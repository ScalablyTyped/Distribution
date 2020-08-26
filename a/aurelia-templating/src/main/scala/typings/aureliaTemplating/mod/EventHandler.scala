package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventHandler extends js.Object {
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
  implicit class EventHandlerOps[Self <: EventHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: js.Function): Self = this.set("dispose", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandler(value: js.Function): Self = this.set("handler", value.asInstanceOf[js.Any])
  }
  
}

