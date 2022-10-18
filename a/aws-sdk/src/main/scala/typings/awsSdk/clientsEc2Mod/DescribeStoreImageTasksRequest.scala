package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStoreImageTasksRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    task-state - Returns tasks in a certain state (InProgress | Completed | Failed)    bucket - Returns task information for tasks that targeted a specific bucket. For the filter value, specify the bucket name.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
    */
  var ImageIds: js.UndefOr[ImageIdList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 1 and 200. You cannot specify this parameter and the ImageIDs parameter in the same call.
    */
  var MaxResults: js.UndefOr[DescribeStoreImageTasksRequestMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeStoreImageTasksRequest {
  
  inline def apply(): DescribeStoreImageTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStoreImageTasksRequest]
  }
  
  extension [Self <: DescribeStoreImageTasksRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setImageIds(value: ImageIdList): Self = StObject.set(x, "ImageIds", value.asInstanceOf[js.Any])
    
    inline def setImageIdsUndefined: Self = StObject.set(x, "ImageIds", js.undefined)
    
    inline def setImageIdsVarargs(value: ImageId*): Self = StObject.set(x, "ImageIds", js.Array(value*))
    
    inline def setMaxResults(value: DescribeStoreImageTasksRequestMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
