package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object ImageryLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): ImageryLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[ImageryLayerLayerviewCreateErrorEvent]
  }
}

