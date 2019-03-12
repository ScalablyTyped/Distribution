package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Point")
@js.native
class Point protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var ApplyPictToEnd: scala.Boolean = js.native
  var ApplyPictToFront: scala.Boolean = js.native
  var ApplyPictToSides: scala.Boolean = js.native
  val Border: activexDashExcelLib.ExcelNs.Border = js.native
  val Creator: XlCreator = js.native
  val DataLabel: activexDashExcelLib.ExcelNs.DataLabel = js.native
  var `Excel.Point_typekey`: Point = js.native
  var Explosion: scala.Double = js.native
  val Fill: ChartFillFormat = js.native
  val Format: ChartFormat = js.native
  var Has3DEffect: scala.Boolean = js.native
  var HasDataLabel: scala.Boolean = js.native
  val Height: scala.Double = js.native
  val Interior: activexDashExcelLib.ExcelNs.Interior = js.native
  var InvertIfNegative: scala.Boolean = js.native
  val Left: scala.Double = js.native
  var MarkerBackgroundColor: scala.Double = js.native
  var MarkerBackgroundColorIndex: XlColorIndex = js.native
  var MarkerForegroundColor: scala.Double = js.native
  var MarkerForegroundColorIndex: XlColorIndex = js.native
  var MarkerSize: scala.Double = js.native
  var MarkerStyle: XlMarkerStyle = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var PictureType: XlChartPictureType = js.native
  var PictureUnit: scala.Double = js.native
  var PictureUnit2: scala.Double = js.native
  var SecondaryPlot: scala.Boolean = js.native
  var Shadow: scala.Boolean = js.native
  val Top: scala.Double = js.native
  val Width: scala.Double = js.native
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
  def Delete(): js.Any = js.native
  def Paste(): js.Any = js.native
  /** @param Index [Index=2] */
  def PieSliceLocation(loc: XlPieSliceLocation): scala.Double = js.native
  def PieSliceLocation(loc: XlPieSliceLocation, Index: XlPieSliceIndex): scala.Double = js.native
  def Select(): js.Any = js.native
  /** @param Type [Type=2] */
  def _ApplyDataLabels(): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any, AutoText: js.Any): js.Any = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any, AutoText: js.Any, HasLeaderLines: js.Any): js.Any = js.native
}

