package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerContentEncryptionConfiguration extends StObject {
  
  /**
    * The KMS key that is used to encrypt the user's data stores in Athena.
    */
  var KmsKey: typings.awsSdk.clientsAthenaMod.KmsKey
}
object CustomerContentEncryptionConfiguration {
  
  inline def apply(KmsKey: KmsKey): CustomerContentEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(KmsKey = KmsKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerContentEncryptionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerContentEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKmsKey(value: KmsKey): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
  }
}
