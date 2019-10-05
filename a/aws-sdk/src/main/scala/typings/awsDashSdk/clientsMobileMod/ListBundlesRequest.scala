package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBundlesRequest extends js.Object {
  /**
    *  Maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    *  Pagination token. Set to null to start listing bundles from start. If non-null pagination token is returned in a result, then pass its value in here in another request to list more bundles. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListBundlesRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: NextToken = null): ListBundlesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListBundlesRequest]
  }
}

