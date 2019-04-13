package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAutomationStepExecutionsRequest extends js.Object {
  /**
    * The Automation execution ID for which you want step execution descriptions.
    */
  var AutomationExecutionId: awsDashSdkLib.clientsSsmMod.AutomationExecutionId
  /**
    * One or more filters to limit the number of step executions returned by the request.
    */
  var Filters: js.UndefOr[StepExecutionFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A boolean that indicates whether to list step executions in reverse order by start time. The default value is false.
    */
  var ReverseOrder: js.UndefOr[Boolean] = js.undefined
}

object DescribeAutomationStepExecutionsRequest {
  @scala.inline
  def apply(
    AutomationExecutionId: AutomationExecutionId,
    Filters: StepExecutionFilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ReverseOrder: js.UndefOr[Boolean] = js.undefined
  ): DescribeAutomationStepExecutionsRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(ReverseOrder)) __obj.updateDynamic("ReverseOrder")(ReverseOrder)
    __obj.asInstanceOf[DescribeAutomationStepExecutionsRequest]
  }
}

