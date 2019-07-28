package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicationJobResponse extends js.Object {
  /**
    * The unique identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
}

object CreateReplicationJobResponse {
  @scala.inline
  def apply(replicationJobId: ReplicationJobId = null): CreateReplicationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (replicationJobId != null) __obj.updateDynamic("replicationJobId")(replicationJobId)
    __obj.asInstanceOf[CreateReplicationJobResponse]
  }
}

