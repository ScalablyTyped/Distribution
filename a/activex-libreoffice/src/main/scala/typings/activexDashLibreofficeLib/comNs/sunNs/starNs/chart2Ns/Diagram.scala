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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ConnectBars")(ConnectBars)
    __obj.updateDynamic("CoordinateSystems")(CoordinateSystems)
    __obj.updateDynamic("DataTableHBorder")(DataTableHBorder)
    __obj.updateDynamic("DataTableOutline")(DataTableOutline)
    __obj.updateDynamic("DataTableVBorder")(DataTableVBorder)
    __obj.updateDynamic("DefaultColorScheme")(DefaultColorScheme)
    __obj.updateDynamic("ExternalData")(ExternalData)
    __obj.updateDynamic("Floor")(Floor)
    __obj.updateDynamic("GroupBarsPerAxis")(GroupBarsPerAxis)
    __obj.updateDynamic("Legend")(Legend)
    __obj.updateDynamic("MissingValueTreatment")(MissingValueTreatment)
    __obj.updateDynamic("Perspective")(Perspective)
    __obj.updateDynamic("PosSizeExcludeLabels")(PosSizeExcludeLabels)
    __obj.updateDynamic("RelativePosition")(RelativePosition)
    __obj.updateDynamic("RelativeSize")(RelativeSize)
    __obj.updateDynamic("RightAngledAxes")(RightAngledAxes)
    __obj.updateDynamic("RotationHorizontal")(RotationHorizontal)
    __obj.updateDynamic("RotationVertical")(RotationVertical)
    __obj.updateDynamic("SortByXValues")(SortByXValues)
    __obj.updateDynamic("StartingAngle")(StartingAngle)
    __obj.updateDynamic("TitleObject")(TitleObject)
    __obj.updateDynamic("Wall")(Wall)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addCoordinateSystem")(addCoordinateSystem)
    __obj.updateDynamic("getCoordinateSystems")(getCoordinateSystems)
    __obj.updateDynamic("getDefaultColorScheme")(getDefaultColorScheme)
    __obj.updateDynamic("getFloor")(getFloor)
    __obj.updateDynamic("getLegend")(getLegend)
    __obj.updateDynamic("getTitleObject")(getTitleObject)
    __obj.updateDynamic("getWall")(getWall)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeCoordinateSystem")(removeCoordinateSystem)
    __obj.updateDynamic("set3DSettingsToDefault")(set3DSettingsToDefault)
    __obj.updateDynamic("setCoordinateSystems")(setCoordinateSystems)
    __obj.updateDynamic("setDefaultColorScheme")(setDefaultColorScheme)
    __obj.updateDynamic("setDefaultIllumination")(setDefaultIllumination)
    __obj.updateDynamic("setDefaultRotation")(setDefaultRotation)
    __obj.updateDynamic("setDiagramData")(setDiagramData)
    __obj.updateDynamic("setLegend")(setLegend)
    __obj.updateDynamic("setTitleObject")(setTitleObject)
    __obj.asInstanceOf[Diagram]
  }
}

