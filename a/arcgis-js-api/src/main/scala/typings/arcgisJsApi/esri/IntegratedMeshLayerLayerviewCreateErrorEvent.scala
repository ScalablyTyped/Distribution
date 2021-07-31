package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegratedMeshLayerLayerviewCreateErrorEvent extends StObject {
  
  var error: Error
  
  var view: View
}
object IntegratedMeshLayerLayerviewCreateErrorEvent {
  
  @scala.inline
  def apply(error: Error, view: View): IntegratedMeshLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegratedMeshLayerLayerviewCreateErrorEvent]
  }
  
  @scala.inline
  implicit class IntegratedMeshLayerLayerviewCreateErrorEventMutableBuilder[Self <: IntegratedMeshLayerLayerviewCreateErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
