package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionSpecification extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the customer managed KMS key, for example kms_key_identifier:ARN.
    */
  var kmsKeyIdentifier: js.UndefOr[kmsKeyARN] = js.undefined
  
  /**
    * The encryption option specified for the table. You can choose one of the following KMS keys (KMS keys): • type:AWS_OWNED_KMS_KEY - This key is owned by Amazon Keyspaces.  • type:CUSTOMER_MANAGED_KMS_KEY - This key is stored in your account and is created, owned, and managed by you. This option requires the kms_key_identifier of the KMS key in Amazon Resource Name (ARN) format as input.  The default is type:AWS_OWNED_KMS_KEY.  For more information, see Encryption at rest in the Amazon Keyspaces Developer Guide.
    */
  var `type`: EncryptionType
}
object EncryptionSpecification {
  
  inline def apply(`type`: EncryptionType): EncryptionSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionSpecification]
  }
  
  extension [Self <: EncryptionSpecification](x: Self) {
    
    inline def setKmsKeyIdentifier(value: kmsKeyARN): Self = StObject.set(x, "kmsKeyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdentifierUndefined: Self = StObject.set(x, "kmsKeyIdentifier", js.undefined)
    
    inline def setType(value: EncryptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
