package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecretValueResponse extends StObject {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The date and time that this version of the secret was created. If you don't specify which version in VersionId or VersionStage, then Secrets Manager uses the AWSCURRENT version.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * The decrypted secret value, if the secret value was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a base64-encoded string. If the secret was created by using the Secrets Manager console, or if the secret value was originally provided as a string, then this field is omitted. The secret value appears in SecretString instead.
    */
  var SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined
  
  /**
    * The decrypted secret value, if the secret value was originally provided as a string or through the Secrets Manager console. If this secret was created by using the console, then Secrets Manager stores the information as a JSON structure of key/value pairs. 
    */
  var SecretString: js.UndefOr[SecretStringType] = js.undefined
  
  /**
    * The unique identifier of this version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
  
  /**
    * A list of all of the staging labels currently attached to this version of the secret.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
}
object GetSecretValueResponse {
  
  inline def apply(): GetSecretValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecretValueResponse]
  }
  
  extension [Self <: GetSecretValueResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSecretBinary(value: SecretBinaryType): Self = StObject.set(x, "SecretBinary", value.asInstanceOf[js.Any])
    
    inline def setSecretBinaryUndefined: Self = StObject.set(x, "SecretBinary", js.undefined)
    
    inline def setSecretString(value: SecretStringType): Self = StObject.set(x, "SecretString", value.asInstanceOf[js.Any])
    
    inline def setSecretStringUndefined: Self = StObject.set(x, "SecretString", js.undefined)
    
    inline def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    
    inline def setVersionStages(value: SecretVersionStagesType): Self = StObject.set(x, "VersionStages", value.asInstanceOf[js.Any])
    
    inline def setVersionStagesUndefined: Self = StObject.set(x, "VersionStages", js.undefined)
    
    inline def setVersionStagesVarargs(value: SecretVersionStageType*): Self = StObject.set(x, "VersionStages", js.Array(value*))
  }
}
