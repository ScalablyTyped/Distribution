package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewFocusEvent extends StObject {
  
  var native: js.Any = js.native
  
  var target: View = js.native
}
object ViewFocusEvent {
  
  @scala.inline
  def apply(native: js.Any, target: View): ViewFocusEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFocusEvent]
  }
  
  @scala.inline
  implicit class ViewFocusEventMutableBuilder[Self <: ViewFocusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: View): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
