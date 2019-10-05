package typings.awsDashSdk.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemsRequest extends js.Object {
  /**
    * The maximum number of results to return per API request. For example, you submit a ListItems request with MaxResults set at 500. Although 2,000 items match your request, the service returns no more than the first 500 items. (The service also returns a NextToken value that you can use to fetch the next batch of results.) The service might return fewer results than the MaxResults value. If MaxResults is not included in the request, the service defaults to pagination with a maximum of 1,000 results per page.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListItems request with MaxResults set at 500. The service returns the first batch of results (up to 500) and a NextToken value. To see the next batch of results, you can submit the ListItems request a second time and specify the NextToken value. Tokens expire after 15 minutes.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
    */
  var Path: js.UndefOr[ListPathNaming] = js.undefined
}

object ListItemsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: PaginationToken = null, Path: ListPathNaming = null): ListItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[ListItemsRequest]
  }
}

