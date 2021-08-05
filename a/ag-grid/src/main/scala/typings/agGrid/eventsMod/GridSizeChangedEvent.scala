package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridSizeChangedEvent
  extends StObject
     with AgGridEvent {
  
  var clientHeight: Double
  
  var clientWidth: Double
}
object GridSizeChangedEvent {
  
  inline def apply(api: GridApi, clientHeight: Double, clientWidth: Double, columnApi: ColumnApi, `type`: String): GridSizeChangedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSizeChangedEvent]
  }
  
  extension [Self <: GridSizeChangedEvent](x: Self) {
    
    inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
  }
}
