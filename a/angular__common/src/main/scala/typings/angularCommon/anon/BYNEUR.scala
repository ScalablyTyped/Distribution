package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BYNEUR extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var EUR: js.Array[js.UndefOr[String]]
  
  var GBP: js.Array[js.UndefOr[String]]
  
  var JPY: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var USD: js.Array[String]
}
object BYNEUR {
  
  inline def apply(
    BYN: js.Array[js.UndefOr[String]],
    EUR: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    USD: js.Array[String]
  ): BYNEUR = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], EUR = EUR.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNEUR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BYNEUR] (val x: Self) extends AnyVal {
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setEUR(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "EUR", value.asInstanceOf[js.Any])
    
    inline def setEURVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "EUR", js.Array(value*))
    
    inline def setGBP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "GBP", value.asInstanceOf[js.Any])
    
    inline def setGBPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "GBP", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
