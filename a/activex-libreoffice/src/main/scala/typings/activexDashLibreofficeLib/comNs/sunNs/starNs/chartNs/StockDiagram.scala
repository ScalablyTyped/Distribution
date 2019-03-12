package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

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
  var UpDown: scala.Boolean
  /**
    * indicates if a stock chart contains data representing the volume of stocks.
    *
    * The values of the volume are represented as columns like those of a {@link BarDiagram} .
    *
    * If this property is set to `TRUE` , the values of the first series of the chart data are interpreted as volume.
    */
  var Volume: scala.Boolean
}

object StockDiagram {
  @scala.inline
  def apply(
    AutomaticPosition: scala.Boolean,
    AutomaticSize: scala.Boolean,
    ConstantErrorHigh: scala.Double,
    ConstantErrorLow: scala.Double,
    DataCaption: scala.Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: java.lang.String,
    DownBar: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ErrorBarRangeNegative: java.lang.String,
    ErrorBarRangePositive: java.lang.String,
    ErrorBarStyle: scala.Double,
    ErrorCategory: ChartErrorCategory,
    ErrorIndicator: ChartErrorIndicatorType,
    ErrorMargin: scala.Double,
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
    MeanValue: scala.Boolean,
    MinMaxLine: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    MissingValueTreatment: scala.Double,
    PercentageError: scala.Double,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RegressionCurves: ChartRegressionCurveType,
    SecondXAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    SecondYAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    SecondaryYAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    UpBar: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    UpDown: scala.Boolean,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Volume: scala.Boolean,
    XAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    XHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    YHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
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
    getDownBar: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getMinMaxLine: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getPosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSecondXAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getSecondYAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getSecondaryAxis: scala.Double => XAxis,
    getSecondaryYAxis: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getShapeType: () => java.lang.String,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getUpBar: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getXAxis: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getXAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getXHelpGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getXMainGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getYAxis: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getYAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getYHelpGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getYMainGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    isAutomaticDiagramPositioning: () => scala.Boolean,
    isExcludingDiagramPositioning: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setAutomaticDiagramPositioning: () => scala.Unit,
    setDiagramPositionExcludingAxes: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit,
    setDiagramPositionIncludingAxes: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit,
    setDiagramPositionIncludingAxesAndAxisTitles: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit,
    setPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size => scala.Unit
  ): StockDiagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition, AutomaticSize = AutomaticSize, ConstantErrorHigh = ConstantErrorHigh, ConstantErrorLow = ConstantErrorLow, DataCaption = DataCaption, DataRowSource = DataRowSource, DiagramType = DiagramType, DownBar = DownBar, ErrorBarRangeNegative = ErrorBarRangeNegative, ErrorBarRangePositive = ErrorBarRangePositive, ErrorBarStyle = ErrorBarStyle, ErrorCategory = ErrorCategory, ErrorIndicator = ErrorIndicator, ErrorMargin = ErrorMargin, HasSecondaryYAxis = HasSecondaryYAxis, HasSecondaryYAxisDescription = HasSecondaryYAxisDescription, HasSecondaryYAxisTitle = HasSecondaryYAxisTitle, HasXAxis = HasXAxis, HasXAxisDescription = HasXAxisDescription, HasXAxisGrid = HasXAxisGrid, HasXAxisHelpGrid = HasXAxisHelpGrid, HasXAxisTitle = HasXAxisTitle, HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, MeanValue = MeanValue, MinMaxLine = MinMaxLine, MissingValueTreatment = MissingValueTreatment, PercentageError = PercentageError, Position = Position, PropertySetInfo = PropertySetInfo, RegressionCurves = RegressionCurves, SecondXAxisTitle = SecondXAxisTitle, SecondYAxisTitle = SecondYAxisTitle, SecondaryYAxis = SecondaryYAxis, ShapeType = ShapeType, Size = Size, UpBar = UpBar, UpDown = UpDown, UserDefinedAttributes = UserDefinedAttributes, Volume = Volume, XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), calculateDiagramPositionExcludingAxes = js.Any.fromFunction0(calculateDiagramPositionExcludingAxes), calculateDiagramPositionIncludingAxes = js.Any.fromFunction0(calculateDiagramPositionIncludingAxes), calculateDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction0(calculateDiagramPositionIncludingAxesAndAxisTitles), getAxis = js.Any.fromFunction1(getAxis), getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = js.Any.fromFunction0(getDiagramType), getDownBar = js.Any.fromFunction0(getDownBar), getMinMaxLine = js.Any.fromFunction0(getMinMaxLine), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), getSecondaryYAxis = js.Any.fromFunction0(getSecondaryYAxis), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getUpBar = js.Any.fromFunction0(getUpBar), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), isAutomaticDiagramPositioning = js.Any.fromFunction0(isAutomaticDiagramPositioning), isExcludingDiagramPositioning = js.Any.fromFunction0(isExcludingDiagramPositioning), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAutomaticDiagramPositioning = js.Any.fromFunction0(setAutomaticDiagramPositioning), setDiagramPositionExcludingAxes = js.Any.fromFunction1(setDiagramPositionExcludingAxes), setDiagramPositionIncludingAxes = js.Any.fromFunction1(setDiagramPositionIncludingAxes), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1(setDiagramPositionIncludingAxesAndAxisTitles), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[StockDiagram]
  }
}

