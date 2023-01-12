package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WMSLayerRefreshEvent extends StObject {
  
  var dataChanged: Boolean
}
object WMSLayerRefreshEvent {
  
  inline def apply(dataChanged: Boolean): WMSLayerRefreshEvent = {
    val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMSLayerRefreshEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WMSLayerRefreshEvent] (val x: Self) extends AnyVal {
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
  }
}
