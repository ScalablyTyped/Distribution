package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerLayerviewCreateErrorEvent extends StObject {
  
  var error: Error
  
  var view: View
}
object LayerLayerviewCreateErrorEvent {
  
  inline def apply(error: Error, view: View): LayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerLayerviewCreateErrorEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerLayerviewCreateErrorEvent] (val x: Self) extends AnyVal {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
