package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnknownLayerLayerviewCreateErrorEvent extends StObject {
  
  var error: Error
  
  var view: View
}
object UnknownLayerLayerviewCreateErrorEvent {
  
  inline def apply(error: Error, view: View): UnknownLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnknownLayerLayerviewCreateErrorEvent]
  }
  
  extension [Self <: UnknownLayerLayerviewCreateErrorEvent](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
