package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTileLayerLayerviewDestroyEvent extends StObject {
  
  var layerView: LayerView
  
  var view: View
}
object BaseTileLayerLayerviewDestroyEvent {
  
  @scala.inline
  def apply(layerView: LayerView, view: View): BaseTileLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTileLayerLayerviewDestroyEvent]
  }
  
  @scala.inline
  implicit class BaseTileLayerLayerviewDestroyEventMutableBuilder[Self <: BaseTileLayerLayerviewDestroyEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerView(value: LayerView): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
