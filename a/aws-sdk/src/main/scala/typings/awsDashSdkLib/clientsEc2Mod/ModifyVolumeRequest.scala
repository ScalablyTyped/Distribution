package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVolumeRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The target IOPS rate of the volume. This is only valid for Provisioned IOPS SSD (io1) volumes. For more information, see Provisioned IOPS SSD (io1) Volumes. Default: If no IOPS value is specified, the existing value is retained.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  /**
    * The target size of the volume, in GiB. The target volume size must be greater than or equal to than the existing size of the volume. For information about available EBS volume sizes, see Amazon EBS Volume Types. Default: If no size is specified, the existing size is retained.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  /**
    * The ID of the volume.
    */
  var VolumeId: String
  /**
    * The target EBS volume type of the volume. Default: If no type is specified, the existing type is retained.
    */
  var VolumeType: js.UndefOr[VolumeType] = js.undefined
}

object ModifyVolumeRequest {
  @scala.inline
  def apply(
    VolumeId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Iops: js.UndefOr[Integer] = js.undefined,
    Size: js.UndefOr[Integer] = js.undefined,
    VolumeType: VolumeType = null
  ): ModifyVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVolumeRequest]
  }
}

