package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobRunsResponse extends js.Object {
  /**
    * A list of job-run metatdata objects.
    */
  var JobRuns: js.UndefOr[JobRunList] = js.undefined
  /**
    * A continuation token, if not all reequested job runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object GetJobRunsResponse {
  @scala.inline
  def apply(JobRuns: JobRunList = null, NextToken: GenericString = null): GetJobRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (JobRuns != null) __obj.updateDynamic("JobRuns")(JobRuns)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetJobRunsResponse]
  }
}

