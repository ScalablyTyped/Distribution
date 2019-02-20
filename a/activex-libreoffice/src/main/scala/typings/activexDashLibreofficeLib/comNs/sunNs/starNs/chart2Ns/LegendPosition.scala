package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendPosition extends js.Object

@JSGlobal("com.sun.star.chart2.LegendPosition")
@js.native
object LegendPosition extends js.Object {
  /** The position of the legend is given by an offset value */
  @js.native
  sealed trait CUSTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LegendPosition
  
  /** In LTR mode this is the right-hand side <p>This usually is the default.</p> */
  @js.native
  sealed trait LINE_END
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LegendPosition
  
  /** In LTR mode this is the left-hand side */
  @js.native
  sealed trait LINE_START
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LegendPosition
  
  /** In LTR mode this is the bottom side */
  @js.native
  sealed trait PAGE_END
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LegendPosition
  
  /** In LTR mode this is the top side */
  @js.native
  sealed trait PAGE_START
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LegendPosition
  
  /* 4 */ val CUSTOM: CUSTOM with scala.Double = js.native
  /* 1 */ val LINE_END: LINE_END with scala.Double = js.native
  /* 0 */ val LINE_START: LINE_START with scala.Double = js.native
  /* 3 */ val PAGE_END: PAGE_END with scala.Double = js.native
  /* 2 */ val PAGE_START: PAGE_START with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.LegendPosition with scala.Double
  ] = js.native
}

