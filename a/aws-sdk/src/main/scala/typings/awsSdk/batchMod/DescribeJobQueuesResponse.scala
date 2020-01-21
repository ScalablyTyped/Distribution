package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobQueuesResponse extends js.Object {
  /**
    * The list of job queues.
    */
  var jobQueues: js.UndefOr[JobQueueDetailList] = js.native
  /**
    * The nextToken value to include in a future DescribeJobQueues request. When the results of a DescribeJobQueues request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeJobQueuesResponse {
  @scala.inline
  def apply(jobQueues: JobQueueDetailList = null, nextToken: String = null): DescribeJobQueuesResponse = {
    val __obj = js.Dynamic.literal()
    if (jobQueues != null) __obj.updateDynamic("jobQueues")(jobQueues.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobQueuesResponse]
  }
}

