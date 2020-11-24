package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMsoChart extends js.Object {
  
  val Application: js.Any = js.native
  
  def ApplyChartTemplate(bstrFileName: String): Unit = js.native
  
  def ApplyCustomType(ChartType: XlChartType): Unit = js.native
  def ApplyCustomType(ChartType: XlChartType, TypeName: js.Any): Unit = js.native
  
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
  ): Unit = js.native
  
  def ApplyLayout(Layout: Double): Unit = js.native
  def ApplyLayout(Layout: Double, varChartType: js.Any): Unit = js.native
  
  val Area3DGroup: IMsoChartGroup = js.native
  
  def AreaGroups(): js.Any = js.native
  def AreaGroups(Index: js.Any): js.Any = js.native
  
  def AutoFormat(rGallery: Double): Unit = js.native
  def AutoFormat(rGallery: Double, varFormat: js.Any): Unit = js.native
  
  var AutoScaling: Boolean = js.native
  
  /** @param AxisGroup [AxisGroup=1] */
  def Axes(Type: js.Any): js.Any = js.native
  def Axes(Type: js.Any, AxisGroup: XlAxisGroup): js.Any = js.native
  
  val BackWall: IMsoWalls = js.native
  
  val Bar3DGroup: IMsoChartGroup = js.native
  
  def BarGroups(): js.Any = js.native
  def BarGroups(Index: js.Any): js.Any = js.native
  
  var BarShape: XlBarShape = js.native
  
  var CategoryLabelLevel: XlCategoryLabelLevel = js.native
  
  val ChartArea: IMsoChartArea = js.native
  
  var ChartColor: js.Any = js.native
  
  val ChartData: IMsoChartData = js.native
  
  def ChartGroups(): js.Any = js.native
  def ChartGroups(pvarIndex: js.UndefOr[scala.Nothing], varIgallery: js.Any): js.Any = js.native
  def ChartGroups(pvarIndex: js.Any): js.Any = js.native
  def ChartGroups(pvarIndex: js.Any, varIgallery: js.Any): js.Any = js.native
  
  var ChartStyle: js.Any = js.native
  
  val ChartTitle: IMsoChartTitle = js.native
  
  var ChartType: XlChartType = js.native
  
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
  ): Unit = js.native
  
  def ClearToMatchColorStyle(): Unit = js.native
  
  def ClearToMatchStyle(): Unit = js.native
  
  val Column3DGroup: IMsoChartGroup = js.native
  
  def ColumnGroups(): js.Any = js.native
  def ColumnGroups(Index: js.Any): js.Any = js.native
  
  def Copy(): js.Any = js.native
  
  /**
    * @param Appearance [Appearance=1]
    * @param Format [Format=-4147]
    * @param Size [Size=2]
    */
  def CopyPicture(): Unit = js.native
  def CopyPicture(Appearance: js.UndefOr[scala.Nothing], Format: js.UndefOr[scala.Nothing], Size: Double): Unit = js.native
  def CopyPicture(Appearance: js.UndefOr[scala.Nothing], Format: Double): Unit = js.native
  def CopyPicture(Appearance: js.UndefOr[scala.Nothing], Format: Double, Size: Double): Unit = js.native
  def CopyPicture(Appearance: Double): Unit = js.native
  def CopyPicture(Appearance: Double, Format: js.UndefOr[scala.Nothing], Size: Double): Unit = js.native
  def CopyPicture(Appearance: Double, Format: Double): Unit = js.native
  def CopyPicture(Appearance: Double, Format: Double, Size: Double): Unit = js.native
  
  val Corners: IMsoCorners = js.native
  
  val Creator: Double = js.native
  
  val DataTable: IMsoDataTable = js.native
  
  def Delete(): js.Any = js.native
  
  def DeleteHiddenContent(): Unit = js.native
  
  var DepthPercent: Double = js.native
  
  var DisplayBlanksAs: XlDisplayBlanksAs = js.native
  
  def DoughnutGroups(): js.Any = js.native
  def DoughnutGroups(Index: js.Any): js.Any = js.native
  
  var Elevation: Double = js.native
  
  def Export(bstr: String): Boolean = js.native
  def Export(bstr: String, varFilterName: js.UndefOr[scala.Nothing], varInteractive: js.Any): Boolean = js.native
  def Export(bstr: String, varFilterName: js.Any): Boolean = js.native
  def Export(bstr: String, varFilterName: js.Any, varInteractive: js.Any): Boolean = js.native
  
  val Floor: IMsoFloor = js.native
  
  val Format: IMsoChartFormat = js.native
  
  def FullSeriesCollection(): js.Any = js.native
  def FullSeriesCollection(Index: js.Any): js.Any = js.native
  
  var GapDepth: Double = js.native
  
  def GetChartElement(x: Double, y: Double, ElementID: Double, Arg1: Double, Arg2: Double): Unit = js.native
  
  def HasAxis(): js.Any = js.native
  def HasAxis(axisType: js.UndefOr[scala.Nothing], AxisGroup: js.Any): js.Any = js.native
  def HasAxis(axisType: js.Any): js.Any = js.native
  def HasAxis(axisType: js.Any, AxisGroup: js.Any): js.Any = js.native
  
  var HasDataTable: Boolean = js.native
  
  val HasHiddenContent: Boolean = js.native
  
  var HasLegend: Boolean = js.native
  
  var HasPivotFields: Boolean = js.native
  
  var HasTitle: Boolean = js.native
  
  var HeightPercent: Double = js.native
  
  val Legend: IMsoLegend = js.native
  
  val Line3DGroup: IMsoChartGroup = js.native
  
  def LineGroups(): js.Any = js.native
  def LineGroups(Index: js.Any): js.Any = js.native
  
  @JSName("Office.IMsoChart_typekey")
  var OfficeDotIMsoChart_typekey: IMsoChart = js.native
  
  val Parent: js.Any = js.native
  
  var Perspective: Double = js.native
  
  val Pie3DGroup: IMsoChartGroup = js.native
  
  def PieGroups(): js.Any = js.native
  def PieGroups(Index: js.Any): js.Any = js.native
  
  val PivotLayout: js.Any = js.native
  
  val PlotArea: IMsoPlotArea = js.native
  
  var PlotBy: XlRowCol = js.native
  
  var PlotVisibleOnly: Boolean = js.native
  
  def RadarGroups(): js.Any = js.native
  def RadarGroups(Index: js.Any): js.Any = js.native
  
  def Refresh(): Unit = js.native
  
  def RefreshPivotTable(): Unit = js.native
  
  var RightAngleAxes: js.Any = js.native
  
  var Rotation: js.Any = js.native
  
  def SaveChartTemplate(bstrFileName: String): Unit = js.native
  
  def Select(): js.Any = js.native
  def Select(Replace: js.Any): js.Any = js.native
  
  def SeriesCollection(): js.Any = js.native
  def SeriesCollection(Index: js.Any): js.Any = js.native
  
  var SeriesNameLevel: XlSeriesNameLevel = js.native
  
  def SetDefaultChart(varName: js.Any): Unit = js.native
  
  def SetElement(RHS: MsoChartElementType): Unit = js.native
  
  def SetSourceData(Source: String): Unit = js.native
  def SetSourceData(Source: String, PlotBy: js.Any): Unit = js.native
  
  def Shapes(Index: js.Any): Shape = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  
  var ShowAllFieldButtons: Boolean = js.native
  
  var ShowAxisFieldButtons: Boolean = js.native
  
  var ShowDataLabelsOverMaximum: Boolean = js.native
  
  var ShowExpandCollapseEntireFieldButtons: Boolean = js.native
  
  var ShowLegendFieldButtons: Boolean = js.native
  
  var ShowReportFilterFieldButtons: Boolean = js.native
  
  var ShowValueFieldButtons: Boolean = js.native
  
  val SideWall: IMsoWalls = js.native
  
  var SubType: Double = js.native
  
  val SurfaceGroup: IMsoChartGroup = js.native
  
  var Type: Double = js.native
  
  /** @param fBackWall [fBackWall=true] */
  def Walls(): IMsoWalls = js.native
  def Walls(fBackWall: Boolean): IMsoWalls = js.native
  
  def XYGroups(): js.Any = js.native
  def XYGroups(Index: js.Any): js.Any = js.native
  
  /** @param Type [Type=2] */
  def _ApplyDataLabels(): Unit = js.native
  def _ApplyDataLabels(
    Type: js.UndefOr[scala.Nothing],
    IMsoLegendKey: js.UndefOr[scala.Nothing],
    AutoText: js.UndefOr[scala.Nothing],
    HasLeaderLines: js.Any
  ): Unit = js.native
  def _ApplyDataLabels(Type: js.UndefOr[scala.Nothing], IMsoLegendKey: js.UndefOr[scala.Nothing], AutoText: js.Any): Unit = js.native
  def _ApplyDataLabels(
    Type: js.UndefOr[scala.Nothing],
    IMsoLegendKey: js.UndefOr[scala.Nothing],
    AutoText: js.Any,
    HasLeaderLines: js.Any
  ): Unit = js.native
  def _ApplyDataLabels(Type: js.UndefOr[scala.Nothing], IMsoLegendKey: js.Any): Unit = js.native
  def _ApplyDataLabels(
    Type: js.UndefOr[scala.Nothing],
    IMsoLegendKey: js.Any,
    AutoText: js.UndefOr[scala.Nothing],
    HasLeaderLines: js.Any
  ): Unit = js.native
  def _ApplyDataLabels(Type: js.UndefOr[scala.Nothing], IMsoLegendKey: js.Any, AutoText: js.Any): Unit = js.native
  def _ApplyDataLabels(Type: js.UndefOr[scala.Nothing], IMsoLegendKey: js.Any, AutoText: js.Any, HasLeaderLines: js.Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType): Unit = js.native
  def _ApplyDataLabels(
    Type: XlDataLabelsType,
    IMsoLegendKey: js.UndefOr[scala.Nothing],
    AutoText: js.UndefOr[scala.Nothing],
    HasLeaderLines: js.Any
  ): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: js.UndefOr[scala.Nothing], AutoText: js.Any): Unit = js.native
  def _ApplyDataLabels(
    Type: XlDataLabelsType,
    IMsoLegendKey: js.UndefOr[scala.Nothing],
    AutoText: js.Any,
    HasLeaderLines: js.Any
  ): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: js.Any): Unit = js.native
  def _ApplyDataLabels(
    Type: XlDataLabelsType,
    IMsoLegendKey: js.Any,
    AutoText: js.UndefOr[scala.Nothing],
    HasLeaderLines: js.Any
  ): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: js.Any, AutoText: js.Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: js.Any, AutoText: js.Any, HasLeaderLines: js.Any): Unit = js.native
}
