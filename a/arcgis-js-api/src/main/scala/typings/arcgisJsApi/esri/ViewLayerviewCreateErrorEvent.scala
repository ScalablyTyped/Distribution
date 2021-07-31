package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewLayerviewCreateErrorEvent extends StObject {
  
  var error: Error
  
  var layer: Layer
}
object ViewLayerviewCreateErrorEvent {
  
  @scala.inline
  def apply(error: Error, layer: Layer): ViewLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewLayerviewCreateErrorEvent]
  }
  
  @scala.inline
  implicit class ViewLayerviewCreateErrorEventMutableBuilder[Self <: ViewLayerviewCreateErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
  }
}
