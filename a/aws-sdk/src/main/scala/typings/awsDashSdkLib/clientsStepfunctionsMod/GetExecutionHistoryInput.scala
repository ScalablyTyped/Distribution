package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExecutionHistoryInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the execution.
    */
  var executionArn: Arn
  /**
    * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
    */
  var maxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Lists events in descending order of their timeStamp.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
}

object GetExecutionHistoryInput {
  @scala.inline
  def apply(
    executionArn: Arn,
    maxResults: js.UndefOr[PageSize] = js.undefined,
    nextToken: PageToken = null,
    reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  ): GetExecutionHistoryInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (!js.isUndefined(reverseOrder)) __obj.updateDynamic("reverseOrder")(reverseOrder)
    __obj.asInstanceOf[GetExecutionHistoryInput]
  }
}

