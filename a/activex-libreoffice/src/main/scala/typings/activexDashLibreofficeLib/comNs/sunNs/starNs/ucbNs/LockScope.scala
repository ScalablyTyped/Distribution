package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LockScope extends js.Object

/**
  * defines the scope of a lock.
  * @see LockEntry
  */
@JSGlobal("com.sun.star.ucb.LockScope")
@js.native
object LockScope extends js.Object {
  /** the lock is exclusive. */
  @js.native
  sealed trait EXCLUSIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.LockScope
  
  /** the lock is shared. */
  @js.native
  sealed trait SHARED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.LockScope
  
  /* 0 */ val EXCLUSIVE: EXCLUSIVE with scala.Double = js.native
  /* 1 */ val SHARED: SHARED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.LockScope with scala.Double] = js.native
}

