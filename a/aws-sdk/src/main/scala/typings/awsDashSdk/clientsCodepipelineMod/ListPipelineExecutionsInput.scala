package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelineExecutionsInput extends js.Object {
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline execution start times. Default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token that was returned from the previous ListPipelineExecutions call, which can be used to return the next set of pipeline executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the pipeline for which you want to get execution summary information.
    */
  var pipelineName: PipelineName = js.native
}

object ListPipelineExecutionsInput {
  @scala.inline
  def apply(pipelineName: PipelineName, maxResults: Int | Double = null, nextToken: NextToken = null): ListPipelineExecutionsInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelineExecutionsInput]
  }
}

