package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYArray extends StObject {
  
  var JPY: js.Array[String]
}
object JPYArray {
  
  inline def apply(JPY: js.Array[String]): JPYArray = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYArray]
  }
  
  extension [Self <: JPYArray](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
  }
}
