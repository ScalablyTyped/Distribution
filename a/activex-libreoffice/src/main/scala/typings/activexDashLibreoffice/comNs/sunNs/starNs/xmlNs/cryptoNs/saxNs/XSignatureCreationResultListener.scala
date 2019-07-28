package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Creation Result Listener.
  *
  * This interface is used to receive the result information of a signature creation.
  */
trait XSignatureCreationResultListener extends XInterface {
  /**
    * Notifies the signature creation result.
    * @param securityId the security id of the signature
    * @param creationResult the result information
    */
  def signatureCreated(securityId: Double, creationResult: SecurityOperationStatus): Unit
}

object XSignatureCreationResultListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    signatureCreated: (Double, SecurityOperationStatus) => Unit
  ): XSignatureCreationResultListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), signatureCreated = js.Any.fromFunction2(signatureCreated))
  
    __obj.asInstanceOf[XSignatureCreationResultListener]
  }
}

