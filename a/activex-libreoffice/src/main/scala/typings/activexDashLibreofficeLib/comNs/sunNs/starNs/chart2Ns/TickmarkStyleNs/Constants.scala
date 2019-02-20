package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.TickmarkStyleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.chart2.TickmarkStyle.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait INNER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.TickmarkStyleNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.TickmarkStyleNs.Constants
  
  @js.native
  sealed trait OUTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.TickmarkStyleNs.Constants
  
  /* 1 */ val INNER: INNER with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val OUTER: OUTER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.TickmarkStyleNs.Constants with scala.Double
  ] = js.native
}

