package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserProfilesRequest extends js.Object {
  /**
    * The maximum number of results to return in a response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The continuation token for the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListUserProfilesRequest {
  @scala.inline
  def apply(maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: PaginationToken = null): ListUserProfilesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListUserProfilesRequest]
  }
}

