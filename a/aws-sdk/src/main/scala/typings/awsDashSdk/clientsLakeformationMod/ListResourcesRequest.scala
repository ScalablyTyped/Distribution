package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesRequest extends js.Object {
  /**
    * Any applicable row-level and/or column-level filtering conditions for the resources.
    */
  var FilterConditionList: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.FilterConditionList] = js.undefined
  /**
    * The maximum number of resource results.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is not the first call to retrieve these resources.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object ListResourcesRequest {
  @scala.inline
  def apply(
    FilterConditionList: FilterConditionList = null,
    MaxResults: Int | Double = null,
    NextToken: Token = null
  ): ListResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (FilterConditionList != null) __obj.updateDynamic("FilterConditionList")(FilterConditionList)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResourcesRequest]
  }
}

