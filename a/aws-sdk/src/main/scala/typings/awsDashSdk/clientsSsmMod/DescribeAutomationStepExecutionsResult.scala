package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAutomationStepExecutionsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * A list of details about the current state of all steps that make up an execution.
    */
  var StepExecutions: js.UndefOr[StepExecutionList] = js.undefined
}

object DescribeAutomationStepExecutionsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, StepExecutions: StepExecutionList = null): DescribeAutomationStepExecutionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StepExecutions != null) __obj.updateDynamic("StepExecutions")(StepExecutions)
    __obj.asInstanceOf[DescribeAutomationStepExecutionsResult]
  }
}

