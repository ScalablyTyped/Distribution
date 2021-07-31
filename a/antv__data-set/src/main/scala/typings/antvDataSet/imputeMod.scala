package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.max
import typings.antvDataSet.antvDataSetStrings.mean
import typings.antvDataSet.antvDataSetStrings.median
import typings.antvDataSet.antvDataSetStrings.min
import typings.antvDataSet.antvDataSetStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imputeMod {
  
  trait Imputations extends StObject {
    
    def max(row: js.Any, values: js.Array[js.Any]): Double
    
    def mean(row: js.Any, values: js.Array[js.Any]): Double
    
    def median(row: js.Any, values: js.Array[js.Any]): Double
    
    def min(row: js.Any, values: js.Array[js.Any]): Double
    
    def value(row: js.Any, values: js.Array[js.Any], value: js.Any): js.Any
  }
  object Imputations {
    
    @scala.inline
    def apply(
      max: (js.Any, js.Array[js.Any]) => Double,
      mean: (js.Any, js.Array[js.Any]) => Double,
      median: (js.Any, js.Array[js.Any]) => Double,
      min: (js.Any, js.Array[js.Any]) => Double,
      value: (js.Any, js.Array[js.Any], js.Any) => js.Any
    ): Imputations = {
      val __obj = js.Dynamic.literal(max = js.Any.fromFunction2(max), mean = js.Any.fromFunction2(mean), median = js.Any.fromFunction2(median), min = js.Any.fromFunction2(min), value = js.Any.fromFunction3(value))
      __obj.asInstanceOf[Imputations]
    }
    
    @scala.inline
    implicit class ImputationsMutableBuilder[Self <: Imputations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: (js.Any, js.Array[js.Any]) => Double): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMean(value: (js.Any, js.Array[js.Any]) => Double): Self = StObject.set(x, "mean", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMedian(value: (js.Any, js.Array[js.Any]) => Double): Self = StObject.set(x, "median", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMin(value: (js.Any, js.Array[js.Any]) => Double): Self = StObject.set(x, "min", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValue(value: (js.Any, js.Array[js.Any], js.Any) => js.Any): Self = StObject.set(x, "value", js.Any.fromFunction3(value))
    }
  }
  
  trait Options extends StObject {
    
    var field: String
    
    var groupBy: js.UndefOr[String | js.Array[String] | (js.Function1[/* item */ js.Any, String])] = js.undefined
    
    var method: mean | median | max | min | value | (js.Function4[
        /* row */ js.Any, 
        /* values */ js.Array[js.Any], 
        /* value */ js.Any, 
        /* group */ js.Array[js.Any], 
        js.Any
      ])
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(
      field: String,
      method: mean | median | max | min | value | (js.Function4[
          /* row */ js.Any, 
          /* values */ js.Array[js.Any], 
          /* value */ js.Any, 
          /* group */ js.Array[js.Any], 
          js.Any
        ])
    ): Options = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupBy(value: String | js.Array[String] | (js.Function1[/* item */ js.Any, String])): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByFunction1(value: /* item */ js.Any => String): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setGroupByVarargs(value: String*): Self = StObject.set(x, "groupBy", js.Array(value :_*))
      
      @scala.inline
      def setMethod(
        value: mean | median | max | min | value | (js.Function4[
              /* row */ js.Any, 
              /* values */ js.Array[js.Any], 
              /* value */ js.Any, 
              /* group */ js.Array[js.Any], 
              js.Any
            ])
      ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodFunction4(
        value: (/* row */ js.Any, /* values */ js.Array[js.Any], /* value */ js.Any, /* group */ js.Array[js.Any]) => js.Any
      ): Self = StObject.set(x, "method", js.Any.fromFunction4(value))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
