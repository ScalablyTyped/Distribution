package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoRSSLayerRefreshEvent extends StObject {
  
  var dataChanged: Boolean
}
object GeoRSSLayerRefreshEvent {
  
  inline def apply(dataChanged: Boolean): GeoRSSLayerRefreshEvent = {
    val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoRSSLayerRefreshEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoRSSLayerRefreshEvent] (val x: Self) extends AnyVal {
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
  }
}
