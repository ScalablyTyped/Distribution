package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationHistoryRequest extends js.Object {
  /**
    * The end time of the event.
    */
  var EndTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.EndTime] = js.native
  /**
    * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
    */
  var EventStatus: js.UndefOr[ConfigurationEventStatus] = js.native
  /**
    *  The maximum number of results returned by ListConfigurationHistory in paginated output. When this parameter is used, ListConfigurationHistory returns only MaxResults in a single page along with a NextToken response element. The remaining results of the initial request can be seen by sending another ListConfigurationHistory request with the returned NextToken value. If this parameter is not used, then ListConfigurationHistory returns all results. 
    */
  var MaxResults: js.UndefOr[MaxEntities] = js.native
  /**
    * The NextToken value returned from a previous paginated ListConfigurationHistory request where MaxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the NextToken value. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Resource group to which the application belongs. 
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
  /**
    * The start time of the event. 
    */
  var StartTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.StartTime] = js.native
}

object ListConfigurationHistoryRequest {
  @scala.inline
  def apply(
    EndTime: EndTime = null,
    EventStatus: ConfigurationEventStatus = null,
    MaxResults: js.UndefOr[MaxEntities] = js.undefined,
    NextToken: PaginationToken = null,
    ResourceGroupName: ResourceGroupName = null,
    StartTime: StartTime = null
  ): ListConfigurationHistoryRequest = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (EventStatus != null) __obj.updateDynamic("EventStatus")(EventStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationHistoryRequest]
  }
}

