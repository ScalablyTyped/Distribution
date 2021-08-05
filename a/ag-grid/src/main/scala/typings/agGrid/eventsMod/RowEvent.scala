package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowEvent
  extends StObject
     with AgGridEvent {
  
  var context: js.Any
  
  var data: js.Any
  
  var event: js.UndefOr[Event] = js.undefined
  
  var node: RowNode
  
  var rowIndex: Double
  
  var rowPinned: String
}
object RowEvent {
  
  inline def apply(
    api: GridApi,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    node: RowNode,
    rowIndex: Double,
    rowPinned: String,
    `type`: String
  ): RowEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowPinned = rowPinned.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowEvent]
  }
  
  extension [Self <: RowEvent](x: Self) {
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowPinned(value: String): Self = StObject.set(x, "rowPinned", value.asInstanceOf[js.Any])
  }
}
