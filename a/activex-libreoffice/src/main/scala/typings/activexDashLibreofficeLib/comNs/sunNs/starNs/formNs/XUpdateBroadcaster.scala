package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

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
trait XUpdateBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive the events "approveUpdate" and "updated".
    * @param aListener the listener to add.
    * @see com.sun.star.form.XUpdateListener
    */
  def addUpdateListener(aListener: XUpdateListener): scala.Unit
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XUpdateListener
    */
  def removeUpdateListener(aListener: XUpdateListener): scala.Unit
}

object XUpdateBroadcaster {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addUpdateListener: XUpdateListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeUpdateListener: XUpdateListener => scala.Unit
  ): XUpdateBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addUpdateListener = js.Any.fromFunction1(addUpdateListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeUpdateListener = js.Any.fromFunction1(removeUpdateListener))
  
    __obj.asInstanceOf[XUpdateBroadcaster]
  }
}

