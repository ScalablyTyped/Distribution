package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Verify Result Listener.
  *
  * This interface is used to receive the result information of a signature verification.
  */
trait XSignatureVerifyResultListener extends XInterface {
  /**
    * Notifies the signature verify result.
    * @param securityId the security id of the signature
    * @param verifyResult the result information
    */
  def signatureVerified(securityId: Double, verifyResult: SecurityOperationStatus): Unit
}

object XSignatureVerifyResultListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    signatureVerified: (Double, SecurityOperationStatus) => Unit
  ): XSignatureVerifyResultListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), signatureVerified = js.Any.fromFunction2(signatureVerified))
    __obj.asInstanceOf[XSignatureVerifyResultListener]
  }
}

