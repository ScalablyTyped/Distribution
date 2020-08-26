package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Creation Result Listener.
  *
  * This interface is used to receive the result information of a signature creation.
  */
@js.native
trait XSignatureCreationResultListener extends XInterface {
  /**
    * Notifies the signature creation result.
    * @param securityId the security id of the signature
    * @param creationResult the result information
    */
  def signatureCreated(securityId: Double, creationResult: SecurityOperationStatus): Unit = js.native
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
  @scala.inline
  implicit class XSignatureCreationResultListenerOps[Self <: XSignatureCreationResultListener] (val x: Self) extends AnyVal {
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
    def setSignatureCreated(value: (Double, SecurityOperationStatus) => Unit): Self = this.set("signatureCreated", js.Any.fromFunction2(value))
  }
  
}

