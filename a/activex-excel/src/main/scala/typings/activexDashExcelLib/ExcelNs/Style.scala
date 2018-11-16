package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Style")
@js.native
class Style protected () extends js.Object {
  var AddIndent: scala.Boolean = js.native
  val Application: Application = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val BuiltIn: scala.Boolean = js.native
  val Creator: XlCreator = js.native
  var `Excel.Style_typekey`: Style = js.native
  val Font: Font = js.native
  var FormulaHidden: scala.Boolean = js.native
  var HorizontalAlignment: XlHAlign = js.native
  var IncludeAlignment: scala.Boolean = js.native
  var IncludeBorder: scala.Boolean = js.native
  var IncludeFont: scala.Boolean = js.native
  var IncludeNumber: scala.Boolean = js.native
  var IncludePatterns: scala.Boolean = js.native
  var IncludeProtection: scala.Boolean = js.native
  var IndentLevel: scala.Double = js.native
  val Interior: Interior = js.native
  var Locked: scala.Boolean = js.native
  var MergeCells: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  val NameLocal: java.lang.String = js.native
  var NumberFormat: java.lang.String = js.native
  var NumberFormatLocal: java.lang.String = js.native
  var Orientation: XlOrientation = js.native
  val Parent: js.Any = js.native
  var ReadingOrder: scala.Double = js.native
  var ShrinkToFit: scala.Boolean = js.native
  val Value: java.lang.String = js.native
  var VerticalAlignment: XlVAlign = js.native
  var WrapText: scala.Boolean = js.native
  val _Default: java.lang.String = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Delete(): js.Any = js.native
}

