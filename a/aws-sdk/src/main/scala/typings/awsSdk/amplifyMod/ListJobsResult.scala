package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsResult extends js.Object {
  /**
    *  The result structure for the list job result request. 
    */
  var jobSummaries: JobSummaries = js.native
  /**
    *  A pagination token. If non-null the pagination token is returned in a result. Pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListJobsResult {
  @scala.inline
  def apply(jobSummaries: JobSummaries): ListJobsResult = {
    val __obj = js.Dynamic.literal(jobSummaries = jobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResult]
  }
  @scala.inline
  implicit class ListJobsResultOps[Self <: ListJobsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobSummariesVarargs(value: JobSummary*): Self = this.set("jobSummaries", js.Array(value :_*))
    @scala.inline
    def setJobSummaries(value: JobSummaries): Self = this.set("jobSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

