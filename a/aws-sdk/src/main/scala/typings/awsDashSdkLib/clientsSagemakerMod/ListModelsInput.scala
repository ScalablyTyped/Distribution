package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListModelsInput extends js.Object {
  /**
    * A filter that returns only models with a creation time greater than or equal to the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter that returns only models created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
  /**
    * The maximum number of models to return in the response.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A string in the training job name. This filter returns only models in the training job whose name contains the specified string.
    */
  var NameContains: js.UndefOr[ModelNameContains] = js.undefined
  /**
    * If the response to a previous ListModels request was truncated, the response includes a NextToken. To retrieve the next set of models, use the token in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Sorts the list of results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[ModelSortKey] = js.undefined
  /**
    * The sort order for results. The default is Descending.
    */
  var SortOrder: js.UndefOr[OrderKey] = js.undefined
}

object ListModelsInput {
  @scala.inline
  def apply(
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NameContains: ModelNameContains = null,
    NextToken: PaginationToken = null,
    SortBy: ModelSortKey = null,
    SortOrder: OrderKey = null
  ): ListModelsInput = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter)
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelsInput]
  }
}

