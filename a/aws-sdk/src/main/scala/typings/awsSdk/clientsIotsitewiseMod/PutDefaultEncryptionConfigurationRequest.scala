package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDefaultEncryptionConfigurationRequest extends StObject {
  
  /**
    * The type of encryption used for the encryption configuration.
    */
  var encryptionType: EncryptionType
  
  /**
    * The Key ID of the customer managed key used for KMS encryption. This is required if you use KMS_BASED_ENCRYPTION.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
}
object PutDefaultEncryptionConfigurationRequest {
  
  inline def apply(encryptionType: EncryptionType): PutDefaultEncryptionConfigurationRequest = {
    val __obj = js.Dynamic.literal(encryptionType = encryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDefaultEncryptionConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutDefaultEncryptionConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
  }
}
