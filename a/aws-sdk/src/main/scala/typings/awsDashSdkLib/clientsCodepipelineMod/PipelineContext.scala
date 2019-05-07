package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineContext extends js.Object {
  /**
    * The context of an action to a job worker within the stage of a pipeline.
    */
  var action: js.UndefOr[ActionContext] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.undefined
  /**
    * The execution ID of the pipeline.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  /**
    * The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all pipeline names under an Amazon Web Services account.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.undefined
  /**
    * The stage of the pipeline.
    */
  var stage: js.UndefOr[StageContext] = js.undefined
}

object PipelineContext {
  @scala.inline
  def apply(
    action: ActionContext = null,
    pipelineArn: PipelineArn = null,
    pipelineExecutionId: PipelineExecutionId = null,
    pipelineName: PipelineName = null,
    stage: StageContext = null
  ): PipelineContext = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (pipelineArn != null) __obj.updateDynamic("pipelineArn")(pipelineArn)
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId)
    if (pipelineName != null) __obj.updateDynamic("pipelineName")(pipelineName)
    if (stage != null) __obj.updateDynamic("stage")(stage)
    __obj.asInstanceOf[PipelineContext]
  }
}

