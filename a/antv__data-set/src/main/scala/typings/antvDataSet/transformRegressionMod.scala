package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.exponential
import typings.antvDataSet.antvDataSetStrings.linear
import typings.antvDataSet.antvDataSetStrings.logarithmic
import typings.antvDataSet.antvDataSetStrings.polynomial
import typings.antvDataSet.antvDataSetStrings.power
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformRegressionMod {
  
  object default {
    
    @JSImport("@antv/data-set/lib/transform/regression", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/data-set/lib/transform/regression", "default.REGRESSION_METHODS")
    @js.native
    def REGRESSION_METHODS: js.Array[String] = js.native
    inline def REGRESSION_METHODS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGRESSION_METHODS")(x.asInstanceOf[js.Any])
  }
  
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Array[String]] = js.undefined
    
    var bandwidth: js.UndefOr[Double] = js.undefined
    
    var extent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var fields: js.Array[String]
    
    var method: js.UndefOr[linear | exponential | logarithmic | power | polynomial] = js.undefined
    
    var order: js.UndefOr[Double] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(fields: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAs(value: js.Array[String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAsVarargs(value: String*): Self = StObject.set(x, "as", js.Array(value*))
      
      inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
      
      inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
      
      inline def setExtent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setMethod(value: linear | exponential | logarithmic | power | polynomial): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
}
