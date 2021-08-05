package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewLayerviewCreateErrorEvent extends StObject {
  
  var error: Error
  
  var layer: Layer
}
object MapViewLayerviewCreateErrorEvent {
  
  inline def apply(error: Error, layer: Layer): MapViewLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewLayerviewCreateErrorEvent]
  }
  
  extension [Self <: MapViewLayerviewCreateErrorEvent](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
  }
}
