package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartErrorCategory extends js.Object

/** specifies the category of error indicators. */
@JSGlobal("com.sun.star.chart.ChartErrorCategory")
@js.native
object ChartErrorCategory extends js.Object {
  /**
    * displays the same lower and upper error indicators for all data points.
    *
    * The values for these are given as absolute numbers in {@link ChartStatistics.ConstantErrorLow} and {@link ChartStatistics.ConstantErrorHigh}
    * @see ChartStatistics
    */
  @js.native
  sealed trait CONSTANT_VALUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorCategory
  
  /**
    * The length of the error indicators for all data points is calculated by taking the percentage given as {@link ChartStatistics.ErrorMargin} of the
    * largest data point value.
    * @see ChartStatistics
    */
  @js.native
  sealed trait ERROR_MARGIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorCategory
  
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
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorCategory
  
  /**
    * The length of the error indicators is calculated for each data point by taking the percentage given as {@link ChartStatistics.PercentageError} of its
    * value.
    * @see ChartStatistics
    */
  @js.native
  sealed trait PERCENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorCategory
  
  /** displays error indicators for the standard deviation (square root of variance) of the data row. */
  @js.native
  sealed trait STANDARD_DEVIATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorCategory
  
  /** displays error indicators for the variance of the data row. */
  @js.native
  sealed trait VARIANCE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorCategory
  
  /* 5 */ val CONSTANT_VALUE: CONSTANT_VALUE with scala.Double = js.native
  /* 4 */ val ERROR_MARGIN: ERROR_MARGIN with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val PERCENT: PERCENT with scala.Double = js.native
  /* 2 */ val STANDARD_DEVIATION: STANDARD_DEVIATION with scala.Double = js.native
  /* 1 */ val VARIANCE: VARIANCE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorCategory with scala.Double
  ] = js.native
}

