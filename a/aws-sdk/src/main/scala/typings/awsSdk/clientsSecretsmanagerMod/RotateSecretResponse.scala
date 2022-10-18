package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateSecretResponse extends StObject {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * The ID of the new version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
}
object RotateSecretResponse {
  
  inline def apply(): RotateSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateSecretResponse]
  }
  
  extension [Self <: RotateSecretResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
