package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTopicsDetectionJobsRequest extends js.Object {
  /**
    * Filters the jobs that are returned. Jobs can be filtered on their name, status, or the date and time that they were submitted. You can set only one filter at a time.
    */
  var Filter: js.UndefOr[TopicsDetectionJobFilter] = js.undefined
  /**
    * The maximum number of results to return in each page. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListTopicsDetectionJobsRequest {
  @scala.inline
  def apply(
    Filter: TopicsDetectionJobFilter = null,
    MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
    NextToken: String = null
  ): ListTopicsDetectionJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTopicsDetectionJobsRequest]
  }
}

