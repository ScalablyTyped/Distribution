package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSecretValueResponse extends StObject {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * The unique identifier of the version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
  
  /**
    * The list of staging labels that are currently attached to this version of the secret. Secrets Manager uses staging labels to track a version as it progresses through the secret rotation process.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
}
object PutSecretValueResponse {
  
  inline def apply(): PutSecretValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSecretValueResponse]
  }
  
  extension [Self <: PutSecretValueResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    
    inline def setVersionStages(value: SecretVersionStagesType): Self = StObject.set(x, "VersionStages", value.asInstanceOf[js.Any])
    
    inline def setVersionStagesUndefined: Self = StObject.set(x, "VersionStages", js.undefined)
    
    inline def setVersionStagesVarargs(value: SecretVersionStageType*): Self = StObject.set(x, "VersionStages", js.Array(value*))
  }
}
