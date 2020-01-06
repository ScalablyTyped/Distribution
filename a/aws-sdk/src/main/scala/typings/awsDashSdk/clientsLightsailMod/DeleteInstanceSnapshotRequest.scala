package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInstanceSnapshotRequest extends js.Object {
  /**
    * The name of the snapshot to delete.
    */
  var instanceSnapshotName: ResourceName = js.native
}

object DeleteInstanceSnapshotRequest {
  @scala.inline
  def apply(instanceSnapshotName: ResourceName): DeleteInstanceSnapshotRequest = {
    val __obj = js.Dynamic.literal(instanceSnapshotName = instanceSnapshotName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteInstanceSnapshotRequest]
  }
}

