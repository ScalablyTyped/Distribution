package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseAddressRequest extends js.Object {
  /**
    * [EC2-VPC] The allocation ID. Required for EC2-VPC.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}

object ReleaseAddressRequest {
  @scala.inline
  def apply(
    AllocationId: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    PublicIp: String = null
  ): ReleaseAddressRequest = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp)
    __obj.asInstanceOf[ReleaseAddressRequest]
  }
}

