package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexExcel.Excel.WorksheetView
  - typings.activexExcel.Excel.DialogSheetView
*/
trait SheetView extends js.Object

object SheetView {
  @scala.inline
  def WorksheetView(
    Application: Application,
    Creator: XlCreator,
    DisplayFormulas: Boolean,
    DisplayGridlines: Boolean,
    DisplayHeadings: Boolean,
    DisplayOutline: Boolean,
    DisplayZeros: Boolean,
    ExcelDotWorksheetView_typekey: typings.activexExcel.Excel.WorksheetView,
    Parent: js.Any,
    Sheet: Worksheet
  ): SheetView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplayFormulas = DisplayFormulas.asInstanceOf[js.Any], DisplayGridlines = DisplayGridlines.asInstanceOf[js.Any], DisplayHeadings = DisplayHeadings.asInstanceOf[js.Any], DisplayOutline = DisplayOutline.asInstanceOf[js.Any], DisplayZeros = DisplayZeros.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.WorksheetView_typekey")(ExcelDotWorksheetView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetView]
  }
  @scala.inline
  def DialogSheetView(
    Application: Application,
    Creator: XlCreator,
    ExcelDotDialogSheetView_typekey: typings.activexExcel.Excel.DialogSheetView,
    Parent: js.Any,
    Sheet: DialogSheet
  ): SheetView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DialogSheetView_typekey")(ExcelDotDialogSheetView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetView]
  }
}

