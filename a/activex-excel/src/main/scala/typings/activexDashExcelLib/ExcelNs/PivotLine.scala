package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotLine")
@js.native
class PivotLine protected () extends js.Object {
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.PivotLine_typekey`: PivotLine = js.native
  val LineType: XlPivotLineType = js.native
  val Parent: js.Any = js.native
  @JSName("PivotLineCells")
  val PivotLineCells_Original: PivotLineCells = js.native
  val Position: scala.Double = js.native
  def PivotLineCells(Index: scala.Double): PivotCell = js.native
}

