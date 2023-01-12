package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecretsResponse extends StObject {
  
  /**
    * Secrets Manager includes this value if there's more output available than what is included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a long list. To get the next results, call ListSecrets again with this value.
    */
  var NextToken: js.UndefOr[NextTokenType] = js.undefined
  
  /**
    * A list of the secrets in the account.
    */
  var SecretList: js.UndefOr[SecretListType] = js.undefined
}
object ListSecretsResponse {
  
  inline def apply(): ListSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecretsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSecretsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextTokenType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecretList(value: SecretListType): Self = StObject.set(x, "SecretList", value.asInstanceOf[js.Any])
    
    inline def setSecretListUndefined: Self = StObject.set(x, "SecretList", js.undefined)
    
    inline def setSecretListVarargs(value: SecretListEntry*): Self = StObject.set(x, "SecretList", js.Array(value*))
  }
}
