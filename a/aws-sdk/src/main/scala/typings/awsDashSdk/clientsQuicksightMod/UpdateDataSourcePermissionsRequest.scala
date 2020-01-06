package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourcePermissionsRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId = js.native
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account. 
    */
  var DataSourceId: ResourceId = js.native
  /**
    * A list of resource permissions that you want to grant on the data source.
    */
  var GrantPermissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * A list of resource permissions that you want to revoke on the data source.
    */
  var RevokePermissions: js.UndefOr[ResourcePermissionList] = js.native
}

object UpdateDataSourcePermissionsRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DataSourceId: ResourceId,
    GrantPermissions: ResourcePermissionList = null,
    RevokePermissions: ResourcePermissionList = null
  ): UpdateDataSourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any])
    if (GrantPermissions != null) __obj.updateDynamic("GrantPermissions")(GrantPermissions.asInstanceOf[js.Any])
    if (RevokePermissions != null) __obj.updateDynamic("RevokePermissions")(RevokePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourcePermissionsRequest]
  }
}

