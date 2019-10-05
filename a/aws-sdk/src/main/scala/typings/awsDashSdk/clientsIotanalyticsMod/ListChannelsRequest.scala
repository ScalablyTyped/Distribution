package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsRequest extends js.Object {
  /**
    * The maximum number of results to return in this request. The default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListChannelsRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: NextToken = null): ListChannelsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListChannelsRequest]
  }
}

