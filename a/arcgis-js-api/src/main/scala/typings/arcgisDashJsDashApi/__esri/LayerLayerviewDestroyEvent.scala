package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object LayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): LayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView, view = view)
  
    __obj.asInstanceOf[LayerLayerviewDestroyEvent]
  }
}

