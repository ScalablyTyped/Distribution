package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ERNETB extends StObject {
  
  var ERN: js.Array[String]
  
  var ETB: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object ERNETB {
  
  inline def apply(ERN: js.Array[String], ETB: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): ERNETB = {
    val __obj = js.Dynamic.literal(ERN = ERN.asInstanceOf[js.Any], ETB = ETB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERNETB]
  }
  
  extension [Self <: ERNETB](x: Self) {
    
    inline def setERN(value: js.Array[String]): Self = StObject.set(x, "ERN", value.asInstanceOf[js.Any])
    
    inline def setERNVarargs(value: String*): Self = StObject.set(x, "ERN", js.Array(value :_*))
    
    inline def setETB(value: js.Array[String]): Self = StObject.set(x, "ETB", value.asInstanceOf[js.Any])
    
    inline def setETBVarargs(value: String*): Self = StObject.set(x, "ETB", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
