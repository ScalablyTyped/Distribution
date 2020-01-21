package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Outline")
@js.native
class Outline protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var AutomaticStyles: Boolean = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Outline_typekey")
  var ExcelDotOutline_typekey: Outline = js.native
  val Parent: js.Any = js.native
  var SummaryColumn: XlSummaryColumn = js.native
  var SummaryRow: XlSummaryRow = js.native
  def ShowLevels(): js.Any = js.native
  def ShowLevels(RowLevels: Double): js.Any = js.native
  def ShowLevels(RowLevels: Double, ColumnLevels: Double): js.Any = js.native
}

