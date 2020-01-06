package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventAggregatesRequest extends js.Object {
  /**
    * The only currently supported value is eventTypeCategory.
    */
  var aggregateField: eventAggregateField = js.native
  /**
    * Values to narrow the results returned.
    */
  var filter: js.UndefOr[EventFilter] = js.native
  /**
    * The maximum number of items to return in one batch, between 10 and 100, inclusive.
    */
  var maxResults: js.UndefOr[typings.awsDashSdk.clientsHealthMod.maxResults] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsDashSdk.clientsHealthMod.nextToken] = js.native
}

object DescribeEventAggregatesRequest {
  @scala.inline
  def apply(
    aggregateField: eventAggregateField,
    filter: EventFilter = null,
    maxResults: Int | Double = null,
    nextToken: nextToken = null
  ): DescribeEventAggregatesRequest = {
    val __obj = js.Dynamic.literal(aggregateField = aggregateField.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventAggregatesRequest]
  }
}

