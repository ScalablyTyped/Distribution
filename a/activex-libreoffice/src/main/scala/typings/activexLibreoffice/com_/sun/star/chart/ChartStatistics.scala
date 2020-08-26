package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers statistical properties for the data in the chart. It is available for a single data row and for the whole diagram. */
@js.native
trait ChartStatistics extends XPropertySet {
  /**
    * specifies the upper limit of the error range of a data row.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::CONSTANT_VALUE.
    * @see ConstantErrorLow
    * @see ErrorCategory
    */
  var ConstantErrorHigh: Double = js.native
  /**
    * specifies the lower limit of the error range of a data row.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::CONSTANT_VALUE.
    * @see ConstantErrorHigh
    * @see ErrorCategory
    */
  var ConstantErrorLow: Double = js.native
  /** contains a cell range string for negative error bars. This property is used when the ErrorBarCategory is set to ErrorBarCategory::FROM_DATA. */
  var ErrorBarRangeNegative: String = js.native
  /** contains a cell range string for positive error bars. This property is used when the ErrorBarCategory is set to ErrorBarCategory::FROM_DATA. */
  var ErrorBarRangePositive: String = js.native
  /**
    * determines the style of the error bars. Use this instead of ErrorCategory
    * @see ErrorBarStyle
    */
  var ErrorBarStyle: Double = js.native
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
  var ErrorCategory: ChartErrorCategory = js.native
  /**
    * determines how the error is indicated.
    *
    * You can enable indicators pointing up, down or both.
    * @see ErrorCategory
    */
  var ErrorIndicator: ChartErrorIndicatorType = js.native
  /**
    * specifies the percentage for the margin of errors.
    *
    * The length of the error indicators is calculated by taking the percentage given of the largest data point value.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::ERROR_MARGIN.
    * @see ErrorCategory
    */
  var ErrorMargin: Double = js.native
  /** determines if the mean value for a data row is displayed as a line. */
  var MeanValue: Boolean = js.native
  /**
    * specifies the percentage that is used to display error bars.
    *
    * The length of the error indicators is calculated for each data point by taking the given percentage of its value.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::PERCENT.
    * @see ErrorCategory
    */
  var PercentageError: Double = js.native
  /**
    * determines a type of regression for the data row values.
    * @see ChartRegressionCurveType
    */
  var RegressionCurves: ChartRegressionCurveType = js.native
}

object ChartStatistics {
  @scala.inline
  def apply(
    ConstantErrorHigh: Double,
    ConstantErrorLow: Double,
    ErrorBarRangeNegative: String,
    ErrorBarRangePositive: String,
    ErrorBarStyle: Double,
    ErrorCategory: ChartErrorCategory,
    ErrorIndicator: ChartErrorIndicatorType,
    ErrorMargin: Double,
    MeanValue: Boolean,
    PercentageError: Double,
    PropertySetInfo: XPropertySetInfo,
    RegressionCurves: ChartRegressionCurveType,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ChartStatistics = {
    val __obj = js.Dynamic.literal(ConstantErrorHigh = ConstantErrorHigh.asInstanceOf[js.Any], ConstantErrorLow = ConstantErrorLow.asInstanceOf[js.Any], ErrorBarRangeNegative = ErrorBarRangeNegative.asInstanceOf[js.Any], ErrorBarRangePositive = ErrorBarRangePositive.asInstanceOf[js.Any], ErrorBarStyle = ErrorBarStyle.asInstanceOf[js.Any], ErrorCategory = ErrorCategory.asInstanceOf[js.Any], ErrorIndicator = ErrorIndicator.asInstanceOf[js.Any], ErrorMargin = ErrorMargin.asInstanceOf[js.Any], MeanValue = MeanValue.asInstanceOf[js.Any], PercentageError = PercentageError.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RegressionCurves = RegressionCurves.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ChartStatistics]
  }
  @scala.inline
  implicit class ChartStatisticsOps[Self <: ChartStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConstantErrorHigh(value: Double): Self = this.set("ConstantErrorHigh", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstantErrorLow(value: Double): Self = this.set("ConstantErrorLow", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorBarRangeNegative(value: String): Self = this.set("ErrorBarRangeNegative", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorBarRangePositive(value: String): Self = this.set("ErrorBarRangePositive", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorBarStyle(value: Double): Self = this.set("ErrorBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCategory(value: ChartErrorCategory): Self = this.set("ErrorCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorIndicator(value: ChartErrorIndicatorType): Self = this.set("ErrorIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMargin(value: Double): Self = this.set("ErrorMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeanValue(value: Boolean): Self = this.set("MeanValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentageError(value: Double): Self = this.set("PercentageError", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegressionCurves(value: ChartRegressionCurveType): Self = this.set("RegressionCurves", value.asInstanceOf[js.Any])
  }
  
}

