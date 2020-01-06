package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRunsResponse extends js.Object {
  /**
    * A list of job-run metadata objects.
    */
  var JobRuns: js.UndefOr[JobRunList] = js.native
  /**
    * A continuation token, if not all requested job runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetJobRunsResponse {
  @scala.inline
  def apply(JobRuns: JobRunList = null, NextToken: GenericString = null): GetJobRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (JobRuns != null) __obj.updateDynamic("JobRuns")(JobRuns.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRunsResponse]
  }
}

