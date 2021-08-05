package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EURGBP extends StObject {
  
  var EUR: js.Array[js.UndefOr[String]]
  
  var GBP: js.Array[js.UndefOr[String]]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object EURGBP {
  
  inline def apply(
    EUR: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    USD: js.Array[String]
  ): EURGBP = {
    val __obj = js.Dynamic.literal(EUR = EUR.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[EURGBP]
  }
  
  extension [Self <: EURGBP](x: Self) {
    
    inline def setEUR(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "EUR", value.asInstanceOf[js.Any])
    
    inline def setEURVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "EUR", js.Array(value :_*))
    
    inline def setGBP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "GBP", value.asInstanceOf[js.Any])
    
    inline def setGBPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "GBP", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
