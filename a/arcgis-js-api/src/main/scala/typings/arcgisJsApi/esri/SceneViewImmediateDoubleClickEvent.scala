package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`immediate-double-click`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewImmediateDoubleClickEvent extends js.Object {
  var button: js.Any = js.native
  var buttons: Double = js.native
  var mapPoint: Point = js.native
  var native: js.Any = js.native
  var stopPropagation: js.Function = js.native
  var timestamp: Double = js.native
  var `type`: `immediate-double-click` = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SceneViewImmediateDoubleClickEvent {
  @scala.inline
  def apply(
    button: js.Any,
    buttons: Double,
    mapPoint: Point,
    native: js.Any,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: `immediate-double-click`,
    x: Double,
    y: Double
  ): SceneViewImmediateDoubleClickEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewImmediateDoubleClickEvent]
  }
  @scala.inline
  implicit class SceneViewImmediateDoubleClickEventOps[Self <: SceneViewImmediateDoubleClickEvent] (val x: Self) extends AnyVal {
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
    def setButton(value: js.Any): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtons(value: Double): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapPoint(value: Point): Self = this.set("mapPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setNative(value: js.Any): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: js.Function): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `immediate-double-click`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

