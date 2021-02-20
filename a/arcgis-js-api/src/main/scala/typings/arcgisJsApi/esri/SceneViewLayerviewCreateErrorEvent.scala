package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewLayerviewCreateErrorEvent extends StObject {
  
  var error: Error = js.native
  
  var layer: Layer = js.native
}
object SceneViewLayerviewCreateErrorEvent {
  
  @scala.inline
  def apply(error: Error, layer: Layer): SceneViewLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewLayerviewCreateErrorEvent]
  }
  
  @scala.inline
  implicit class SceneViewLayerviewCreateErrorEventMutableBuilder[Self <: SceneViewLayerviewCreateErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
  }
}
