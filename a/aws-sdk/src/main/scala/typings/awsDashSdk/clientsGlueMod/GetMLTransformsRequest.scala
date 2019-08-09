package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMLTransformsRequest extends js.Object {
  /**
    * The filter transformation criteria.
    */
  var Filter: js.UndefOr[TransformFilterCriteria] = js.undefined
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A paginated token to offset the results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[TransformSortCriteria] = js.undefined
}

object GetMLTransformsRequest {
  @scala.inline
  def apply(
    Filter: TransformFilterCriteria = null,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: PaginationToken = null,
    Sort: TransformSortCriteria = null
  ): GetMLTransformsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Sort != null) __obj.updateDynamic("Sort")(Sort)
    __obj.asInstanceOf[GetMLTransformsRequest]
  }
}

