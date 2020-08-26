package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewLayerviewDestroyEvent extends js.Object {
  var layer: Layer = js.native
  var layerView: LayerView = js.native
}

object SceneViewLayerviewDestroyEvent {
  @scala.inline
  def apply(layer: Layer, layerView: LayerView): SceneViewLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerView = layerView.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewLayerviewDestroyEvent]
  }
  @scala.inline
  implicit class SceneViewLayerviewDestroyEventOps[Self <: SceneViewLayerviewDestroyEvent] (val x: Self) extends AnyVal {
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
    def setLayer(value: Layer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerView(value: LayerView): Self = this.set("layerView", value.asInstanceOf[js.Any])
  }
  
}

