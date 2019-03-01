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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("angle")(angle)
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("native")(native)
    __obj.updateDynamic("origin")(origin)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[SceneViewDragEvent]
  }
}

