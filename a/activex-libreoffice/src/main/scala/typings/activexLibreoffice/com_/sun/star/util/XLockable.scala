package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows locking a component
  *
  * `lock` and `unlock` calls can be nested. However, they must be in pairs. As long as there has been one more call to `lock` than to `unlock` , the
  * component is considered locked, which is reflected by {@link isLocked()} returning `TRUE` .
  */
trait XLockable extends js.Object {
  /**
    * determines whether the component is currently locked.
    * @see lock
    * @see unlock
    */
  def isLocked(): Boolean
  /**
    * locks the component
    * @see unlock
    * @see isLocked
    */
  def lock(): Unit
  /**
    * unlocks the component
    * @see lock
    * @see isLocked
    * @throws NotLockedException if the component is not currently locked.
    */
  def unlock(): Unit
}

object XLockable {
  @scala.inline
  def apply(isLocked: () => Boolean, lock: () => Unit, unlock: () => Unit): XLockable = {
    val __obj = js.Dynamic.literal(isLocked = js.Any.fromFunction0(isLocked), lock = js.Any.fromFunction0(lock), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[XLockable]
  }
}

