package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReplicationJobsRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
}

object GetReplicationJobsRequest {
  @scala.inline
  def apply(
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    replicationJobId: ReplicationJobId = null
  ): GetReplicationJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (replicationJobId != null) __obj.updateDynamic("replicationJobId")(replicationJobId)
    __obj.asInstanceOf[GetReplicationJobsRequest]
  }
}

