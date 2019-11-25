package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object OpenStreetMapLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): OpenStreetMapLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenStreetMapLayerLayerviewDestroyEvent]
  }
}

