package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RONUSD extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var JPY: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var RON: js.Array[String]
  
  var USD: js.Array[String]
}
object RONUSD {
  
  inline def apply(
    BYN: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    RON: js.Array[String],
    USD: js.Array[String]
  ): RONUSD = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[RONUSD]
  }
  
  extension [Self <: RONUSD](x: Self) {
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setRON(value: js.Array[String]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    inline def setRONVarargs(value: String*): Self = StObject.set(x, "RON", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
