package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.max
import typings.antvDataSet.antvDataSetStrings.mean
import typings.antvDataSet.antvDataSetStrings.median
import typings.antvDataSet.antvDataSetStrings.min
import typings.antvDataSet.antvDataSetStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformImputeMod {
  
  trait Imputations extends StObject {
    
    def max(row: Any, values: js.Array[Any]): Double
    
    def mean(row: Any, values: js.Array[Any]): Double
    
    def median(row: Any, values: js.Array[Any]): Double
    
    def min(row: Any, values: js.Array[Any]): Double
    
    def value(row: Any, values: js.Array[Any], value: Any): Any
  }
  object Imputations {
    
    inline def apply(
      max: (Any, js.Array[Any]) => Double,
      mean: (Any, js.Array[Any]) => Double,
      median: (Any, js.Array[Any]) => Double,
      min: (Any, js.Array[Any]) => Double,
      value: (Any, js.Array[Any], Any) => Any
    ): Imputations = {
      val __obj = js.Dynamic.literal(max = js.Any.fromFunction2(max), mean = js.Any.fromFunction2(mean), median = js.Any.fromFunction2(median), min = js.Any.fromFunction2(min), value = js.Any.fromFunction3(value))
      __obj.asInstanceOf[Imputations]
    }
    
    extension [Self <: Imputations](x: Self) {
      
      inline def setMax(value: (Any, js.Array[Any]) => Double): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
      
      inline def setMean(value: (Any, js.Array[Any]) => Double): Self = StObject.set(x, "mean", js.Any.fromFunction2(value))
      
      inline def setMedian(value: (Any, js.Array[Any]) => Double): Self = StObject.set(x, "median", js.Any.fromFunction2(value))
      
      inline def setMin(value: (Any, js.Array[Any]) => Double): Self = StObject.set(x, "min", js.Any.fromFunction2(value))
      
      inline def setValue(value: (Any, js.Array[Any], Any) => Any): Self = StObject.set(x, "value", js.Any.fromFunction3(value))
    }
  }
  
  trait Options extends StObject {
    
    var field: String
    
    var groupBy: js.UndefOr[String | js.Array[String] | (js.Function1[/* item */ Any, String])] = js.undefined
    
    var method: mean | median | max | min | value | (js.Function4[
        /* row */ Any, 
        /* values */ js.Array[Any], 
        /* value */ Any, 
        /* group */ js.Array[Any], 
        Any
      ])
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(
      field: String,
      method: mean | median | max | min | value | (js.Function4[
          /* row */ Any, 
          /* values */ js.Array[Any], 
          /* value */ Any, 
          /* group */ js.Array[Any], 
          Any
        ])
    ): Options = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setGroupBy(value: String | js.Array[String] | (js.Function1[/* item */ Any, String])): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByFunction1(value: /* item */ Any => String): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setGroupByVarargs(value: String*): Self = StObject.set(x, "groupBy", js.Array(value*))
      
      inline def setMethod(
        value: mean | median | max | min | value | (js.Function4[
              /* row */ Any, 
              /* values */ js.Array[Any], 
              /* value */ Any, 
              /* group */ js.Array[Any], 
              Any
            ])
      ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodFunction4(
        value: (/* row */ Any, /* values */ js.Array[Any], /* value */ Any, /* group */ js.Array[Any]) => Any
      ): Self = StObject.set(x, "method", js.Any.fromFunction4(value))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
