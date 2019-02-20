package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StackingDirection extends js.Object

@JSGlobal("com.sun.star.chart2.StackingDirection")
@js.native
object StackingDirection extends js.Object {
  @js.native
  sealed trait NO_STACKING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.StackingDirection
  
  @js.native
  sealed trait Y_STACKING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.StackingDirection
  
  @js.native
  sealed trait Z_STACKING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.StackingDirection
  
  /* 0 */ val NO_STACKING: NO_STACKING with scala.Double = js.native
  /* 1 */ val Y_STACKING: Y_STACKING with scala.Double = js.native
  /* 2 */ val Z_STACKING: Z_STACKING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.StackingDirection with scala.Double
  ] = js.native
}

