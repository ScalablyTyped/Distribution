package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointServicePermissionsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    principal - The ARN of the principal.    principal-type - The principal type (All | Service | OrganizationUnit | Account | User | Role).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results of the initial request can be seen by sending another request with the returned NextToken value. This value can be between 5 and 1,000; if MaxResults is given a value larger than 1,000, only 1,000 results are returned.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the service.
    */
  var ServiceId: VpcEndpointServiceId
}
object DescribeVpcEndpointServicePermissionsRequest {
  
  inline def apply(ServiceId: VpcEndpointServiceId): DescribeVpcEndpointServicePermissionsRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointServicePermissionsRequest]
  }
  
  extension [Self <: DescribeVpcEndpointServicePermissionsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceId(value: VpcEndpointServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
