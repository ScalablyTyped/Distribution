package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelWorksheet extends StObject {
  
  var name: String = js.native
  
  var table: ExcelTable = js.native
}
object ExcelWorksheet {
  
  @scala.inline
  def apply(name: String, table: ExcelTable): ExcelWorksheet = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelWorksheet]
  }
  
  @scala.inline
  implicit class ExcelWorksheetMutableBuilder[Self <: ExcelWorksheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: ExcelTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
