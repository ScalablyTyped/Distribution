package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDiskFromSnapshotRequest extends js.Object {
  /**
    * The Availability Zone where you want to create the disk (e.g., us-east-2a). Choose the same Availability Zone as the Lightsail instance where you want to create the disk. Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
    */
  var availabilityZone: NonEmptyString
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName
  /**
    * The name of the disk snapshot (e.g., my-snapshot) from which to create the new storage disk.
    */
  var diskSnapshotName: ResourceName
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: integer
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateDiskFromSnapshotRequest {
  @scala.inline
  def apply(
    availabilityZone: NonEmptyString,
    diskName: ResourceName,
    diskSnapshotName: ResourceName,
    sizeInGb: integer,
    tags: TagList = null
  ): CreateDiskFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone, diskName = diskName, diskSnapshotName = diskSnapshotName, sizeInGb = sizeInGb)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateDiskFromSnapshotRequest]
  }
}

