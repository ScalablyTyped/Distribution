package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NGNRUB extends StObject {
  
  var JPY: js.Array[String]
  
  var NGN: js.Array[String]
  
  var RUB: js.Array[String]
}
object NGNRUB {
  
  inline def apply(JPY: js.Array[String], NGN: js.Array[String], RUB: js.Array[String]): NGNRUB = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NGN = NGN.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any])
    __obj.asInstanceOf[NGNRUB]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NGNRUB] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setNGN(value: js.Array[String]): Self = StObject.set(x, "NGN", value.asInstanceOf[js.Any])
    
    inline def setNGNVarargs(value: String*): Self = StObject.set(x, "NGN", js.Array(value*))
    
    inline def setRUB(value: js.Array[String]): Self = StObject.set(x, "RUB", value.asInstanceOf[js.Any])
    
    inline def setRUBVarargs(value: String*): Self = StObject.set(x, "RUB", js.Array(value*))
  }
}
