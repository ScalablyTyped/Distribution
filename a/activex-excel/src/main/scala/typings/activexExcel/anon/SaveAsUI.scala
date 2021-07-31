package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveAsUI extends StObject {
  
  var Cancel: Boolean
  
  val SaveAsUI: Boolean
  
  val Wb: Workbook
}
object SaveAsUI {
  
  @scala.inline
  def apply(Cancel: Boolean, SaveAsUI: Boolean, Wb: Workbook): SaveAsUI = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], SaveAsUI = SaveAsUI.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAsUI]
  }
  
  @scala.inline
  implicit class SaveAsUIMutableBuilder[Self <: SaveAsUI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsUI(value: Boolean): Self = StObject.set(x, "SaveAsUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
