package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActionExecutionsInput extends js.Object {
  /**
    * Input information used to filter action execution history.
    */
  var filter: js.UndefOr[ActionExecutionFilter] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value. Action execution history is retained for up to 12 months, based on action execution start times. Default value is 100.   Detailed execution history is available for executions run on or after February 21, 2019. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token that was returned from the previous ListActionExecutions call, which can be used to return the next set of action executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    *  The name of the pipeline for which you want to list action execution history.
    */
  var pipelineName: PipelineName = js.native
}

object ListActionExecutionsInput {
  @scala.inline
  def apply(
    pipelineName: PipelineName,
    filter: ActionExecutionFilter = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): ListActionExecutionsInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActionExecutionsInput]
  }
}

