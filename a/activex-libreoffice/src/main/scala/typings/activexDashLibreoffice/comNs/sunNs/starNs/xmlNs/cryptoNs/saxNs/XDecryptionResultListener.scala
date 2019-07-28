package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Decryption Result Listener.
  *
  * This interface is used to receive the result information of a decryption operation.
  */
trait XDecryptionResultListener extends XInterface {
  /**
    * Notifies the decryption result.
    * @param securityId the security id of the encryption to be decrypted
    * @param decryptionResult the result information
    */
  def decrypted(securityId: Double, decryptionResult: SecurityOperationStatus): Unit
}

object XDecryptionResultListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    decrypted: (Double, SecurityOperationStatus) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDecryptionResultListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), decrypted = js.Any.fromFunction2(decrypted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDecryptionResultListener]
  }
}

