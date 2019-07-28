package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReplicationJobsResponse extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Information about the replication jobs.
    */
  var replicationJobList: js.UndefOr[ReplicationJobList] = js.undefined
}

object GetReplicationJobsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, replicationJobList: ReplicationJobList = null): GetReplicationJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (replicationJobList != null) __obj.updateDynamic("replicationJobList")(replicationJobList)
    __obj.asInstanceOf[GetReplicationJobsResponse]
  }
}

