package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BWPJPY extends StObject {
  
  var BWP: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object BWPJPY {
  
  inline def apply(BWP: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BWPJPY = {
    val __obj = js.Dynamic.literal(BWP = BWP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BWPJPY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BWPJPY] (val x: Self) extends AnyVal {
    
    inline def setBWP(value: js.Array[String]): Self = StObject.set(x, "BWP", value.asInstanceOf[js.Any])
    
    inline def setBWPVarargs(value: String*): Self = StObject.set(x, "BWP", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
