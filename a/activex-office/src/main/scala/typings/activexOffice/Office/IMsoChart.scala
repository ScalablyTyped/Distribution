package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMsoChart extends StObject {
  
  val Application: Any = js.native
  
  def ApplyChartTemplate(bstrFileName: String): Unit = js.native
  
  def ApplyCustomType(ChartType: XlChartType): Unit = js.native
  def ApplyCustomType(ChartType: XlChartType, TypeName: Any): Unit = js.native
  
  /** @param Type [Type=2] */
  def ApplyDataLabels(
    Type: js.UndefOr[XlDataLabelsType],
    IMsoLegendKey: js.UndefOr[Any],
    AutoText: js.UndefOr[Any],
    HasLeaderLines: js.UndefOr[Any],
    ShowSeriesName: js.UndefOr[Any],
    ShowCategoryName: js.UndefOr[Any],
    ShowValue: js.UndefOr[Any],
    ShowPercentage: js.UndefOr[Any],
    ShowBubbleSize: js.UndefOr[Any],
    Separator: js.UndefOr[Any]
  ): Unit = js.native
  
  def ApplyLayout(Layout: Double): Unit = js.native
  def ApplyLayout(Layout: Double, varChartType: Any): Unit = js.native
  
  val Area3DGroup: IMsoChartGroup = js.native
  
  def AreaGroups(): Any = js.native
  def AreaGroups(Index: Any): Any = js.native
  
  def AutoFormat(rGallery: Double): Unit = js.native
  def AutoFormat(rGallery: Double, varFormat: Any): Unit = js.native
  
  var AutoScaling: Boolean = js.native
  
  /** @param AxisGroup [AxisGroup=1] */
  def Axes(Type: Any): Any = js.native
  def Axes(Type: Any, AxisGroup: XlAxisGroup): Any = js.native
  
  val BackWall: IMsoWalls = js.native
  
  val Bar3DGroup: IMsoChartGroup = js.native
  
  def BarGroups(): Any = js.native
  def BarGroups(Index: Any): Any = js.native
  
  var BarShape: XlBarShape = js.native
  
  var CategoryLabelLevel: XlCategoryLabelLevel = js.native
  
  val ChartArea: IMsoChartArea = js.native
  
  var ChartColor: Any = js.native
  
  val ChartData: IMsoChartData = js.native
  
  def ChartGroups(): Any = js.native
  def ChartGroups(pvarIndex: Any): Any = js.native
  def ChartGroups(pvarIndex: Any, varIgallery: Any): Any = js.native
  def ChartGroups(pvarIndex: Unit, varIgallery: Any): Any = js.native
  
  var ChartStyle: Any = js.native
  
  val ChartTitle: IMsoChartTitle = js.native
  
  var ChartType: XlChartType = js.native
  
  def ChartWizard(
    varSource: js.UndefOr[Any],
    varGallery: js.UndefOr[Any],
    varFormat: js.UndefOr[Any],
    varPlotBy: js.UndefOr[Any],
    varCategoryLabels: js.UndefOr[Any],
    varSeriesLabels: js.UndefOr[Any],
    varHasLegend: js.UndefOr[Any],
    varTitle: js.UndefOr[Any],
    varCategoryTitle: js.UndefOr[Any],
    varValueTitle: js.UndefOr[Any],
    varExtraTitle: js.UndefOr[Any]
  ): Unit = js.native
  
  def ClearToMatchColorStyle(): Unit = js.native
  
  def ClearToMatchStyle(): Unit = js.native
  
  val Column3DGroup: IMsoChartGroup = js.native
  
  def ColumnGroups(): Any = js.native
  def ColumnGroups(Index: Any): Any = js.native
  
  def Copy(): Any = js.native
  
  /**
    * @param Appearance [Appearance=1]
    * @param Format [Format=-4147]
    * @param Size [Size=2]
    */
  def CopyPicture(): Unit = js.native
  def CopyPicture(Appearance: Double): Unit = js.native
  def CopyPicture(Appearance: Double, Format: Double): Unit = js.native
  def CopyPicture(Appearance: Double, Format: Double, Size: Double): Unit = js.native
  def CopyPicture(Appearance: Double, Format: Unit, Size: Double): Unit = js.native
  def CopyPicture(Appearance: Unit, Format: Double): Unit = js.native
  def CopyPicture(Appearance: Unit, Format: Double, Size: Double): Unit = js.native
  def CopyPicture(Appearance: Unit, Format: Unit, Size: Double): Unit = js.native
  
  val Corners: IMsoCorners = js.native
  
  val Creator: Double = js.native
  
  val DataTable: IMsoDataTable = js.native
  
  def Delete(): Any = js.native
  
  def DeleteHiddenContent(): Unit = js.native
  
  var DepthPercent: Double = js.native
  
  var DisplayBlanksAs: XlDisplayBlanksAs = js.native
  
  def DoughnutGroups(): Any = js.native
  def DoughnutGroups(Index: Any): Any = js.native
  
  var Elevation: Double = js.native
  
  def Export(bstr: String): Boolean = js.native
  def Export(bstr: String, varFilterName: Any): Boolean = js.native
  def Export(bstr: String, varFilterName: Any, varInteractive: Any): Boolean = js.native
  def Export(bstr: String, varFilterName: Unit, varInteractive: Any): Boolean = js.native
  
  val Floor: IMsoFloor = js.native
  
  val Format: IMsoChartFormat = js.native
  
  def FullSeriesCollection(): Any = js.native
  def FullSeriesCollection(Index: Any): Any = js.native
  
  var GapDepth: Double = js.native
  
  def GetChartElement(x: Double, y: Double, ElementID: Double, Arg1: Double, Arg2: Double): Unit = js.native
  
  def HasAxis(): Any = js.native
  def HasAxis(axisType: Any): Any = js.native
  def HasAxis(axisType: Any, AxisGroup: Any): Any = js.native
  def HasAxis(axisType: Unit, AxisGroup: Any): Any = js.native
  
  var HasDataTable: Boolean = js.native
  
  val HasHiddenContent: Boolean = js.native
  
  var HasLegend: Boolean = js.native
  
  var HasPivotFields: Boolean = js.native
  
  var HasTitle: Boolean = js.native
  
  var HeightPercent: Double = js.native
  
  val Legend: IMsoLegend = js.native
  
  val Line3DGroup: IMsoChartGroup = js.native
  
  def LineGroups(): Any = js.native
  def LineGroups(Index: Any): Any = js.native
  
  /* private */ @JSName("Office.IMsoChart_typekey")
  var OfficeDotIMsoChart_typekey: IMsoChart = js.native
  
  val Parent: Any = js.native
  
  var Perspective: Double = js.native
  
  val Pie3DGroup: IMsoChartGroup = js.native
  
  def PieGroups(): Any = js.native
  def PieGroups(Index: Any): Any = js.native
  
  val PivotLayout: Any = js.native
  
  val PlotArea: IMsoPlotArea = js.native
  
  var PlotBy: XlRowCol = js.native
  
  var PlotVisibleOnly: Boolean = js.native
  
  def RadarGroups(): Any = js.native
  def RadarGroups(Index: Any): Any = js.native
  
  def Refresh(): Unit = js.native
  
  def RefreshPivotTable(): Unit = js.native
  
  var RightAngleAxes: Any = js.native
  
  var Rotation: Any = js.native
  
  def SaveChartTemplate(bstrFileName: String): Unit = js.native
  
  def Select(): Any = js.native
  def Select(Replace: Any): Any = js.native
  
  def SeriesCollection(): Any = js.native
  def SeriesCollection(Index: Any): Any = js.native
  
  var SeriesNameLevel: XlSeriesNameLevel = js.native
  
  def SetDefaultChart(varName: Any): Unit = js.native
  
  def SetElement(RHS: MsoChartElementType): Unit = js.native
  
  def SetSourceData(Source: String): Unit = js.native
  def SetSourceData(Source: String, PlotBy: Any): Unit = js.native
  
  def Shapes(Index: Any): Shape = js.native
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
  
  def XYGroups(): Any = js.native
  def XYGroups(Index: Any): Any = js.native
  
  /** @param Type [Type=2] */
  def _ApplyDataLabels(): Unit = js.native
  def _ApplyDataLabels(Type: Unit, IMsoLegendKey: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, IMsoLegendKey: Any, AutoText: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, IMsoLegendKey: Any, AutoText: Any, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, IMsoLegendKey: Any, AutoText: Unit, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, IMsoLegendKey: Unit, AutoText: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, IMsoLegendKey: Unit, AutoText: Any, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, IMsoLegendKey: Unit, AutoText: Unit, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: Any, AutoText: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: Any, AutoText: Any, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: Any, AutoText: Unit, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: Unit, AutoText: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: Unit, AutoText: Any, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, IMsoLegendKey: Unit, AutoText: Unit, HasLeaderLines: Any): Unit = js.native
}
