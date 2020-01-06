package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDashboardPermissionsRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the dashboard whose permissions you're updating.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * The permissions that you want to grant on this resource.
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
  /**
    * The permissions that you want to revoke from this resource.
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
}

object UpdateDashboardPermissionsRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DashboardId: RestrictiveResourceId,
    GrantPermissions: UpdateResourcePermissionList = null,
    RevokePermissions: UpdateResourcePermissionList = null
  ): UpdateDashboardPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    if (GrantPermissions != null) __obj.updateDynamic("GrantPermissions")(GrantPermissions.asInstanceOf[js.Any])
    if (RevokePermissions != null) __obj.updateDynamic("RevokePermissions")(RevokePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardPermissionsRequest]
  }
}

