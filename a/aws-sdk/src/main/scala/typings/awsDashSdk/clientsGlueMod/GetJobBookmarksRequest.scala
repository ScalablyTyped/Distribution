package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobBookmarksRequest extends js.Object {
  /**
    * The name of the job in question.
    */
  var JobName: typings.awsDashSdk.clientsGlueMod.JobName
  /**
    * The maximum size of the response.
    */
  var MaxResults: js.UndefOr[IntegerValue] = js.undefined
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[IntegerValue] = js.undefined
}

object GetJobBookmarksRequest {
  @scala.inline
  def apply(
    JobName: JobName,
    MaxResults: js.UndefOr[IntegerValue] = js.undefined,
    NextToken: js.UndefOr[IntegerValue] = js.undefined
  ): GetJobBookmarksRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (!js.isUndefined(NextToken)) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetJobBookmarksRequest]
  }
}

