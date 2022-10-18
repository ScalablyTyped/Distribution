package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformBinQuantileMod {
  
  trait Options extends StObject {
    
    var as: js.UndefOr[String] = js.undefined
    
    var field: String
    
    var fraction: js.UndefOr[Double] = js.undefined
    
    var groupBy: js.UndefOr[js.Array[String]] = js.undefined
    
    var p: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Options {
    
    inline def apply(field: String): Options = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      inline def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
      
      inline def setGroupBy(value: js.Array[String]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setGroupByVarargs(value: String*): Self = StObject.set(x, "groupBy", js.Array(value*))
      
      inline def setP(value: js.Array[Double]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: Double*): Self = StObject.set(x, "p", js.Array(value*))
    }
  }
}
