package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnRequestEvent extends AgGridEvent {
  
  var columns: js.Array[Column] = js.native
}
object ColumnRequestEvent {
  
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, columns: js.Array[Column], `type`: String): ColumnRequestEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnRequestEvent]
  }
  
  @scala.inline
  implicit class ColumnRequestEventMutableBuilder[Self <: ColumnRequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
  }
}
