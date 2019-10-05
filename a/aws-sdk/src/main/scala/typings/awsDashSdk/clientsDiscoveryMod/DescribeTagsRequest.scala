package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsRequest extends js.Object {
  /**
    * You can filter the list using a key-value format. You can separate these items by using logical operators. Allowed filters include tagKey, tagValue, and configurationId. 
    */
  var filters: js.UndefOr[TagFilters] = js.undefined
  /**
    * The total number of items to return in a single page of output. The maximum value is 100.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * A token to start the list. Use this token to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeTagsRequest {
  @scala.inline
  def apply(filters: TagFilters = null, maxResults: Int | Double = null, nextToken: NextToken = null): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeTagsRequest]
  }
}

