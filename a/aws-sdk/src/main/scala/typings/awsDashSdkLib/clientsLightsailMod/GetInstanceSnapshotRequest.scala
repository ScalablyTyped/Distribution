package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceSnapshotRequest extends js.Object {
  /**
    * The name of the snapshot for which you are requesting information.
    */
  var instanceSnapshotName: ResourceName
}

object GetInstanceSnapshotRequest {
  @scala.inline
  def apply(instanceSnapshotName: ResourceName): GetInstanceSnapshotRequest = {
    val __obj = js.Dynamic.literal(instanceSnapshotName = instanceSnapshotName)
  
    __obj.asInstanceOf[GetInstanceSnapshotRequest]
  }
}

