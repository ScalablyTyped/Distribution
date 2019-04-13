package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRoleAliasRequest extends js.Object {
  /**
    * The role alias to delete.
    */
  var roleAlias: RoleAlias
}

object DeleteRoleAliasRequest {
  @scala.inline
  def apply(roleAlias: RoleAlias): DeleteRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias)
  
    __obj.asInstanceOf[DeleteRoleAliasRequest]
  }
}

