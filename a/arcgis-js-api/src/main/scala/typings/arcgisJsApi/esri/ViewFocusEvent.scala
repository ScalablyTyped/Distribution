package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewFocusEvent extends StObject {
  
  var native: Any
  
  var target: View
}
object ViewFocusEvent {
  
  inline def apply(native: Any, target: View): ViewFocusEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFocusEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewFocusEvent] (val x: Self) extends AnyVal {
    
    inline def setNative(value: Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: View): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
