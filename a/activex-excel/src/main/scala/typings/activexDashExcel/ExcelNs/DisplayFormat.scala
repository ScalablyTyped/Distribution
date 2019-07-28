package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DisplayFormat")
@js.native
class DisplayFormat protected () extends js.Object {
  val AddIndent: Boolean | Null = js.native
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  var `Excel.DisplayFormat_typekey`: DisplayFormat = js.native
  val Font: typings.activexDashExcel.ExcelNs.Font = js.native
  val FormulaHidden: Boolean | Null = js.native
  val HorizontalAlignment: js.Any = js.native
  val IndentLevel: js.Any = js.native
  val Interior: typings.activexDashExcel.ExcelNs.Interior = js.native
  val Locked: Boolean | Null = js.native
  val MergeCells: Boolean = js.native
  val NumberFormat: String | Null = js.native
  val NumberFormatLocal: String | Null = js.native
  val Orientation: js.Any = js.native
  val Parent: js.Any = js.native
  val ReadingOrder: Double = js.native
  val ShrinkToFit: Boolean = js.native
  val Style: typings.activexDashExcel.ExcelNs.Style = js.native
  val VerticalAlignment: js.Any = js.native
  val WrapText: Boolean = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Characters(): typings.activexDashExcel.ExcelNs.Characters = js.native
  def Characters(Start: Double): typings.activexDashExcel.ExcelNs.Characters = js.native
  def Characters(Start: Double, Length: Double): typings.activexDashExcel.ExcelNs.Characters = js.native
}

