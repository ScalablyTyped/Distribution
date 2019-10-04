package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDiskFromSnapshotRequest extends js.Object {
  /**
    * An array of objects that represent the add-ons to enable for the new disk.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.undefined
  /**
    * The Availability Zone where you want to create the disk (e.g., us-east-2a). Choose the same Availability Zone as the Lightsail instance where you want to create the disk. Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
    */
  var availabilityZone: NonEmptyString
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName
  /**
    * The name of the disk snapshot (e.g., my-snapshot) from which to create the new storage disk. This parameter cannot be defined together with the source disk name parameter. The disk snapshot name and source disk name parameters are mutually exclusive.
    */
  var diskSnapshotName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The date of the automatic snapshot to use for the new disk. Use the get auto snapshots operation to identify the dates of the available automatic snapshots. Constraints:   Must be specified in YYYY-MM-DD format.   This parameter cannot be defined together with the use latest restorable auto snapshot parameter. The restore date and use latest restorable auto snapshot parameters are mutually exclusive.    Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Lightsail Dev Guide. 
    */
  var restoreDate: js.UndefOr[String] = js.undefined
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: integer
  /**
    * The name of the source disk from which the source automatic snapshot was created. This parameter cannot be defined together with the disk snapshot name parameter. The source disk name and disk snapshot name parameters are mutually exclusive.  Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Lightsail Dev Guide. 
    */
  var sourceDiskName: js.UndefOr[String] = js.undefined
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * A Boolean value to indicate whether to use the latest available automatic snapshot. This parameter cannot be defined together with the restore date parameter. The use latest restorable auto snapshot and restore date parameters are mutually exclusive.  Define this parameter only when creating a new disk from an automatic snapshot. For more information, see the Lightsail Dev Guide. 
    */
  var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.undefined
}

object CreateDiskFromSnapshotRequest {
  @scala.inline
  def apply(
    availabilityZone: NonEmptyString,
    diskName: ResourceName,
    sizeInGb: integer,
    addOns: AddOnRequestList = null,
    diskSnapshotName: ResourceName = null,
    restoreDate: String = null,
    sourceDiskName: String = null,
    tags: TagList = null,
    useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.undefined
  ): CreateDiskFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone, diskName = diskName, sizeInGb = sizeInGb)
    if (addOns != null) __obj.updateDynamic("addOns")(addOns)
    if (diskSnapshotName != null) __obj.updateDynamic("diskSnapshotName")(diskSnapshotName)
    if (restoreDate != null) __obj.updateDynamic("restoreDate")(restoreDate)
    if (sourceDiskName != null) __obj.updateDynamic("sourceDiskName")(sourceDiskName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(useLatestRestorableAutoSnapshot)) __obj.updateDynamic("useLatestRestorableAutoSnapshot")(useLatestRestorableAutoSnapshot)
    __obj.asInstanceOf[CreateDiskFromSnapshotRequest]
  }
}

