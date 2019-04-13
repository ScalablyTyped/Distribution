package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyReplicationTaskResponse extends js.Object {
  /**
    * The replication task that was modified.
    */
  var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
}

object ModifyReplicationTaskResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): ModifyReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask)
    __obj.asInstanceOf[ModifyReplicationTaskResponse]
  }
}

