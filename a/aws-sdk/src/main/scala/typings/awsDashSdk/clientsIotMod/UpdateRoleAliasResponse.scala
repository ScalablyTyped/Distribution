package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRoleAliasResponse extends js.Object {
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.undefined
  /**
    * The role alias ARN.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
}

object UpdateRoleAliasResponse {
  @scala.inline
  def apply(roleAlias: RoleAlias = null, roleAliasArn: RoleAliasArn = null): UpdateRoleAliasResponse = {
    val __obj = js.Dynamic.literal()
    if (roleAlias != null) __obj.updateDynamic("roleAlias")(roleAlias)
    if (roleAliasArn != null) __obj.updateDynamic("roleAliasArn")(roleAliasArn)
    __obj.asInstanceOf[UpdateRoleAliasResponse]
  }
}

