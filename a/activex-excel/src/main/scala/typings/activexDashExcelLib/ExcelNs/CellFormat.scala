package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.CellFormat")
@js.native
class CellFormat protected () extends js.Object {
  var AddIndent: scala.Boolean = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  @JSName("Borders")
  var Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  var `Excel.CellFormat_typekey`: CellFormat = js.native
  var Font: activexDashExcelLib.ExcelNs.Font = js.native
  var FormulaHidden: scala.Boolean | scala.Null = js.native
  var HorizontalAlignment: HorizontalAlignments = js.native
  var IndentLevel: activexDashExcelLib.activexDashExcelLibNumbers.`0` | activexDashExcelLib.activexDashExcelLibNumbers.`1` | activexDashExcelLib.activexDashExcelLibNumbers.`2` | activexDashExcelLib.activexDashExcelLibNumbers.`3` | activexDashExcelLib.activexDashExcelLibNumbers.`4` | activexDashExcelLib.activexDashExcelLibNumbers.`5` | activexDashExcelLib.activexDashExcelLibNumbers.`6` | activexDashExcelLib.activexDashExcelLibNumbers.`7` | activexDashExcelLib.activexDashExcelLibNumbers.`8` | activexDashExcelLib.activexDashExcelLibNumbers.`9` | activexDashExcelLib.activexDashExcelLibNumbers.`10` | activexDashExcelLib.activexDashExcelLibNumbers.`11` | activexDashExcelLib.activexDashExcelLibNumbers.`12` | activexDashExcelLib.activexDashExcelLibNumbers.`13` | activexDashExcelLib.activexDashExcelLibNumbers.`14` | activexDashExcelLib.activexDashExcelLibNumbers.`15` = js.native
  var Interior: activexDashExcelLib.ExcelNs.Interior = js.native
  var Locked: scala.Boolean | scala.Null = js.native
  var MergeCells: scala.Boolean = js.native
  var NumberFormat: java.lang.String | scala.Null = js.native
  var NumberFormatLocal: java.lang.String | scala.Null = js.native
  var Orientation: scala.Double | XlOrientation = js.native
  val Parent: js.Any = js.native
  var ShrinkToFit: scala.Boolean | scala.Null = js.native
  var VerticalAlignment: VerticalAlignments = js.native
  var WrapText: scala.Boolean | scala.Null = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Clear(): scala.Unit = js.native
}

