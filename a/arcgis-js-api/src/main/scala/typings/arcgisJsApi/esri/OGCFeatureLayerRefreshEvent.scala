package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OGCFeatureLayerRefreshEvent extends StObject {
  
  var dataChanged: Boolean
}
object OGCFeatureLayerRefreshEvent {
  
  inline def apply(dataChanged: Boolean): OGCFeatureLayerRefreshEvent = {
    val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[OGCFeatureLayerRefreshEvent]
  }
  
  extension [Self <: OGCFeatureLayerRefreshEvent](x: Self) {
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
  }
}
