package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Encryption Result Listener.
  *
  * This interface is used to receive the result information of an encryption operation.
  */
trait XEncryptionResultListener extends XInterface {
  /**
    * Notifies the encryption result.
    * @param securityId the security id of the encryption
    * @param encryptionResult the result information
    */
  def encrypted(securityId: Double, encryptionResult: SecurityOperationStatus): Unit
}

object XEncryptionResultListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    encrypted: (Double, SecurityOperationStatus) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEncryptionResultListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), encrypted = js.Any.fromFunction2(encrypted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEncryptionResultListener]
  }
}

