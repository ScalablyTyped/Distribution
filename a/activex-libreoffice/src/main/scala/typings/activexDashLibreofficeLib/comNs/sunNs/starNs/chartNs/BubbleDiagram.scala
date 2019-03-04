package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

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
    AutomaticPosition: scala.Boolean,
    AutomaticSize: scala.Boolean,
    ConstantErrorHigh: scala.Double,
    ConstantErrorLow: scala.Double,
    DataCaption: scala.Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: java.lang.String,
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
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    XAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    XHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    YHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
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
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSecondXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondaryAxis: js.Function1[scala.Double, XAxis],
    getSecondaryYAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getXAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getXHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getYHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
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
    setAutomaticDiagramPositioning: js.Function0[scala.Unit],
    setDiagramPositionExcludingAxes: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setDiagramPositionIncludingAxes: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setDiagramPositionIncludingAxesAndAxisTitles: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): BubbleDiagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition, AutomaticSize = AutomaticSize, ConstantErrorHigh = ConstantErrorHigh, ConstantErrorLow = ConstantErrorLow, DataCaption = DataCaption, DataRowSource = DataRowSource, DiagramType = DiagramType, ErrorBarRangeNegative = ErrorBarRangeNegative, ErrorBarRangePositive = ErrorBarRangePositive, ErrorBarStyle = ErrorBarStyle, ErrorCategory = ErrorCategory, ErrorIndicator = ErrorIndicator, ErrorMargin = ErrorMargin, HasSecondaryYAxis = HasSecondaryYAxis, HasSecondaryYAxisDescription = HasSecondaryYAxisDescription, HasSecondaryYAxisTitle = HasSecondaryYAxisTitle, HasXAxis = HasXAxis, HasXAxisDescription = HasXAxisDescription, HasXAxisGrid = HasXAxisGrid, HasXAxisHelpGrid = HasXAxisHelpGrid, HasXAxisTitle = HasXAxisTitle, HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, MeanValue = MeanValue, MissingValueTreatment = MissingValueTreatment, PercentageError = PercentageError, Position = Position, PropertySetInfo = PropertySetInfo, RegressionCurves = RegressionCurves, SecondXAxisTitle = SecondXAxisTitle, SecondYAxisTitle = SecondYAxisTitle, SecondaryYAxis = SecondaryYAxis, ShapeType = ShapeType, Size = Size, UserDefinedAttributes = UserDefinedAttributes, XAxis = XAxis, XAxisTitle = XAxisTitle, XHelpGrid = XHelpGrid, XMainGrid = XMainGrid, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, calculateDiagramPositionExcludingAxes = calculateDiagramPositionExcludingAxes, calculateDiagramPositionIncludingAxes = calculateDiagramPositionIncludingAxes, calculateDiagramPositionIncludingAxesAndAxisTitles = calculateDiagramPositionIncludingAxesAndAxisTitles, getAxis = getAxis, getDataPointProperties = getDataPointProperties, getDataRowProperties = getDataRowProperties, getDiagramType = getDiagramType, getPosition = getPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSecondXAxisTitle = getSecondXAxisTitle, getSecondYAxisTitle = getSecondYAxisTitle, getSecondaryAxis = getSecondaryAxis, getSecondaryYAxis = getSecondaryYAxis, getShapeType = getShapeType, getSize = getSize, getXAxis = getXAxis, getXAxisTitle = getXAxisTitle, getXHelpGrid = getXHelpGrid, getXMainGrid = getXMainGrid, getYAxis = getYAxis, getYAxisTitle = getYAxisTitle, getYHelpGrid = getYHelpGrid, getYMainGrid = getYMainGrid, isAutomaticDiagramPositioning = isAutomaticDiagramPositioning, isExcludingDiagramPositioning = isExcludingDiagramPositioning, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setAutomaticDiagramPositioning = setAutomaticDiagramPositioning, setDiagramPositionExcludingAxes = setDiagramPositionExcludingAxes, setDiagramPositionIncludingAxes = setDiagramPositionIncludingAxes, setDiagramPositionIncludingAxesAndAxisTitles = setDiagramPositionIncludingAxesAndAxisTitles, setPosition = setPosition, setPropertyValue = setPropertyValue, setSize = setSize)
  
    __obj.asInstanceOf[BubbleDiagram]
  }
}

