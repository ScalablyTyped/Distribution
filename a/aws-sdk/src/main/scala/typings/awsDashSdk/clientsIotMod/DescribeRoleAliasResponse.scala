package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRoleAliasResponse extends js.Object {
  /**
    * The role alias description.
    */
  var roleAliasDescription: js.UndefOr[RoleAliasDescription] = js.undefined
}

object DescribeRoleAliasResponse {
  @scala.inline
  def apply(roleAliasDescription: RoleAliasDescription = null): DescribeRoleAliasResponse = {
    val __obj = js.Dynamic.literal()
    if (roleAliasDescription != null) __obj.updateDynamic("roleAliasDescription")(roleAliasDescription)
    __obj.asInstanceOf[DescribeRoleAliasResponse]
  }
}

