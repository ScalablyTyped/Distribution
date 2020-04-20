package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewLayerviewDestroyEvent extends js.Object {
  var layer: Layer
  var layerView: LayerView
}

object SceneViewLayerviewDestroyEvent {
  @scala.inline
  def apply(layer: Layer, layerView: LayerView): SceneViewLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerView = layerView.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewLayerviewDestroyEvent]
  }
}

