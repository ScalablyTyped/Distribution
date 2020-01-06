package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRoleAliasResponse extends js.Object {
  /**
    * The role alias description.
    */
  var roleAliasDescription: js.UndefOr[RoleAliasDescription] = js.native
}

object DescribeRoleAliasResponse {
  @scala.inline
  def apply(roleAliasDescription: RoleAliasDescription = null): DescribeRoleAliasResponse = {
    val __obj = js.Dynamic.literal()
    if (roleAliasDescription != null) __obj.updateDynamic("roleAliasDescription")(roleAliasDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRoleAliasResponse]
  }
}

