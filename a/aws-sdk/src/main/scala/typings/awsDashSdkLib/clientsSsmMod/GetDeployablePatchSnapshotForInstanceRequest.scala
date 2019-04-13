package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeployablePatchSnapshotForInstanceRequest extends js.Object {
  /**
    * The ID of the instance for which the appropriate patch snapshot should be retrieved.
    */
  var InstanceId: awsDashSdkLib.clientsSsmMod.InstanceId
  /**
    * The user-defined snapshot ID.
    */
  var SnapshotId: awsDashSdkLib.clientsSsmMod.SnapshotId
}

object GetDeployablePatchSnapshotForInstanceRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, SnapshotId: SnapshotId): GetDeployablePatchSnapshotForInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, SnapshotId = SnapshotId)
  
    __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceRequest]
  }
}

