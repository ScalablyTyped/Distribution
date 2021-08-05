package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewLayerviewCreateEvent extends StObject {
  
  var layer: Layer
  
  var layerView: LayerView
}
object ViewLayerviewCreateEvent {
  
  inline def apply(layer: Layer, layerView: LayerView): ViewLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerView = layerView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewLayerviewCreateEvent]
  }
  
  extension [Self <: ViewLayerviewCreateEvent](x: Self) {
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerView(value: LayerView): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
  }
}
