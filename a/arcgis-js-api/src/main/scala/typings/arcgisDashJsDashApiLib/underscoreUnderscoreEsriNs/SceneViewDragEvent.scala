package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewDragEvent extends js.Object {
  var action: java.lang.String
  var angle: scala.Double
  var button: scala.Double
  var buttons: scala.Double
  var native: js.Any
  var origin: SceneViewDragEventOrigin
  var radius: scala.Double
  var stopPropagation: js.Function
  var timestamp: scala.Double
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object SceneViewDragEvent {
  @scala.inline
  def apply(
    action: java.lang.String,
    angle: scala.Double,
    button: scala.Double,
    buttons: scala.Double,
    native: js.Any,
    origin: SceneViewDragEventOrigin,
    radius: scala.Double,
    stopPropagation: js.Function,
    timestamp: scala.Double,
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): SceneViewDragEvent = {
    val __obj = js.Dynamic.literal(action = action, angle = angle, button = button, buttons = buttons, native = native, origin = origin, radius = radius, stopPropagation = stopPropagation, timestamp = timestamp, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SceneViewDragEvent]
  }
}

