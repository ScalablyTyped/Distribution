package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapNotesLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object MapNotesLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): MapNotesLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapNotesLayerLayerviewDestroyEvent]
  }
}

