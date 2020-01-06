package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExperimentsResponse extends js.Object {
  /**
    * A list of the summaries of your experiments.
    */
  var ExperimentSummaries: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ExperimentSummaries] = js.native
  /**
    * A token for getting the next set of experiments, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.native
}

object ListExperimentsResponse {
  @scala.inline
  def apply(ExperimentSummaries: ExperimentSummaries = null, NextToken: NextToken = null): ListExperimentsResponse = {
    val __obj = js.Dynamic.literal()
    if (ExperimentSummaries != null) __obj.updateDynamic("ExperimentSummaries")(ExperimentSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExperimentsResponse]
  }
}

