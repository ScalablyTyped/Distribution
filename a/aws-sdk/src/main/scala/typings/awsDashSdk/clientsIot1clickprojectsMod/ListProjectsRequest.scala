package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProjectsRequest extends js.Object {
  /**
    * The maximum number of results to return per request. If not set, a default value of 100 is used.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListProjectsRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: NextToken = null): ListProjectsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListProjectsRequest]
  }
}

