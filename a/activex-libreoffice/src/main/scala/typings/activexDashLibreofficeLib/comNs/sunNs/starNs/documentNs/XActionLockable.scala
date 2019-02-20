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

