package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTileLayerLayerviewCreateEvent extends StObject {
  
  var layerView: LayerView
  
  var view: View
}
object BaseTileLayerLayerviewCreateEvent {
  
  inline def apply(layerView: LayerView, view: View): BaseTileLayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTileLayerLayerviewCreateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseTileLayerLayerviewCreateEvent] (val x: Self) extends AnyVal {
    
    inline def setLayerView(value: LayerView): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
