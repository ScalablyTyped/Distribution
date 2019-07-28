package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotsRequest extends js.Object {
  /**
    * Copies the tags from the specified volume to corresponding snapshot.
    */
  var CopyTagsFromSource: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.CopyTagsFromSource] = js.undefined
  /**
    *  A description propagated to every snapshot specified by the instance.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action without actually making the request. Provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The instance to specify which volumes should be included in the snapshots.
    */
  var InstanceSpecification: typings.awsDashSdk.clientsEc2Mod.InstanceSpecification
  /**
    * Tags to apply to every snapshot specified by the instance.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}

object CreateSnapshotsRequest {
  @scala.inline
  def apply(
    InstanceSpecification: InstanceSpecification,
    CopyTagsFromSource: CopyTagsFromSource = null,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    TagSpecifications: TagSpecificationList = null
  ): CreateSnapshotsRequest = {
    val __obj = js.Dynamic.literal(InstanceSpecification = InstanceSpecification)
    if (CopyTagsFromSource != null) __obj.updateDynamic("CopyTagsFromSource")(CopyTagsFromSource.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    __obj.asInstanceOf[CreateSnapshotsRequest]
  }
}

