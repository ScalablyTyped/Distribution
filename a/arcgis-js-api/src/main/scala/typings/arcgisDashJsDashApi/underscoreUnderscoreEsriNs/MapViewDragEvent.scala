package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewDragEvent extends js.Object {
  var action: String
  var angle: Double
  var button: Double
  var buttons: Double
  var native: js.Any
  var origin: MapViewDragEventOrigin
  var radius: Double
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: String
  var x: Double
  var y: Double
}

object MapViewDragEvent {
  @scala.inline
  def apply(
    action: String,
    angle: Double,
    button: Double,
    buttons: Double,
    native: js.Any,
    origin: MapViewDragEventOrigin,
    radius: Double,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: String,
    x: Double,
    y: Double
  ): MapViewDragEvent = {
    val __obj = js.Dynamic.literal(action = action, angle = angle, button = button, buttons = buttons, native = native, origin = origin, radius = radius, stopPropagation = stopPropagation, timestamp = timestamp, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapViewDragEvent]
  }
}

