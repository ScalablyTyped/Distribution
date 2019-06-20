package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of the regression curve to be displayed. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
*/
trait ChartRegressionCurveType extends js.Object

object ChartRegressionCurveType {
  /**
    * displays an exponential regression curve. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A</i>&sdot;e<sup><i>B</i>&sdot;<i>x</i></sup>.</p>
    */
  @scala.inline
  def EXPONENTIAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * displays a linear regression curve. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A</i>&sdot;<i>x</i> + <i>B</i>.</p>
    */
  @scala.inline
  def LINEAR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * displays a linear logarithmic regression curve. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A</i>&sdot;log(<i>x</i>) + <i>B</i>.</p>
    */
  @scala.inline
  def LOGARITHM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
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
  def NONE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** displays a polynomial regression curve. */
  @scala.inline
  def POLYNOMIAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /**
    * displays a regression curve using a power function. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A&sdot;<i>x</i><sup>B</sup></i>.</p>
    *
    *  displays a moving average regression curve.
    */
  @scala.inline
  def POWER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

