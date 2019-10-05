package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobRunsRequest extends js.Object {
  /**
    * The name of the job definition for which to retrieve all job runs.
    */
  var JobName: NameString
  /**
    * The maximum size of the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object GetJobRunsRequest {
  @scala.inline
  def apply(JobName: NameString, MaxResults: Int | Double = null, NextToken: GenericString = null): GetJobRunsRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetJobRunsRequest]
  }
}

