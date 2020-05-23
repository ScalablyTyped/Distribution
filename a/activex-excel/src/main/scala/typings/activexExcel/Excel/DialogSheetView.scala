package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSheetView extends SheetView {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.DialogSheetView_typekey")
  var ExcelDotDialogSheetView_typekey: DialogSheetView
  val Parent: js.Any
  val Sheet: DialogSheet
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
}

