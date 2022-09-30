package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import typings.activexLibreoffice.activexLibreofficeInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the category of error indicators. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`5`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait ChartErrorCategory extends StObject
object ChartErrorCategory {
  
  /**
    * displays the same lower and upper error indicators for all data points.
    *
    * The values for these are given as absolute numbers in {@link ChartStatistics.ConstantErrorLow} and {@link ChartStatistics.ConstantErrorHigh}
    * @see ChartStatistics
    */
  inline def CONSTANT_VALUE: `5` = 5.asInstanceOf[`5`]
  
  /**
    * The length of the error indicators for all data points is calculated by taking the percentage given as {@link ChartStatistics.ErrorMargin} of the
    * largest data point value.
    * @see ChartStatistics
    */
  inline def ERROR_MARGIN: `4` = 4.asInstanceOf[`4`]
  
  /**
    * error indicators are not displayed.
    *
    * displays no error indicators.
    *
    * no chart legend is displayed. <p>To disable the legend you should set the property
    *
    * ChartDocument::HasLegend to `FALSE` instead
    *
    * of setting this value.</p>
    *
    *
    *
    * displays no regression curve.
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * The length of the error indicators is calculated for each data point by taking the percentage given as {@link ChartStatistics.PercentageError} of its
    * value.
    * @see ChartStatistics
    */
  inline def PERCENT: `3` = 3.asInstanceOf[`3`]
  
  /** displays error indicators for the standard deviation (square root of variance) of the data row. */
  inline def STANDARD_DEVIATION: `2` = 2.asInstanceOf[`2`]
  
  /** displays error indicators for the variance of the data row. */
  inline def VARIANCE: `1` = 1.asInstanceOf[`1`]
}
