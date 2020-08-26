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
  def apply(jobSummaryList: JobSummaryList): ListJobsResponse = {
    val __obj = js.Dynamic.literal(jobSummaryList = jobSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResponse]
  }
  @scala.inline
  implicit class ListJobsResponseOps[Self <: ListJobsResponse] (val x: Self) extends AnyVal {
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
    def setJobSummaryListVarargs(value: JobSummary*): Self = this.set("jobSummaryList", js.Array(value :_*))
    @scala.inline
    def setJobSummaryList(value: JobSummaryList): Self = this.set("jobSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

