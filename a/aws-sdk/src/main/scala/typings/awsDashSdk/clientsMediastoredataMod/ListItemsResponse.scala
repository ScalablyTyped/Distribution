package typings.awsDashSdk.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemsResponse extends js.Object {
  /**
    * The metadata entries for the folders and objects at the requested path.
    */
  var Items: js.UndefOr[ItemList] = js.native
  /**
    * The token that can be used in a request to view the next set of results. For example, you submit a ListItems request that matches 2,000 items with MaxResults set at 500. The service returns the first batch of results (up to 500) and a NextToken value that can be used to fetch the next batch of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListItemsResponse {
  @scala.inline
  def apply(Items: ItemList = null, NextToken: PaginationToken = null): ListItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemsResponse]
  }
}

