package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`draw-complete`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDrawActionDrawCompleteEvent extends js.Object {
  var coordinates: js.Array[Double]
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: `draw-complete`
}

object PointDrawActionDrawCompleteEvent {
  @scala.inline
  def apply(
    coordinates: js.Array[Double],
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: `draw-complete`
  ): PointDrawActionDrawCompleteEvent = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDrawActionDrawCompleteEvent]
  }
}

