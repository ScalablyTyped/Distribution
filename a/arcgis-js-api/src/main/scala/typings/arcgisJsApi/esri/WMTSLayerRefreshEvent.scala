package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WMTSLayerRefreshEvent extends StObject {
  
  var dataChanged: Boolean
}
object WMTSLayerRefreshEvent {
  
  inline def apply(dataChanged: Boolean): WMTSLayerRefreshEvent = {
    val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMTSLayerRefreshEvent]
  }
  
  extension [Self <: WMTSLayerRefreshEvent](x: Self) {
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
  }
}
