package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Decryption Result Listener.
  *
  * This interface is used to receive the result information of a decryption operation.
  */
@js.native
trait XDecryptionResultListener extends XInterface {
  /**
    * Notifies the decryption result.
    * @param securityId the security id of the encryption to be decrypted
    * @param decryptionResult the result information
    */
  def decrypted(securityId: Double, decryptionResult: SecurityOperationStatus): Unit = js.native
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
  @scala.inline
  implicit class XDecryptionResultListenerOps[Self <: XDecryptionResultListener] (val x: Self) extends AnyVal {
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
    def setDecrypted(value: (Double, SecurityOperationStatus) => Unit): Self = this.set("decrypted", js.Any.fromFunction2(value))
  }
  
}

