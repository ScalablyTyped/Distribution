package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInstanceSnapshotRequest extends js.Object {
  /**
    * The name of the snapshot to delete.
    */
  var instanceSnapshotName: ResourceName
}

object DeleteInstanceSnapshotRequest {
  @scala.inline
  def apply(instanceSnapshotName: ResourceName): DeleteInstanceSnapshotRequest = {
    val __obj = js.Dynamic.literal(instanceSnapshotName = instanceSnapshotName)
  
    __obj.asInstanceOf[DeleteInstanceSnapshotRequest]
  }
}

