package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachDiskRequest extends js.Object {
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName
  /**
    * The disk path to expose to the instance (e.g., /dev/xvdf).
    */
  var diskPath: NonEmptyString
  /**
    * The name of the Lightsail instance where you want to utilize the storage disk.
    */
  var instanceName: ResourceName
}

object AttachDiskRequest {
  @scala.inline
  def apply(diskName: ResourceName, diskPath: NonEmptyString, instanceName: ResourceName): AttachDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName, diskPath = diskPath, instanceName = instanceName)
  
    __obj.asInstanceOf[AttachDiskRequest]
  }
}

