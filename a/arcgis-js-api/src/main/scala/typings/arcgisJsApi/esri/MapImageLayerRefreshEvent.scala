package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapImageLayerRefreshEvent extends StObject {
  
  var dataChanged: Boolean
}
object MapImageLayerRefreshEvent {
  
  inline def apply(dataChanged: Boolean): MapImageLayerRefreshEvent = {
    val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapImageLayerRefreshEvent]
  }
  
  extension [Self <: MapImageLayerRefreshEvent](x: Self) {
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
  }
}
