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
    getDownBar: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getMinMaxLine: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSecondXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondaryAxis: js.Function1[scala.Double, XAxis],
    getSecondaryYAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getUpBar: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
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
  ): StockDiagram = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutomaticPosition")(AutomaticPosition)
    __obj.updateDynamic("AutomaticSize")(AutomaticSize)
    __obj.updateDynamic("ConstantErrorHigh")(ConstantErrorHigh)
    __obj.updateDynamic("ConstantErrorLow")(ConstantErrorLow)
    __obj.updateDynamic("DataCaption")(DataCaption)
    __obj.updateDynamic("DataRowSource")(DataRowSource)
    __obj.updateDynamic("DiagramType")(DiagramType)
    __obj.updateDynamic("DownBar")(DownBar)
    __obj.updateDynamic("ErrorBarRangeNegative")(ErrorBarRangeNegative)
    __obj.updateDynamic("ErrorBarRangePositive")(ErrorBarRangePositive)
    __obj.updateDynamic("ErrorBarStyle")(ErrorBarStyle)
    __obj.updateDynamic("ErrorCategory")(ErrorCategory)
    __obj.updateDynamic("ErrorIndicator")(ErrorIndicator)
    __obj.updateDynamic("ErrorMargin")(ErrorMargin)
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
    __obj.updateDynamic("MeanValue")(MeanValue)
    __obj.updateDynamic("MinMaxLine")(MinMaxLine)
    __obj.updateDynamic("MissingValueTreatment")(MissingValueTreatment)
    __obj.updateDynamic("PercentageError")(PercentageError)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RegressionCurves")(RegressionCurves)
    __obj.updateDynamic("SecondXAxisTitle")(SecondXAxisTitle)
    __obj.updateDynamic("SecondYAxisTitle")(SecondYAxisTitle)
    __obj.updateDynamic("SecondaryYAxis")(SecondaryYAxis)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("UpBar")(UpBar)
    __obj.updateDynamic("UpDown")(UpDown)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("Volume")(Volume)
    __obj.updateDynamic("XAxis")(XAxis)
    __obj.updateDynamic("XAxisTitle")(XAxisTitle)
    __obj.updateDynamic("XHelpGrid")(XHelpGrid)
    __obj.updateDynamic("XMainGrid")(XMainGrid)
    __obj.updateDynamic("YAxis")(YAxis)
    __obj.updateDynamic("YAxisTitle")(YAxisTitle)
    __obj.updateDynamic("YHelpGrid")(YHelpGrid)
    __obj.updateDynamic("YMainGrid")(YMainGrid)
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
    __obj.updateDynamic("getDownBar")(getDownBar)
    __obj.updateDynamic("getMinMaxLine")(getMinMaxLine)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getSecondXAxisTitle")(getSecondXAxisTitle)
    __obj.updateDynamic("getSecondYAxisTitle")(getSecondYAxisTitle)
    __obj.updateDynamic("getSecondaryAxis")(getSecondaryAxis)
    __obj.updateDynamic("getSecondaryYAxis")(getSecondaryYAxis)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getUpBar")(getUpBar)
    __obj.updateDynamic("getXAxis")(getXAxis)
    __obj.updateDynamic("getXAxisTitle")(getXAxisTitle)
    __obj.updateDynamic("getXHelpGrid")(getXHelpGrid)
    __obj.updateDynamic("getXMainGrid")(getXMainGrid)
    __obj.updateDynamic("getYAxis")(getYAxis)
    __obj.updateDynamic("getYAxisTitle")(getYAxisTitle)
    __obj.updateDynamic("getYHelpGrid")(getYHelpGrid)
    __obj.updateDynamic("getYMainGrid")(getYMainGrid)
    __obj.updateDynamic("isAutomaticDiagramPositioning")(isAutomaticDiagramPositioning)
    __obj.updateDynamic("isExcludingDiagramPositioning")(isExcludingDiagramPositioning)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setAutomaticDiagramPositioning")(setAutomaticDiagramPositioning)
    __obj.updateDynamic("setDiagramPositionExcludingAxes")(setDiagramPositionExcludingAxes)
    __obj.updateDynamic("setDiagramPositionIncludingAxes")(setDiagramPositionIncludingAxes)
    __obj.updateDynamic("setDiagramPositionIncludingAxesAndAxisTitles")(setDiagramPositionIncludingAxesAndAxisTitles)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setSize")(setSize)
    __obj.asInstanceOf[StockDiagram]
  }
}

