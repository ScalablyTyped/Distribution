package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionOptions extends StObject {
  
  /**
    * The customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt your data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
    */
  var KmsKeyId: js.UndefOr[string] = js.undefined
  
  /**
    * Enables the use of an AWS owned CMK using AWS Key Management Service (KMS). Set to true by default, if no value is provided, for example, for RabbitMQ brokers.
    */
  var UseAwsOwnedKey: boolean
}
object EncryptionOptions {
  
  inline def apply(UseAwsOwnedKey: boolean): EncryptionOptions = {
    val __obj = js.Dynamic.literal(UseAwsOwnedKey = UseAwsOwnedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionOptions]
  }
  
  extension [Self <: EncryptionOptions](x: Self) {
    
    inline def setKmsKeyId(value: string): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setUseAwsOwnedKey(value: boolean): Self = StObject.set(x, "UseAwsOwnedKey", value.asInstanceOf[js.Any])
  }
}
