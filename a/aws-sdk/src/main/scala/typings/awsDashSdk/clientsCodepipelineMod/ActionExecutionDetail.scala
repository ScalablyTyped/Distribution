package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionExecutionDetail extends js.Object {
  /**
    * The action execution ID.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.undefined
  /**
    * The name of the action.
    */
  var actionName: js.UndefOr[ActionName] = js.undefined
  /**
    * Input details for the action execution, such as role ARN, Region, and input artifacts.
    */
  var input: js.UndefOr[ActionExecutionInput] = js.undefined
  /**
    * The last update time of the action execution.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Output details for the action execution, such as the action execution result.
    */
  var output: js.UndefOr[ActionExecutionOutput] = js.undefined
  /**
    * The pipeline execution ID for the action execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  /**
    * The version of the pipeline where the action was run.
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined
  /**
    * The name of the stage that contains the action.
    */
  var stageName: js.UndefOr[StageName] = js.undefined
  /**
    * The start time of the action execution.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  /**
    *  The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
    */
  var status: js.UndefOr[ActionExecutionStatus] = js.undefined
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
    if (actionExecutionId != null) __obj.updateDynamic("actionExecutionId")(actionExecutionId)
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (input != null) __obj.updateDynamic("input")(input)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (output != null) __obj.updateDynamic("output")(output)
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId)
    if (pipelineVersion != null) __obj.updateDynamic("pipelineVersion")(pipelineVersion.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionExecutionDetail]
  }
}

