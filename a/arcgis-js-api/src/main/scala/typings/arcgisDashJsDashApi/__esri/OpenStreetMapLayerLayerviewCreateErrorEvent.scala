package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object OpenStreetMapLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): OpenStreetMapLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[OpenStreetMapLayerLayerviewCreateErrorEvent]
  }
}

