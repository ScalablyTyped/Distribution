package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionDetails extends js.Object {
  /**
    * The system-generated unique ID of this action used to identify this job worker in any external systems, such as AWS CodeDeploy.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.undefined
  /**
    * The percentage of work completed on the action, represented on a scale of 0 to 100 percent.
    */
  var percentComplete: js.UndefOr[Percentage] = js.undefined
  /**
    * The summary of the current status of the actions.
    */
  var summary: js.UndefOr[ExecutionSummary] = js.undefined
}

object ExecutionDetails {
  @scala.inline
  def apply(
    externalExecutionId: ExecutionId = null,
    percentComplete: js.UndefOr[Percentage] = js.undefined,
    summary: ExecutionSummary = null
  ): ExecutionDetails = {
    val __obj = js.Dynamic.literal()
    if (externalExecutionId != null) __obj.updateDynamic("externalExecutionId")(externalExecutionId)
    if (!js.isUndefined(percentComplete)) __obj.updateDynamic("percentComplete")(percentComplete)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[ExecutionDetails]
  }
}

