package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPipelineExecutionsOutput extends js.Object {
  /**
    * A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of executions in the history of a pipeline.
    */
  var pipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList] = js.undefined
}

object ListPipelineExecutionsOutput {
  @scala.inline
  def apply(nextToken: NextToken = null, pipelineExecutionSummaries: PipelineExecutionSummaryList = null): ListPipelineExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (pipelineExecutionSummaries != null) __obj.updateDynamic("pipelineExecutionSummaries")(pipelineExecutionSummaries)
    __obj.asInstanceOf[ListPipelineExecutionsOutput]
  }
}

