package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`mouse-wheel`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewMouseWheelEvent extends js.Object {
  var deltaY: Double
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: `mouse-wheel`
  var x: Double
  var y: Double
}

object SceneViewMouseWheelEvent {
  @scala.inline
  def apply(
    deltaY: Double,
    native: js.Any,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: `mouse-wheel`,
    x: Double,
    y: Double
  ): SceneViewMouseWheelEvent = {
    val __obj = js.Dynamic.literal(deltaY = deltaY.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewMouseWheelEvent]
  }
}

