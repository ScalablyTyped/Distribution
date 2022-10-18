package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduledInstancesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    availability-zone - The Availability Zone (for example, us-west-2a).    instance-type - The instance type (for example, c4.large).    network-platform - The network platform (EC2-Classic or EC2-VPC).    platform - The platform (Linux/UNIX or Windows).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value is 100. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Scheduled Instance IDs.
    */
  var ScheduledInstanceIds: js.UndefOr[ScheduledInstanceIdRequestSet] = js.undefined
  
  /**
    * The time period for the first schedule to start.
    */
  var SlotStartTimeRange: js.UndefOr[SlotStartTimeRangeRequest] = js.undefined
}
object DescribeScheduledInstancesRequest {
  
  inline def apply(): DescribeScheduledInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledInstancesRequest]
  }
  
  extension [Self <: DescribeScheduledInstancesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScheduledInstanceIds(value: ScheduledInstanceIdRequestSet): Self = StObject.set(x, "ScheduledInstanceIds", value.asInstanceOf[js.Any])
    
    inline def setScheduledInstanceIdsUndefined: Self = StObject.set(x, "ScheduledInstanceIds", js.undefined)
    
    inline def setScheduledInstanceIdsVarargs(value: ScheduledInstanceId*): Self = StObject.set(x, "ScheduledInstanceIds", js.Array(value*))
    
    inline def setSlotStartTimeRange(value: SlotStartTimeRangeRequest): Self = StObject.set(x, "SlotStartTimeRange", value.asInstanceOf[js.Any])
    
    inline def setSlotStartTimeRangeUndefined: Self = StObject.set(x, "SlotStartTimeRange", js.undefined)
  }
}
