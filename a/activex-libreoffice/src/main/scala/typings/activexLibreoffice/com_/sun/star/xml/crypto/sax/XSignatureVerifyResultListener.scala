package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Signature Verify Result Listener.
  *
  * This interface is used to receive the result information of a signature verification.
  */
trait XSignatureVerifyResultListener
  extends StObject
     with XInterface {
  
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
  
  @scala.inline
  implicit class XSignatureVerifyResultListenerMutableBuilder[Self <: XSignatureVerifyResultListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignatureVerified(value: (Double, SecurityOperationStatus) => Unit): Self = StObject.set(x, "signatureVerified", js.Any.fromFunction2(value))
  }
}
