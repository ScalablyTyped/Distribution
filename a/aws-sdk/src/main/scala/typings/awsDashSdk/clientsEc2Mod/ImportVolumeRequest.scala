package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportVolumeRequest extends js.Object {
  /**
    * The Availability Zone for the resulting EBS volume.
    */
  var AvailabilityZone: String
  /**
    * A description of the volume.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The disk image.
    */
  var Image: DiskImageDetail
  /**
    * The volume size.
    */
  var Volume: VolumeDetail
}

object ImportVolumeRequest {
  @scala.inline
  def apply(
    AvailabilityZone: String,
    Image: DiskImageDetail,
    Volume: VolumeDetail,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ImportVolumeRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone, Image = Image, Volume = Volume)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ImportVolumeRequest]
  }
}

