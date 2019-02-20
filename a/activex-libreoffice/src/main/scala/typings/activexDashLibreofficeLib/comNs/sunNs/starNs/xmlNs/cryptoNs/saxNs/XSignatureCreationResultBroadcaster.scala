package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Creation Result Broadcaster.
  *
  * This interface is used to manipulate signature creation result listener.
  */
trait XSignatureCreationResultBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Adds a new signature creation result listener.
    *
    * When the signature is created, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addSignatureCreationResultListener(listener: XSignatureCreationResultListener): scala.Unit
  /**
    * Removes a signature creation result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeSignatureCreationResultListener(listener: XSignatureCreationResultListener): scala.Unit
}

