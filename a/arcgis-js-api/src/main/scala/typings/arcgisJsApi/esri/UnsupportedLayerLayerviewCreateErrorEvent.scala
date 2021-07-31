package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsupportedLayerLayerviewCreateErrorEvent extends StObject {
  
  var error: Error
  
  var view: View
}
object UnsupportedLayerLayerviewCreateErrorEvent {
  
  @scala.inline
  def apply(error: Error, view: View): UnsupportedLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedLayerLayerviewCreateErrorEvent]
  }
  
  @scala.inline
  implicit class UnsupportedLayerLayerviewCreateErrorEventMutableBuilder[Self <: UnsupportedLayerLayerviewCreateErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
