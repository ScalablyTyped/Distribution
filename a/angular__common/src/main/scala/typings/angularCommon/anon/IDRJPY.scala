package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDRJPY extends StObject {
  
  var IDR: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object IDRJPY {
  
  inline def apply(IDR: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): IDRJPY = {
    val __obj = js.Dynamic.literal(IDR = IDR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDRJPY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDRJPY] (val x: Self) extends AnyVal {
    
    inline def setIDR(value: js.Array[String]): Self = StObject.set(x, "IDR", value.asInstanceOf[js.Any])
    
    inline def setIDRVarargs(value: String*): Self = StObject.set(x, "IDR", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
