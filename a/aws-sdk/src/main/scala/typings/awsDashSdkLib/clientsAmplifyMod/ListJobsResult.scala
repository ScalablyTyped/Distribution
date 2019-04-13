package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResult extends js.Object {
  /**
    *  Result structure for list job result request. 
    */
  var jobSummaries: JobSummaries
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListJobsResult {
  @scala.inline
  def apply(jobSummaries: JobSummaries, nextToken: NextToken = null): ListJobsResult = {
    val __obj = js.Dynamic.literal(jobSummaries = jobSummaries)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListJobsResult]
  }
}

