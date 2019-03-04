package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Creation Result Listener.
  *
  * This interface is used to receive the result information of a signature creation.
  */
trait XSignatureCreationResultListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Notifies the signature creation result.
    * @param securityId the security id of the signature
    * @param creationResult the result information
    */
  def signatureCreated(
    securityId: scala.Double,
    creationResult: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  ): scala.Unit
}

object XSignatureCreationResultListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    signatureCreated: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus, 
      scala.Unit
    ]
  ): XSignatureCreationResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, signatureCreated = signatureCreated)
  
    __obj.asInstanceOf[XSignatureCreationResultListener]
  }
}

