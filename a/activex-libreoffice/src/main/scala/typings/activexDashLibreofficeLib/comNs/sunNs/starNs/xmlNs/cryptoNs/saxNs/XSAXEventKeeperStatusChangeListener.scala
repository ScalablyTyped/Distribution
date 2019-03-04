package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of {@link SAXEventKeeper} Status Change Listener.
  *
  * This interface is used to receive the {@link SAXEventKeeper} status change notification.
  */
trait XSAXEventKeeperStatusChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Notifies the {@link SAXEventKeeper} is entering/leaving blocking state.
    * @param isBlocking `true` if the {@link SAXEventKeeper} is entering blocking state, `false` otherwise
    */
  def blockingStatusChanged(isBlocking: scala.Boolean): scala.Unit
  /**
    * Notifies the {@link SAXEventKeeper} 's buffer is empty/not empty
    * @param isBufferEmpty `true` if the {@link SAXEventKeeper} has no buffer at all; `false` otherwise.
    */
  def bufferStatusChanged(isBufferEmpty: scala.Boolean): scala.Unit
  /**
    * Notifies the {@link SAXEventKeeper} is entering/leaving collecting state.
    * @param isInsideCollectedElement `true` if the {@link SAXEventKeeper} is collecting some element, `false` otherwise
    */
  def collectionStatusChanged(isInsideCollectedElement: scala.Boolean): scala.Unit
}

object XSAXEventKeeperStatusChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    blockingStatusChanged: js.Function1[scala.Boolean, scala.Unit],
    bufferStatusChanged: js.Function1[scala.Boolean, scala.Unit],
    collectionStatusChanged: js.Function1[scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSAXEventKeeperStatusChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, blockingStatusChanged = blockingStatusChanged, bufferStatusChanged = bufferStatusChanged, collectionStatusChanged = collectionStatusChanged, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSAXEventKeeperStatusChangeListener]
  }
}

