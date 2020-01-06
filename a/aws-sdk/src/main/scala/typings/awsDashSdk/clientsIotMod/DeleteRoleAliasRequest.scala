package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRoleAliasRequest extends js.Object {
  /**
    * The role alias to delete.
    */
  var roleAlias: RoleAlias = js.native
}

object DeleteRoleAliasRequest {
  @scala.inline
  def apply(roleAlias: RoleAlias): DeleteRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRoleAliasRequest]
  }
}

