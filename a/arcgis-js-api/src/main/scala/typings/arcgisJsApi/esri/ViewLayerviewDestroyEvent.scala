package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewLayerviewDestroyEvent extends StObject {
  
  var layer: Layer = js.native
  
  var layerView: LayerView = js.native
}
object ViewLayerviewDestroyEvent {
  
  @scala.inline
  def apply(layer: Layer, layerView: LayerView): ViewLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerView = layerView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewLayerviewDestroyEvent]
  }
  
  @scala.inline
  implicit class ViewLayerviewDestroyEventMutableBuilder[Self <: ViewLayerviewDestroyEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerView(value: LayerView): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
  }
}
