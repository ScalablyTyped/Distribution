package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAppsRequest extends js.Object {
  /**
    * 
    */
  var appIds: js.UndefOr[AppIds] = js.undefined
  /**
    * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListAppsRequest {
  @scala.inline
  def apply(appIds: AppIds = null, maxResults: Int | Double = null, nextToken: NextToken = null): ListAppsRequest = {
    val __obj = js.Dynamic.literal()
    if (appIds != null) __obj.updateDynamic("appIds")(appIds)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListAppsRequest]
  }
}

