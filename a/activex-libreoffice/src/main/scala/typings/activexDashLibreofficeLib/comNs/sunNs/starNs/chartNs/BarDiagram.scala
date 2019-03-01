package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a service for bar and column diagrams. */
trait BarDiagram
  extends Diagram
     with ChartStatistics
     with ChartAxisXSupplier
     with ChartTwoAxisYSupplier
     with ChartAxisZSupplier
     with Dim3DDiagram
     with StackableDiagram {
  /**
    * If `TRUE` , determines that in a three-dimensional bar chart the bars of each series are arranged behind each other in the z-direction. If `FALSE` the
    * arrangement of bars is like in two-dimensional bar charts.
    */
  var Deep: scala.Boolean
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
    * Determines how many data rows are displayed as lines rather than bars.
    *
    * If this property differs from zero the last {@link BarDiagram.NumberOfLines} data rows are shown as lines. It is currently supported by two
    * dimensional vertical bar charts only.
    * @deprecated Deprecated
    */
  var NumberOfLines: scala.Double
  /**
    * determines if, in a stacked chart, there are connecting lines between corresponding bars. Currently, bar charts with horizontal bars do not support
    * this property.
    */
  var StackedBarsConnected: scala.Boolean
  /**
    * Determines if the bars of a chart are drawn vertically or horizontally. Default is vertical.
    *
    * If Vertical is `FALSE` you get a column chart rather than a bar chart.
    */
  var Vertical: scala.Boolean
}

object BarDiagram {
  @scala.inline
  def apply(
    AutomaticPosition: scala.Boolean,
    AutomaticSize: scala.Boolean,
    ConstantErrorHigh: scala.Double,
    ConstantErrorLow: scala.Double,
    DataCaption: scala.Double,
    DataRowSource: ChartDataRowSource,
    Deep: scala.Boolean,
    DiagramType: java.lang.String,
    Dim3D: scala.Boolean,
    ErrorBarRangeNegative: java.lang.String,
    ErrorBarRangePositive: java.lang.String,
    ErrorBarStyle: scala.Double,
    ErrorCategory: ChartErrorCategory,
    ErrorIndicator: ChartErrorIndicatorType,
    ErrorMargin: scala.Double,
    Floor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    GroupBarsPerAxis: scala.Boolean,
    HasSecondaryYAxis: scala.Boolean,
    HasSecondaryYAxisDescription: scala.Boolean,
    HasSecondaryYAxisTitle: scala.Boolean,
    HasXAxis: scala.Boolean,
    HasXAxisDescription: scala.Boolean,
    HasXAxisGrid: scala.Boolean,
    HasXAxisHelpGrid: scala.Boolean,
    HasXAxisTitle: scala.Boolean,
    HasYAxis: scala.Boolean,
    HasYAxisDescription: scala.Boolean,
    HasYAxisGrid: scala.Boolean,
    HasYAxisHelpGrid: scala.Boolean,
    HasYAxisTitle: scala.Boolean,
    HasZAxis: scala.Boolean,
    HasZAxisDescription: scala.Boolean,
    HasZAxisGrid: scala.Boolean,
    HasZAxisHelpGrid: scala.Boolean,
    HasZAxisTitle: scala.Boolean,
    MeanValue: scala.Boolean,
    MissingValueTreatment: scala.Double,
    NumberOfLines: scala.Double,
    Percent: scala.Boolean,
    PercentageError: scala.Double,
    Perspective: scala.Double,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RegressionCurves: ChartRegressionCurveType,
    RotationHorizontal: scala.Double,
    RotationVertical: scala.Double,
    SecondXAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    SecondYAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    SecondaryYAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Stacked: scala.Boolean,
    StackedBarsConnected: scala.Boolean,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Vertical: scala.Boolean,
    Wall: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    XHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    YHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ZAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ZAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    ZHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ZMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    calculateDiagramPositionExcludingAxes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    calculateDiagramPositionIncludingAxes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    calculateDiagramPositionIncludingAxesAndAxisTitles: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getAxis: js.Function1[scala.Double, XAxis],
    getDataPointProperties: js.Function2[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
    ],
    getDataRowProperties: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getDiagramType: js.Function0[java.lang.String],
    getFloor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSecondXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondaryAxis: js.Function1[scala.Double, XAxis],
    getSecondaryYAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getWall: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getXHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getYHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getZAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getZAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getZHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getZMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    isAutomaticDiagramPositioning: js.Function0[scala.Boolean],
    isExcludingDiagramPositioning: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    set3DSettingsToDefault: js.Function0[scala.Unit],
    setAutomaticDiagramPositioning: js.Function0[scala.Unit],
    setDefaultIllumination: js.Function0[scala.Unit],
    setDefaultRotation: js.Function0[scala.Unit],
    setDiagramPositionExcludingAxes: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setDiagramPositionIncludingAxes: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setDiagramPositionIncludingAxesAndAxisTitles: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): BarDiagram = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutomaticPosition")(AutomaticPosition)
    __obj.updateDynamic("AutomaticSize")(AutomaticSize)
    __obj.updateDynamic("ConstantErrorHigh")(ConstantErrorHigh)
    __obj.updateDynamic("ConstantErrorLow")(ConstantErrorLow)
    __obj.updateDynamic("DataCaption")(DataCaption)
    __obj.updateDynamic("DataRowSource")(DataRowSource)
    __obj.updateDynamic("Deep")(Deep)
    __obj.updateDynamic("DiagramType")(DiagramType)
    __obj.updateDynamic("Dim3D")(Dim3D)
    __obj.updateDynamic("ErrorBarRangeNegative")(ErrorBarRangeNegative)
    __obj.updateDynamic("ErrorBarRangePositive")(ErrorBarRangePositive)
    __obj.updateDynamic("ErrorBarStyle")(ErrorBarStyle)
    __obj.updateDynamic("ErrorCategory")(ErrorCategory)
    __obj.updateDynamic("ErrorIndicator")(ErrorIndicator)
    __obj.updateDynamic("ErrorMargin")(ErrorMargin)
    __obj.updateDynamic("Floor")(Floor)
    __obj.updateDynamic("GroupBarsPerAxis")(GroupBarsPerAxis)
    __obj.updateDynamic("HasSecondaryYAxis")(HasSecondaryYAxis)
    __obj.updateDynamic("HasSecondaryYAxisDescription")(HasSecondaryYAxisDescription)
    __obj.updateDynamic("HasSecondaryYAxisTitle")(HasSecondaryYAxisTitle)
    __obj.updateDynamic("HasXAxis")(HasXAxis)
    __obj.updateDynamic("HasXAxisDescription")(HasXAxisDescription)
    __obj.updateDynamic("HasXAxisGrid")(HasXAxisGrid)
    __obj.updateDynamic("HasXAxisHelpGrid")(HasXAxisHelpGrid)
    __obj.updateDynamic("HasXAxisTitle")(HasXAxisTitle)
    __obj.updateDynamic("HasYAxis")(HasYAxis)
    __obj.updateDynamic("HasYAxisDescription")(HasYAxisDescription)
    __obj.updateDynamic("HasYAxisGrid")(HasYAxisGrid)
    __obj.updateDynamic("HasYAxisHelpGrid")(HasYAxisHelpGrid)
    __obj.updateDynamic("HasYAxisTitle")(HasYAxisTitle)
    __obj.updateDynamic("HasZAxis")(HasZAxis)
    __obj.updateDynamic("HasZAxisDescription")(HasZAxisDescription)
    __obj.updateDynamic("HasZAxisGrid")(HasZAxisGrid)
    __obj.updateDynamic("HasZAxisHelpGrid")(HasZAxisHelpGrid)
    __obj.updateDynamic("HasZAxisTitle")(HasZAxisTitle)
    __obj.updateDynamic("MeanValue")(MeanValue)
    __obj.updateDynamic("MissingValueTreatment")(MissingValueTreatment)
    __obj.updateDynamic("NumberOfLines")(NumberOfLines)
    __obj.updateDynamic("Percent")(Percent)
    __obj.updateDynamic("PercentageError")(PercentageError)
    __obj.updateDynamic("Perspective")(Perspective)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RegressionCurves")(RegressionCurves)
    __obj.updateDynamic("RotationHorizontal")(RotationHorizontal)
    __obj.updateDynamic("RotationVertical")(RotationVertical)
    __obj.updateDynamic("SecondXAxisTitle")(SecondXAxisTitle)
    __obj.updateDynamic("SecondYAxisTitle")(SecondYAxisTitle)
    __obj.updateDynamic("SecondaryYAxis")(SecondaryYAxis)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("Stacked")(Stacked)
    __obj.updateDynamic("StackedBarsConnected")(StackedBarsConnected)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("Vertical")(Vertical)
    __obj.updateDynamic("Wall")(Wall)
    __obj.updateDynamic("XAxis")(XAxis)
    __obj.updateDynamic("XAxisTitle")(XAxisTitle)
    __obj.updateDynamic("XHelpGrid")(XHelpGrid)
    __obj.updateDynamic("XMainGrid")(XMainGrid)
    __obj.updateDynamic("YAxis")(YAxis)
    __obj.updateDynamic("YAxisTitle")(YAxisTitle)
    __obj.updateDynamic("YHelpGrid")(YHelpGrid)
    __obj.updateDynamic("YMainGrid")(YMainGrid)
    __obj.updateDynamic("ZAxis")(ZAxis)
    __obj.updateDynamic("ZAxisTitle")(ZAxisTitle)
    __obj.updateDynamic("ZHelpGrid")(ZHelpGrid)
    __obj.updateDynamic("ZMainGrid")(ZMainGrid)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("calculateDiagramPositionExcludingAxes")(calculateDiagramPositionExcludingAxes)
    __obj.updateDynamic("calculateDiagramPositionIncludingAxes")(calculateDiagramPositionIncludingAxes)
    __obj.updateDynamic("calculateDiagramPositionIncludingAxesAndAxisTitles")(calculateDiagramPositionIncludingAxesAndAxisTitles)
    __obj.updateDynamic("getAxis")(getAxis)
    __obj.updateDynamic("getDataPointProperties")(getDataPointProperties)
    __obj.updateDynamic("getDataRowProperties")(getDataRowProperties)
    __obj.updateDynamic("getDiagramType")(getDiagramType)
    __obj.updateDynamic("getFloor")(getFloor)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getSecondXAxisTitle")(getSecondXAxisTitle)
    __obj.updateDynamic("getSecondYAxisTitle")(getSecondYAxisTitle)
    __obj.updateDynamic("getSecondaryAxis")(getSecondaryAxis)
    __obj.updateDynamic("getSecondaryYAxis")(getSecondaryYAxis)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getWall")(getWall)
    __obj.updateDynamic("getXAxis")(getXAxis)
    __obj.updateDynamic("getXAxisTitle")(getXAxisTitle)
    __obj.updateDynamic("getXHelpGrid")(getXHelpGrid)
    __obj.updateDynamic("getXMainGrid")(getXMainGrid)
    __obj.updateDynamic("getYAxis")(getYAxis)
    __obj.updateDynamic("getYAxisTitle")(getYAxisTitle)
    __obj.updateDynamic("getYHelpGrid")(getYHelpGrid)
    __obj.updateDynamic("getYMainGrid")(getYMainGrid)
    __obj.updateDynamic("getZAxis")(getZAxis)
    __obj.updateDynamic("getZAxisTitle")(getZAxisTitle)
    __obj.updateDynamic("getZHelpGrid")(getZHelpGrid)
    __obj.updateDynamic("getZMainGrid")(getZMainGrid)
    __obj.updateDynamic("isAutomaticDiagramPositioning")(isAutomaticDiagramPositioning)
    __obj.updateDynamic("isExcludingDiagramPositioning")(isExcludingDiagramPositioning)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("set3DSettingsToDefault")(set3DSettingsToDefault)
    __obj.updateDynamic("setAutomaticDiagramPositioning")(setAutomaticDiagramPositioning)
    __obj.updateDynamic("setDefaultIllumination")(setDefaultIllumination)
    __obj.updateDynamic("setDefaultRotation")(setDefaultRotation)
    __obj.updateDynamic("setDiagramPositionExcludingAxes")(setDiagramPositionExcludingAxes)
    __obj.updateDynamic("setDiagramPositionIncludingAxes")(setDiagramPositionIncludingAxes)
    __obj.updateDynamic("setDiagramPositionIncludingAxesAndAxisTitles")(setDiagramPositionIncludingAxesAndAxisTitles)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setSize")(setSize)
    __obj.asInstanceOf[BarDiagram]
  }
}

