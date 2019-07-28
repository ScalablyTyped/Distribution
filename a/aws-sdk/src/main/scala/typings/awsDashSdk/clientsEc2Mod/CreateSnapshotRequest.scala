package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotRequest extends js.Object {
  /**
    * A description for the snapshot.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The tags to apply to the snapshot during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  /**
    * The ID of the EBS volume.
    */
  var VolumeId: String
}

object CreateSnapshotRequest {
  @scala.inline
  def apply(
    VolumeId: String,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    TagSpecifications: TagSpecificationList = null
  ): CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    __obj.asInstanceOf[CreateSnapshotRequest]
  }
}

