package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PHPUSD extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var JPY: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var USD: js.Array[String]
  
  var UZS: js.Array[String]
}
object PHPUSD {
  
  inline def apply(
    BYN: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    UZS: js.Array[String]
  ): PHPUSD = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], UZS = UZS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PHPUSD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PHPUSD] (val x: Self) extends AnyVal {
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
    
    inline def setUZS(value: js.Array[String]): Self = StObject.set(x, "UZS", value.asInstanceOf[js.Any])
    
    inline def setUZSVarargs(value: String*): Self = StObject.set(x, "UZS", js.Array(value*))
  }
}
