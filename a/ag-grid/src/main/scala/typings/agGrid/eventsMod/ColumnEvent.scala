package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnEvent extends AgGridEvent {
  
  var column: Column = js.native
  
  var columns: js.Array[Column] = js.native
  
  var source: ColumnEventType = js.native
}
object ColumnEvent {
  
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    columns: js.Array[Column],
    source: ColumnEventType,
    `type`: String
  ): ColumnEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEvent]
  }
  
  @scala.inline
  implicit class ColumnEventMutableBuilder[Self <: ColumnEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: ColumnEventType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
