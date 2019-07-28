package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XUpdateBroadcaster extends XInterface {
  /**
    * adds the specified listener to receive the events "approveUpdate" and "updated".
    * @param aListener the listener to add.
    * @see com.sun.star.form.XUpdateListener
    */
  def addUpdateListener(aListener: XUpdateListener): Unit
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XUpdateListener
    */
  def removeUpdateListener(aListener: XUpdateListener): Unit
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
}

