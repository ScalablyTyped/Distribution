package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewLayerviewCreateEvent extends js.Object {
  var layer: Layer
  var layerView: LayerView
}

object ViewLayerviewCreateEvent {
  @scala.inline
  def apply(layer: Layer, layerView: LayerView): ViewLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layer = layer, layerView = layerView)
  
    __obj.asInstanceOf[ViewLayerviewCreateEvent]
  }
}

