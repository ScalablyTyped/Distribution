package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOnDemandReplicationRunRequest extends js.Object {
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: ReplicationJobId
}

object StartOnDemandReplicationRunRequest {
  @scala.inline
  def apply(replicationJobId: ReplicationJobId, description: Description = null): StartOnDemandReplicationRunRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[StartOnDemandReplicationRunRequest]
  }
}

