package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDiskSnapshotRequest extends js.Object {
  /**
    * The name of the disk snapshot you want to delete (e.g., my-disk-snapshot).
    */
  var diskSnapshotName: ResourceName
}

object DeleteDiskSnapshotRequest {
  @scala.inline
  def apply(diskSnapshotName: ResourceName): DeleteDiskSnapshotRequest = {
    val __obj = js.Dynamic.literal(diskSnapshotName = diskSnapshotName)
  
    __obj.asInstanceOf[DeleteDiskSnapshotRequest]
  }
}

