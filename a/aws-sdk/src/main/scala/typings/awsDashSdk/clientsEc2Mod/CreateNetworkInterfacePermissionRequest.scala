package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNetworkInterfacePermissionRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.undefined
  /**
    * The AWS service. Currently not supported.
    */
  var AwsService: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: String
  /**
    * The type of permission to grant.
    */
  var Permission: InterfacePermissionType
}

object CreateNetworkInterfacePermissionRequest {
  @scala.inline
  def apply(
    NetworkInterfaceId: String,
    Permission: InterfacePermissionType,
    AwsAccountId: String = null,
    AwsService: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateNetworkInterfacePermissionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId, Permission = Permission.asInstanceOf[js.Any])
    if (AwsAccountId != null) __obj.updateDynamic("AwsAccountId")(AwsAccountId)
    if (AwsService != null) __obj.updateDynamic("AwsService")(AwsService)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CreateNetworkInterfacePermissionRequest]
  }
}

