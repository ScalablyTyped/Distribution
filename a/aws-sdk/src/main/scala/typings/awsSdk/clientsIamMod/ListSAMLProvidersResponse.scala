package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSAMLProvidersResponse extends StObject {
  
  /**
    * The list of SAML provider resource objects defined in IAM for this Amazon Web Services account.
    */
  var SAMLProviderList: js.UndefOr[SAMLProviderListType] = js.undefined
}
object ListSAMLProvidersResponse {
  
  inline def apply(): ListSAMLProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSAMLProvidersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSAMLProvidersResponse] (val x: Self) extends AnyVal {
    
    inline def setSAMLProviderList(value: SAMLProviderListType): Self = StObject.set(x, "SAMLProviderList", value.asInstanceOf[js.Any])
    
    inline def setSAMLProviderListUndefined: Self = StObject.set(x, "SAMLProviderList", js.undefined)
    
    inline def setSAMLProviderListVarargs(value: SAMLProviderListEntry*): Self = StObject.set(x, "SAMLProviderList", js.Array(value*))
  }
}
