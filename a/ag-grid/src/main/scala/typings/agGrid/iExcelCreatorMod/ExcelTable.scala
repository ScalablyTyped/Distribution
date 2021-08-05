package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelTable extends StObject {
  
  var columns: js.Array[ExcelColumn]
  
  var rows: js.Array[ExcelRow]
}
object ExcelTable {
  
  inline def apply(columns: js.Array[ExcelColumn], rows: js.Array[ExcelRow]): ExcelTable = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelTable]
  }
  
  extension [Self <: ExcelTable](x: Self) {
    
    inline def setColumns(value: js.Array[ExcelColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: ExcelColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setRows(value: js.Array[ExcelRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: ExcelRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
