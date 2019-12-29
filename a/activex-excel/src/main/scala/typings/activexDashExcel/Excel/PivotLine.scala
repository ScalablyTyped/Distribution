package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotLine")
@js.native
class PivotLine protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.PivotLine_typekey")
  var ExcelDotPivotLine_typekey: PivotLine = js.native
  val LineType: XlPivotLineType = js.native
  val Parent: js.Any = js.native
  @JSName("PivotLineCells")
  val PivotLineCells_Original: PivotLineCells = js.native
  val Position: Double = js.native
  def PivotLineCells(Index: Double): PivotCell = js.native
}

