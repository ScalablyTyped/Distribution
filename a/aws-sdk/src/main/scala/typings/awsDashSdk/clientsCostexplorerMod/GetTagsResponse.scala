package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagsResponse extends js.Object {
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  /**
    * The number of query results that AWS returns at a time.
    */
  var ReturnSize: PageSize
  /**
    * The tags that match your request.
    */
  var Tags: TagList
  /**
    * The total number of query results.
    */
  var TotalSize: PageSize
}

object GetTagsResponse {
  @scala.inline
  def apply(ReturnSize: PageSize, Tags: TagList, TotalSize: PageSize, NextPageToken: NextPageToken = null): GetTagsResponse = {
    val __obj = js.Dynamic.literal(ReturnSize = ReturnSize, Tags = Tags, TotalSize = TotalSize)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    __obj.asInstanceOf[GetTagsResponse]
  }
}

