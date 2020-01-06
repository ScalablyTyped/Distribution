package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionDetail extends js.Object {
  /**
    * The action execution ID.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.native
  /**
    * The name of the action.
    */
  var actionName: js.UndefOr[ActionName] = js.native
  /**
    * Input details for the action execution, such as role ARN, Region, and input artifacts.
    */
  var input: js.UndefOr[ActionExecutionInput] = js.native
  /**
    * The last update time of the action execution.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * Output details for the action execution, such as the action execution result.
    */
  var output: js.UndefOr[ActionExecutionOutput] = js.native
  /**
    * The pipeline execution ID for the action execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
  /**
    * The version of the pipeline where the action was run.
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.native
  /**
    * The name of the stage that contains the action.
    */
  var stageName: js.UndefOr[StageName] = js.native
  /**
    * The start time of the action execution.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
    */
  var status: js.UndefOr[ActionExecutionStatus] = js.native
}

object ActionExecutionDetail {
  @scala.inline
  def apply(
    actionExecutionId: ActionExecutionId = null,
    actionName: ActionName = null,
    input: ActionExecutionInput = null,
    lastUpdateTime: Timestamp = null,
    output: ActionExecutionOutput = null,
    pipelineExecutionId: PipelineExecutionId = null,
    pipelineVersion: Int | Double = null,
    stageName: StageName = null,
    startTime: Timestamp = null,
    status: ActionExecutionStatus = null
  ): ActionExecutionDetail = {
    val __obj = js.Dynamic.literal()
    if (actionExecutionId != null) __obj.updateDynamic("actionExecutionId")(actionExecutionId.asInstanceOf[js.Any])
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId.asInstanceOf[js.Any])
    if (pipelineVersion != null) __obj.updateDynamic("pipelineVersion")(pipelineVersion.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionExecutionDetail]
  }
}

