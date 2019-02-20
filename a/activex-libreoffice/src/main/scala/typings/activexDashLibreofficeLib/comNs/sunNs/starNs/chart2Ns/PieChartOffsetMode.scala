package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PieChartOffsetMode extends js.Object

/** Mode used for a pie chart template to determine the initial state of exploded pies. */
@JSGlobal("com.sun.star.chart2.PieChartOffsetMode")
@js.native
object PieChartOffsetMode extends js.Object {
  /** All pies are exploded by a certain percentage. The default is 10 percent. */
  @js.native
  sealed trait ALL_EXPLODED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PieChartOffsetMode
  
  /**
    * Default, no pies are exploded.
    *
    * The symbol is invisible
    *
    * no transparency attribute is evaluated
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PieChartOffsetMode
  
  /* 1 */ val ALL_EXPLODED: ALL_EXPLODED with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.PieChartOffsetMode with scala.Double
  ] = js.native
}

