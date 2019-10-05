package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerLayerviewCreateEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object GeoJSONLayerLayerviewCreateEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): GeoJSONLayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView, view = view)
  
    __obj.asInstanceOf[GeoJSONLayerLayerviewCreateEvent]
  }
}

