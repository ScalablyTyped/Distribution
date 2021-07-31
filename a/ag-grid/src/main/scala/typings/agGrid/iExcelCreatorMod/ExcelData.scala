package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelData extends StObject {
  
  var `type`: ExcelDataType
  
  var value: String
}
object ExcelData {
  
  @scala.inline
  def apply(`type`: ExcelDataType, value: String): ExcelData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelData]
  }
  
  @scala.inline
  implicit class ExcelDataMutableBuilder[Self <: ExcelData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExcelDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
