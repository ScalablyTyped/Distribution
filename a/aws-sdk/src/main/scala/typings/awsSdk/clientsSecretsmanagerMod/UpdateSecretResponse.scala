package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecretResponse extends StObject {
  
  /**
    * The ARN of the secret that was updated.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The name of the secret that was updated.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * If Secrets Manager created a new version of the secret during this operation, then VersionId contains the unique identifier of the new version.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
}
object UpdateSecretResponse {
  
  inline def apply(): UpdateSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecretResponse]
  }
  
  extension [Self <: UpdateSecretResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
