package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USD extends StObject {
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
  
  var ZMW: js.Array[String]
}
object USD {
  
  inline def apply(JPY: js.Array[String], USD: js.Array[String], ZMW: js.Array[String]): USD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZMW = ZMW.asInstanceOf[js.Any])
    __obj.asInstanceOf[USD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USD] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
    
    inline def setZMW(value: js.Array[String]): Self = StObject.set(x, "ZMW", value.asInstanceOf[js.Any])
    
    inline def setZMWVarargs(value: String*): Self = StObject.set(x, "ZMW", js.Array(value*))
  }
}
