package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResponse extends js.Object {
  /**
    * A list of jobs.
    */
  var jobs: js.UndefOr[JobSummaryList] = js.undefined
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListJobsResponse {
  @scala.inline
  def apply(jobs: JobSummaryList = null, nextToken: NextToken = null): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListJobsResponse]
  }
}

