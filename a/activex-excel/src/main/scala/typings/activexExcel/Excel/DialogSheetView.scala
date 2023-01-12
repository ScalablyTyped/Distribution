package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogSheetView
  extends StObject
     with SheetView {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.DialogSheetView_typekey")
  var ExcelDotDialogSheetView_typekey: DialogSheetView
  
  val Parent: Any
  
  val Sheet: DialogSheet
}
object DialogSheetView {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotDialogSheetView_typekey: DialogSheetView,
    Parent: Any,
    Sheet: DialogSheet
  ): DialogSheetView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DialogSheetView_typekey")(ExcelDotDialogSheetView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSheetView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogSheetView] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotDialogSheetView_typekey(value: DialogSheetView): Self = StObject.set(x, "Excel.DialogSheetView_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: DialogSheet): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
  }
}
