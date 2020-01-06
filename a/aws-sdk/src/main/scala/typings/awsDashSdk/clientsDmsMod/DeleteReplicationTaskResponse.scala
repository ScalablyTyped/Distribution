package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationTaskResponse extends js.Object {
  /**
    * The deleted replication task.
    */
  var ReplicationTask: js.UndefOr[typings.awsDashSdk.clientsDmsMod.ReplicationTask] = js.native
}

object DeleteReplicationTaskResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): DeleteReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationTaskResponse]
  }
}

