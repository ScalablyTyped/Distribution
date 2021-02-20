package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelNumberFormat extends StObject {
  
  var format: String = js.native
}
object ExcelNumberFormat {
  
  @scala.inline
  def apply(format: String): ExcelNumberFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelNumberFormat]
  }
  
  @scala.inline
  implicit class ExcelNumberFormatMutableBuilder[Self <: ExcelNumberFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
