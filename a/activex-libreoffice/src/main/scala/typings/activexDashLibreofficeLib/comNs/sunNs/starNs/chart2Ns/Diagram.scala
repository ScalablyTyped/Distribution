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
  var RelativePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.RelativePosition
  /** The size of the diagram as relative size of the page size. */
  var RelativeSize: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.RelativeSize
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
    CoordinateSystems: stdLib.SafeArray[XCoordinateSystem],
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
    acquire: () => scala.Unit,
    addCoordinateSystem: XCoordinateSystem => scala.Unit,
    getCoordinateSystems: () => stdLib.SafeArray[XCoordinateSystem],
    getDefaultColorScheme: () => XColorScheme,
    getFloor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getLegend: () => XLegend,
    getTitleObject: () => XTitle,
    getWall: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeCoordinateSystem: XCoordinateSystem => scala.Unit,
    set3DSettingsToDefault: () => scala.Unit,
    setCoordinateSystems: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XCoordinateSystem] => scala.Unit,
    setDefaultColorScheme: XColorScheme => scala.Unit,
    setDefaultIllumination: () => scala.Unit,
    setDefaultRotation: () => scala.Unit,
    setDiagramData: (activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    setLegend: XLegend => scala.Unit,
    setTitleObject: XTitle => scala.Unit
  ): Diagram = {
    val __obj = js.Dynamic.literal(ConnectBars = ConnectBars, CoordinateSystems = CoordinateSystems, DataTableHBorder = DataTableHBorder, DataTableOutline = DataTableOutline, DataTableVBorder = DataTableVBorder, DefaultColorScheme = DefaultColorScheme, ExternalData = ExternalData, Floor = Floor, GroupBarsPerAxis = GroupBarsPerAxis, Legend = Legend, MissingValueTreatment = MissingValueTreatment, Perspective = Perspective, PosSizeExcludeLabels = PosSizeExcludeLabels, RelativePosition = RelativePosition, RelativeSize = RelativeSize, RightAngledAxes = RightAngledAxes, RotationHorizontal = RotationHorizontal, RotationVertical = RotationVertical, SortByXValues = SortByXValues, StartingAngle = StartingAngle, TitleObject = TitleObject, Wall = Wall, acquire = js.Any.fromFunction0(acquire), addCoordinateSystem = js.Any.fromFunction1(addCoordinateSystem), getCoordinateSystems = js.Any.fromFunction0(getCoordinateSystems), getDefaultColorScheme = js.Any.fromFunction0(getDefaultColorScheme), getFloor = js.Any.fromFunction0(getFloor), getLegend = js.Any.fromFunction0(getLegend), getTitleObject = js.Any.fromFunction0(getTitleObject), getWall = js.Any.fromFunction0(getWall), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCoordinateSystem = js.Any.fromFunction1(removeCoordinateSystem), set3DSettingsToDefault = js.Any.fromFunction0(set3DSettingsToDefault), setCoordinateSystems = js.Any.fromFunction1(setCoordinateSystems), setDefaultColorScheme = js.Any.fromFunction1(setDefaultColorScheme), setDefaultIllumination = js.Any.fromFunction0(setDefaultIllumination), setDefaultRotation = js.Any.fromFunction0(setDefaultRotation), setDiagramData = js.Any.fromFunction2(setDiagramData), setLegend = js.Any.fromFunction1(setLegend), setTitleObject = js.Any.fromFunction1(setTitleObject))
  
    __obj.asInstanceOf[Diagram]
  }
}

