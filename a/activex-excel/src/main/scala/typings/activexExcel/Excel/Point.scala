package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  /** @param Type [Type=2] */
  def ApplyDataLabels(
    Type: js.UndefOr[XlDataLabelsType],
    LegendKey: js.UndefOr[Boolean],
    AutoText: js.UndefOr[Boolean],
    HasLeaderLines: js.UndefOr[Boolean],
    ShowSeriesName: js.UndefOr[Boolean],
    ShowCategoryName: js.UndefOr[Boolean],
    ShowValue: js.UndefOr[Boolean],
    ShowPercentage: js.UndefOr[Boolean],
    ShowBubbleSize: js.UndefOr[Boolean],
    Separator: js.UndefOr[String]
  ): js.Any = js.native
  
  var ApplyPictToEnd: Boolean = js.native
  
  var ApplyPictToFront: Boolean = js.native
  
  var ApplyPictToSides: Boolean = js.native
  
  val Border: typings.activexExcel.Excel.Border = js.native
  
  def ClearFormats(): js.Any = js.native
  
  def Copy(): js.Any = js.native
  
  val Creator: XlCreator = js.native
  
  val DataLabel: typings.activexExcel.Excel.DataLabel = js.native
  
  def Delete(): js.Any = js.native
  
  @JSName("Excel.Point_typekey")
  var ExcelDotPoint_typekey: Point = js.native
  
  var Explosion: Double = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Format: ChartFormat = js.native
  
  var Has3DEffect: Boolean = js.native
  
  var HasDataLabel: Boolean = js.native
  
  val Height: Double = js.native
  
  val Interior: typings.activexExcel.Excel.Interior = js.native
  
  var InvertIfNegative: Boolean = js.native
  
  val Left: Double = js.native
  
  var MarkerBackgroundColor: Double = js.native
  
  var MarkerBackgroundColorIndex: XlColorIndex = js.native
  
  var MarkerForegroundColor: Double = js.native
  
  var MarkerForegroundColorIndex: XlColorIndex = js.native
  
  var MarkerSize: Double = js.native
  
  var MarkerStyle: XlMarkerStyle = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  def Paste(): js.Any = js.native
  
  var PictureType: XlChartPictureType = js.native
  
  var PictureUnit: Double = js.native
  
  var PictureUnit2: Double = js.native
  
  /** @param Index [Index=2] */
  def PieSliceLocation(loc: XlPieSliceLocation): Double = js.native
  def PieSliceLocation(loc: XlPieSliceLocation, Index: XlPieSliceIndex): Double = js.native
  
  var SecondaryPlot: Boolean = js.native
  
  def Select(): js.Any = js.native
  
  var Shadow: Boolean = js.native
  
  val Top: Double = js.native
  
  val Width: Double = js.native
  
  /** @param Type [Type=2] */
  def _ApplyDataLabels(): js.Any = js.native
  def _ApplyDataLabels(
    Type: js.UndefOr[scala.Nothing],
    LegendKey: js.UndefOr[scala.Nothing],
    AutoText: js.UndefOr[scala.Nothing],
    HasLeaderLines: js.Any
  ): js.Any = js.native
  def _ApplyDataLabels(Type: js.UndefOr[scala.Nothing], LegendKey: js.UndefOr[scala.Nothing], AutoText: js.Any): js.Any = js.native
  def _ApplyDataLabels(
    Type: js.UndefOr[scala.Nothing],
    LegendKey: js.UndefOr[scala.Nothing],
    AutoText: js.Any,
    HasLeaderLines: js.Any
  ): js.Any = js.native
  def _ApplyDataLabels(Type: js.UndefOr[scala.Nothing], LegendKey: js.Any): js.Any = js.native
  def _ApplyDataLabels(
    Type: js.UndefOr[scala.Nothing],
    LegendKey: js.Any,
    AutoText: js.UndefOr[scala.Nothing],
    HasLeaderLines: js.Any
  ): js.Any = js.native
  def _ApplyDataLabels(Type: js.UndefOr[scala.Nothing], LegendKey: js.Any, AutoText: js.Any): js.Any = js.native
  def _ApplyDataLabels(Type: js.UndefOr[scala.Nothing], LegendKey: js.Any, AutoText: js.Any, HasLeaderLines: js.Any): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType): js.Any = js.native
  def _ApplyDataLabels(
    Type: XlDataLabelsType,
    LegendKey: js.UndefOr[scala.Nothing],
    AutoText: js.UndefOr[scala.Nothing],
    HasLeaderLines: js.Any
  ): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.UndefOr[scala.Nothing], AutoText: js.Any): js.Any = js.native
  def _ApplyDataLabels(
    Type: XlDataLabelsType,
    LegendKey: js.UndefOr[scala.Nothing],
    AutoText: js.Any,
    HasLeaderLines: js.Any
  ): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any): js.Any = js.native
  def _ApplyDataLabels(
    Type: XlDataLabelsType,
    LegendKey: js.Any,
    AutoText: js.UndefOr[scala.Nothing],
    HasLeaderLines: js.Any
  ): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any, AutoText: js.Any): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any, AutoText: js.Any, HasLeaderLines: js.Any): js.Any = js.native
}
