package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFindingsRequest extends js.Object {
  /**
    * The findings attributes used to define a condition to filter the findings returned.
    */
  var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined
  /**
    * The maximum number of findings to return.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Paginates results. On your first call to the GetFindings operation, set the value of this parameter to NULL. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Findings attributes used to sort the list of findings returned.
    */
  var SortCriteria: js.UndefOr[SortCriteria] = js.undefined
}

object GetFindingsRequest {
  @scala.inline
  def apply(
    Filters: AwsSecurityFindingFilters = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    SortCriteria: SortCriteria = null
  ): GetFindingsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortCriteria != null) __obj.updateDynamic("SortCriteria")(SortCriteria)
    __obj.asInstanceOf[GetFindingsRequest]
  }
}

