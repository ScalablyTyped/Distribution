package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.IMsoChart")
@js.native
class IMsoChart protected () extends js.Object {
  val Application: js.Any = js.native
  val Area3DGroup: IMsoChartGroup = js.native
  var AutoScaling: scala.Boolean = js.native
  val BackWall: IMsoWalls = js.native
  val Bar3DGroup: IMsoChartGroup = js.native
  var BarShape: XlBarShape = js.native
  var CategoryLabelLevel: XlCategoryLabelLevel = js.native
  val ChartArea: IMsoChartArea = js.native
  var ChartColor: js.Any = js.native
  val ChartData: IMsoChartData = js.native
  var ChartStyle: js.Any = js.native
  val ChartTitle: IMsoChartTitle = js.native
  var ChartType: XlChartType = js.native
  val Column3DGroup: IMsoChartGroup = js.native
  val Corners: IMsoCorners = js.native
  val Creator: scala.Double = js.native
  val DataTable: IMsoDataTable = js.native
  var DepthPercent: scala.Double = js.native
  var DisplayBlanksAs: XlDisplayBlanksAs = js.native
  var Elevation: scala.Double = js.native
  val Floor: IMsoFloor = js.native
  val Format: IMsoChartFormat = js.native
  var GapDepth: scala.Double = js.native
  var HasDataTable: scala.Boolean = js.native
  val HasHiddenContent: scala.Boolean = js.native
  var HasLegend: scala.Boolean = js.native
  var HasPivotFields: scala.Boolean = js.native
  var HasTitle: scala.Boolean = js.native
  var HeightPercent: scala.Double = js.native
  val Legend: IMsoLegend = js.native
  val Line3DGroup: IMsoChartGroup = js.native
  var `Office.IMsoChart_typekey`: IMsoChart = js.native
  val Parent: js.Any = js.native
  var Perspective: scala.Double = js.native
  val Pie3DGroup: IMsoChartGroup = js.native
  val PivotLayout: js.Any = js.native
  val PlotArea: IMsoPlotArea = js.native
  var PlotBy: XlRowCol = js.native
  var PlotVisibleOnly: scala.Boolean = js.native
  var RightAngleAxes: js.Any = js.native
  var Rotation: js.Any = js.native
  var SeriesNameLevel: XlSeriesNameLevel = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  var ShowAllFieldButtons: scala.Boolean = js.native
  var ShowAxisFieldButtons: scala.Boolean = js.native
  var ShowDataLabelsOverMaximum: scala.Boolean = js.native
  var ShowExpandCollapseEntireFieldButtons: scala.Boolean = js.native
  var ShowLegendFieldButtons: scala.Boolean = js.native
  var ShowReportFilterFieldButtons: scala.Boolean = js.native
  var ShowValueFieldButtons: scala.Boolean = js.native
  val SideWall: IMsoWalls = js.native
  var SubType: scala.Double = js.native
  val SurfaceGroup: IMsoChartGroup = js.native
  var Type: scala.Double = js.native
  def ApplyChartTemplate(bstrFileName: java.lang.String): scala.Unit = js.native
  def ApplyCustomType(ChartType: XlChartType): scala.Unit = js.native
  def ApplyCustomType(ChartType: XlChartType, TypeName: js.Any): scala.Unit = js.native
  /** @param Type [Type=2] */
  def ApplyDataLabels(
    Type: js.UndefOr[XlDataLabelsType],
    IMsoLegendKey: js.UndefOr[js.Any],
    AutoText: js.UndefOr[js.Any],
    HasLeaderLines: js.UndefOr[js.Any],
    ShowSeriesName: js.UndefOr[js.Any],
    ShowCategoryName: js.UndefOr[js.Any],
    ShowValue: js.UndefOr[js.Any],
    ShowPercentage: js.UndefOr[js.Any],
    ShowBubbleSize: js.UndefOr[js.Any],
    Separator: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def ApplyLayout(Layout: scala.Double): scala.Unit = js.native
  def ApplyLayout(Layout: scala.Double, varChartType: js.Any): scala.Unit = js.native
  def AreaGroups(): js.Any = js.native
  def AreaGroups(Index: js.Any): js.Any = js.native
  def AutoFormat(rGallery: scala.Double): scala.Unit = js.native
  def AutoFormat(rGallery: scala.Double, varFormat: js.Any): scala.Unit = js.native
  /** @param AxisGroup [AxisGroup=1] */
  def Axes(Type: js.Any): js.Any = js.native
  /** @param AxisGroup [AxisGroup=1] */
  def Axes(Type: js.Any, AxisGroup: XlAxisGroup): js.Any = js.native
  def BarGroups(): js.Any = js.native
  def BarGroups(Index: js.Any): js.Any = js.native
  def ChartGroups(): js.Any = js.native
  def ChartGroups(pvarIndex: js.Any): js.Any = js.native
  def ChartGroups(pvarIndex: js.Any, varIgallery: js.Any): js.Any = js.native
  def ChartWizard(
    varSource: js.UndefOr[js.Any],
    varGallery: js.UndefOr[js.Any],
    varFormat: js.UndefOr[js.Any],
    varPlotBy: js.UndefOr[js.Any],
    varCategoryLabels: js.UndefOr[js.Any],
    varSeriesLabels: js.UndefOr[js.Any],
    varHasLegend: js.UndefOr[js.Any],
    varTitle: js.UndefOr[js.Any],
    varCategoryTitle: js.UndefOr[js.Any],
    varValueTitle: js.UndefOr[js.Any],
    varExtraTitle: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def ClearToMatchColorStyle(): scala.Unit = js.native
  def ClearToMatchStyle(): scala.Unit = js.native
  def ColumnGroups(): js.Any = js.native
  def ColumnGroups(Index: js.Any): js.Any = js.native
  def Copy(): js.Any = js.native
  /**
           * @param Appearance [Appearance=1]
           * @param Format [Format=-4147]
           * @param Size [Size=2]
           */
  def CopyPicture(): scala.Unit = js.native
  /**
           * @param Appearance [Appearance=1]
           * @param Format [Format=-4147]
           * @param Size [Size=2]
           */
  def CopyPicture(Appearance: scala.Double): scala.Unit = js.native
  /**
           * @param Appearance [Appearance=1]
           * @param Format [Format=-4147]
           * @param Size [Size=2]
           */
  def CopyPicture(Appearance: scala.Double, Format: scala.Double): scala.Unit = js.native
  /**
           * @param Appearance [Appearance=1]
           * @param Format [Format=-4147]
           * @param Size [Size=2]
           */
  def CopyPicture(Appearance: scala.Double, Format: scala.Double, Size: scala.Double): scala.Unit = js.native
  def Delete(): js.Any = js.native
  def DeleteHiddenContent(): scala.Unit = js.native
  def DoughnutGroups(): js.Any = js.native
  def DoughnutGroups(Index: js.Any): js.Any = js.native
  def Export(bstr: java.lang.String): scala.Boolean = js.native
  def Export(bstr: java.lang.String, varFilterName: js.Any): scala.Boolean = js.native
  def Export(bstr: java.lang.String, varFilterName: js.Any, varInteractive: js.Any): scala.Boolean = js.native
  def FullSeriesCollection(): js.Any = js.native
  def FullSeriesCollection(Index: js.Any): js.Any = js.native
  def GetChartElement(x: scala.Double, y: scala.Double, ElementID: scala.Double, Arg1: scala.Double, Arg2: scala.Double): scala.Unit = js.native
  def HasAxis(): js.Any = js.native
  def HasAxis(axisType: js.Any): js.Any = js.native
  def HasAxis(axisType: js.Any, AxisGroup: js.Any): js.Any = js.native
  def LineGroups(): js.Any = js.native
  def LineGroups(Index: js.Any): js.Any = js.native
  def PieGroups(): js.Any = js.native
  def PieGroups(Index: js.Any): js.Any = js.native
  def RadarGroups(): js.Any = js.native
  def RadarGroups(Index: js.Any): js.Any = js.native
  def Refresh(): scala.Unit = js.native
  def RefreshPivotTable(): scala.Unit = js.native
  def SaveChartTemplate(bstrFileName: java.lang.String): scala.Unit = js.native
  def Select(): js.Any = js.native
  def Select(Replace: js.Any): js.Any = js.native
  def SeriesCollection(): js.Any = js.native
  def SeriesCollection(Index: js.Any): js.Any = js.native
  def SetDefaultChart(varName: js.Any): scala.Unit = js.native
  def SetElement(RHS: MsoChartElementType): scala.Unit = js.native
  def SetSourceData(Source: java.lang.String): scala.Unit = js.native
  def SetSourceData(Source: java.lang.String, PlotBy: js.Any): scala.Unit = js.native
  def Shapes(Index: js.Any): Shape = js.native
  /** @param fBackWall [fBackWall=true] */
  def Walls(): IMsoWalls = js.native
  /** @param fBackWall [fBackWall=true] */
  def Walls(fBackWall: scala.Boolean): IMsoWalls = js.native
  def XYGroups(): js.Any = js.native
  def XYGroups(Index: js.Any): js.Any = js.native
  /** @param Type [Type=2] */
  def _ApplyDataLabels(): scala.Unit = js.native
  /** @param Type [Type=2] */
  def _ApplyDataLabels(Type: XlDataLabelsType): scala.Unit = js.native
  /** @param Type [Type=2] */
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: js.Any): scala.Unit = js.native
  /** @param Type [Type=2] */
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: js.Any, AutoText: js.Any): scala.Unit = js.native
  /** @param Type [Type=2] */
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: js.Any, AutoText: js.Any, HasLeaderLines: js.Any): scala.Unit = js.native
}

