package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLabels extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  var AutoScaleFont: js.Any = js.native
  var AutoText: Boolean = js.native
  val Border: typings.activexDashExcel.ExcelNs.Border = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Fill: ChartFillFormat = js.native
  val Font: typings.activexDashExcel.ExcelNs.Font = js.native
  val Format: ChartFormat = js.native
  var HorizontalAlignment: HorizontalAlignments = js.native
  val Interior: typings.activexDashExcel.ExcelNs.Interior = js.native
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
  var Type: js.Any = js.native
  var VerticalAlignment: VerticalAlignments = js.native
  def apply(Index: Double): DataLabel = js.native
  def Delete(): js.Any = js.native
  def Item(Index: Double): DataLabel = js.native
  def Select(): js.Any = js.native
  def _Default(Index: js.Any): DataLabel = js.native
}

