package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerRefreshEvent extends StObject {
  
  var dataChanged: Boolean
}
object SubtypeGroupLayerRefreshEvent {
  
  inline def apply(dataChanged: Boolean): SubtypeGroupLayerRefreshEvent = {
    val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerRefreshEvent]
  }
  
  extension [Self <: SubtypeGroupLayerRefreshEvent](x: Self) {
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
  }
}
