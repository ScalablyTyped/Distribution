package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecretVersionIdsResponse extends StObject {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * Secrets Manager includes this value if there's more output available than what is included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a long list. To get the next results, call ListSecretVersionIds again with this value. 
    */
  var NextToken: js.UndefOr[NextTokenType] = js.undefined
  
  /**
    * A list of the versions of the secret.
    */
  var Versions: js.UndefOr[SecretVersionsListType] = js.undefined
}
object ListSecretVersionIdsResponse {
  
  inline def apply(): ListSecretVersionIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecretVersionIdsResponse]
  }
  
  extension [Self <: ListSecretVersionIdsResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNextToken(value: NextTokenType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVersions(value: SecretVersionsListType): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    inline def setVersionsVarargs(value: SecretVersionsListEntry*): Self = StObject.set(x, "Versions", js.Array(value*))
  }
}
