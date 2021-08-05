package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsAddedEvent
  extends StObject
     with AgGridEvent {
  
  var items: js.Array[RowNode]
}
object ItemsAddedEvent {
  
  inline def apply(api: GridApi, columnApi: ColumnApi, items: js.Array[RowNode], `type`: String): ItemsAddedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsAddedEvent]
  }
  
  extension [Self <: ItemsAddedEvent](x: Self) {
    
    inline def setItems(value: js.Array[RowNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: RowNode*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
