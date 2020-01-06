package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventAggregatesResponse extends js.Object {
  /**
    * The number of events in each category that meet the optional filter criteria.
    */
  var eventAggregates: js.UndefOr[EventAggregateList] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsDashSdk.clientsHealthMod.nextToken] = js.native
}

object DescribeEventAggregatesResponse {
  @scala.inline
  def apply(eventAggregates: EventAggregateList = null, nextToken: nextToken = null): DescribeEventAggregatesResponse = {
    val __obj = js.Dynamic.literal()
    if (eventAggregates != null) __obj.updateDynamic("eventAggregates")(eventAggregates.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventAggregatesResponse]
  }
}

