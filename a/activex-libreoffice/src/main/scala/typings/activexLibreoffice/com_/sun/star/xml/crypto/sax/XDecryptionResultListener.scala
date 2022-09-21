package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.crypto.SecurityOperationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Decryption Result Listener.
  *
  * This interface is used to receive the result information of a decryption operation.
  */
trait XDecryptionResultListener
  extends StObject
     with XInterface {
  
  /**
    * Notifies the decryption result.
    * @param securityId the security id of the encryption to be decrypted
    * @param decryptionResult the result information
    */
  def decrypted(securityId: Double, decryptionResult: SecurityOperationStatus): Unit
}
object XDecryptionResultListener {
  
  inline def apply(
    acquire: () => Unit,
    decrypted: (Double, SecurityOperationStatus) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDecryptionResultListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), decrypted = js.Any.fromFunction2(decrypted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDecryptionResultListener]
  }
  
  extension [Self <: XDecryptionResultListener](x: Self) {
    
    inline def setDecrypted(value: (Double, SecurityOperationStatus) => Unit): Self = StObject.set(x, "decrypted", js.Any.fromFunction2(value))
  }
}
