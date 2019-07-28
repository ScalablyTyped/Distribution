package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchRequest extends js.Object {
  /**
    * The maximum number of results to return in a SearchResponse.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxResults] = js.undefined
  /**
    * If more than MaxResults resource objects match the specified SearchExpression, the SearchResponse includes a NextToken. The NextToken can be passed to the next SearchRequest to continue retrieving results for the specified SearchExpression and Sort parameters.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
  /**
    * The name of the Amazon SageMaker resource to search for. Currently, the only valid Resource value is TrainingJob.
    */
  var Resource: ResourceType
  /**
    * A Boolean conditional statement. Resource objects must satisfy this condition to be included in search results. You must provide at least one subexpression, filter, or nested filter. The maximum number of recursive SubExpressions, NestedFilters, and Filters that can be included in a SearchExpression object is 50.
    */
  var SearchExpression: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SearchExpression] = js.undefined
  /**
    * The name of the resource property used to sort the SearchResults. The default is LastModifiedTime.
    */
  var SortBy: js.UndefOr[ResourcePropertyName] = js.undefined
  /**
    * How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
    */
  var SortOrder: js.UndefOr[SearchSortOrder] = js.undefined
}

object SearchRequest {
  @scala.inline
  def apply(
    Resource: ResourceType,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    SearchExpression: SearchExpression = null,
    SortBy: ResourcePropertyName = null,
    SortOrder: SearchSortOrder = null
  ): SearchRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SearchExpression != null) __obj.updateDynamic("SearchExpression")(SearchExpression)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy)
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRequest]
  }
}

