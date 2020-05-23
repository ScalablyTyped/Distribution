package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to prevent object internal updates for a certain period to be able to quickly change multiple parts of the objects, where the
  * updates would invalidate each other, anyway.
  */
trait XActionLockable extends XInterface {
  /** increments the lock count of the object by one. */
  def addActionLock(): Unit
  /** @returns `TRUE` if at least one lock exists. */
  def isActionLocked(): Boolean
  /** decrements the lock count of the object by one. */
  def removeActionLock(): Unit
  /**
    * resets the locking level.
    *
    * This method is used for debugging purposes. The debugging environment of a programming language can reset the locks to allow refreshing of the view if
    * a breakpoint is reached or step execution is used.
    */
  def resetActionLocks(): Double
  /**
    * sets the locking level.
    *
    * This method is used for debugging purposes. The programming environment can restore the locking after a break of a debug session.
    */
  def setActionLocks(nLock: Double): Unit
}

object XActionLockable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addActionLock: () => Unit,
    isActionLocked: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionLock: () => Unit,
    resetActionLocks: () => Double,
    setActionLocks: Double => Unit
  ): XActionLockable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionLock = js.Any.fromFunction0(addActionLock), isActionLocked = js.Any.fromFunction0(isActionLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionLock = js.Any.fromFunction0(removeActionLock), resetActionLocks = js.Any.fromFunction0(resetActionLocks), setActionLocks = js.Any.fromFunction1(setActionLocks))
    __obj.asInstanceOf[XActionLockable]
  }
}

