package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers statistical properties for the data in the chart. It is available for a single data row and for the whole diagram. */
trait ChartStatistics
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * specifies the upper limit of the error range of a data row.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::CONSTANT_VALUE.
    * @see ConstantErrorLow
    * @see ErrorCategory
    */
  var ConstantErrorHigh: scala.Double
  /**
    * specifies the lower limit of the error range of a data row.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::CONSTANT_VALUE.
    * @see ConstantErrorHigh
    * @see ErrorCategory
    */
  var ConstantErrorLow: scala.Double
  /** contains a cell range string for negative error bars. This property is used when the ErrorBarCategory is set to ErrorBarCategory::FROM_DATA. */
  var ErrorBarRangeNegative: java.lang.String
  /** contains a cell range string for positive error bars. This property is used when the ErrorBarCategory is set to ErrorBarCategory::FROM_DATA. */
  var ErrorBarRangePositive: java.lang.String
  /**
    * determines the style of the error bars. Use this instead of ErrorCategory
    * @see ErrorBarStyle
    */
  var ErrorBarStyle: scala.Double
  /**
    * determines the type of error to indicate.
    * @deprecated Deprecated
    * @see ChartErrorCategory
    * @see PercentageError
    * @see ErrorMargin
    * @see ConstantErrorLow
    * @see ConstantErrorHigh
    * @see ErrorIndicator
    */
  var ErrorCategory: ChartErrorCategory
  /**
    * determines how the error is indicated.
    *
    * You can enable indicators pointing up, down or both.
    * @see ErrorCategory
    */
  var ErrorIndicator: ChartErrorIndicatorType
  /**
    * specifies the percentage for the margin of errors.
    *
    * The length of the error indicators is calculated by taking the percentage given of the largest data point value.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::ERROR_MARGIN.
    * @see ErrorCategory
    */
  var ErrorMargin: scala.Double
  /** determines if the mean value for a data row is displayed as a line. */
  var MeanValue: scala.Boolean
  /**
    * specifies the percentage that is used to display error bars.
    *
    * The length of the error indicators is calculated for each data point by taking the given percentage of its value.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::PERCENT.
    * @see ErrorCategory
    */
  var PercentageError: scala.Double
  /**
    * determines a type of regression for the data row values.
    * @see ChartRegressionCurveType
    */
  var RegressionCurves: ChartRegressionCurveType
}

object ChartStatistics {
  @scala.inline
  def apply(
    ConstantErrorHigh: scala.Double,
    ConstantErrorLow: scala.Double,
    ErrorBarRangeNegative: java.lang.String,
    ErrorBarRangePositive: java.lang.String,
    ErrorBarStyle: scala.Double,
    ErrorCategory: ChartErrorCategory,
    ErrorIndicator: ChartErrorIndicatorType,
    ErrorMargin: scala.Double,
    MeanValue: scala.Boolean,
    PercentageError: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RegressionCurves: ChartRegressionCurveType,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): ChartStatistics = {
    val __obj = js.Dynamic.literal(ConstantErrorHigh = ConstantErrorHigh, ConstantErrorLow = ConstantErrorLow, ErrorBarRangeNegative = ErrorBarRangeNegative, ErrorBarRangePositive = ErrorBarRangePositive, ErrorBarStyle = ErrorBarStyle, ErrorCategory = ErrorCategory, ErrorIndicator = ErrorIndicator, ErrorMargin = ErrorMargin, MeanValue = MeanValue, PercentageError = PercentageError, PropertySetInfo = PropertySetInfo, RegressionCurves = RegressionCurves, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ChartStatistics]
  }
}

