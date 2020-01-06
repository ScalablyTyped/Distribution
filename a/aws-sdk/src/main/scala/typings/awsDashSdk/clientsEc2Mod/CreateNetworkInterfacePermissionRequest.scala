package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkInterfacePermissionRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.native
  /**
    * The AWS service. Currently not supported.
    */
  var AwsService: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsDashSdk.clientsEc2Mod.NetworkInterfaceId = js.native
  /**
    * The type of permission to grant.
    */
  var Permission: InterfacePermissionType = js.native
}

object CreateNetworkInterfacePermissionRequest {
  @scala.inline
  def apply(
    NetworkInterfaceId: NetworkInterfaceId,
    Permission: InterfacePermissionType,
    AwsAccountId: String = null,
    AwsService: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateNetworkInterfacePermissionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any])
    if (AwsAccountId != null) __obj.updateDynamic("AwsAccountId")(AwsAccountId.asInstanceOf[js.Any])
    if (AwsService != null) __obj.updateDynamic("AwsService")(AwsService.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInterfacePermissionRequest]
  }
}

