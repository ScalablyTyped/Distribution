package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineExecutionSummary extends js.Object {
  /**
    * The date and time of the last change to the pipeline execution, in timestamp format.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ID of the pipeline execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  /**
    * A list of the source artifact revisions that initiated a pipeline execution.
    */
  var sourceRevisions: js.UndefOr[SourceRevisionList] = js.undefined
  /**
    * The date and time when the pipeline execution began, in timestamp format.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status of the pipeline execution.   InProgress: The pipeline execution is currently running.   Succeeded: The pipeline execution was completed successfully.    Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline execution advanced and continued through the pipeline instead.    Failed: The pipeline execution was not completed successfully.  
    */
  var status: js.UndefOr[PipelineExecutionStatus] = js.undefined
}

object PipelineExecutionSummary {
  @scala.inline
  def apply(
    lastUpdateTime: Timestamp = null,
    pipelineExecutionId: PipelineExecutionId = null,
    sourceRevisions: SourceRevisionList = null,
    startTime: Timestamp = null,
    status: PipelineExecutionStatus = null
  ): PipelineExecutionSummary = {
    val __obj = js.Dynamic.literal()
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId)
    if (sourceRevisions != null) __obj.updateDynamic("sourceRevisions")(sourceRevisions)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineExecutionSummary]
  }
}

