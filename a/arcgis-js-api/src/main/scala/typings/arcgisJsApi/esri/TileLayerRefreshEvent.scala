package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayerRefreshEvent extends StObject {
  
  var dataChanged: Boolean
}
object TileLayerRefreshEvent {
  
  inline def apply(dataChanged: Boolean): TileLayerRefreshEvent = {
    val __obj = js.Dynamic.literal(dataChanged = dataChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerRefreshEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileLayerRefreshEvent] (val x: Self) extends AnyVal {
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
  }
}
