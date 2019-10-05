package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAlgorithmsInput extends js.Object {
  /**
    * A filter that returns only algorithms created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
  /**
    * A filter that returns only algorithms created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
  /**
    * The maximum number of algorithms to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxResults] = js.undefined
  /**
    * A string in the algorithm name. This filter returns only algorithms whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NameContains] = js.undefined
  /**
    * If the response to a previous ListAlgorithms request was truncated, the response includes a NextToken. To retrieve the next set of algorithms, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
  /**
    * The parameter by which to sort the results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[AlgorithmSortBy] = js.undefined
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SortOrder] = js.undefined
}

object ListAlgorithmsInput {
  @scala.inline
  def apply(
    CreationTimeAfter: CreationTime = null,
    CreationTimeBefore: CreationTime = null,
    MaxResults: Int | Double = null,
    NameContains: NameContains = null,
    NextToken: NextToken = null,
    SortBy: AlgorithmSortBy = null,
    SortOrder: SortOrder = null
  ): ListAlgorithmsInput = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter)
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlgorithmsInput]
  }
}

