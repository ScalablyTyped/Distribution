package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewPointerUpEvent extends js.Object {
  var button: scala.Double
  var buttons: scala.Double
  var native: js.Any
  var pointerId: scala.Double
  var pointerType: java.lang.String
  var stopPropagation: js.Function
  var timestamp: scala.Double
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object SceneViewPointerUpEvent {
  @scala.inline
  def apply(
    button: scala.Double,
    buttons: scala.Double,
    native: js.Any,
    pointerId: scala.Double,
    pointerType: java.lang.String,
    stopPropagation: js.Function,
    timestamp: scala.Double,
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): SceneViewPointerUpEvent = {
    val __obj = js.Dynamic.literal(button = button, buttons = buttons, native = native, pointerId = pointerId, pointerType = pointerType, stopPropagation = stopPropagation, timestamp = timestamp, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SceneViewPointerUpEvent]
  }
}

