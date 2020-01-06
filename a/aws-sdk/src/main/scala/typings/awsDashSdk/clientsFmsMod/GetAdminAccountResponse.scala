package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAdminAccountResponse extends js.Object {
  /**
    * The AWS account that is set as the AWS Firewall Manager administrator.
    */
  var AdminAccount: js.UndefOr[AWSAccountId] = js.native
  /**
    * The status of the AWS account that you set as the AWS Firewall Manager administrator.
    */
  var RoleStatus: js.UndefOr[AccountRoleStatus] = js.native
}

object GetAdminAccountResponse {
  @scala.inline
  def apply(AdminAccount: AWSAccountId = null, RoleStatus: AccountRoleStatus = null): GetAdminAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (AdminAccount != null) __obj.updateDynamic("AdminAccount")(AdminAccount.asInstanceOf[js.Any])
    if (RoleStatus != null) __obj.updateDynamic("RoleStatus")(RoleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAdminAccountResponse]
  }
}

