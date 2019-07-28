package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a service for bubble diagrams.
  * @since OOo 3.2
  */
trait BubbleDiagram
  extends Diagram
     with ChartAxisXSupplier
     with ChartTwoAxisYSupplier
     with ChartStatistics

object BubbleDiagram {
  @scala.inline
  def apply(
    AutomaticPosition: Boolean,
    AutomaticSize: Boolean,
    ConstantErrorHigh: Double,
    ConstantErrorLow: Double,
    DataCaption: Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: String,
    ErrorBarRangeNegative: String,
    ErrorBarRangePositive: String,
    ErrorBarStyle: Double,
    ErrorCategory: ChartErrorCategory,
    ErrorIndicator: ChartErrorIndicatorType,
    ErrorMargin: Double,
    HasSecondaryYAxis: Boolean,
    HasSecondaryYAxisDescription: Boolean,
    HasSecondaryYAxisTitle: Boolean,
    HasXAxis: Boolean,
    HasXAxisDescription: Boolean,
    HasXAxisGrid: Boolean,
    HasXAxisHelpGrid: Boolean,
    HasXAxisTitle: Boolean,
    HasYAxis: Boolean,
    HasYAxisDescription: Boolean,
    HasYAxisGrid: Boolean,
    HasYAxisHelpGrid: Boolean,
    HasYAxisTitle: Boolean,
    MeanValue: Boolean,
    MissingValueTreatment: Double,
    PercentageError: Double,
    Position: Point,
    PropertySetInfo: XPropertySetInfo,
    RegressionCurves: ChartRegressionCurveType,
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    SecondaryYAxis: XPropertySet,
    ShapeType: String,
    Size: Size,
    UserDefinedAttributes: XNameContainer,
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    calculateDiagramPositionExcludingAxes: () => Rectangle,
    calculateDiagramPositionIncludingAxes: () => Rectangle,
    calculateDiagramPositionIncludingAxesAndAxisTitles: () => Rectangle,
    getAxis: Double => XAxis,
    getDataPointProperties: (Double, Double) => XPropertySet,
    getDataRowProperties: Double => XPropertySet,
    getDiagramType: () => String,
    getPosition: () => Point,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSecondXAxisTitle: () => XShape,
    getSecondYAxisTitle: () => XShape,
    getSecondaryAxis: Double => XAxis,
    getSecondaryYAxis: () => XPropertySet,
    getShapeType: () => String,
    getSize: () => Size,
    getXAxis: () => XPropertySet,
    getXAxisTitle: () => XShape,
    getXHelpGrid: () => XPropertySet,
    getXMainGrid: () => XPropertySet,
    getYAxis: () => XPropertySet,
    getYAxisTitle: () => XShape,
    getYHelpGrid: () => XPropertySet,
    getYMainGrid: () => XPropertySet,
    isAutomaticDiagramPositioning: () => Boolean,
    isExcludingDiagramPositioning: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setAutomaticDiagramPositioning: () => Unit,
    setDiagramPositionExcludingAxes: Rectangle => Unit,
    setDiagramPositionIncludingAxes: Rectangle => Unit,
    setDiagramPositionIncludingAxesAndAxisTitles: Rectangle => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSize: Size => Unit
  ): BubbleDiagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition, AutomaticSize = AutomaticSize, ConstantErrorHigh = ConstantErrorHigh, ConstantErrorLow = ConstantErrorLow, DataCaption = DataCaption, DataRowSource = DataRowSource, DiagramType = DiagramType, ErrorBarRangeNegative = ErrorBarRangeNegative, ErrorBarRangePositive = ErrorBarRangePositive, ErrorBarStyle = ErrorBarStyle, ErrorCategory = ErrorCategory, ErrorIndicator = ErrorIndicator, ErrorMargin = ErrorMargin, HasSecondaryYAxis = HasSecondaryYAxis, HasSecondaryYAxisDescription = HasSecondaryYAxisDescription, HasSecondaryYAxisTitle = HasSecondaryYAxisTitle, HasXAxis = HasXAxis, HasXAxisDescription = HasXAxisDescription, HasXAxisGrid = HasXAxisGrid, HasXAxisHelpGrid = HasXAxisHelpGrid, HasXAxisTitle = HasXAxisTitle, HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, MeanValue = MeanValue, MissingValueTreatment = MissingValueTreatment, PercentageError = PercentageError, Position = Position, PropertySetInfo = PropertySetInfo, RegressionCurves = RegressionCurves, SecondXAxisTitle = SecondXAxisTitle, SecondYAxisTitle = SecondYAxisTitle, SecondaryYAxis = SecondaryYAxis, ShapeType = ShapeType, Size = Size, UserDefinedAttributes = UserDefinedAttributes, XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), calculateDiagramPositionExcludingAxes = js.Any.fromFunction0(calculateDiagramPositionExcludingAxes), calculateDiagramPositionIncludingAxes = js.Any.fromFunction0(calculateDiagramPositionIncludingAxes), calculateDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction0(calculateDiagramPositionIncludingAxesAndAxisTitles), getAxis = js.Any.fromFunction1(getAxis), getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = js.Any.fromFunction0(getDiagramType), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), getSecondaryYAxis = js.Any.fromFunction0(getSecondaryYAxis), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), isAutomaticDiagramPositioning = js.Any.fromFunction0(isAutomaticDiagramPositioning), isExcludingDiagramPositioning = js.Any.fromFunction0(isExcludingDiagramPositioning), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAutomaticDiagramPositioning = js.Any.fromFunction0(setAutomaticDiagramPositioning), setDiagramPositionExcludingAxes = js.Any.fromFunction1(setDiagramPositionExcludingAxes), setDiagramPositionIncludingAxes = js.Any.fromFunction1(setDiagramPositionIncludingAxes), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1(setDiagramPositionIncludingAxesAndAxisTitles), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[BubbleDiagram]
  }
}

