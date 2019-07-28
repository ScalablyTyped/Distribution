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
    val __obj = js.Dynamic.literal(bubbles = bubbles, capture = capture, dispose = dispose, eventName = eventName, handler = handler)
  
    __obj.asInstanceOf[EventHandler]
  }
}

