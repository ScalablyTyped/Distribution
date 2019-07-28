package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object PointCloudLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): PointCloudLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[PointCloudLayerLayerviewCreateErrorEvent]
  }
}

