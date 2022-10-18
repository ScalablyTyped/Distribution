package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.average
import typings.antvDataSet.antvDataSetStrings.count
import typings.antvDataSet.antvDataSetStrings.max
import typings.antvDataSet.antvDataSetStrings.mean
import typings.antvDataSet.antvDataSetStrings.median
import typings.antvDataSet.antvDataSetStrings.min
import typings.antvDataSet.antvDataSetStrings.mode
import typings.antvDataSet.antvDataSetStrings.product
import typings.antvDataSet.antvDataSetStrings.standardDeviation
import typings.antvDataSet.antvDataSetStrings.sum
import typings.antvDataSet.antvDataSetStrings.sumSimple
import typings.antvDataSet.antvDataSetStrings.variance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformAggregateMod {
  
  object default {
    
    @JSImport("@antv/data-set/lib/transform/aggregate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/data-set/lib/transform/aggregate", "default.VALID_AGGREGATES")
    @js.native
    def VALID_AGGREGATES: js.Array[Any] = js.native
    inline def VALID_AGGREGATES_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALID_AGGREGATES")(x.asInstanceOf[js.Any])
  }
  
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Array[String]] = js.undefined
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    var groupBy: js.UndefOr[String | js.Array[String] | (js.Function1[/* item */ Any, String])] = js.undefined
    
    var operations: js.UndefOr[
        js.Array[
          count | max | min | mean | average | median | mode | product | standardDeviation | sum | sumSimple | variance
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAs(value: js.Array[String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAsVarargs(value: String*): Self = StObject.set(x, "as", js.Array(value*))
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setGroupBy(value: String | js.Array[String] | (js.Function1[/* item */ Any, String])): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByFunction1(value: /* item */ Any => String): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setGroupByVarargs(value: String*): Self = StObject.set(x, "groupBy", js.Array(value*))
      
      inline def setOperations(
        value: js.Array[
              count | max | min | mean | average | median | mode | product | standardDeviation | sum | sumSimple | variance
            ]
      ): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      inline def setOperationsVarargs(
        value: (count | max | min | mean | average | median | mode | product | standardDeviation | sum | sumSimple | variance)*
      ): Self = StObject.set(x, "operations", js.Array(value*))
    }
  }
}
