package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIpamAddressHistoryRequest extends StObject {
  
  /**
    * The CIDR you want the history of. The CIDR can be an IPv4 or IPv6 IP address range. If you enter a /16 IPv4 CIDR, you will get records that match it exactly. You will not get records for any subnets within the /16 CIDR.
    */
  var Cidr: String
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The end of the time period for which you are looking for history. If you omit this option, it will default to the current time.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the IPAM scope that the CIDR is in.
    */
  var IpamScopeId: typings.awsSdk.clientsEc2Mod.IpamScopeId
  
  /**
    * The maximum number of historical results you would like returned per page. Defaults to 100.
    */
  var MaxResults: js.UndefOr[IpamAddressHistoryMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * The start of the time period for which you are looking for history. If you omit this option, it will default to the value of EndTime.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the VPC you want your history records filtered by.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object GetIpamAddressHistoryRequest {
  
  inline def apply(Cidr: String, IpamScopeId: IpamScopeId): GetIpamAddressHistoryRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any], IpamScopeId = IpamScopeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpamAddressHistoryRequest]
  }
  
  extension [Self <: GetIpamAddressHistoryRequest](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setIpamScopeId(value: IpamScopeId): Self = StObject.set(x, "IpamScopeId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: IpamAddressHistoryMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
