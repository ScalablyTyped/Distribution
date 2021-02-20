package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetView extends SheetView {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  var DisplayFormulas: Boolean = js.native
  
  var DisplayGridlines: Boolean = js.native
  
  var DisplayHeadings: Boolean = js.native
  
  var DisplayOutline: Boolean = js.native
  
  var DisplayZeros: Boolean = js.native
  
  @JSName("Excel.WorksheetView_typekey")
  var ExcelDotWorksheetView_typekey: WorksheetView = js.native
  
  val Parent: js.Any = js.native
  
  val Sheet: Worksheet = js.native
}
object WorksheetView {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    DisplayFormulas: Boolean,
    DisplayGridlines: Boolean,
    DisplayHeadings: Boolean,
    DisplayOutline: Boolean,
    DisplayZeros: Boolean,
    ExcelDotWorksheetView_typekey: WorksheetView,
    Parent: js.Any,
    Sheet: Worksheet
  ): WorksheetView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplayFormulas = DisplayFormulas.asInstanceOf[js.Any], DisplayGridlines = DisplayGridlines.asInstanceOf[js.Any], DisplayHeadings = DisplayHeadings.asInstanceOf[js.Any], DisplayOutline = DisplayOutline.asInstanceOf[js.Any], DisplayZeros = DisplayZeros.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.WorksheetView_typekey")(ExcelDotWorksheetView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetView]
  }
  
  @scala.inline
  implicit class WorksheetViewMutableBuilder[Self <: WorksheetView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFormulas(value: Boolean): Self = StObject.set(x, "DisplayFormulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayGridlines(value: Boolean): Self = StObject.set(x, "DisplayGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayHeadings(value: Boolean): Self = StObject.set(x, "DisplayHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOutline(value: Boolean): Self = StObject.set(x, "DisplayOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayZeros(value: Boolean): Self = StObject.set(x, "DisplayZeros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotWorksheetView_typekey(value: WorksheetView): Self = StObject.set(x, "Excel.WorksheetView_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet(value: Worksheet): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
  }
}
