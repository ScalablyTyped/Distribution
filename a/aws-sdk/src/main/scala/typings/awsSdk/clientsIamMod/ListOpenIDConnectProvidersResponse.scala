package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOpenIDConnectProvidersResponse extends StObject {
  
  /**
    * The list of IAM OIDC provider resource objects defined in the Amazon Web Services account.
    */
  var OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType] = js.undefined
}
object ListOpenIDConnectProvidersResponse {
  
  inline def apply(): ListOpenIDConnectProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOpenIDConnectProvidersResponse]
  }
  
  extension [Self <: ListOpenIDConnectProvidersResponse](x: Self) {
    
    inline def setOpenIDConnectProviderList(value: OpenIDConnectProviderListType): Self = StObject.set(x, "OpenIDConnectProviderList", value.asInstanceOf[js.Any])
    
    inline def setOpenIDConnectProviderListUndefined: Self = StObject.set(x, "OpenIDConnectProviderList", js.undefined)
    
    inline def setOpenIDConnectProviderListVarargs(value: OpenIDConnectProviderListEntry*): Self = StObject.set(x, "OpenIDConnectProviderList", js.Array(value*))
  }
}
