package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseDynamicLayerLayerviewCreateEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object BaseDynamicLayerLayerviewCreateEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): BaseDynamicLayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseDynamicLayerLayerviewCreateEvent]
  }
}

