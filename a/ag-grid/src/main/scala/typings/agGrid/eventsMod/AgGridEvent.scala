package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgGridEvent
  extends StObject
     with AgEvent {
  
  var api: GridApi
  
  var columnApi: ColumnApi
}
object AgGridEvent {
  
  inline def apply(api: GridApi, columnApi: ColumnApi, `type`: String): AgGridEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgGridEvent]
  }
  
  extension [Self <: AgGridEvent](x: Self) {
    
    inline def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
  }
}
