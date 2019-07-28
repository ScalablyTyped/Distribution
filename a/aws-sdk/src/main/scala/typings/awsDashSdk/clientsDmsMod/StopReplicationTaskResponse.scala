package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopReplicationTaskResponse extends js.Object {
  /**
    * The replication task stopped.
    */
  var ReplicationTask: js.UndefOr[typings.awsDashSdk.clientsDmsMod.ReplicationTask] = js.undefined
}

object StopReplicationTaskResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): StopReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask)
    __obj.asInstanceOf[StopReplicationTaskResponse]
  }
}

