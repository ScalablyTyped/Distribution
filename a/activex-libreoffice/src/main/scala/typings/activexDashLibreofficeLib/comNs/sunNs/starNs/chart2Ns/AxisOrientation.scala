package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AxisOrientation extends js.Object

@JSGlobal("com.sun.star.chart2.AxisOrientation")
@js.native
object AxisOrientation extends js.Object {
  /** means equal to the primary writing direction */
  @js.native
  sealed trait MATHEMATICAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.AxisOrientation
  
  /** means the opposite of the primary writing direction */
  @js.native
  sealed trait REVERSE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.AxisOrientation
  
  /* 0 */ val MATHEMATICAL: MATHEMATICAL with scala.Double = js.native
  /* 1 */ val REVERSE: REVERSE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.AxisOrientation with scala.Double
  ] = js.native
}

