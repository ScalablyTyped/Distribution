package typings.activexDashExcel.Excel

import typings.activexDashExcel.activexDashExcelNumbers.`0`
import typings.activexDashExcel.activexDashExcelNumbers.`10`
import typings.activexDashExcel.activexDashExcelNumbers.`11`
import typings.activexDashExcel.activexDashExcelNumbers.`12`
import typings.activexDashExcel.activexDashExcelNumbers.`13`
import typings.activexDashExcel.activexDashExcelNumbers.`14`
import typings.activexDashExcel.activexDashExcelNumbers.`15`
import typings.activexDashExcel.activexDashExcelNumbers.`1`
import typings.activexDashExcel.activexDashExcelNumbers.`2`
import typings.activexDashExcel.activexDashExcelNumbers.`3`
import typings.activexDashExcel.activexDashExcelNumbers.`4`
import typings.activexDashExcel.activexDashExcelNumbers.`5`
import typings.activexDashExcel.activexDashExcelNumbers.`6`
import typings.activexDashExcel.activexDashExcelNumbers.`7`
import typings.activexDashExcel.activexDashExcelNumbers.`8`
import typings.activexDashExcel.activexDashExcelNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.CellFormat")
@js.native
class CellFormat protected () extends js.Object {
  var AddIndent: Boolean = js.native
  val Application: typings.activexDashExcel.Excel.Application = js.native
  @JSName("Borders")
  var Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  var `Excel.CellFormat_typekey`: CellFormat = js.native
  var Font: typings.activexDashExcel.Excel.Font = js.native
  var FormulaHidden: Boolean | Null = js.native
  var HorizontalAlignment: HorizontalAlignments = js.native
  var IndentLevel: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
  var Interior: typings.activexDashExcel.Excel.Interior = js.native
  var Locked: Boolean | Null = js.native
  var MergeCells: Boolean = js.native
  var NumberFormat: String | Null = js.native
  var NumberFormatLocal: String | Null = js.native
  var Orientation: Double | XlOrientation = js.native
  val Parent: js.Any = js.native
  var ShrinkToFit: Boolean | Null = js.native
  var VerticalAlignment: VerticalAlignments = js.native
  var WrapText: Boolean | Null = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Clear(): Unit = js.native
}

