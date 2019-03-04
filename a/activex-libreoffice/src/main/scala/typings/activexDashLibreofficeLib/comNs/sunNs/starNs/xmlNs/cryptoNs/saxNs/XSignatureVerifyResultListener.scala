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

object XSignatureVerifyResultListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    signatureVerified: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus, 
      scala.Unit
    ]
  ): XSignatureVerifyResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, signatureVerified = signatureVerified)
  
    __obj.asInstanceOf[XSignatureVerifyResultListener]
  }
}

