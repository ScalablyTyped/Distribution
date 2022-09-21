package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetView
  extends StObject
     with SheetView {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var DisplayFormulas: Boolean
  
  var DisplayGridlines: Boolean
  
  var DisplayHeadings: Boolean
  
  var DisplayOutline: Boolean
  
  var DisplayZeros: Boolean
  
  /* private */ @JSName("Excel.WorksheetView_typekey")
  var ExcelDotWorksheetView_typekey: WorksheetView
  
  val Parent: Any
  
  val Sheet: Worksheet
}
object WorksheetView {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    DisplayFormulas: Boolean,
    DisplayGridlines: Boolean,
    DisplayHeadings: Boolean,
    DisplayOutline: Boolean,
    DisplayZeros: Boolean,
    ExcelDotWorksheetView_typekey: WorksheetView,
    Parent: Any,
    Sheet: Worksheet
  ): WorksheetView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplayFormulas = DisplayFormulas.asInstanceOf[js.Any], DisplayGridlines = DisplayGridlines.asInstanceOf[js.Any], DisplayHeadings = DisplayHeadings.asInstanceOf[js.Any], DisplayOutline = DisplayOutline.asInstanceOf[js.Any], DisplayZeros = DisplayZeros.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.WorksheetView_typekey")(ExcelDotWorksheetView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetView]
  }
  
  extension [Self <: WorksheetView](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormulas(value: Boolean): Self = StObject.set(x, "DisplayFormulas", value.asInstanceOf[js.Any])
    
    inline def setDisplayGridlines(value: Boolean): Self = StObject.set(x, "DisplayGridlines", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeadings(value: Boolean): Self = StObject.set(x, "DisplayHeadings", value.asInstanceOf[js.Any])
    
    inline def setDisplayOutline(value: Boolean): Self = StObject.set(x, "DisplayOutline", value.asInstanceOf[js.Any])
    
    inline def setDisplayZeros(value: Boolean): Self = StObject.set(x, "DisplayZeros", value.asInstanceOf[js.Any])
    
    inline def setExcelDotWorksheetView_typekey(value: WorksheetView): Self = StObject.set(x, "Excel.WorksheetView_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: Worksheet): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
  }
}
