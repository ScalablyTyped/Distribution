package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TJS extends StObject {
  
  var JPY: js.Array[String]
  
  var TJS: js.Array[String]
}
object TJS {
  
  inline def apply(JPY: js.Array[String], TJS: js.Array[String]): TJS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TJS = TJS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TJS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TJS] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setTJS(value: js.Array[String]): Self = StObject.set(x, "TJS", value.asInstanceOf[js.Any])
    
    inline def setTJSVarargs(value: String*): Self = StObject.set(x, "TJS", js.Array(value*))
  }
}
