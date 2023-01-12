package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceEventWindowsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    dedicated-host-id - The event windows associated with the specified Dedicated Host ID.    event-window-name - The event windows associated with the specified names.     instance-id - The event windows associated with the specified instance ID.    instance-tag - The event windows associated with the specified tag and value.    instance-tag-key - The event windows associated with the specified tag key, regardless of the value.    instance-tag-value - The event windows associated with the specified tag value, regardless of the key.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the event window. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value CMX, specify tag:Owner for the filter name and CMX for the filter value.     tag-key - The key of a tag assigned to the event window. Use this filter to find all event windows that have a tag with a specific key, regardless of the tag value.     tag-value - The value of a tag assigned to the event window. Use this filter to find all event windows that have a tag with a specific value, regardless of the tag key.   
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The IDs of the event windows.
    */
  var InstanceEventWindowIds: js.UndefOr[InstanceEventWindowIdSet] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 20 and 500. You cannot specify this parameter and the event window IDs parameter in the same call.
    */
  var MaxResults: js.UndefOr[ResultRange] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeInstanceEventWindowsRequest {
  
  inline def apply(): DescribeInstanceEventWindowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceEventWindowsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInstanceEventWindowsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setInstanceEventWindowIds(value: InstanceEventWindowIdSet): Self = StObject.set(x, "InstanceEventWindowIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventWindowIdsUndefined: Self = StObject.set(x, "InstanceEventWindowIds", js.undefined)
    
    inline def setInstanceEventWindowIdsVarargs(value: InstanceEventWindowId*): Self = StObject.set(x, "InstanceEventWindowIds", js.Array(value*))
    
    inline def setMaxResults(value: ResultRange): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
