package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobExecutionsForJobResponse extends js.Object {
  /**
    * A list of job execution summaries.
    */
  var executionSummaries: js.UndefOr[JobExecutionSummaryForJobList] = js.undefined
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListJobExecutionsForJobResponse {
  @scala.inline
  def apply(executionSummaries: JobExecutionSummaryForJobList = null, nextToken: NextToken = null): ListJobExecutionsForJobResponse = {
    val __obj = js.Dynamic.literal()
    if (executionSummaries != null) __obj.updateDynamic("executionSummaries")(executionSummaries)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListJobExecutionsForJobResponse]
  }
}

