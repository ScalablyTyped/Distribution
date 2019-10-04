package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPipelineStateOutput extends js.Object {
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the pipeline for which you want to get the state.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.undefined
  /**
    * The version number of the pipeline.  A newly created pipeline is always assigned a version number of 1. 
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined
  /**
    * A list of the pipeline stage output information, including stage name, state, most recent run details, whether the stage is disabled, and other data.
    */
  var stageStates: js.UndefOr[StageStateList] = js.undefined
  /**
    * The date and time the pipeline was last updated, in timestamp format.
    */
  var updated: js.UndefOr[Timestamp] = js.undefined
}

object GetPipelineStateOutput {
  @scala.inline
  def apply(
    created: Timestamp = null,
    pipelineName: PipelineName = null,
    pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined,
    stageStates: StageStateList = null,
    updated: Timestamp = null
  ): GetPipelineStateOutput = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created)
    if (pipelineName != null) __obj.updateDynamic("pipelineName")(pipelineName)
    if (!js.isUndefined(pipelineVersion)) __obj.updateDynamic("pipelineVersion")(pipelineVersion)
    if (stageStates != null) __obj.updateDynamic("stageStates")(stageStates)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[GetPipelineStateOutput]
  }
}

