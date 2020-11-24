package typings.activexExcel.Excel

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
  implicit class DialogSheetViewOps[Self <: DialogSheetView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotDialogSheetView_typekey(value: DialogSheetView): Self = this.set("Excel.DialogSheetView_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet(value: DialogSheet): Self = this.set("Sheet", value.asInstanceOf[js.Any])
  }
}
