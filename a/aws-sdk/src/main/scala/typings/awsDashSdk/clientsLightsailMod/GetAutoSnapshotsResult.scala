package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAutoSnapshotsResult extends js.Object {
  /**
    * An array of objects that describe the automatic snapshots that are available for the specified source resource.asdf
    */
  var autoSnapshots: js.UndefOr[AutoSnapshotDetailsList] = js.undefined
  /**
    * The name of the source resource for the automatic snapshots.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The resource type (e.g., Instance or Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}

object GetAutoSnapshotsResult {
  @scala.inline
  def apply(
    autoSnapshots: AutoSnapshotDetailsList = null,
    resourceName: ResourceName = null,
    resourceType: ResourceType = null
  ): GetAutoSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (autoSnapshots != null) __obj.updateDynamic("autoSnapshots")(autoSnapshots)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoSnapshotsResult]
  }
}

