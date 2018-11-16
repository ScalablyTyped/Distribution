package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Chart")
@js.native
class Chart protected () extends js.Object {
  var AlternativeText: java.lang.String = js.native
  val Application: Application = js.native
  val Area3DGroup: ChartGroup = js.native
  var AutoScaling: scala.Boolean = js.native
  val BackWall: Walls = js.native
  val Bar3DGroup: ChartGroup = js.native
  var BarShape: XlBarShape = js.native
  val ChartArea: ChartArea = js.native
  val ChartData: ChartData = js.native
  var ChartStyle: js.Any = js.native
  val ChartTitle: ChartTitle = js.native
  var ChartType: activexDashOfficeLib.OfficeNs.XlChartType = js.native
  val Column3DGroup: ChartGroup = js.native
  val Corners: Corners = js.native
  val Creator: scala.Double = js.native
  val DataTable: DataTable = js.native
  var DepthPercent: scala.Double = js.native
  var DisplayBlanksAs: XlDisplayBlanksAs = js.native
  var Elevation: scala.Double = js.native
  val Floor: Floor = js.native
  val Format: ChartFormat = js.native
  var GapDepth: scala.Double = js.native
  var HasDataTable: scala.Boolean = js.native
  var HasLegend: scala.Boolean = js.native
  var HasPivotFields: scala.Boolean = js.native
  var HasTitle: scala.Boolean = js.native
  var HeightPercent: scala.Double = js.native
  val Legend: Legend = js.native
  val Line3DGroup: ChartGroup = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Perspective: scala.Double = js.native
  val Pie3DGroup: ChartGroup = js.native
  val PlotArea: PlotArea = js.native
  var PlotBy: XlRowCol = js.native
  var PlotVisibleOnly: scala.Boolean = js.native
  var `PowerPoint.Chart_typekey`: Chart = js.native
  var RightAngleAxes: js.Any = js.native
  var Rotation: js.Any = js.native
  val Shapes: Shapes = js.native
  var ShowAllFieldButtons: scala.Boolean = js.native
  var ShowAxisFieldButtons: scala.Boolean = js.native
  var ShowDataLabelsOverMaximum: scala.Boolean = js.native
  var ShowLegendFieldButtons: scala.Boolean = js.native
  var ShowReportFilterFieldButtons: scala.Boolean = js.native
  var ShowValueFieldButtons: scala.Boolean = js.native
  val SideWall: Walls = js.native
  var Subtype: scala.Double = js.native
  val SurfaceGroup: ChartGroup = js.native
  var Title: java.lang.String = js.native
  var Type: scala.Double = js.native
  val Walls: Walls = js.native
  def ApplyChartTemplate(FileName: java.lang.String): scala.Unit = js.native
  def ApplyCustomType(ChartType: activexDashOfficeLib.OfficeNs.XlChartType): scala.Unit = js.native
  def ApplyCustomType(ChartType: activexDashOfficeLib.OfficeNs.XlChartType, TypeName: js.Any): scala.Unit = js.native
  /** @param PowerPoint.XlDataLabelsType [Type=2] */
  def ApplyDataLabels(
    Type: js.UndefOr[XlDataLabelsType],
    LegendKey: js.UndefOr[js.Any],
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
  def ApplyLayout(Layout: scala.Double, ChartType: js.Any): scala.Unit = js.native
  def AreaGroups(): js.Any = js.native
  def AreaGroups(Index: js.Any): js.Any = js.native
  def AutoFormat(Gallery: scala.Double): scala.Unit = js.native
  def AutoFormat(Gallery: scala.Double, Format: js.Any): scala.Unit = js.native
  /** @param PowerPoint.XlAxisGroup [AxisGroup=1] */
  def Axes(Type: js.Any): js.Any = js.native
  /** @param PowerPoint.XlAxisGroup [AxisGroup=1] */
  def Axes(Type: js.Any, AxisGroup: XlAxisGroup): js.Any = js.native
  def BarGroups(): js.Any = js.native
  def BarGroups(Index: js.Any): js.Any = js.native
  def ChartGroups(): js.Any = js.native
  def ChartGroups(Index: js.Any): js.Any = js.native
  def ChartWizard(
    Source: js.UndefOr[js.Any],
    Gallery: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    PlotBy: js.UndefOr[js.Any],
    CategoryLabels: js.UndefOr[js.Any],
    SeriesLabels: js.UndefOr[js.Any],
    HasLegend: js.UndefOr[js.Any],
    Title: js.UndefOr[js.Any],
    CategoryTitle: js.UndefOr[js.Any],
    ValueTitle: js.UndefOr[js.Any],
    ExtraTitle: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def ClearToMatchStyle(): scala.Unit = js.native
  def ColumnGroups(): js.Any = js.native
  def ColumnGroups(Index: js.Any): js.Any = js.native
  def Copy(): scala.Unit = js.native
  def Copy(Before: js.Any): scala.Unit = js.native
  def Copy(Before: js.Any, After: js.Any): scala.Unit = js.native
  /**
           * @param PowerPoint.XlPictureAppearance [Appearance=1]
           * @param PowerPoint.XlCopyPictureFormat [Format=-4147]
           * @param PowerPoint.XlPictureAppearance [Size=2]
           */
  def CopyPicture(): scala.Unit = js.native
  /**
           * @param PowerPoint.XlPictureAppearance [Appearance=1]
           * @param PowerPoint.XlCopyPictureFormat [Format=-4147]
           * @param PowerPoint.XlPictureAppearance [Size=2]
           */
  def CopyPicture(Appearance: XlPictureAppearance): scala.Unit = js.native
  /**
           * @param PowerPoint.XlPictureAppearance [Appearance=1]
           * @param PowerPoint.XlCopyPictureFormat [Format=-4147]
           * @param PowerPoint.XlPictureAppearance [Size=2]
           */
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): scala.Unit = js.native
  /**
           * @param PowerPoint.XlPictureAppearance [Appearance=1]
           * @param PowerPoint.XlCopyPictureFormat [Format=-4147]
           * @param PowerPoint.XlPictureAppearance [Size=2]
           */
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat, Size: XlPictureAppearance): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def DoughnutGroups(): js.Any = js.native
  def DoughnutGroups(Index: js.Any): js.Any = js.native
  def Export(FileName: java.lang.String): scala.Boolean = js.native
  def Export(FileName: java.lang.String, FilterName: js.Any): scala.Boolean = js.native
  def Export(FileName: java.lang.String, FilterName: js.Any, Interactive: js.Any): scala.Boolean = js.native
  def GetChartElement(X: scala.Double, Y: scala.Double, ElementID: scala.Double, Arg1: scala.Double, Arg2: scala.Double): scala.Unit = js.native
  def HasAxis(): js.Any = js.native
  def HasAxis(Index1: js.Any): js.Any = js.native
  def HasAxis(Index1: js.Any, Index2: js.Any): js.Any = js.native
  def LineGroups(): js.Any = js.native
  def LineGroups(Index: js.Any): js.Any = js.native
  def Paste(): scala.Unit = js.native
  def Paste(Type: js.Any): scala.Unit = js.native
  def PieGroups(): js.Any = js.native
  def PieGroups(Index: js.Any): js.Any = js.native
  def RadarGroups(): js.Any = js.native
  def RadarGroups(Index: js.Any): js.Any = js.native
  def Refresh(): scala.Unit = js.native
  def SaveChartTemplate(FileName: java.lang.String): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def Select(Replace: js.Any): scala.Unit = js.native
  def SeriesCollection(): js.Any = js.native
  def SeriesCollection(Index: js.Any): js.Any = js.native
  def SetBackgroundPicture(FileName: java.lang.String): scala.Unit = js.native
  def SetDefaultChart(Name: js.Any): scala.Unit = js.native
  def SetElement(Element: activexDashOfficeLib.OfficeNs.MsoChartElementType): scala.Unit = js.native
  def SetSourceData(Source: java.lang.String): scala.Unit = js.native
  def SetSourceData(Source: java.lang.String, PlotBy: js.Any): scala.Unit = js.native
  def XYGroups(): js.Any = js.native
  def XYGroups(Index: js.Any): js.Any = js.native
  /** @param PowerPoint.XlDataLabelsType [Type=2] */
  def _ApplyDataLabels(): scala.Unit = js.native
  /** @param PowerPoint.XlDataLabelsType [Type=2] */
  def _ApplyDataLabels(Type: XlDataLabelsType): scala.Unit = js.native
  /** @param PowerPoint.XlDataLabelsType [Type=2] */
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any): scala.Unit = js.native
  /** @param PowerPoint.XlDataLabelsType [Type=2] */
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any, AutoText: js.Any): scala.Unit = js.native
  /** @param PowerPoint.XlDataLabelsType [Type=2] */
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: js.Any, AutoText: js.Any, HasLeaderLines: js.Any): scala.Unit = js.native
}

