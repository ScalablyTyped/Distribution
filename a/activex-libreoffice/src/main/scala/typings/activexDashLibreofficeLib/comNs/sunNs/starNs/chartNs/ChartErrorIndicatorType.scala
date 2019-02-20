package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartErrorIndicatorType extends js.Object

/** specifies how the error is indicated. */
@JSGlobal("com.sun.star.chart.ChartErrorIndicatorType")
@js.native
object ChartErrorIndicatorType extends js.Object {
  /** displays only the lower value. */
  @js.native
  sealed trait LOWER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorIndicatorType
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorIndicatorType
  
  /** displays both the upper and lower values. */
  @js.native
  sealed trait TOP_AND_BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorIndicatorType
  
  /** displays only the upper value. */
  @js.native
  sealed trait UPPER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorIndicatorType
  
  /* 3 */ val LOWER: LOWER with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val TOP_AND_BOTTOM: TOP_AND_BOTTOM with scala.Double = js.native
  /* 2 */ val UPPER: UPPER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartErrorIndicatorType with scala.Double
  ] = js.native
}

