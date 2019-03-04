package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Encryption Result Broadcaster.
  *
  * This interface is used to manipulate encryption result listener.
  */
trait XEncryptionResultBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Adds a new encryption result listener.
    *
    * When the encryption is finished, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addEncryptionResultListener(listener: XEncryptionResultListener): scala.Unit
  /**
    * Removes an encryption result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeEncryptionResultListener(listener: XEncryptionResultListener): scala.Unit
}

object XEncryptionResultBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addEncryptionResultListener: js.Function1[XEncryptionResultListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEncryptionResultListener: js.Function1[XEncryptionResultListener, scala.Unit]
  ): XEncryptionResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire, addEncryptionResultListener = addEncryptionResultListener, queryInterface = queryInterface, release = release, removeEncryptionResultListener = removeEncryptionResultListener)
  
    __obj.asInstanceOf[XEncryptionResultBroadcaster]
  }
}

