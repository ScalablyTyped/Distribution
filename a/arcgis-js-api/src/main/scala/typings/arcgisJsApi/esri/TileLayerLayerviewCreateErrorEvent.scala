package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object TileLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): TileLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerLayerviewCreateErrorEvent]
  }
}

