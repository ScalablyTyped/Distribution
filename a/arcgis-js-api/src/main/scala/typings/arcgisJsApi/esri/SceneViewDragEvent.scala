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

trait SceneViewDragEvent extends js.Object {
  var action: start | added | update | removed | end
  var angle: Double
  var button: js.Any
  var buttons: Double
  var native: js.Any
  var origin: SceneViewDragEventOrigin
  var radius: Double
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: drag
  var x: Double
  var y: Double
}

object SceneViewDragEvent {
  @scala.inline
  def apply(
    action: start | added | update | removed | end,
    angle: Double,
    button: js.Any,
    buttons: Double,
    native: js.Any,
    origin: SceneViewDragEventOrigin,
    radius: Double,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: drag,
    x: Double,
    y: Double
  ): SceneViewDragEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewDragEvent]
  }
}

