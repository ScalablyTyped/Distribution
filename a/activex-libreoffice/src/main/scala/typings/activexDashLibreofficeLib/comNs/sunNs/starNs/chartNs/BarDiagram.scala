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
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    calculateDiagramPositionExcludingAxes: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    calculateDiagramPositionIncludingAxes: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    calculateDiagramPositionIncludingAxesAndAxisTitles: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getAxis: scala.Double => XAxis,
    getDataPointProperties: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getDataRowProperties: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getDiagramType: () => java.lang.String,
    getFloor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getPosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSecondXAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getSecondYAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getSecondaryAxis: scala.Double => XAxis,
    getSecondaryYAxis: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getShapeType: () => java.lang.String,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getWall: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getXAxis: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getXAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getXHelpGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getXMainGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getYAxis: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getYAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getYHelpGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getYMainGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getZAxis: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getZAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getZHelpGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getZMainGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    isAutomaticDiagramPositioning: () => scala.Boolean,
    isExcludingDiagramPositioning: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    set3DSettingsToDefault: () => scala.Unit,
    setAutomaticDiagramPositioning: () => scala.Unit,
    setDefaultIllumination: () => scala.Unit,
    setDefaultRotation: () => scala.Unit,
    setDiagramPositionExcludingAxes: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit,
    setDiagramPositionIncludingAxes: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit,
    setDiagramPositionIncludingAxesAndAxisTitles: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit,
    setPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size => scala.Unit
  ): BarDiagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition, AutomaticSize = AutomaticSize, ConstantErrorHigh = ConstantErrorHigh, ConstantErrorLow = ConstantErrorLow, DataCaption = DataCaption, DataRowSource = DataRowSource, Deep = Deep, DiagramType = DiagramType, Dim3D = Dim3D, ErrorBarRangeNegative = ErrorBarRangeNegative, ErrorBarRangePositive = ErrorBarRangePositive, ErrorBarStyle = ErrorBarStyle, ErrorCategory = ErrorCategory, ErrorIndicator = ErrorIndicator, ErrorMargin = ErrorMargin, Floor = Floor, GroupBarsPerAxis = GroupBarsPerAxis, HasSecondaryYAxis = HasSecondaryYAxis, HasSecondaryYAxisDescription = HasSecondaryYAxisDescription, HasSecondaryYAxisTitle = HasSecondaryYAxisTitle, HasXAxis = HasXAxis, HasXAxisDescription = HasXAxisDescription, HasXAxisGrid = HasXAxisGrid, HasXAxisHelpGrid = HasXAxisHelpGrid, HasXAxisTitle = HasXAxisTitle, HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, HasZAxis = HasZAxis, HasZAxisDescription = HasZAxisDescription, HasZAxisGrid = HasZAxisGrid, HasZAxisHelpGrid = HasZAxisHelpGrid, HasZAxisTitle = HasZAxisTitle, MeanValue = MeanValue, MissingValueTreatment = MissingValueTreatment, NumberOfLines = NumberOfLines, Percent = Percent, PercentageError = PercentageError, Perspective = Perspective, Position = Position, PropertySetInfo = PropertySetInfo, RegressionCurves = RegressionCurves, RotationHorizontal = RotationHorizontal, RotationVertical = RotationVertical, SecondXAxisTitle = SecondXAxisTitle, SecondYAxisTitle = SecondYAxisTitle, SecondaryYAxis = SecondaryYAxis, ShapeType = ShapeType, Size = Size, Stacked = Stacked, StackedBarsConnected = StackedBarsConnected, UserDefinedAttributes = UserDefinedAttributes, Vertical = Vertical, Wall = Wall, XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, ZAxis = ZAxis, ZAxisTitle = ZAxisTitle, ZHelpGrid = ZHelpGrid, ZMainGrid = ZMainGrid, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), calculateDiagramPositionExcludingAxes = js.Any.fromFunction0(calculateDiagramPositionExcludingAxes), calculateDiagramPositionIncludingAxes = js.Any.fromFunction0(calculateDiagramPositionIncludingAxes), calculateDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction0(calculateDiagramPositionIncludingAxesAndAxisTitles), getAxis = js.Any.fromFunction1(getAxis), getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = js.Any.fromFunction0(getDiagramType), getFloor = js.Any.fromFunction0(getFloor), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), getSecondaryYAxis = js.Any.fromFunction0(getSecondaryYAxis), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getWall = js.Any.fromFunction0(getWall), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), getZAxis = js.Any.fromFunction0(getZAxis), getZAxisTitle = js.Any.fromFunction0(getZAxisTitle), getZHelpGrid = js.Any.fromFunction0(getZHelpGrid), getZMainGrid = js.Any.fromFunction0(getZMainGrid), isAutomaticDiagramPositioning = js.Any.fromFunction0(isAutomaticDiagramPositioning), isExcludingDiagramPositioning = js.Any.fromFunction0(isExcludingDiagramPositioning), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), set3DSettingsToDefault = js.Any.fromFunction0(set3DSettingsToDefault), setAutomaticDiagramPositioning = js.Any.fromFunction0(setAutomaticDiagramPositioning), setDefaultIllumination = js.Any.fromFunction0(setDefaultIllumination), setDefaultRotation = js.Any.fromFunction0(setDefaultRotation), setDiagramPositionExcludingAxes = js.Any.fromFunction1(setDiagramPositionExcludingAxes), setDiagramPositionIncludingAxes = js.Any.fromFunction1(setDiagramPositionIncludingAxes), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1(setDiagramPositionIncludingAxesAndAxisTitles), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[BarDiagram]
  }
}

