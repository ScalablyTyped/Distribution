package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandler extends StObject {
  
  var bubbles: Boolean = js.native
  
  var capture: Boolean = js.native
  
  var dispose: js.Function = js.native
  
  var eventName: String = js.native
  
  var handler: js.Function = js.native
}
object EventHandler {
  
  @scala.inline
  def apply(bubbles: Boolean, capture: Boolean, dispose: js.Function, eventName: String, handler: js.Function): EventHandler = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], dispose = dispose.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandler]
  }
  
  @scala.inline
  implicit class EventHandlerMutableBuilder[Self <: EventHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: js.Function): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: js.Function): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
  }
}
