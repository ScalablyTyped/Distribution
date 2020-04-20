package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationLayerLayerviewCreateEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object ElevationLayerLayerviewCreateEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): ElevationLayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationLayerLayerviewCreateEvent]
  }
}

