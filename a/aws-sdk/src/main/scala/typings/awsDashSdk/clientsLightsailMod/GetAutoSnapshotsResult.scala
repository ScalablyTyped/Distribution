package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoSnapshotsResult extends js.Object {
  /**
    * An array of objects that describe the automatic snapshots that are available for the specified source instance or disk.
    */
  var autoSnapshots: js.UndefOr[AutoSnapshotDetailsList] = js.native
  /**
    * The name of the source instance or disk for the automatic snapshots.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The resource type (e.g., Instance or Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object GetAutoSnapshotsResult {
  @scala.inline
  def apply(
    autoSnapshots: AutoSnapshotDetailsList = null,
    resourceName: ResourceName = null,
    resourceType: ResourceType = null
  ): GetAutoSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (autoSnapshots != null) __obj.updateDynamic("autoSnapshots")(autoSnapshots.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoSnapshotsResult]
  }
}

