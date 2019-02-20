package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LockType extends js.Object

/**
  * specifies the access type of a lock.
  * @see LockEntry
  */
@JSGlobal("com.sun.star.ucb.LockType")
@js.native
object LockType extends js.Object {
  /** specifies a write lock.read lock.read-write lock. */
  @js.native
  sealed trait WRITE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.LockType
  
  /* 0 */ val WRITE: WRITE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.LockType with scala.Double] = js.native
}

