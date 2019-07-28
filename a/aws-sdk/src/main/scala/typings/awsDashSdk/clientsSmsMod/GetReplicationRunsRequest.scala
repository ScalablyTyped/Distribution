package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReplicationRunsRequest extends js.Object {
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
  var replicationJobId: ReplicationJobId
}

object GetReplicationRunsRequest {
  @scala.inline
  def apply(
    replicationJobId: ReplicationJobId,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): GetReplicationRunsRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetReplicationRunsRequest]
  }
}

