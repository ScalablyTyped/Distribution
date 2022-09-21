package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RUB extends StObject {
  
  var CNY: js.Array[String]
  
  var JPY: js.Array[String]
  
  var RUB: js.Array[String]
}
object RUB {
  
  inline def apply(CNY: js.Array[String], JPY: js.Array[String], RUB: js.Array[String]): RUB = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any])
    __obj.asInstanceOf[RUB]
  }
  
  extension [Self <: RUB](x: Self) {
    
    inline def setCNY(value: js.Array[String]): Self = StObject.set(x, "CNY", value.asInstanceOf[js.Any])
    
    inline def setCNYVarargs(value: String*): Self = StObject.set(x, "CNY", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setRUB(value: js.Array[String]): Self = StObject.set(x, "RUB", value.asInstanceOf[js.Any])
    
    inline def setRUBVarargs(value: String*): Self = StObject.set(x, "RUB", js.Array(value*))
  }
}
