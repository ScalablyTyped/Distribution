package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoRSSLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object GeoRSSLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): GeoRSSLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[GeoRSSLayerLayerviewCreateErrorEvent]
  }
}

