package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMLLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView = js.native
  var view: View = js.native
}

object KMLLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): KMLLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMLLayerLayerviewDestroyEvent]
  }
  @scala.inline
  implicit class KMLLayerLayerviewDestroyEventOps[Self <: KMLLayerLayerviewDestroyEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLayerView(value: LayerView): Self = this.set("layerView", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

