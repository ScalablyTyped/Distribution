package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Series")
@js.native
class Series protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var ApplyPictToEnd: scala.Boolean = js.native
  var ApplyPictToFront: scala.Boolean = js.native
  var ApplyPictToSides: scala.Boolean = js.native
  var AxisGroup: XlAxisGroup = js.native
  var BarShape: XlBarShape = js.native
  val Border: activexDashExcelLib.ExcelNs.Border = js.native
  var BubbleSizes: java.lang.String = js.native
  var ChartType: XlChartType = js.native
  val Creator: XlCreator = js.native
  @JSName("DataLabels")
  var DataLabels_Original: DataLabels with (js.Function1[/* Index */ scala.Double, DataLabel]) = js.native
  val ErrorBars: activexDashExcelLib.ExcelNs.ErrorBars = js.native
  var `Excel.Series_typekey`: Series = js.native
  var Explosion: scala.Double = js.native
  val Fill: ChartFillFormat = js.native
  val Format: ChartFormat = js.native
  var Formula: java.lang.String = js.native
  var FormulaLocal: java.lang.String = js.native
  var FormulaR1C1: java.lang.String = js.native
  var FormulaR1C1Local: java.lang.String = js.native
  var Has3DEffect: scala.Boolean = js.native
  var HasDataLabels: scala.Boolean = js.native
  var HasErrorBars: scala.Boolean = js.native
  var HasLeaderLines: scala.Boolean = js.native
  val Interior: activexDashExcelLib.ExcelNs.Interior = js.native
  var InvertColor: scala.Double = js.native
  var InvertColorIndex: scala.Double = js.native
  var InvertIfNegative: scala.Boolean = js.native
  val LeaderLines: activexDashExcelLib.ExcelNs.LeaderLines = js.native
  var MarkerBackgroundColor: scala.Double = js.native
  var MarkerBackgroundColorIndex: XlColorIndex = js.native
  var MarkerForegroundColor: scala.Double = js.native
  var MarkerForegroundColorIndex: XlColorIndex = js.native
  var MarkerSize: scala.Double = js.native
  var MarkerStyle: XlMarkerStyle = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var PictureType: XlChartPictureType = js.native
  var PictureUnit: scala.Double = js.native
  var PictureUnit2: scala.Double = js.native
  val PlotColorIndex: scala.Double = js.native
  var PlotOrder: scala.Double = js.native
  @JSName("Points")
  var Points_Original: Points with (js.Function1[/* Index */ scala.Double, Point]) = js.native
  var Shadow: scala.Boolean = js.native
  var Smooth: scala.Boolean = js.native
  @JSName("Trendlines")
  var Trendlines_Original: Trendlines with (js.Function1[/* Index */ scala.Double | java.lang.String, Trendline]) = js.native
  var Type: scala.Double = js.native
  var Values: Range | stdLib.SafeArray[scala.Double] = js.native
  var XValues: Range | stdLib.SafeArray[scala.Double] = js.native
  def ApplyCustomType(ChartType: XlChartType): scala.Unit = js.native
  /** @param Type [Type=2] */
  def ApplyDataLabels(
    Type: js.UndefOr[XlDataLabelsType],
    LegendKey: js.UndefOr[scala.Boolean],
    AutoText: js.UndefOr[scala.Boolean],
    HasLeaderLines: js.UndefOr[scala.Boolean],
    ShowSeriesName: js.UndefOr[scala.Boolean],
    ShowCategoryName: js.UndefOr[scala.Boolean],
    ShowValue: js.UndefOr[scala.Boolean],
    ShowPercentage: js.UndefOr[scala.Boolean],
    ShowBubbleSize: js.UndefOr[scala.Boolean],
    Separator: js.UndefOr[java.lang.String]
  ): js.Any = js.native
  def ClearFormats(): js.Any = js.native
  def Copy(): js.Any = js.native
  def DataLabels(Index: scala.Double): DataLabel = js.native
  def Delete(): js.Any = js.native
  def ErrorBar(Direction: XlErrorBarDirection, Include: XlErrorBarInclude, Type: XlErrorBarType): js.Any = js.native
  def ErrorBar(Direction: XlErrorBarDirection, Include: XlErrorBarInclude, Type: XlErrorBarType, Amount: js.Any): js.Any = js.native
  def ErrorBar(
    Direction: XlErrorBarDirection,
    Include: XlErrorBarInclude,
    Type: XlErrorBarType,
    Amount: js.Any,
    MinusValues: js.Any
  ): js.Any = js.native
  def Paste(): js.Any = js.native
  def Points(Index: scala.Double): Point = js.native
  def Select(): js.Any = js.native
  def Trendlines(Index: java.lang.String): Trendline = js.native
  def Trendlines(Index: scala.Double): Trendline = js.native
  /** @param Type [Type=2] */
  def _ApplyDataLabels(): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any, AutoText: js.Any): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any, AutoText: js.Any, HasLeaderLines: js.Any): js.Any = js.native
}

