package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetView extends SheetView {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  var DisplayFormulas: Boolean
  var DisplayGridlines: Boolean
  var DisplayHeadings: Boolean
  var DisplayOutline: Boolean
  var DisplayZeros: Boolean
  @JSName("Excel.WorksheetView_typekey")
  var ExcelDotWorksheetView_typekey: WorksheetView
  val Parent: js.Any
  val Sheet: Worksheet
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
}

