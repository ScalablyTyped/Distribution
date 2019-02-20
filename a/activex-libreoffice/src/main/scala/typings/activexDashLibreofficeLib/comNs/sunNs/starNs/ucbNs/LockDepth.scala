package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LockDepth extends js.Object

/**
  * defines a depth for a lock.
  * @see Lock
  */
@JSGlobal("com.sun.star.ucb.LockDepth")
@js.native
object LockDepth extends js.Object {
  /** Infinity (includes children and children's children and ...). */
  @js.native
  sealed trait INFINITY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.LockDepth
  
  /** One (includes children). */
  @js.native
  sealed trait ONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.LockDepth
  
  /** Zero (includes no children). */
  @js.native
  sealed trait ZERO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.LockDepth
  
  /* 2 */ val INFINITY: INFINITY with scala.Double = js.native
  /* 1 */ val ONE: ONE with scala.Double = js.native
  /* 0 */ val ZERO: ZERO with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.LockDepth with scala.Double] = js.native
}

