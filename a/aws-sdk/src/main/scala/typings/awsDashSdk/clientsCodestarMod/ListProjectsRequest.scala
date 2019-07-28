package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProjectsRequest extends js.Object {
  /**
    * The maximum amount of data that can be contained in a single set of results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The continuation token to be used to return the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListProjectsRequest {
  @scala.inline
  def apply(maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: PaginationToken = null): ListProjectsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListProjectsRequest]
  }
}

