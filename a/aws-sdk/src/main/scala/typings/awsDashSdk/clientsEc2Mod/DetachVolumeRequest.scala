package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachVolumeRequest extends js.Object {
  /**
    * The device name.
    */
  var Device: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an instance, unmounting the volume, and detaching normally). This option can lead to data loss or a corrupted file system. Use this option only as a last resort to detach a volume from a failed instance. The instance won't have an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file system check and repair procedures.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the volume.
    */
  var VolumeId: String
}

object DetachVolumeRequest {
  @scala.inline
  def apply(
    VolumeId: String,
    Device: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Force: js.UndefOr[scala.Boolean] = js.undefined,
    InstanceId: String = null
  ): DetachVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId)
    if (Device != null) __obj.updateDynamic("Device")(Device)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[DetachVolumeRequest]
  }
}

