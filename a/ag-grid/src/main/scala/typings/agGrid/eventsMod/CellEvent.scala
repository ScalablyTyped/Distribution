package typings.agGrid.eventsMod

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellEvent extends RowEvent {
  
  var colDef: ColDef = js.native
  
  var column: Column = js.native
  
  var value: js.Any = js.native
}
object CellEvent {
  
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    node: RowNode,
    rowIndex: Double,
    rowPinned: String,
    `type`: String,
    value: js.Any
  ): CellEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowPinned = rowPinned.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellEvent]
  }
  
  @scala.inline
  implicit class CellEventMutableBuilder[Self <: CellEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColDef(value: ColDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
