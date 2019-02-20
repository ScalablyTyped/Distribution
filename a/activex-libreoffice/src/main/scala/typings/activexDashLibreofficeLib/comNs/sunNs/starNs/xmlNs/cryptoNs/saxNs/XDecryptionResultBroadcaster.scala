package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Decryption Result Broadcaster.
  *
  * This interface is used to manipulate decryption result listener.
  */
trait XDecryptionResultBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Adds a new decryption result listener.
    *
    * When the decryption is finished, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addDecryptionResultListener(listener: XDecryptionResultListener): scala.Unit
  /**
    * Removes a decryption result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeDecryptionResultListener(listener: XDecryptionResultListener): scala.Unit
}

