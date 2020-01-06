package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoleAliasResponse extends js.Object {
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.native
  /**
    * The role alias ARN.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.native
}

object UpdateRoleAliasResponse {
  @scala.inline
  def apply(roleAlias: RoleAlias = null, roleAliasArn: RoleAliasArn = null): UpdateRoleAliasResponse = {
    val __obj = js.Dynamic.literal()
    if (roleAlias != null) __obj.updateDynamic("roleAlias")(roleAlias.asInstanceOf[js.Any])
    if (roleAliasArn != null) __obj.updateDynamic("roleAliasArn")(roleAliasArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleAliasResponse]
  }
}

