package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMLLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object KMLLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): KMLLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMLLayerLayerviewCreateErrorEvent]
  }
}

