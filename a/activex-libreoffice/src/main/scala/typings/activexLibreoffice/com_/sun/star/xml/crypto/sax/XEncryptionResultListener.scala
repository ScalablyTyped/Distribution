package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Encryption Result Listener.
  *
  * This interface is used to receive the result information of an encryption operation.
  */
@js.native
trait XEncryptionResultListener extends XInterface {
  /**
    * Notifies the encryption result.
    * @param securityId the security id of the encryption
    * @param encryptionResult the result information
    */
  def encrypted(securityId: Double, encryptionResult: SecurityOperationStatus): Unit = js.native
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
  @scala.inline
  implicit class XEncryptionResultListenerOps[Self <: XEncryptionResultListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncrypted(value: (Double, SecurityOperationStatus) => Unit): Self = this.set("encrypted", js.Any.fromFunction2(value))
  }
  
}

