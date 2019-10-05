package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewLayerviewCreateEvent extends js.Object {
  var layer: Layer
  var layerView: LayerView
}

object SceneViewLayerviewCreateEvent {
  @scala.inline
  def apply(layer: Layer, layerView: LayerView): SceneViewLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layer = layer, layerView = layerView)
  
    __obj.asInstanceOf[SceneViewLayerviewCreateEvent]
  }
}

