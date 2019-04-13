package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOnDemandReplicationRunResponse extends js.Object {
  /**
    * The identifier of the replication run.
    */
  var replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
}

object StartOnDemandReplicationRunResponse {
  @scala.inline
  def apply(replicationRunId: ReplicationRunId = null): StartOnDemandReplicationRunResponse = {
    val __obj = js.Dynamic.literal()
    if (replicationRunId != null) __obj.updateDynamic("replicationRunId")(replicationRunId)
    __obj.asInstanceOf[StartOnDemandReplicationRunResponse]
  }
}

