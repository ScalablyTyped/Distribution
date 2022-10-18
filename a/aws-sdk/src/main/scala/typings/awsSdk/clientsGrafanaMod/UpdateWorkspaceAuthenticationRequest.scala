package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkspaceAuthenticationRequest extends StObject {
  
  /**
    * Specifies whether this workspace uses SAML 2.0, Amazon Web Services Single Sign On, or both to authenticate users for using the Grafana console within a workspace. For more information, see User authentication in Amazon Managed Grafana.
    */
  var authenticationProviders: AuthenticationProviders
  
  /**
    * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace user information and define which groups in the assertion attribute are to have the Admin and Editor roles in the workspace.
    */
  var samlConfiguration: js.UndefOr[SamlConfiguration] = js.undefined
  
  /**
    * The ID of the workspace to update the authentication for.
    */
  var workspaceId: WorkspaceId
}
object UpdateWorkspaceAuthenticationRequest {
  
  inline def apply(authenticationProviders: AuthenticationProviders, workspaceId: WorkspaceId): UpdateWorkspaceAuthenticationRequest = {
    val __obj = js.Dynamic.literal(authenticationProviders = authenticationProviders.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceAuthenticationRequest]
  }
  
  extension [Self <: UpdateWorkspaceAuthenticationRequest](x: Self) {
    
    inline def setAuthenticationProviders(value: AuthenticationProviders): Self = StObject.set(x, "authenticationProviders", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProvidersVarargs(value: AuthenticationProviderTypes*): Self = StObject.set(x, "authenticationProviders", js.Array(value*))
    
    inline def setSamlConfiguration(value: SamlConfiguration): Self = StObject.set(x, "samlConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSamlConfigurationUndefined: Self = StObject.set(x, "samlConfiguration", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
