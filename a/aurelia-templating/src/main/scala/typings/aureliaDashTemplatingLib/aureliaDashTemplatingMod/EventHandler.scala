package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventHandler extends js.Object {
  var bubbles: scala.Boolean
  var capture: scala.Boolean
  var dispose: js.Function
  var eventName: java.lang.String
  var handler: js.Function
}

object EventHandler {
  @scala.inline
  def apply(
    bubbles: scala.Boolean,
    capture: scala.Boolean,
    dispose: js.Function,
    eventName: java.lang.String,
    handler: js.Function
  ): EventHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("capture")(capture)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("eventName")(eventName)
    __obj.updateDynamic("handler")(handler)
    __obj.asInstanceOf[EventHandler]
  }
}

