package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReplicationRunsResponse extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Information about the replication job.
    */
  var replicationJob: js.UndefOr[ReplicationJob] = js.undefined
  /**
    * Information about the replication runs.
    */
  var replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined
}

object GetReplicationRunsResponse {
  @scala.inline
  def apply(
    nextToken: NextToken = null,
    replicationJob: ReplicationJob = null,
    replicationRunList: ReplicationRunList = null
  ): GetReplicationRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (replicationJob != null) __obj.updateDynamic("replicationJob")(replicationJob)
    if (replicationRunList != null) __obj.updateDynamic("replicationRunList")(replicationRunList)
    __obj.asInstanceOf[GetReplicationRunsResponse]
  }
}

