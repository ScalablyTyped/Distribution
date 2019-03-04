package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewMouseWheelEvent extends js.Object {
  var deltaY: scala.Double
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: scala.Double
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object MapViewMouseWheelEvent {
  @scala.inline
  def apply(
    deltaY: scala.Double,
    native: js.Any,
    stopPropagation: js.Function,
    timestamp: scala.Double,
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): MapViewMouseWheelEvent = {
    val __obj = js.Dynamic.literal(deltaY = deltaY, native = native, stopPropagation = stopPropagation, timestamp = timestamp, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapViewMouseWheelEvent]
  }
}

