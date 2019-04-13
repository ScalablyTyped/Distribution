package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStackSetOperationsOutput extends js.Object {
  /**
    * If the request doesn't return all results, NextToken is set to a token. To retrieve the next set of results, call ListOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of StackSetOperationSummary structures that contain summary information about operations for the specified stack set.
    */
  var Summaries: js.UndefOr[StackSetOperationSummaries] = js.undefined
}

object ListStackSetOperationsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Summaries: StackSetOperationSummaries = null): ListStackSetOperationsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Summaries != null) __obj.updateDynamic("Summaries")(Summaries)
    __obj.asInstanceOf[ListStackSetOperationsOutput]
  }
}

