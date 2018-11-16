package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLabels extends js.Object {
  val Application: Application = js.native
  var AutoScaleFont: js.Any = js.native
  var AutoText: scala.Boolean = js.native
  val Border: Border = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Fill: ChartFillFormat = js.native
  val Font: Font = js.native
  val Format: ChartFormat = js.native
  var HorizontalAlignment: HorizontalAlignments = js.native
  val Interior: Interior = js.native
  val Name: java.lang.String = js.native
  var NumberFormat: java.lang.String = js.native
  var NumberFormatLinked: scala.Boolean = js.native
  var NumberFormatLocal: java.lang.String = js.native
  var Orientation: XlOrientation = js.native
  val Parent: js.Any = js.native
  var Position: XlDataLabelPosition = js.native
  var ReadingOrder: scala.Double = js.native
  var Separator: java.lang.String | XlDataLabelSeparator = js.native
  var Shadow: scala.Boolean = js.native
  var ShowBubbleSize: scala.Boolean = js.native
  var ShowCategoryName: scala.Boolean = js.native
  var ShowLegendKey: scala.Boolean = js.native
  var ShowPercentage: scala.Boolean = js.native
  var ShowSeriesName: scala.Boolean = js.native
  var ShowValue: scala.Boolean = js.native
  var Type: js.Any = js.native
  var VerticalAlignment: VerticalAlignments = js.native
  def apply(Index: scala.Double): DataLabel = js.native
  def Delete(): js.Any = js.native
  def Item(Index: scala.Double): DataLabel = js.native
  def Select(): js.Any = js.native
  def _Default(Index: js.Any): DataLabel = js.native
}

