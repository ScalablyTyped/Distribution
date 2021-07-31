package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewLayerviewCreateEvent extends StObject {
  
  var layer: Layer
  
  var layerView: LayerView
}
object MapViewLayerviewCreateEvent {
  
  @scala.inline
  def apply(layer: Layer, layerView: LayerView): MapViewLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerView = layerView.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewLayerviewCreateEvent]
  }
  
  @scala.inline
  implicit class MapViewLayerviewCreateEventMutableBuilder[Self <: MapViewLayerviewCreateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerView(value: LayerView): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
  }
}
