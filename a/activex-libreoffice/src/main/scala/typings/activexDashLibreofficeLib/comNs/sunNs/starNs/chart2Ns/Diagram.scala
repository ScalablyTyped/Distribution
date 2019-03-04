package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagram
  extends XDiagram
     with XCoordinateSystemContainer
     with XTitled
     with activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.X3DDefaultSetter {
  /** Draw connection lines for stacked bar charts. */
  var ConnectBars: scala.Boolean
  /** Chart Datatable flags */
  var DataTableHBorder: scala.Boolean
  var DataTableOutline: scala.Boolean
  var DataTableVBorder: scala.Boolean
  var ExternalData: java.lang.String
  /**
    * If bars of a bar or column chart are attached to different axis, this property determines how to display those. If `TRUE` , the bars are grouped
    * together in one block for each axis, thus they are painted one group over the other.
    *
    * If `FALSE` , the bars are displayed side-by-side, as if they were all attached to the same axis.
    *
    * If all data series of a bar or column chart are attached to only one axis, this property has no effect.
    */
  var GroupBarsPerAxis: scala.Boolean
  /**
    * specifies how empty or invalid cells in the provided data should be handled when displayed
    * @see com.sun.star.chart.MissingValueTreatment
    */
  var MissingValueTreatment: scala.Double
  /** Perspective of 3D charts ( [0,100] ). */
  var Perspective: scala.Double
  /**
    * The attributes {@link RelativePosition} and {@link RelativeSize} should be used for the inner coordinate region without axis labels and without data
    * labels.
    */
  var PosSizeExcludeLabels: scala.Boolean
  /**
    * The position is as a relative position on the page.
    *
    * If a relative position is given the diagram is not automatically placed, but instead is placed relative on the page.
    */
  var RelativePosition: RelativePosition
  /** The size of the diagram as relative size of the page size. */
  var RelativeSize: RelativeSize
  var RightAngledAxes: scala.Boolean
  /** Horizontal rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationHorizontal: scala.Double
  /** Vertical rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationVertical: scala.Double
  /** Sort data points by x values for rendering */
  var SortByXValues: scala.Boolean
  /** Starting angle in degrees for pie charts and doughnut charts. */
  var StartingAngle: scala.Double
}

object Diagram {
  @scala.inline
  def apply(
    ConnectBars: scala.Boolean,
    CoordinateSystems: activexDashInteropLib.SafeArray[XCoordinateSystem],
    DataTableHBorder: scala.Boolean,
    DataTableOutline: scala.Boolean,
    DataTableVBorder: scala.Boolean,
    DefaultColorScheme: XColorScheme,
    ExternalData: java.lang.String,
    Floor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    GroupBarsPerAxis: scala.Boolean,
    Legend: XLegend,
    MissingValueTreatment: scala.Double,
    Perspective: scala.Double,
    PosSizeExcludeLabels: scala.Boolean,
    RelativePosition: RelativePosition,
    RelativeSize: RelativeSize,
    RightAngledAxes: scala.Boolean,
    RotationHorizontal: scala.Double,
    RotationVertical: scala.Double,
    SortByXValues: scala.Boolean,
    StartingAngle: scala.Double,
    TitleObject: XTitle,
    Wall: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    addCoordinateSystem: js.Function1[XCoordinateSystem, scala.Unit],
    getCoordinateSystems: js.Function0[activexDashInteropLib.SafeArray[XCoordinateSystem]],
    getDefaultColorScheme: js.Function0[XColorScheme],
    getFloor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getLegend: js.Function0[XLegend],
    getTitleObject: js.Function0[XTitle],
    getWall: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeCoordinateSystem: js.Function1[XCoordinateSystem, scala.Unit],
    set3DSettingsToDefault: js.Function0[scala.Unit],
    setCoordinateSystems: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XCoordinateSystem], scala.Unit],
    setDefaultColorScheme: js.Function1[XColorScheme, scala.Unit],
    setDefaultIllumination: js.Function0[scala.Unit],
    setDefaultRotation: js.Function0[scala.Unit],
    setDiagramData: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    setLegend: js.Function1[XLegend, scala.Unit],
    setTitleObject: js.Function1[XTitle, scala.Unit]
  ): Diagram = {
    val __obj = js.Dynamic.literal(ConnectBars = ConnectBars, CoordinateSystems = CoordinateSystems, DataTableHBorder = DataTableHBorder, DataTableOutline = DataTableOutline, DataTableVBorder = DataTableVBorder, DefaultColorScheme = DefaultColorScheme, ExternalData = ExternalData, Floor = Floor, GroupBarsPerAxis = GroupBarsPerAxis, Legend = Legend, MissingValueTreatment = MissingValueTreatment, Perspective = Perspective, PosSizeExcludeLabels = PosSizeExcludeLabels, RelativePosition = RelativePosition, RelativeSize = RelativeSize, RightAngledAxes = RightAngledAxes, RotationHorizontal = RotationHorizontal, RotationVertical = RotationVertical, SortByXValues = SortByXValues, StartingAngle = StartingAngle, TitleObject = TitleObject, Wall = Wall, acquire = acquire, addCoordinateSystem = addCoordinateSystem, getCoordinateSystems = getCoordinateSystems, getDefaultColorScheme = getDefaultColorScheme, getFloor = getFloor, getLegend = getLegend, getTitleObject = getTitleObject, getWall = getWall, queryInterface = queryInterface, release = release, removeCoordinateSystem = removeCoordinateSystem, set3DSettingsToDefault = set3DSettingsToDefault, setCoordinateSystems = setCoordinateSystems, setDefaultColorScheme = setDefaultColorScheme, setDefaultIllumination = setDefaultIllumination, setDefaultRotation = setDefaultRotation, setDiagramData = setDiagramData, setLegend = setLegend, setTitleObject = setTitleObject)
  
    __obj.asInstanceOf[Diagram]
  }
}

