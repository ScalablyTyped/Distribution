package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelWorksheet extends StObject {
  
  var name: String
  
  var table: ExcelTable
}
object ExcelWorksheet {
  
  inline def apply(name: String, table: ExcelTable): ExcelWorksheet = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelWorksheet]
  }
  
  extension [Self <: ExcelWorksheet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTable(value: ExcelTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
