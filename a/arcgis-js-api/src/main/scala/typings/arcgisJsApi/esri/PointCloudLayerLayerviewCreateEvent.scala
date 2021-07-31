package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCloudLayerLayerviewCreateEvent extends StObject {
  
  var layerView: LayerView
  
  var view: View
}
object PointCloudLayerLayerviewCreateEvent {
  
  @scala.inline
  def apply(layerView: LayerView, view: View): PointCloudLayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudLayerLayerviewCreateEvent]
  }
  
  @scala.inline
  implicit class PointCloudLayerLayerviewCreateEventMutableBuilder[Self <: PointCloudLayerLayerviewCreateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerView(value: LayerView): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
