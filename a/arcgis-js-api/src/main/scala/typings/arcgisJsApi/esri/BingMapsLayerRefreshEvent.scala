package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BingMapsLayerRefreshEvent extends StObject {
  
  var dataChanged: Boolean
}
object BingMapsLayerRefreshEvent {
  
  inline def apply(dataChanged: Boolean): BingMapsLayerRefreshEvent = {
    val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingMapsLayerRefreshEvent]
  }
  
  extension [Self <: BingMapsLayerRefreshEvent](x: Self) {
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
  }
}
