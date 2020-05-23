package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to reset components to some default values.
  *
  * The semantics of **default value** depends on the providing service.
  */
trait XReset extends XInterface {
  /**
    * adds the specified listener to receive events related to resetting the component.
    * @param aListener the listener to add.
    */
  def addResetListener(aListener: XResetListener): Unit
  /**
    * removes the specified listener
    * @param aListener the listener to remove
    */
  def removeResetListener(aListener: XResetListener): Unit
  /** resets a component to some default value. */
  def reset(): Unit
}

object XReset {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addResetListener: XResetListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeResetListener: XResetListener => Unit,
    reset: () => Unit
  ): XReset = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addResetListener = js.Any.fromFunction1(addResetListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeResetListener = js.Any.fromFunction1(removeResetListener), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[XReset]
  }
}

