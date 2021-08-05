package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RONUSD extends StObject {
  
  var JPY: js.Array[String]
  
  var RON: js.Array[String]
  
  var USD: js.Array[String]
}
object RONUSD {
  
  inline def apply(JPY: js.Array[String], RON: js.Array[String], USD: js.Array[String]): RONUSD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[RONUSD]
  }
  
  extension [Self <: RONUSD](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setRON(value: js.Array[String]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    inline def setRONVarargs(value: String*): Self = StObject.set(x, "RON", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
