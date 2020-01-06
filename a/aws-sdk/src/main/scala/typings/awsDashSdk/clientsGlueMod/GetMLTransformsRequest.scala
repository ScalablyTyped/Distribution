package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTransformsRequest extends js.Object {
  /**
    * The filter transformation criteria.
    */
  var Filter: js.UndefOr[TransformFilterCriteria] = js.native
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A paginated token to offset the results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[TransformSortCriteria] = js.native
}

object GetMLTransformsRequest {
  @scala.inline
  def apply(
    Filter: TransformFilterCriteria = null,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null,
    Sort: TransformSortCriteria = null
  ): GetMLTransformsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTransformsRequest]
  }
}

