package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHyperParameterTuningJobsResponse extends js.Object {
  /**
    * A list of HyperParameterTuningJobSummary objects that describe the tuning jobs that the ListHyperParameterTuningJobs request returned.
    */
  var HyperParameterTuningJobSummaries: awsDashSdkLib.clientsSagemakerMod.HyperParameterTuningJobSummaries
  /**
    * If the result of this ListHyperParameterTuningJobs request was truncated, the response includes a NextToken. To retrieve the next set of tuning jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListHyperParameterTuningJobsResponse {
  @scala.inline
  def apply(HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries, NextToken: NextToken = null): ListHyperParameterTuningJobsResponse = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobSummaries = HyperParameterTuningJobSummaries)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListHyperParameterTuningJobsResponse]
  }
}

