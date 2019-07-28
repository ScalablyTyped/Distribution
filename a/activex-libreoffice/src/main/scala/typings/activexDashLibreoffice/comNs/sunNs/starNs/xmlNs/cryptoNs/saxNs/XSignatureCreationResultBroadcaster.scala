package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Creation Result Broadcaster.
  *
  * This interface is used to manipulate signature creation result listener.
  */
trait XSignatureCreationResultBroadcaster extends XInterface {
  /**
    * Adds a new signature creation result listener.
    *
    * When the signature is created, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addSignatureCreationResultListener(listener: XSignatureCreationResultListener): Unit
  /**
    * Removes a signature creation result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeSignatureCreationResultListener(listener: XSignatureCreationResultListener): Unit
}

object XSignatureCreationResultBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSignatureCreationResultListener: XSignatureCreationResultListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSignatureCreationResultListener: XSignatureCreationResultListener => Unit
  ): XSignatureCreationResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSignatureCreationResultListener = js.Any.fromFunction1(addSignatureCreationResultListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSignatureCreationResultListener = js.Any.fromFunction1(removeSignatureCreationResultListener))
  
    __obj.asInstanceOf[XSignatureCreationResultBroadcaster]
  }
}

