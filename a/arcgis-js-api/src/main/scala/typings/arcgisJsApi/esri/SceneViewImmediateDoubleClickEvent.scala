package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`immediate-double-click`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewImmediateDoubleClickEvent extends js.Object {
  var button: js.Any
  var buttons: Double
  var mapPoint: Point
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: `immediate-double-click`
  var x: Double
  var y: Double
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
}

