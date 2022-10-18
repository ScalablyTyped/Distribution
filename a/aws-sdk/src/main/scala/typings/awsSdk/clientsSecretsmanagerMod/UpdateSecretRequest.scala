package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecretRequest extends StObject {
  
  /**
    * If you include SecretString or SecretBinary, then Secrets Manager creates a new version for the secret, and this parameter specifies the unique identifier for the new version.  If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it as the value for this parameter in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken yourself for the new version and include the value in the request.  This value becomes the VersionId of the new version.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined
  
  /**
    * The description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt new secret versions as well as any existing versions with the staging labels AWSCURRENT, AWSPENDING, or AWSPREVIOUS. For more information about versions and staging labels, see Concepts: Version. A key alias is always prefixed by alias/, for example alias/aws/secretsmanager. For more information, see About aliases. If you set this to an empty string, Secrets Manager uses the Amazon Web Services managed key aws/secretsmanager. If this key doesn't already exist in your account, then Secrets Manager creates it for you automatically. All users and roles in the Amazon Web Services account automatically have access to use aws/secretsmanager. Creating aws/secretsmanager can result in a one-time significant delay in returning the result.   You can only use the Amazon Web Services managed key aws/secretsmanager if you call this operation using credentials from the same Amazon Web Services account that owns the secret. If the secret is in a different account, then you must use a customer managed key and provide the ARN of that KMS key in this field. The user making the call must have permissions to both the secret and the KMS key in their respective accounts. 
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined
  
  /**
    * The binary data to encrypt and store in the new version of the secret. We recommend that you store your binary data in a file and then pass the contents of the file as a parameter.  Either SecretBinary or SecretString must have a value, but not both. You can't access this parameter in the Secrets Manager console.
    */
  var SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined
  
  /**
    * The ARN or name of the secret. For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN.
    */
  var SecretId: SecretIdType
  
  /**
    * The text data to encrypt and store in the new version of the secret. We recommend you use a JSON structure of key/value pairs for your secret value.  Either SecretBinary or SecretString must have a value, but not both. 
    */
  var SecretString: js.UndefOr[SecretStringType] = js.undefined
}
object UpdateSecretRequest {
  
  inline def apply(SecretId: SecretIdType): UpdateSecretRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecretRequest]
  }
  
  extension [Self <: UpdateSecretRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenType): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyIdType): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setSecretBinary(value: SecretBinaryType): Self = StObject.set(x, "SecretBinary", value.asInstanceOf[js.Any])
    
    inline def setSecretBinaryUndefined: Self = StObject.set(x, "SecretBinary", js.undefined)
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
    
    inline def setSecretString(value: SecretStringType): Self = StObject.set(x, "SecretString", value.asInstanceOf[js.Any])
    
    inline def setSecretStringUndefined: Self = StObject.set(x, "SecretString", js.undefined)
  }
}
