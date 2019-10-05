package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object FeatureLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): FeatureLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView, view = view)
  
    __obj.asInstanceOf[FeatureLayerLayerviewDestroyEvent]
  }
}

