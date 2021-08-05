package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ESPJPY extends StObject {
  
  var ESP: js.Array[String]
  
  var JPY: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
  
  var USD: js.Array[String]
}
object ESPJPY {
  
  inline def apply(
    ESP: js.Array[String],
    JPY: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): ESPJPY = {
    val __obj = js.Dynamic.literal(ESP = ESP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESPJPY]
  }
  
  extension [Self <: ESPJPY](x: Self) {
    
    inline def setESP(value: js.Array[String]): Self = StObject.set(x, "ESP", value.asInstanceOf[js.Any])
    
    inline def setESPVarargs(value: String*): Self = StObject.set(x, "ESP", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
