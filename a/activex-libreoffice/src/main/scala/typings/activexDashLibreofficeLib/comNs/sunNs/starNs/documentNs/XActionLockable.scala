package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to prevent object internal updates for a certain period to be able to quickly change multiple parts of the objects, where the
  * updates would invalidate each other, anyway.
  */
trait XActionLockable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** increments the lock count of the object by one. */
  def addActionLock(): scala.Unit
  /** @returns `TRUE` if at least one lock exists. */
  def isActionLocked(): scala.Boolean
  /** decrements the lock count of the object by one. */
  def removeActionLock(): scala.Unit
  /**
    * resets the locking level.
    *
    * This method is used for debugging purposes. The debugging environment of a programming language can reset the locks to allow refreshing of the view if
    * a breakpoint is reached or step execution is used.
    */
  def resetActionLocks(): scala.Double
  /**
    * sets the locking level.
    *
    * This method is used for debugging purposes. The programming environment can restore the locking after a break of a debug session.
    */
  def setActionLocks(nLock: scala.Double): scala.Unit
}

object XActionLockable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addActionLock: () => scala.Unit,
    isActionLocked: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeActionLock: () => scala.Unit,
    resetActionLocks: () => scala.Double,
    setActionLocks: scala.Double => scala.Unit
  ): XActionLockable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionLock = js.Any.fromFunction0(addActionLock), isActionLocked = js.Any.fromFunction0(isActionLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionLock = js.Any.fromFunction0(removeActionLock), resetActionLocks = js.Any.fromFunction0(resetActionLocks), setActionLocks = js.Any.fromFunction1(setActionLocks))
  
    __obj.asInstanceOf[XActionLockable]
  }
}

