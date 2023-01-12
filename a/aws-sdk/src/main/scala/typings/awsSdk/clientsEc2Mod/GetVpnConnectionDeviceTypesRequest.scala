package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpnConnectionDeviceTypesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results returned by GetVpnConnectionDeviceTypes in paginated output. When this parameter is used, GetVpnConnectionDeviceTypes only returns MaxResults results in a single page along with a NextToken response element. The remaining results of the initial request can be seen by sending another GetVpnConnectionDeviceTypes request with the returned NextToken value. This value can be between 200 and 1000. If this parameter is not used, then GetVpnConnectionDeviceTypes returns all results.
    */
  var MaxResults: js.UndefOr[GVCDMaxResults] = js.undefined
  
  /**
    * The NextToken value returned from a previous paginated GetVpnConnectionDeviceTypes request where MaxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the NextToken value. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object GetVpnConnectionDeviceTypesRequest {
  
  inline def apply(): GetVpnConnectionDeviceTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpnConnectionDeviceTypesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVpnConnectionDeviceTypesRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMaxResults(value: GVCDMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
