package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DataLabel")
@js.native
class DataLabel protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var AutoScaleFont: js.Any = js.native
  var AutoText: Boolean = js.native
  val Border: typings.activexDashExcel.Excel.Border = js.native
  var Caption: String = js.native
  val Creator: XlCreator = js.native
  var `Excel.DataLabel_typekey`: DataLabel = js.native
  val Fill: ChartFillFormat = js.native
  val Font: typings.activexDashExcel.Excel.Font = js.native
  val Format: ChartFormat = js.native
  var Formula: String = js.native
  var FormulaLocal: String = js.native
  var FormulaR1C1: String = js.native
  var FormulaR1C1Local: String = js.native
  val Height: Double = js.native
  var HorizontalAlignment: HorizontalAlignments = js.native
  val Interior: typings.activexDashExcel.Excel.Interior = js.native
  var Left: Double = js.native
  val Name: String = js.native
  var NumberFormat: String = js.native
  var NumberFormatLinked: Boolean = js.native
  var NumberFormatLocal: String = js.native
  var Orientation: XlOrientation = js.native
  val Parent: js.Any = js.native
  var Position: XlDataLabelPosition = js.native
  var ReadingOrder: Double = js.native
  var Separator: String | XlDataLabelSeparator = js.native
  var Shadow: Boolean = js.native
  var ShowBubbleSize: Boolean = js.native
  var ShowCategoryName: Boolean = js.native
  var ShowLegendKey: Boolean = js.native
  var ShowPercentage: Boolean = js.native
  var ShowSeriesName: Boolean = js.native
  var ShowValue: Boolean = js.native
  var Text: String = js.native
  var Top: Double = js.native
  var Type: js.Any = js.native
  var VerticalAlignment: VerticalAlignments = js.native
  val Width: Double = js.native
  def Characters(): typings.activexDashExcel.Excel.Characters = js.native
  def Characters(Start: Double): typings.activexDashExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typings.activexDashExcel.Excel.Characters = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

