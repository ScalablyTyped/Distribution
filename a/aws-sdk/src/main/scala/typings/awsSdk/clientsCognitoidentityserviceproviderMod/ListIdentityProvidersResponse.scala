package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityProvidersResponse extends StObject {
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
  
  /**
    * A list of IdP objects.
    */
  var Providers: ProvidersListType
}
object ListIdentityProvidersResponse {
  
  inline def apply(Providers: ProvidersListType): ListIdentityProvidersResponse = {
    val __obj = js.Dynamic.literal(Providers = Providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityProvidersResponse]
  }
  
  extension [Self <: ListIdentityProvidersResponse](x: Self) {
    
    inline def setNextToken(value: PaginationKeyType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProviders(value: ProvidersListType): Self = StObject.set(x, "Providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: ProviderDescription*): Self = StObject.set(x, "Providers", js.Array(value*))
  }
}
