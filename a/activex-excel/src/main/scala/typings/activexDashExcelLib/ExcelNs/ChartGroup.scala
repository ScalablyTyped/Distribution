package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ChartGroup")
@js.native
class ChartGroup protected () extends js.Object {
  val Application: Application = js.native
  var AxisGroup: XlAxisGroup = js.native
  var BubbleScale: scala.Double = js.native
  val Creator: XlCreator = js.native
  var DoughnutHoleSize: scala.Double = js.native
  val DownBars: DownBars = js.native
  val DropLines: DropLines = js.native
  var `Excel.ChartGroup_typekey`: ChartGroup = js.native
  var FirstSliceAngle: scala.Double = js.native
  var GapWidth: scala.Double = js.native
  var Has3DShading: scala.Boolean = js.native
  var HasDropLines: scala.Boolean = js.native
  var HasHiLoLines: scala.Boolean = js.native
  var HasRadarAxisLabels: scala.Boolean = js.native
  var HasSeriesLines: scala.Boolean = js.native
  var HasUpDownBars: scala.Boolean = js.native
  val HiLoLines: HiLoLines = js.native
  val Index: scala.Double = js.native
  var Overlap: scala.Double = js.native
  val Parent: js.Any = js.native
  val RadarAxisLabels: TickLabels = js.native
  var SecondPlotSize: scala.Double = js.native
  val SeriesLines: SeriesLines = js.native
  var ShowNegativeBubbles: scala.Boolean = js.native
  var SizeRepresents: XlSizeRepresents = js.native
  var SplitType: XlChartSplitType = js.native
  var SplitValue: scala.Double = js.native
  var SubType: scala.Double = js.native
  var Type: scala.Double = js.native
  val UpBars: UpBars = js.native
  var VaryByCategories: scala.Boolean = js.native
  def SeriesCollection(): SeriesCollection | Series = js.native
  def SeriesCollection(Index: java.lang.String): SeriesCollection | Series = js.native
  def SeriesCollection(Index: scala.Double): SeriesCollection | Series = js.native
}

