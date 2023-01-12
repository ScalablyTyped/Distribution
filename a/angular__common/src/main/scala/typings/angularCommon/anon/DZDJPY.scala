package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DZDJPY extends StObject {
  
  var DZD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object DZDJPY {
  
  inline def apply(DZD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): DZDJPY = {
    val __obj = js.Dynamic.literal(DZD = DZD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[DZDJPY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DZDJPY] (val x: Self) extends AnyVal {
    
    inline def setDZD(value: js.Array[String]): Self = StObject.set(x, "DZD", value.asInstanceOf[js.Any])
    
    inline def setDZDVarargs(value: String*): Self = StObject.set(x, "DZD", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
