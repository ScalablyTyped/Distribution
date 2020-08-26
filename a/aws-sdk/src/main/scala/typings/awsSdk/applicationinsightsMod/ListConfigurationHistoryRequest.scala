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
  def apply(): ListConfigurationHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationHistoryRequest]
  }
  @scala.inline
  implicit class ListConfigurationHistoryRequestOps[Self <: ListConfigurationHistoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTime(value: EndTime): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setEventStatus(value: ConfigurationEventStatus): Self = this.set("EventStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventStatus: Self = this.set("EventStatus", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxEntities): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceGroupName: Self = this.set("ResourceGroupName", js.undefined)
    @scala.inline
    def setStartTime(value: StartTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
  
}

