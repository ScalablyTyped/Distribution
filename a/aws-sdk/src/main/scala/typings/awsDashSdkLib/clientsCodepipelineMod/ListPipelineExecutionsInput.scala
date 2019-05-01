package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPipelineExecutionsInput extends js.Object {
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline execution start times. Default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token that was returned from the previous ListPipelineExecutions call, which can be used to return the next set of pipeline executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The name of the pipeline for which you want to get execution summary information.
    */
  var pipelineName: PipelineName
}

object ListPipelineExecutionsInput {
  @scala.inline
  def apply(
    pipelineName: PipelineName,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListPipelineExecutionsInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListPipelineExecutionsInput]
  }
}

