package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMSLayerLayerviewCreateEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object WMSLayerLayerviewCreateEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): WMSLayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView, view = view)
  
    __obj.asInstanceOf[WMSLayerLayerviewCreateEvent]
  }
}

