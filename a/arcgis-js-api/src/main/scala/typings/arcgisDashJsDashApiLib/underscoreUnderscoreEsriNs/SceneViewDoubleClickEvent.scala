package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewDoubleClickEvent extends js.Object {
  var button: scala.Double
  var buttons: scala.Double
  var mapPoint: Point
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: scala.Double
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object SceneViewDoubleClickEvent {
  @scala.inline
  def apply(
    button: scala.Double,
    buttons: scala.Double,
    mapPoint: Point,
    native: js.Any,
    stopPropagation: js.Function,
    timestamp: scala.Double,
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): SceneViewDoubleClickEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("mapPoint")(mapPoint)
    __obj.updateDynamic("native")(native)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[SceneViewDoubleClickEvent]
  }
}

