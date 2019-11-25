package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewLayerviewDestroyEvent extends js.Object {
  var layer: Layer
  var layerView: LayerView
}

object MapViewLayerviewDestroyEvent {
  @scala.inline
  def apply(layer: Layer, layerView: LayerView): MapViewLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerView = layerView.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapViewLayerviewDestroyEvent]
  }
}

