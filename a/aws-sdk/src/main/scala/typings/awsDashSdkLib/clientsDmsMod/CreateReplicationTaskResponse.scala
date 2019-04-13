package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicationTaskResponse extends js.Object {
  /**
    * The replication task that was created.
    */
  var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
}

object CreateReplicationTaskResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): CreateReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask)
    __obj.asInstanceOf[CreateReplicationTaskResponse]
  }
}

