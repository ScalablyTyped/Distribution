package typings.awsDashSdk.clientsSsoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleInfo extends js.Object {
  /**
    * The identifier of the AWS account assigned to the user.
    */
  var accountId: js.UndefOr[AccountIdType] = js.native
  /**
    * The friendly name of the role that is assigned to the user.
    */
  var roleName: js.UndefOr[RoleNameType] = js.native
}

object RoleInfo {
  @scala.inline
  def apply(accountId: AccountIdType = null, roleName: RoleNameType = null): RoleInfo = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleInfo]
  }
}

