package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverEndpointIpAddressesResponse extends StObject {
  
  /**
    * Information about the IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints).
    */
  var IpAddresses: js.UndefOr[IpAddressesResponse] = js.undefined
  
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  
  /**
    * If the specified endpoint has more than MaxResults IP addresses, you can submit another ListResolverEndpointIpAddresses request to get the next group of IP addresses. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
}
object ListResolverEndpointIpAddressesResponse {
  
  inline def apply(): ListResolverEndpointIpAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverEndpointIpAddressesResponse]
  }
  
  extension [Self <: ListResolverEndpointIpAddressesResponse](x: Self) {
    
    inline def setIpAddresses(value: IpAddressesResponse): Self = StObject.set(x, "IpAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "IpAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: IpAddressResponse*): Self = StObject.set(x, "IpAddresses", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
