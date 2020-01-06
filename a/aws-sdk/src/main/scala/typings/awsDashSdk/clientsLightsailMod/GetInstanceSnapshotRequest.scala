package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceSnapshotRequest extends js.Object {
  /**
    * The name of the snapshot for which you are requesting information.
    */
  var instanceSnapshotName: ResourceName = js.native
}

object GetInstanceSnapshotRequest {
  @scala.inline
  def apply(instanceSnapshotName: ResourceName): GetInstanceSnapshotRequest = {
    val __obj = js.Dynamic.literal(instanceSnapshotName = instanceSnapshotName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceSnapshotRequest]
  }
}

