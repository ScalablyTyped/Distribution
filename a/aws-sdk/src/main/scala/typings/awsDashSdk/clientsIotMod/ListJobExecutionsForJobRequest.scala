package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobExecutionsForJobRequest extends js.Object {
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
  /**
    * The maximum number of results to be returned per request.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The status of the job.
    */
  var status: js.UndefOr[JobExecutionStatus] = js.undefined
}

object ListJobExecutionsForJobRequest {
  @scala.inline
  def apply(
    jobId: JobId,
    maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
    nextToken: NextToken = null,
    status: JobExecutionStatus = null
  ): ListJobExecutionsForJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobExecutionsForJobRequest]
  }
}

