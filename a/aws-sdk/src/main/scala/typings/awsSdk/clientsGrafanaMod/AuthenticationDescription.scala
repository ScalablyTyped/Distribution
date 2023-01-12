package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationDescription extends StObject {
  
  /**
    * A structure containing information about how this workspace works with Amazon Web Services SSO. 
    */
  var awsSso: js.UndefOr[AwsSsoAuthentication] = js.undefined
  
  /**
    * Specifies whether this workspace uses Amazon Web Services SSO, SAML, or both methods to authenticate users to use the Grafana console in the Amazon Managed Grafana workspace.
    */
  var providers: AuthenticationProviders
  
  /**
    * A structure containing information about how this workspace works with SAML, including what attributes within the assertion are to be mapped to user information in the workspace. 
    */
  var saml: js.UndefOr[SamlAuthentication] = js.undefined
}
object AuthenticationDescription {
  
  inline def apply(providers: AuthenticationProviders): AuthenticationDescription = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationDescription] (val x: Self) extends AnyVal {
    
    inline def setAwsSso(value: AwsSsoAuthentication): Self = StObject.set(x, "awsSso", value.asInstanceOf[js.Any])
    
    inline def setAwsSsoUndefined: Self = StObject.set(x, "awsSso", js.undefined)
    
    inline def setProviders(value: AuthenticationProviders): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: AuthenticationProviderTypes*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setSaml(value: SamlAuthentication): Self = StObject.set(x, "saml", value.asInstanceOf[js.Any])
    
    inline def setSamlUndefined: Self = StObject.set(x, "saml", js.undefined)
  }
}
