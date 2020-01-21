package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.WorksheetView")
@js.native
class WorksheetView protected () extends SheetView {
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

