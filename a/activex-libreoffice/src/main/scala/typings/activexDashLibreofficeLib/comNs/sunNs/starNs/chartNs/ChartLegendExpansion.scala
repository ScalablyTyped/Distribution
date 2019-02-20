package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartLegendExpansion extends js.Object

/** Specifies sizing aspects of the legend */
@JSGlobal("com.sun.star.chart.ChartLegendExpansion")
@js.native
object ChartLegendExpansion extends js.Object {
  /** The legend entries are arranged in a way that the aspect ratio of the resulting legend is as near to 1 as possible. */
  @js.native
  sealed trait BALANCED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendExpansion
  
  /** The size of the legend is given explicitly */
  @js.native
  sealed trait CUSTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendExpansion
  
  /**
    * The legend entries are stacked in a single column if possible. If not enough space is available further columns are added. <p>This is usually used for
    * legends that are displayed on the
    *
    * left or right hand side of the page.</p>
    */
  @js.native
  sealed trait HIGH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendExpansion
  
  /**
    * The legend entries are arranged in a single row if possible. If not enough space is available further rows are added. <p>This is usually used for
    * legends that are displayed at the
    *
    * top or bottom of the page.</p>
    */
  @js.native
  sealed trait WIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendExpansion
  
  /* 2 */ val BALANCED: BALANCED with scala.Double = js.native
  /* 3 */ val CUSTOM: CUSTOM with scala.Double = js.native
  /* 1 */ val HIGH: HIGH with scala.Double = js.native
  /* 0 */ val WIDE: WIDE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendExpansion with scala.Double
  ] = js.native
}

