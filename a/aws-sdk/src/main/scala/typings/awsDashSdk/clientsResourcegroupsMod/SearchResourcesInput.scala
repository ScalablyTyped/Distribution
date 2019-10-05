package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResourcesInput extends js.Object {
  /**
    * The maximum number of group member ARNs returned by SearchResources in paginated output. By default, this number is 50.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.MaxResults] = js.undefined
  /**
    * The NextToken value that is returned in a paginated SearchResources request. To get the next page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.NextToken] = js.undefined
  /**
    * The search query, using the same formats that are supported for resource group definition.
    */
  var ResourceQuery: typings.awsDashSdk.clientsResourcegroupsMod.ResourceQuery
}

object SearchResourcesInput {
  @scala.inline
  def apply(ResourceQuery: ResourceQuery, MaxResults: Int | Double = null, NextToken: NextToken = null): SearchResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceQuery = ResourceQuery)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[SearchResourcesInput]
  }
}

