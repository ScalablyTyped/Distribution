package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.X3DDefaultSetter
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagram
  extends XDiagram
     with XCoordinateSystemContainer
     with XTitled
     with X3DDefaultSetter {
  /** Draw connection lines for stacked bar charts. */
  var ConnectBars: Boolean
  /** Chart Datatable flags */
  var DataTableHBorder: Boolean
  var DataTableOutline: Boolean
  var DataTableVBorder: Boolean
  var ExternalData: String
  /**
    * If bars of a bar or column chart are attached to different axis, this property determines how to display those. If `TRUE` , the bars are grouped
    * together in one block for each axis, thus they are painted one group over the other.
    *
    * If `FALSE` , the bars are displayed side-by-side, as if they were all attached to the same axis.
    *
    * If all data series of a bar or column chart are attached to only one axis, this property has no effect.
    */
  var GroupBarsPerAxis: Boolean
  /**
    * specifies how empty or invalid cells in the provided data should be handled when displayed
    * @see com.sun.star.chart.MissingValueTreatment
    */
  var MissingValueTreatment: Double
  /** Perspective of 3D charts ( [0,100] ). */
  var Perspective: Double
  /**
    * The attributes {@link RelativePosition} and {@link RelativeSize} should be used for the inner coordinate region without axis labels and without data
    * labels.
    */
  var PosSizeExcludeLabels: Boolean
  /**
    * The position is as a relative position on the page.
    *
    * If a relative position is given the diagram is not automatically placed, but instead is placed relative on the page.
    */
  var RelativePosition: typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.RelativePosition
  /** The size of the diagram as relative size of the page size. */
  var RelativeSize: typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.RelativeSize
  var RightAngledAxes: Boolean
  /** Horizontal rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationHorizontal: Double
  /** Vertical rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationVertical: Double
  /** Sort data points by x values for rendering */
  var SortByXValues: Boolean
  /** Starting angle in degrees for pie charts and doughnut charts. */
  var StartingAngle: Double
}

object Diagram {
  @scala.inline
  def apply(
    ConnectBars: Boolean,
    CoordinateSystems: SafeArray[XCoordinateSystem],
    DataTableHBorder: Boolean,
    DataTableOutline: Boolean,
    DataTableVBorder: Boolean,
    DefaultColorScheme: XColorScheme,
    ExternalData: String,
    Floor: XPropertySet,
    GroupBarsPerAxis: Boolean,
    Legend: XLegend,
    MissingValueTreatment: Double,
    Perspective: Double,
    PosSizeExcludeLabels: Boolean,
    RelativePosition: RelativePosition,
    RelativeSize: RelativeSize,
    RightAngledAxes: Boolean,
    RotationHorizontal: Double,
    RotationVertical: Double,
    SortByXValues: Boolean,
    StartingAngle: Double,
    TitleObject: XTitle,
    Wall: XPropertySet,
    acquire: () => Unit,
    addCoordinateSystem: XCoordinateSystem => Unit,
    getCoordinateSystems: () => SafeArray[XCoordinateSystem],
    getDefaultColorScheme: () => XColorScheme,
    getFloor: () => XPropertySet,
    getLegend: () => XLegend,
    getTitleObject: () => XTitle,
    getWall: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCoordinateSystem: XCoordinateSystem => Unit,
    set3DSettingsToDefault: () => Unit,
    setCoordinateSystems: SeqEquiv[XCoordinateSystem] => Unit,
    setDefaultColorScheme: XColorScheme => Unit,
    setDefaultIllumination: () => Unit,
    setDefaultRotation: () => Unit,
    setDiagramData: (XDataSource, SeqEquiv[PropertyValue]) => Unit,
    setLegend: XLegend => Unit,
    setTitleObject: XTitle => Unit
  ): Diagram = {
    val __obj = js.Dynamic.literal(ConnectBars = ConnectBars, CoordinateSystems = CoordinateSystems, DataTableHBorder = DataTableHBorder, DataTableOutline = DataTableOutline, DataTableVBorder = DataTableVBorder, DefaultColorScheme = DefaultColorScheme, ExternalData = ExternalData, Floor = Floor, GroupBarsPerAxis = GroupBarsPerAxis, Legend = Legend, MissingValueTreatment = MissingValueTreatment, Perspective = Perspective, PosSizeExcludeLabels = PosSizeExcludeLabels, RelativePosition = RelativePosition, RelativeSize = RelativeSize, RightAngledAxes = RightAngledAxes, RotationHorizontal = RotationHorizontal, RotationVertical = RotationVertical, SortByXValues = SortByXValues, StartingAngle = StartingAngle, TitleObject = TitleObject, Wall = Wall, acquire = js.Any.fromFunction0(acquire), addCoordinateSystem = js.Any.fromFunction1(addCoordinateSystem), getCoordinateSystems = js.Any.fromFunction0(getCoordinateSystems), getDefaultColorScheme = js.Any.fromFunction0(getDefaultColorScheme), getFloor = js.Any.fromFunction0(getFloor), getLegend = js.Any.fromFunction0(getLegend), getTitleObject = js.Any.fromFunction0(getTitleObject), getWall = js.Any.fromFunction0(getWall), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCoordinateSystem = js.Any.fromFunction1(removeCoordinateSystem), set3DSettingsToDefault = js.Any.fromFunction0(set3DSettingsToDefault), setCoordinateSystems = js.Any.fromFunction1(setCoordinateSystems), setDefaultColorScheme = js.Any.fromFunction1(setDefaultColorScheme), setDefaultIllumination = js.Any.fromFunction0(setDefaultIllumination), setDefaultRotation = js.Any.fromFunction0(setDefaultRotation), setDiagramData = js.Any.fromFunction2(setDiagramData), setLegend = js.Any.fromFunction1(setLegend), setTitleObject = js.Any.fromFunction1(setTitleObject))
  
    __obj.asInstanceOf[Diagram]
  }
}

