package GrokkingAlgorithms.Search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinarySearchTest {

    @Test
   public void testNull_thenThrowIllegalStateException(){
      assertThrows(IllegalStateException.class, () -> BinarySearch.search(null, 1));
   }

    @Test
    public void testArray_thenThrowIllegalStateException(){

    }

    private int[] createArrayWithUniqueValues(int arrayLength, Range range){
        List<Integer> list = new ArrayList<>(arrayLength);

        return list.toArray();
    }

    public class Range {
        int min;
        int max;
    }
}
