package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.click
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewClickEvent extends js.Object {
  var button: Double
  var buttons: js.Any
  var mapPoint: Point
  var native: js.Any
  var screenPoint: js.Any
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: click
  var x: Double
  var y: Double
}

object SceneViewClickEvent {
  @scala.inline
  def apply(
    button: Double,
    buttons: js.Any,
    mapPoint: Point,
    native: js.Any,
    screenPoint: js.Any,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: click,
    x: Double,
    y: Double
  ): SceneViewClickEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], screenPoint = screenPoint.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewClickEvent]
  }
}

