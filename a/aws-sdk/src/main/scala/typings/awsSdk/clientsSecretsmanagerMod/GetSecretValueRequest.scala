package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecretValueRequest extends StObject {
  
  /**
    * The ARN or name of the secret to retrieve. For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN.
    */
  var SecretId: SecretIdType
  
  /**
    * The unique identifier of the version of the secret to retrieve. If you include both this parameter and VersionStage, the two parameters must refer to the same secret version. If you don't specify either a VersionStage or VersionId, then Secrets Manager returns the AWSCURRENT version. This value is typically a UUID-type value with 32 hexadecimal digits.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
  
  /**
    * The staging label of the version of the secret to retrieve.  Secrets Manager uses staging labels to keep track of different versions during the rotation process. If you include both this parameter and VersionId, the two parameters must refer to the same secret version. If you don't specify either a VersionStage or VersionId, Secrets Manager returns the AWSCURRENT version.
    */
  var VersionStage: js.UndefOr[SecretVersionStageType] = js.undefined
}
object GetSecretValueRequest {
  
  inline def apply(SecretId: SecretIdType): GetSecretValueRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretValueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSecretValueRequest] (val x: Self) extends AnyVal {
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    
    inline def setVersionStage(value: SecretVersionStageType): Self = StObject.set(x, "VersionStage", value.asInstanceOf[js.Any])
    
    inline def setVersionStageUndefined: Self = StObject.set(x, "VersionStage", js.undefined)
  }
}
