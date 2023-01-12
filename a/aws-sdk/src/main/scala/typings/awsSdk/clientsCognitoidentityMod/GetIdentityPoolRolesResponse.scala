package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityPoolRolesResponse extends StObject {
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityPoolId] = js.undefined
  
  /**
    * How users for a specific identity provider are to mapped to roles. This is a String-to-RoleMapping object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
    */
  var RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined
  
  /**
    * The map of roles associated with this pool. Currently only authenticated and unauthenticated roles are supported.
    */
  var Roles: js.UndefOr[RolesMap] = js.undefined
}
object GetIdentityPoolRolesResponse {
  
  inline def apply(): GetIdentityPoolRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityPoolRolesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIdentityPoolRolesResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setRoleMappings(value: RoleMappingMap): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
    
    inline def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
    
    inline def setRoles(value: RolesMap): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
  }
}
