package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityPoolRolesResponse extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
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
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId = null, RoleMappings: RoleMappingMap = null, Roles: RolesMap = null): GetIdentityPoolRolesResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId)
    if (RoleMappings != null) __obj.updateDynamic("RoleMappings")(RoleMappings)
    if (Roles != null) __obj.updateDynamic("Roles")(Roles)
    __obj.asInstanceOf[GetIdentityPoolRolesResponse]
  }
}

