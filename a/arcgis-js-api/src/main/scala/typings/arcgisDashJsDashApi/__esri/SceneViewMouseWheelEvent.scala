package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewMouseWheelEvent extends js.Object {
  var deltaY: Double
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: String
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
    `type`: String,
    x: Double,
    y: Double
  ): SceneViewMouseWheelEvent = {
    val __obj = js.Dynamic.literal(deltaY = deltaY, native = native, stopPropagation = stopPropagation, timestamp = timestamp, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SceneViewMouseWheelEvent]
  }
}

