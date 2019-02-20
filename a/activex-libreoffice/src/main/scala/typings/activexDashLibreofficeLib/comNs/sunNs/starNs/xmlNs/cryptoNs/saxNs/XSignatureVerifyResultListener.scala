package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Verify Result Listener.
  *
  * This interface is used to receive the result information of a signature verification.
  */
trait XSignatureVerifyResultListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Notifies the signature verify result.
    * @param securityId the security id of the signature
    * @param verifyResult the result information
    */
  def signatureVerified(
    securityId: scala.Double,
    verifyResult: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  ): scala.Unit
}

