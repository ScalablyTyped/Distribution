package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`mouse-wheel`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapViewMouseWheelEvent extends js.Object {
  var deltaY: Double = js.native
  var native: js.Any = js.native
  var stopPropagation: js.Function = js.native
  var timestamp: Double = js.native
  var `type`: `mouse-wheel` = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object MapViewMouseWheelEvent {
  @scala.inline
  def apply(
    deltaY: Double,
    native: js.Any,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: `mouse-wheel`,
    x: Double,
    y: Double
  ): MapViewMouseWheelEvent = {
    val __obj = js.Dynamic.literal(deltaY = deltaY.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewMouseWheelEvent]
  }
  @scala.inline
  implicit class MapViewMouseWheelEventOps[Self <: MapViewMouseWheelEvent] (val x: Self) extends AnyVal {
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
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNative(value: js.Any): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: js.Function): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `mouse-wheel`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

