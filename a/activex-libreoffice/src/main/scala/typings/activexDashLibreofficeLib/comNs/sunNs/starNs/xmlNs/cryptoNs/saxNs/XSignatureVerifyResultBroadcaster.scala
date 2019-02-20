package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Verify Result Broadcaster.
  *
  * This interface is used to manipulate signature verify result listener.
  */
trait XSignatureVerifyResultBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Adds a new signature verify result listener.
    *
    * When the signature is verified, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addSignatureVerifyResultListener(listener: XSignatureVerifyResultListener): scala.Unit
  /**
    * Removes a signature verify result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeSignatureVerifyResultListener(listener: XSignatureVerifyResultListener): scala.Unit
}

