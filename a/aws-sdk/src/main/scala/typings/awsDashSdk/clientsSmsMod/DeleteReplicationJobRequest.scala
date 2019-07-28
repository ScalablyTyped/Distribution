package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReplicationJobRequest extends js.Object {
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: ReplicationJobId
}

object DeleteReplicationJobRequest {
  @scala.inline
  def apply(replicationJobId: ReplicationJobId): DeleteReplicationJobRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId)
  
    __obj.asInstanceOf[DeleteReplicationJobRequest]
  }
}

