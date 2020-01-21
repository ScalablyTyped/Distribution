package typings.arcgisJsApi.esri

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
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StreamLayerLayerviewCreateErrorEvent]
  }
}

