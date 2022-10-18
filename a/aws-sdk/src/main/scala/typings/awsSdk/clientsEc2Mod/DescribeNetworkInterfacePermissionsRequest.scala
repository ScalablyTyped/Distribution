package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInterfacePermissionsRequest extends StObject {
  
  /**
    * One or more filters.    network-interface-permission.network-interface-permission-id - The ID of the permission.    network-interface-permission.network-interface-id - The ID of the network interface.    network-interface-permission.aws-account-id - The Amazon Web Services account ID.    network-interface-permission.aws-service - The Amazon Web Service.    network-interface-permission.permission - The type of permission (INSTANCE-ATTACH | EIP-ASSOCIATE).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. If this parameter is not specified, up to 50 results are returned by default.
    */
  var MaxResults: js.UndefOr[DescribeNetworkInterfacePermissionsMaxResults] = js.undefined
  
  /**
    * The network interface permission IDs.
    */
  var NetworkInterfacePermissionIds: js.UndefOr[NetworkInterfacePermissionIdList] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNetworkInterfacePermissionsRequest {
  
  inline def apply(): DescribeNetworkInterfacePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInterfacePermissionsRequest]
  }
  
  extension [Self <: DescribeNetworkInterfacePermissionsRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeNetworkInterfacePermissionsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNetworkInterfacePermissionIds(value: NetworkInterfacePermissionIdList): Self = StObject.set(x, "NetworkInterfacePermissionIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacePermissionIdsUndefined: Self = StObject.set(x, "NetworkInterfacePermissionIds", js.undefined)
    
    inline def setNetworkInterfacePermissionIdsVarargs(value: NetworkInterfacePermissionId*): Self = StObject.set(x, "NetworkInterfacePermissionIds", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
