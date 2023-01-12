package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityProviderConfigsResponse extends StObject {
  
  /**
    * The identity provider configurations for the cluster.
    */
  var identityProviderConfigs: js.UndefOr[IdentityProviderConfigs] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated ListIdentityProviderConfigsResponse where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListIdentityProviderConfigsResponse {
  
  inline def apply(): ListIdentityProviderConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityProviderConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIdentityProviderConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityProviderConfigs(value: IdentityProviderConfigs): Self = StObject.set(x, "identityProviderConfigs", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderConfigsUndefined: Self = StObject.set(x, "identityProviderConfigs", js.undefined)
    
    inline def setIdentityProviderConfigsVarargs(value: IdentityProviderConfig*): Self = StObject.set(x, "identityProviderConfigs", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
