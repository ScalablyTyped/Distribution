package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DisplayFormat")
@js.native
class DisplayFormat protected () extends js.Object {
  val AddIndent: Boolean | Null = js.native
  val Application: typings.activexDashExcel.Excel.Application = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.DisplayFormat_typekey")
  var ExcelDotDisplayFormat_typekey: DisplayFormat = js.native
  val Font: typings.activexDashExcel.Excel.Font = js.native
  val FormulaHidden: Boolean | Null = js.native
  val HorizontalAlignment: js.Any = js.native
  val IndentLevel: js.Any = js.native
  val Interior: typings.activexDashExcel.Excel.Interior = js.native
  val Locked: Boolean | Null = js.native
  val MergeCells: Boolean = js.native
  val NumberFormat: String | Null = js.native
  val NumberFormatLocal: String | Null = js.native
  val Orientation: js.Any = js.native
  val Parent: js.Any = js.native
  val ReadingOrder: Double = js.native
  val ShrinkToFit: Boolean = js.native
  val Style: typings.activexDashExcel.Excel.Style = js.native
  val VerticalAlignment: js.Any = js.native
  val WrapText: Boolean = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Characters(): typings.activexDashExcel.Excel.Characters = js.native
  def Characters(Start: Double): typings.activexDashExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typings.activexDashExcel.Excel.Characters = js.native
}

