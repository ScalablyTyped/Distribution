package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`pointer-up`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.mouse
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewPointerUpEvent extends js.Object {
  var button: Double
  var buttons: Double
  var native: js.Any
  var pointerId: Double
  var pointerType: mouse | touch
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: `pointer-up`
  var x: Double
  var y: Double
}

object MapViewPointerUpEvent {
  @scala.inline
  def apply(
    button: Double,
    buttons: Double,
    native: js.Any,
    pointerId: Double,
    pointerType: mouse | touch,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: `pointer-up`,
    x: Double,
    y: Double
  ): MapViewPointerUpEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewPointerUpEvent]
  }
}

