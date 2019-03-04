package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of {@link SAXEventKeeper} Status Change Broadcaster.
  *
  * This interface is used to manipulate {@link SAXEventKeeper} status change listener.
  */
trait XSAXEventKeeperStatusChangeBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Adds a new status change listener.
    *
    * When the {@link SAXEventKeeper} 's status changes, the listener will receive a notification.
    * @param listener the listener to be added
    */
  def addSAXEventKeeperStatusChangeListener(listener: XSAXEventKeeperStatusChangeListener): scala.Unit
  /**
    * Removes a status change listener.
    *
    * After a listener is removed, no status change notification will be sent to it.
    * @param listener the listener to be removed
    */
  def removeSAXEventKeeperStatusChangeListener(listener: XSAXEventKeeperStatusChangeListener): scala.Unit
}

object XSAXEventKeeperStatusChangeBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addSAXEventKeeperStatusChangeListener: js.Function1[XSAXEventKeeperStatusChangeListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSAXEventKeeperStatusChangeListener: js.Function1[XSAXEventKeeperStatusChangeListener, scala.Unit]
  ): XSAXEventKeeperStatusChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire, addSAXEventKeeperStatusChangeListener = addSAXEventKeeperStatusChangeListener, queryInterface = queryInterface, release = release, removeSAXEventKeeperStatusChangeListener = removeSAXEventKeeperStatusChangeListener)
  
    __obj.asInstanceOf[XSAXEventKeeperStatusChangeBroadcaster]
  }
}

