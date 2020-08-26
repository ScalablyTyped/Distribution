package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the broadcaster interface for sending "approveUpdate" and "updated" events.
  *
  * The component supporting this interface must do approval calls ( {@link XUpdateListener.approveUpdate()} ) immediately before the data is updated, and
  * notification calls ( {@link XUpdateListener.updated()} ) immediately afterwards.
  * @see XUpdateListener
  */
@js.native
trait XUpdateBroadcaster extends XInterface {
  /**
    * adds the specified listener to receive the events "approveUpdate" and "updated".
    * @param aListener the listener to add.
    * @see com.sun.star.form.XUpdateListener
    */
  def addUpdateListener(aListener: XUpdateListener): Unit = js.native
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XUpdateListener
    */
  def removeUpdateListener(aListener: XUpdateListener): Unit = js.native
}

object XUpdateBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addUpdateListener: XUpdateListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeUpdateListener: XUpdateListener => Unit
  ): XUpdateBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addUpdateListener = js.Any.fromFunction1(addUpdateListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeUpdateListener = js.Any.fromFunction1(removeUpdateListener))
    __obj.asInstanceOf[XUpdateBroadcaster]
  }
  @scala.inline
  implicit class XUpdateBroadcasterOps[Self <: XUpdateBroadcaster] (val x: Self) extends AnyVal {
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
    def setAddUpdateListener(value: XUpdateListener => Unit): Self = this.set("addUpdateListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveUpdateListener(value: XUpdateListener => Unit): Self = this.set("removeUpdateListener", js.Any.fromFunction1(value))
  }
  
}

