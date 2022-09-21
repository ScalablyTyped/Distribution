package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYRUB extends StObject {
  
  var JPY: js.Array[String]
  
  var RUB: js.Array[String]
}
object JPYRUB {
  
  inline def apply(JPY: js.Array[String], RUB: js.Array[String]): JPYRUB = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYRUB]
  }
  
  extension [Self <: JPYRUB](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setRUB(value: js.Array[String]): Self = StObject.set(x, "RUB", value.asInstanceOf[js.Any])
    
    inline def setRUBVarargs(value: String*): Self = StObject.set(x, "RUB", js.Array(value*))
  }
}
