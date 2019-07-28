package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the category of error indicators. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait ChartErrorCategory extends js.Object

object ChartErrorCategory {
  /**
    * displays the same lower and upper error indicators for all data points.
    *
    * The values for these are given as absolute numbers in {@link ChartStatistics.ConstantErrorLow} and {@link ChartStatistics.ConstantErrorHigh}
    * @see ChartStatistics
    */
  @scala.inline
  def CONSTANT_VALUE: `5` = this.cast(5)
  /**
    * The length of the error indicators for all data points is calculated by taking the percentage given as {@link ChartStatistics.ErrorMargin} of the
    * largest data point value.
    * @see ChartStatistics
    */
  @scala.inline
  def ERROR_MARGIN: `4` = this.cast(4)
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
  @scala.inline
  def NONE: `0` = this.cast(0)
  /**
    * The length of the error indicators is calculated for each data point by taking the percentage given as {@link ChartStatistics.PercentageError} of its
    * value.
    * @see ChartStatistics
    */
  @scala.inline
  def PERCENT: `3` = this.cast(3)
  /** displays error indicators for the standard deviation (square root of variance) of the data row. */
  @scala.inline
  def STANDARD_DEVIATION: `2` = this.cast(2)
  /** displays error indicators for the variance of the data row. */
  @scala.inline
  def VARIANCE: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

