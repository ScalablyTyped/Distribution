package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVerifiedAccessGroupsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters. Filter names and values are case-sensitive.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeVerifiedAccessGroupMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * The ID of the Verified Access groups.
    */
  var VerifiedAccessGroupIds: js.UndefOr[VerifiedAccessGroupIdList] = js.undefined
  
  /**
    * The ID of the Verified Access instance.
    */
  var VerifiedAccessInstanceId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessInstanceId] = js.undefined
}
object DescribeVerifiedAccessGroupsRequest {
  
  inline def apply(): DescribeVerifiedAccessGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVerifiedAccessGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVerifiedAccessGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeVerifiedAccessGroupMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVerifiedAccessGroupIds(value: VerifiedAccessGroupIdList): Self = StObject.set(x, "VerifiedAccessGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessGroupIdsUndefined: Self = StObject.set(x, "VerifiedAccessGroupIds", js.undefined)
    
    inline def setVerifiedAccessGroupIdsVarargs(value: VerifiedAccessGroupId*): Self = StObject.set(x, "VerifiedAccessGroupIds", js.Array(value*))
    
    inline def setVerifiedAccessInstanceId(value: VerifiedAccessInstanceId): Self = StObject.set(x, "VerifiedAccessInstanceId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessInstanceIdUndefined: Self = StObject.set(x, "VerifiedAccessInstanceId", js.undefined)
  }
}
