package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Style")
@js.native
class Style protected () extends js.Object {
  var AddIndent: Boolean = js.native
  val Application: typings.activexDashExcel.Excel.Application = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val BuiltIn: Boolean = js.native
  val Creator: XlCreator = js.native
  var `Excel.Style_typekey`: Style = js.native
  val Font: typings.activexDashExcel.Excel.Font = js.native
  var FormulaHidden: Boolean = js.native
  var HorizontalAlignment: XlHAlign = js.native
  var IncludeAlignment: Boolean = js.native
  var IncludeBorder: Boolean = js.native
  var IncludeFont: Boolean = js.native
  var IncludeNumber: Boolean = js.native
  var IncludePatterns: Boolean = js.native
  var IncludeProtection: Boolean = js.native
  var IndentLevel: Double = js.native
  val Interior: typings.activexDashExcel.Excel.Interior = js.native
  var Locked: Boolean = js.native
  var MergeCells: Boolean = js.native
  val Name: String = js.native
  val NameLocal: String = js.native
  var NumberFormat: String = js.native
  var NumberFormatLocal: String = js.native
  var Orientation: XlOrientation = js.native
  val Parent: js.Any = js.native
  var ReadingOrder: Double = js.native
  var ShrinkToFit: Boolean = js.native
  val Value: String = js.native
  var VerticalAlignment: XlVAlign = js.native
  var WrapText: Boolean = js.native
  val _Default: String = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Delete(): js.Any = js.native
}

