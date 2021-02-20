package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewBlurEvent extends StObject {
  
  var native: js.Any = js.native
  
  var target: View = js.native
}
object ViewBlurEvent {
  
  @scala.inline
  def apply(native: js.Any, target: View): ViewBlurEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewBlurEvent]
  }
  
  @scala.inline
  implicit class ViewBlurEventMutableBuilder[Self <: ViewBlurEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: View): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
