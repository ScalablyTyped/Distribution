package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object StreamLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): StreamLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[StreamLayerLayerviewCreateErrorEvent]
  }
}

