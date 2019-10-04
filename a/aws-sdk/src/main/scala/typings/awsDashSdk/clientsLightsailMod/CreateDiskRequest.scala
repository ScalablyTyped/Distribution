package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDiskRequest extends js.Object {
  /**
    * An array of objects that represent the add-ons to enable for the new disk.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.undefined
  /**
    * The Availability Zone where you want to create the disk (e.g., us-east-2a). Use the same Availability Zone as the Lightsail instance to which you want to attach the disk. Use the get regions operation to list the Availability Zones where Lightsail is currently available.
    */
  var availabilityZone: NonEmptyString
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: integer
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateDiskRequest {
  @scala.inline
  def apply(
    availabilityZone: NonEmptyString,
    diskName: ResourceName,
    sizeInGb: integer,
    addOns: AddOnRequestList = null,
    tags: TagList = null
  ): CreateDiskRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone, diskName = diskName, sizeInGb = sizeInGb)
    if (addOns != null) __obj.updateDynamic("addOns")(addOns)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateDiskRequest]
  }
}

