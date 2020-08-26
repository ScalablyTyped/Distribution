package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.added
import typings.arcgisJsApi.arcgisJsApiStrings.drag
import typings.arcgisJsApi.arcgisJsApiStrings.end
import typings.arcgisJsApi.arcgisJsApiStrings.removed
import typings.arcgisJsApi.arcgisJsApiStrings.start
import typings.arcgisJsApi.arcgisJsApiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDragEvent extends js.Object {
  var action: start | added | update | removed | end = js.native
  var angle: Double = js.native
  var button: js.Any = js.native
  var buttons: Double = js.native
  var native: js.Any = js.native
  var origin: ViewDragEventOrigin = js.native
  var radius: Double = js.native
  var stopPropagation: js.Function = js.native
  var timestamp: Double = js.native
  var `type`: drag = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object ViewDragEvent {
  @scala.inline
  def apply(
    action: start | added | update | removed | end,
    angle: Double,
    button: js.Any,
    buttons: Double,
    native: js.Any,
    origin: ViewDragEventOrigin,
    radius: Double,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: drag,
    x: Double,
    y: Double
  ): ViewDragEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDragEvent]
  }
  @scala.inline
  implicit class ViewDragEventOps[Self <: ViewDragEvent] (val x: Self) extends AnyVal {
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
    def setAction(value: start | added | update | removed | end): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setButton(value: js.Any): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtons(value: Double): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setNative(value: js.Any): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: ViewDragEventOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: js.Function): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: drag): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

