package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationLayerLayerviewDestroyEvent extends StObject {
  
  var layerView: LayerView
  
  var view: View
}
object ElevationLayerLayerviewDestroyEvent {
  
  @scala.inline
  def apply(layerView: LayerView, view: View): ElevationLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationLayerLayerviewDestroyEvent]
  }
  
  @scala.inline
  implicit class ElevationLayerLayerviewDestroyEventMutableBuilder[Self <: ElevationLayerLayerviewDestroyEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerView(value: LayerView): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
