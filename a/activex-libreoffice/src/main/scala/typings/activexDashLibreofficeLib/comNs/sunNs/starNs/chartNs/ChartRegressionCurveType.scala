package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartRegressionCurveType extends js.Object

/** specifies the type of the regression curve to be displayed. */
@JSGlobal("com.sun.star.chart.ChartRegressionCurveType")
@js.native
object ChartRegressionCurveType extends js.Object {
  /**
    * displays an exponential regression curve. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A</i>&sdot;e<sup><i>B</i>&sdot;<i>x</i></sup>.</p>
    */
  @js.native
  sealed trait EXPONENTIAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartRegressionCurveType
  
  /**
    * displays a linear regression curve. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A</i>&sdot;<i>x</i> + <i>B</i>.</p>
    */
  @js.native
  sealed trait LINEAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartRegressionCurveType
  
  /**
    * displays a linear logarithmic regression curve. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A</i>&sdot;log(<i>x</i>) + <i>B</i>.</p>
    */
  @js.native
  sealed trait LOGARITHM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartRegressionCurveType
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartRegressionCurveType
  
  /** displays a polynomial regression curve. */
  @js.native
  sealed trait POLYNOMIAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartRegressionCurveType
  
  /**
    * displays a regression curve using a power function. <p>The values of the series are approximated using the model
    *
    * <i>y</i> = <i>A&sdot;<i>x</i><sup>B</sup></i>.</p>
    *
    *  displays a moving average regression curve.
    */
  @js.native
  sealed trait POWER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartRegressionCurveType
  
  /* 3 */ val EXPONENTIAL: EXPONENTIAL with scala.Double = js.native
  /* 1 */ val LINEAR: LINEAR with scala.Double = js.native
  /* 2 */ val LOGARITHM: LOGARITHM with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 4 */ val POLYNOMIAL: POLYNOMIAL with scala.Double = js.native
  /* 5 */ val POWER: POWER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartRegressionCurveType with scala.Double
  ] = js.native
}

