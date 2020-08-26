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
@js.native
trait XReset extends XInterface {
  /**
    * adds the specified listener to receive events related to resetting the component.
    * @param aListener the listener to add.
    */
  def addResetListener(aListener: XResetListener): Unit = js.native
  /**
    * removes the specified listener
    * @param aListener the listener to remove
    */
  def removeResetListener(aListener: XResetListener): Unit = js.native
  /** resets a component to some default value. */
  def reset(): Unit = js.native
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
  @scala.inline
  implicit class XResetOps[Self <: XReset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddResetListener(value: XResetListener => Unit): Self = this.set("addResetListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveResetListener(value: XResetListener => Unit): Self = this.set("removeResetListener", js.Any.fromFunction1(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

