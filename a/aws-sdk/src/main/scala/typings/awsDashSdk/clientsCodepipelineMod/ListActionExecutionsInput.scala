package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListActionExecutionsInput extends js.Object {
  /**
    * Input information used to filter action execution history.
    */
  var filter: js.UndefOr[ActionExecutionFilter] = js.undefined
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value. Action execution history is retained for up to 12 months, based on action execution start times. Default value is 100.   Detailed execution history is available for executions run on or after February 21, 2019. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token that was returned from the previous ListActionExecutions call, which can be used to return the next set of action executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    *  The name of the pipeline for which you want to list action execution history.
    */
  var pipelineName: PipelineName
}

object ListActionExecutionsInput {
  @scala.inline
  def apply(
    pipelineName: PipelineName,
    filter: ActionExecutionFilter = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListActionExecutionsInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListActionExecutionsInput]
  }
}

