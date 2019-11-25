package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventHandler extends js.Object {
  var bubbles: Boolean
  var capture: Boolean
  var dispose: js.Function
  var eventName: String
  var handler: js.Function
}

object EventHandler {
  @scala.inline
  def apply(bubbles: Boolean, capture: Boolean, dispose: js.Function, eventName: String, handler: js.Function): EventHandler = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], dispose = dispose.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventHandler]
  }
}

