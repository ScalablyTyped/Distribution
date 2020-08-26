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
  def apply(): DescribeJobQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobQueuesResponse]
  }
  @scala.inline
  implicit class DescribeJobQueuesResponseOps[Self <: DescribeJobQueuesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobQueuesVarargs(value: JobQueueDetail*): Self = this.set("jobQueues", js.Array(value :_*))
    @scala.inline
    def setJobQueues(value: JobQueueDetailList): Self = this.set("jobQueues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobQueues: Self = this.set("jobQueues", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

