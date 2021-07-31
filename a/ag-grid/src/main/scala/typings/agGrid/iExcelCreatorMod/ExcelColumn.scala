package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelColumn extends StObject {
  
  var width: Double
}
object ExcelColumn {
  
  @scala.inline
  def apply(width: Double): ExcelColumn = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelColumn]
  }
  
  @scala.inline
  implicit class ExcelColumnMutableBuilder[Self <: ExcelColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
