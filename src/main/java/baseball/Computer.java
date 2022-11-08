package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    public List<Integer> solution;

    public void makeComputerSolution() {
        solution = new ArrayList<>();
        while (solution.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!solution.contains(randomNumber)) {
                solution.add(randomNumber);
            }
        }
    }
}