package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows locking the input on components. */
trait XBoundControl extends XInterface {
  /**
    * determines whether the input is currently locked or not.
    * @returns `TRUE` when it is currently locked, otherwise `FALSE` .
    */
  var Lock: Boolean
  /**
    * determines whether the input is currently locked or not.
    * @returns `TRUE` when it is currently locked, otherwise `FALSE` .
    */
  def getLock(): Boolean
  /**
    * is used for altering the current lock state of the component.
    * @param bLock the new lock state.
    */
  def setLock(bLock: Boolean): Unit
}

object XBoundControl {
  @scala.inline
  def apply(
    Lock: Boolean,
    acquire: () => Unit,
    getLock: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLock: Boolean => Unit
  ): XBoundControl = {
    val __obj = js.Dynamic.literal(Lock = Lock.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLock = js.Any.fromFunction0(getLock), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLock = js.Any.fromFunction1(setLock))
    __obj.asInstanceOf[XBoundControl]
  }
}

