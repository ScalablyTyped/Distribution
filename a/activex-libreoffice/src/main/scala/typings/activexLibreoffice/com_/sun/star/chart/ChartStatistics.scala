package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers statistical properties for the data in the chart. It is available for a single data row and for the whole diagram. */
trait ChartStatistics
  extends StObject
     with XPropertySet {
  
  /**
    * specifies the upper limit of the error range of a data row.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::CONSTANT_VALUE.
    * @see ConstantErrorLow
    * @see ErrorCategory
    */
  var ConstantErrorHigh: Double
  
  /**
    * specifies the lower limit of the error range of a data row.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::CONSTANT_VALUE.
    * @see ConstantErrorHigh
    * @see ErrorCategory
    */
  var ConstantErrorLow: Double
  
  /** contains a cell range string for negative error bars. This property is used when the ErrorBarCategory is set to ErrorBarCategory::FROM_DATA. */
  var ErrorBarRangeNegative: String
  
  /** contains a cell range string for positive error bars. This property is used when the ErrorBarCategory is set to ErrorBarCategory::FROM_DATA. */
  var ErrorBarRangePositive: String
  
  /**
    * determines the style of the error bars. Use this instead of ErrorCategory
    * @see ErrorBarStyle
    */
  var ErrorBarStyle: Double
  
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
  var ErrorMargin: Double
  
  /** determines if the mean value for a data row is displayed as a line. */
  var MeanValue: Boolean
  
  /**
    * specifies the percentage that is used to display error bars.
    *
    * The length of the error indicators is calculated for each data point by taking the given percentage of its value.
    *
    * this setting is effective if the {@link ChartStatistics.ErrorCategory} is set to ChartErrorCategory::PERCENT.
    * @see ErrorCategory
    */
  var PercentageError: Double
  
  /**
    * determines a type of regression for the data row values.
    * @see ChartRegressionCurveType
    */
  var RegressionCurves: ChartRegressionCurveType
}
object ChartStatistics {
  
  inline def apply(
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
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): ChartStatistics = {
    val __obj = js.Dynamic.literal(ConstantErrorHigh = ConstantErrorHigh.asInstanceOf[js.Any], ConstantErrorLow = ConstantErrorLow.asInstanceOf[js.Any], ErrorBarRangeNegative = ErrorBarRangeNegative.asInstanceOf[js.Any], ErrorBarRangePositive = ErrorBarRangePositive.asInstanceOf[js.Any], ErrorBarStyle = ErrorBarStyle.asInstanceOf[js.Any], ErrorCategory = ErrorCategory.asInstanceOf[js.Any], ErrorIndicator = ErrorIndicator.asInstanceOf[js.Any], ErrorMargin = ErrorMargin.asInstanceOf[js.Any], MeanValue = MeanValue.asInstanceOf[js.Any], PercentageError = PercentageError.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RegressionCurves = RegressionCurves.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ChartStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartStatistics] (val x: Self) extends AnyVal {
    
    inline def setConstantErrorHigh(value: Double): Self = StObject.set(x, "ConstantErrorHigh", value.asInstanceOf[js.Any])
    
    inline def setConstantErrorLow(value: Double): Self = StObject.set(x, "ConstantErrorLow", value.asInstanceOf[js.Any])
    
    inline def setErrorBarRangeNegative(value: String): Self = StObject.set(x, "ErrorBarRangeNegative", value.asInstanceOf[js.Any])
    
    inline def setErrorBarRangePositive(value: String): Self = StObject.set(x, "ErrorBarRangePositive", value.asInstanceOf[js.Any])
    
    inline def setErrorBarStyle(value: Double): Self = StObject.set(x, "ErrorBarStyle", value.asInstanceOf[js.Any])
    
    inline def setErrorCategory(value: ChartErrorCategory): Self = StObject.set(x, "ErrorCategory", value.asInstanceOf[js.Any])
    
    inline def setErrorIndicator(value: ChartErrorIndicatorType): Self = StObject.set(x, "ErrorIndicator", value.asInstanceOf[js.Any])
    
    inline def setErrorMargin(value: Double): Self = StObject.set(x, "ErrorMargin", value.asInstanceOf[js.Any])
    
    inline def setMeanValue(value: Boolean): Self = StObject.set(x, "MeanValue", value.asInstanceOf[js.Any])
    
    inline def setPercentageError(value: Double): Self = StObject.set(x, "PercentageError", value.asInstanceOf[js.Any])
    
    inline def setRegressionCurves(value: ChartRegressionCurveType): Self = StObject.set(x, "RegressionCurves", value.asInstanceOf[js.Any])
  }
}
