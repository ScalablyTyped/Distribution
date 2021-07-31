package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebTileLayerLayerviewCreateErrorEvent extends StObject {
  
  var error: Error
  
  var view: View
}
object WebTileLayerLayerviewCreateErrorEvent {
  
  @scala.inline
  def apply(error: Error, view: View): WebTileLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTileLayerLayerviewCreateErrorEvent]
  }
  
  @scala.inline
  implicit class WebTileLayerLayerviewCreateErrorEventMutableBuilder[Self <: WebTileLayerLayerviewCreateErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
