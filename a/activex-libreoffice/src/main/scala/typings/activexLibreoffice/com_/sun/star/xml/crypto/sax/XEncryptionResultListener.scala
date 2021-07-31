package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Encryption Result Listener.
  *
  * This interface is used to receive the result information of an encryption operation.
  */
trait XEncryptionResultListener
  extends StObject
     with XInterface {
  
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
  
  @scala.inline
  implicit class XEncryptionResultListenerMutableBuilder[Self <: XEncryptionResultListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted(value: (Double, SecurityOperationStatus) => Unit): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
  }
}
