package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogSheetView extends SheetView {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.DialogSheetView_typekey")
  var ExcelDotDialogSheetView_typekey: DialogSheetView = js.native
  
  val Parent: js.Any = js.native
  
  val Sheet: DialogSheet = js.native
}
object DialogSheetView {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotDialogSheetView_typekey: DialogSheetView,
    Parent: js.Any,
    Sheet: DialogSheet
  ): DialogSheetView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DialogSheetView_typekey")(ExcelDotDialogSheetView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSheetView]
  }
  
  @scala.inline
  implicit class DialogSheetViewMutableBuilder[Self <: DialogSheetView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotDialogSheetView_typekey(value: DialogSheetView): Self = StObject.set(x, "Excel.DialogSheetView_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet(value: DialogSheet): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
  }
}
