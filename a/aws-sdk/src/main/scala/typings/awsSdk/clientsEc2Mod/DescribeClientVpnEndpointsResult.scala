package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientVpnEndpointsResult extends StObject {
  
  /**
    * Information about the Client VPN endpoints.
    */
  var ClientVpnEndpoints: js.UndefOr[EndpointSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeClientVpnEndpointsResult {
  
  inline def apply(): DescribeClientVpnEndpointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientVpnEndpointsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClientVpnEndpointsResult] (val x: Self) extends AnyVal {
    
    inline def setClientVpnEndpoints(value: EndpointSet): Self = StObject.set(x, "ClientVpnEndpoints", value.asInstanceOf[js.Any])
    
    inline def setClientVpnEndpointsUndefined: Self = StObject.set(x, "ClientVpnEndpoints", js.undefined)
    
    inline def setClientVpnEndpointsVarargs(value: ClientVpnEndpoint*): Self = StObject.set(x, "ClientVpnEndpoints", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
