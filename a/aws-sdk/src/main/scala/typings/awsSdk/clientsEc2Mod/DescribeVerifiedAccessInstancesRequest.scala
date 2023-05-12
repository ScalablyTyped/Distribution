package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVerifiedAccessInstancesRequest extends StObject {
  
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
  var MaxResults: js.UndefOr[DescribeVerifiedAccessInstancesMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * The IDs of the Verified Access instances.
    */
  var VerifiedAccessInstanceIds: js.UndefOr[VerifiedAccessInstanceIdList] = js.undefined
}
object DescribeVerifiedAccessInstancesRequest {
  
  inline def apply(): DescribeVerifiedAccessInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVerifiedAccessInstancesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVerifiedAccessInstancesRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeVerifiedAccessInstancesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVerifiedAccessInstanceIds(value: VerifiedAccessInstanceIdList): Self = StObject.set(x, "VerifiedAccessInstanceIds", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessInstanceIdsUndefined: Self = StObject.set(x, "VerifiedAccessInstanceIds", js.undefined)
    
    inline def setVerifiedAccessInstanceIdsVarargs(value: VerifiedAccessInstanceId*): Self = StObject.set(x, "VerifiedAccessInstanceIds", js.Array(value*))
  }
}
