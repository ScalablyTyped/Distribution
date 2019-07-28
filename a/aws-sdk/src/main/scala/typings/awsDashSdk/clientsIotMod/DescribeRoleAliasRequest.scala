package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRoleAliasRequest extends js.Object {
  /**
    * The role alias to describe.
    */
  var roleAlias: RoleAlias
}

object DescribeRoleAliasRequest {
  @scala.inline
  def apply(roleAlias: RoleAlias): DescribeRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias)
  
    __obj.asInstanceOf[DescribeRoleAliasRequest]
  }
}

