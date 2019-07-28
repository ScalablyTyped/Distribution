package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachVolumeRequest extends js.Object {
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var Device: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: String
  /**
    * The ID of the EBS volume. The volume and instance must be within the same Availability Zone.
    */
  var VolumeId: String
}

object AttachVolumeRequest {
  @scala.inline
  def apply(Device: String, InstanceId: String, VolumeId: String, DryRun: js.UndefOr[Boolean] = js.undefined): AttachVolumeRequest = {
    val __obj = js.Dynamic.literal(Device = Device, InstanceId = InstanceId, VolumeId = VolumeId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AttachVolumeRequest]
  }
}

