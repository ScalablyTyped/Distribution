package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDiskRequest extends js.Object {
  /**
    * The unique name of the disk you want to delete (e.g., my-disk).
    */
  var diskName: ResourceName
}

object DeleteDiskRequest {
  @scala.inline
  def apply(diskName: ResourceName): DeleteDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName)
  
    __obj.asInstanceOf[DeleteDiskRequest]
  }
}

