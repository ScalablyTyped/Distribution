package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the possibility of receiving an event for confirming deletions of rows in a {@link com.sun.star.form.component.DataForm} .
  * @see XConfirmDeleteListener
  */
trait XConfirmDeleteBroadcaster extends XInterface {
  /**
    * remembers the specified listener to receive an event for confirming deletions
    *
    * {@link XConfirmDeleteListener.confirmDelete()} is called before a deletion is performed. You may use the event to write your own confirmation
    * messages.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XConfirmDeleteListener
    */
  def addConfirmDeleteListener(aListener: XConfirmDeleteListener): Unit
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XConfirmDeleteListener
    */
  def removeConfirmDeleteListener(aListener: XConfirmDeleteListener): Unit
}

object XConfirmDeleteBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addConfirmDeleteListener: XConfirmDeleteListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeConfirmDeleteListener: XConfirmDeleteListener => Unit
  ): XConfirmDeleteBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addConfirmDeleteListener = js.Any.fromFunction1(addConfirmDeleteListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeConfirmDeleteListener = js.Any.fromFunction1(removeConfirmDeleteListener))
  
    __obj.asInstanceOf[XConfirmDeleteBroadcaster]
  }
}

