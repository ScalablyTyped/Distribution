package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationHistoryResponse extends js.Object {
  /**
    *  The list of configuration events and their corresponding details. 
    */
  var EventList: js.UndefOr[ConfigurationEventList] = js.native
  /**
    * The NextToken value to include in a future ListConfigurationHistory request. When the results of a ListConfigurationHistory request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListConfigurationHistoryResponse {
  @scala.inline
  def apply(EventList: ConfigurationEventList = null, NextToken: PaginationToken = null): ListConfigurationHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (EventList != null) __obj.updateDynamic("EventList")(EventList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationHistoryResponse]
  }
}

