package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteClusterSnapshotsRequest extends js.Object {
  /**
    * A list of identifiers for the snapshots that you want to delete.
    */
  var Identifiers: DeleteClusterSnapshotMessageList
}

object BatchDeleteClusterSnapshotsRequest {
  @scala.inline
  def apply(Identifiers: DeleteClusterSnapshotMessageList): BatchDeleteClusterSnapshotsRequest = {
    val __obj = js.Dynamic.literal(Identifiers = Identifiers)
  
    __obj.asInstanceOf[BatchDeleteClusterSnapshotsRequest]
  }
}

