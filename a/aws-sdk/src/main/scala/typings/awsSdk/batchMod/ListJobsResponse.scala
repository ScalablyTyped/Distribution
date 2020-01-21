package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsResponse extends js.Object {
  /**
    * A list of job summaries that match the request.
    */
  var jobSummaryList: JobSummaryList = js.native
  /**
    * The nextToken value to include in a future ListJobs request. When the results of a ListJobs request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListJobsResponse {
  @scala.inline
  def apply(jobSummaryList: JobSummaryList, nextToken: String = null): ListJobsResponse = {
    val __obj = js.Dynamic.literal(jobSummaryList = jobSummaryList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResponse]
  }
}

