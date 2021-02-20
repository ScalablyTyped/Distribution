package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelTable extends StObject {
  
  var columns: js.Array[ExcelColumn] = js.native
  
  var rows: js.Array[ExcelRow] = js.native
}
object ExcelTable {
  
  @scala.inline
  def apply(columns: js.Array[ExcelColumn], rows: js.Array[ExcelRow]): ExcelTable = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelTable]
  }
  
  @scala.inline
  implicit class ExcelTableMutableBuilder[Self <: ExcelTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[ExcelColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: ExcelColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[ExcelRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: ExcelRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
