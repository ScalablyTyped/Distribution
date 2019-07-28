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
  * specifies a diagram which can be used for presenting stock quotes.
  *
  * Note that the data must have a specific structure for stock diagrams. Let us assume that data is interpreted, such that series are taken from columns
  * (see property {@link Diagram.DataRowSource} ). Then you need tables of the following structures for different types:
  *
  * **StockDiagram::Volume is FALSEStockDiagram::UpDown is FALSE**{{table here, see documentation}}
  *
  * **StockDiagram::Volume is TRUEStockDiagram::UpDown is FALSE**{{table here, see documentation}}
  *
  * **StockDiagram::Volume is FALSEStockDiagram::UpDown is TRUE**{{table here, see documentation}}
  *
  * **StockDiagram::Volume is TRUEStockDiagram::UpDown is TRUE**{{table here, see documentation}}
  */
trait StockDiagram
  extends Diagram
     with XStatisticDisplay
     with ChartStatistics
     with ChartAxisXSupplier
     with ChartTwoAxisYSupplier {
  /**
    * indicates if a stock chart contains data representing the value of stocks on the opening and closing date.
    *
    * The difference will be indicated by bars. The color of the bar will be significant for positive or negative differences between open and closed data.
    *
    * If this property is `FALSE` , the values of the first series (or second if {@link StockDiagram.Volume} is `TRUE` ) of the chart data are interpreted
    * as the day's lowest value. The next series is interpreted as the day's highest value, and the last series is interpreted as the closing value.
    *
    * If this property is set to `TRUE` , one additional series is needed with the opening value of the stocks. It is assumed as the series before the
    * series with the day's lowest value.
    */
  var UpDown: Boolean
  /**
    * indicates if a stock chart contains data representing the volume of stocks.
    *
    * The values of the volume are represented as columns like those of a {@link BarDiagram} .
    *
    * If this property is set to `TRUE` , the values of the first series of the chart data are interpreted as volume.
    */
  var Volume: Boolean
}

object StockDiagram {
  @scala.inline
  def apply(
    AutomaticPosition: Boolean,
    AutomaticSize: Boolean,
    ConstantErrorHigh: Double,
    ConstantErrorLow: Double,
    DataCaption: Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: String,
    DownBar: XPropertySet,
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
    MinMaxLine: XPropertySet,
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
    UpBar: XPropertySet,
    UpDown: Boolean,
    UserDefinedAttributes: XNameContainer,
    Volume: Boolean,
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
    getDownBar: () => XPropertySet,
    getMinMaxLine: () => XPropertySet,
    getPosition: () => Point,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSecondXAxisTitle: () => XShape,
    getSecondYAxisTitle: () => XShape,
    getSecondaryAxis: Double => XAxis,
    getSecondaryYAxis: () => XPropertySet,
    getShapeType: () => String,
    getSize: () => Size,
    getUpBar: () => XPropertySet,
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
  ): StockDiagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition, AutomaticSize = AutomaticSize, ConstantErrorHigh = ConstantErrorHigh, ConstantErrorLow = ConstantErrorLow, DataCaption = DataCaption, DataRowSource = DataRowSource, DiagramType = DiagramType, DownBar = DownBar, ErrorBarRangeNegative = ErrorBarRangeNegative, ErrorBarRangePositive = ErrorBarRangePositive, ErrorBarStyle = ErrorBarStyle, ErrorCategory = ErrorCategory, ErrorIndicator = ErrorIndicator, ErrorMargin = ErrorMargin, HasSecondaryYAxis = HasSecondaryYAxis, HasSecondaryYAxisDescription = HasSecondaryYAxisDescription, HasSecondaryYAxisTitle = HasSecondaryYAxisTitle, HasXAxis = HasXAxis, HasXAxisDescription = HasXAxisDescription, HasXAxisGrid = HasXAxisGrid, HasXAxisHelpGrid = HasXAxisHelpGrid, HasXAxisTitle = HasXAxisTitle, HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, MeanValue = MeanValue, MinMaxLine = MinMaxLine, MissingValueTreatment = MissingValueTreatment, PercentageError = PercentageError, Position = Position, PropertySetInfo = PropertySetInfo, RegressionCurves = RegressionCurves, SecondXAxisTitle = SecondXAxisTitle, SecondYAxisTitle = SecondYAxisTitle, SecondaryYAxis = SecondaryYAxis, ShapeType = ShapeType, Size = Size, UpBar = UpBar, UpDown = UpDown, UserDefinedAttributes = UserDefinedAttributes, Volume = Volume, XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), calculateDiagramPositionExcludingAxes = js.Any.fromFunction0(calculateDiagramPositionExcludingAxes), calculateDiagramPositionIncludingAxes = js.Any.fromFunction0(calculateDiagramPositionIncludingAxes), calculateDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction0(calculateDiagramPositionIncludingAxesAndAxisTitles), getAxis = js.Any.fromFunction1(getAxis), getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = js.Any.fromFunction0(getDiagramType), getDownBar = js.Any.fromFunction0(getDownBar), getMinMaxLine = js.Any.fromFunction0(getMinMaxLine), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), getSecondaryYAxis = js.Any.fromFunction0(getSecondaryYAxis), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getUpBar = js.Any.fromFunction0(getUpBar), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), isAutomaticDiagramPositioning = js.Any.fromFunction0(isAutomaticDiagramPositioning), isExcludingDiagramPositioning = js.Any.fromFunction0(isExcludingDiagramPositioning), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAutomaticDiagramPositioning = js.Any.fromFunction0(setAutomaticDiagramPositioning), setDiagramPositionExcludingAxes = js.Any.fromFunction1(setDiagramPositionExcludingAxes), setDiagramPositionIncludingAxes = js.Any.fromFunction1(setDiagramPositionIncludingAxes), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1(setDiagramPositionIncludingAxesAndAxisTitles), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[StockDiagram]
  }
}

