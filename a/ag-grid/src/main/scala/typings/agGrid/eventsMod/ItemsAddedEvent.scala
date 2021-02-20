package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsAddedEvent extends AgGridEvent {
  
  var items: js.Array[RowNode] = js.native
}
object ItemsAddedEvent {
  
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, items: js.Array[RowNode], `type`: String): ItemsAddedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsAddedEvent]
  }
  
  @scala.inline
  implicit class ItemsAddedEventMutableBuilder[Self <: ItemsAddedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[RowNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: RowNode*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
