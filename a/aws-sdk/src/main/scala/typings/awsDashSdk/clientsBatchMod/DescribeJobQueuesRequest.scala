package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobQueuesRequest extends js.Object {
  /**
    * A list of up to 100 queue names or full queue Amazon Resource Name (ARN) entries.
    */
  var jobQueues: js.UndefOr[StringList] = js.undefined
  /**
    * The maximum number of results returned by DescribeJobQueues in paginated output. When this parameter is used, DescribeJobQueues only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeJobQueues request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then DescribeJobQueues returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The nextToken value returned from a previous paginated DescribeJobQueues request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object DescribeJobQueuesRequest {
  @scala.inline
  def apply(
    jobQueues: StringList = null,
    maxResults: js.UndefOr[Integer] = js.undefined,
    nextToken: String = null
  ): DescribeJobQueuesRequest = {
    val __obj = js.Dynamic.literal()
    if (jobQueues != null) __obj.updateDynamic("jobQueues")(jobQueues)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeJobQueuesRequest]
  }
}

