package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartLegendPosition extends js.Object

/** specifies one of the default positions of the legend in relation to the diagram. */
@JSGlobal("com.sun.star.chart.ChartLegendPosition")
@js.native
object ChartLegendPosition extends js.Object {
  /**
    * displays the chart legend beneath the diagram. <p>The second entry in the legend is placed on the right hand
    *
    * side of the first one.</p>
    */
  @js.native
  sealed trait BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendPosition
  
  /**
    * displays the chart legend on the left side of the diagram. <p>The second entry in the legend is placed below the first
    *
    * one.</p>
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendPosition
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendPosition
  
  /**
    * displays the chart legend on the right side of the diagram. <p>The second entry in the legend is placed below the first
    *
    * one.</p>
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendPosition
  
  /**
    * displays the chart legend above the diagram. <p>The second entry in the legend is placed on the right hand
    *
    * side of the first one.</p>
    */
  @js.native
  sealed trait TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendPosition
  
  /* 4 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 2 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartLegendPosition with scala.Double
  ] = js.native
}

