package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Decryption Result Broadcaster.
  *
  * This interface is used to manipulate decryption result listener.
  */
trait XDecryptionResultBroadcaster extends XInterface {
  /**
    * Adds a new decryption result listener.
    *
    * When the decryption is finished, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addDecryptionResultListener(listener: XDecryptionResultListener): Unit
  /**
    * Removes a decryption result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeDecryptionResultListener(listener: XDecryptionResultListener): Unit
}

object XDecryptionResultBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addDecryptionResultListener: XDecryptionResultListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDecryptionResultListener: XDecryptionResultListener => Unit
  ): XDecryptionResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addDecryptionResultListener = js.Any.fromFunction1(addDecryptionResultListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDecryptionResultListener = js.Any.fromFunction1(removeDecryptionResultListener))
    __obj.asInstanceOf[XDecryptionResultBroadcaster]
  }
}

