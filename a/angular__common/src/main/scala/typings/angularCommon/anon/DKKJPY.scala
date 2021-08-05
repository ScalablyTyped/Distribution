package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DKKJPY extends StObject {
  
  var DKK: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object DKKJPY {
  
  inline def apply(DKK: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): DKKJPY = {
    val __obj = js.Dynamic.literal(DKK = DKK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[DKKJPY]
  }
  
  extension [Self <: DKKJPY](x: Self) {
    
    inline def setDKK(value: js.Array[String]): Self = StObject.set(x, "DKK", value.asInstanceOf[js.Any])
    
    inline def setDKKVarargs(value: String*): Self = StObject.set(x, "DKK", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
