package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of the regression curve to be displayed. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
*/
trait ChartRegressionCurveType extends js.Object

object ChartRegressionCurveType {
  /**
    * displays an exponential regression curve. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A</i>&sdot;e<sup><i>B</i>&sdot;<i>x</i></sup>.</p>
    */
  @scala.inline
  def EXPONENTIAL: `3` = 3.asInstanceOf[`3`]
  /**
    * displays a linear regression curve. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A</i>&sdot;<i>x</i> + <i>B</i>.</p>
    */
  @scala.inline
  def LINEAR: `1` = 1.asInstanceOf[`1`]
  /**
    * displays a linear logarithmic regression curve. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A</i>&sdot;log(<i>x</i>) + <i>B</i>.</p>
    */
  @scala.inline
  def LOGARITHM: `2` = 2.asInstanceOf[`2`]
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
  def NONE: `0` = 0.asInstanceOf[`0`]
  /** displays a polynomial regression curve. */
  @scala.inline
  def POLYNOMIAL: `4` = 4.asInstanceOf[`4`]
  /**
    * displays a regression curve using a power function. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A&sdot;<i>x</i><sup>B</sup></i>.</p>
    *
    *  displays a moving average regression curve.
    */
  @scala.inline
  def POWER: `5` = 5.asInstanceOf[`5`]
}

