package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object SceneLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): SceneLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView, view = view)
  
    __obj.asInstanceOf[SceneLayerLayerviewDestroyEvent]
  }
}

