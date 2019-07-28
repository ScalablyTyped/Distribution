package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStackSetOperationResultsOutput extends js.Object {
  /**
    * If the request doesn't return all results, NextToken is set to a token. To retrieve the next set of results, call ListOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
  /**
    * A list of StackSetOperationResultSummary structures that contain information about the specified operation results, for accounts and regions that are included in the operation.
    */
  var Summaries: js.UndefOr[StackSetOperationResultSummaries] = js.undefined
}

object ListStackSetOperationResultsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Summaries: StackSetOperationResultSummaries = null): ListStackSetOperationResultsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Summaries != null) __obj.updateDynamic("Summaries")(Summaries)
    __obj.asInstanceOf[ListStackSetOperationResultsOutput]
  }
}

