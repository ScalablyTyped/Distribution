package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayMulticastDomainsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the transit gateway multicast domains.
    */
  var TransitGatewayMulticastDomains: js.UndefOr[TransitGatewayMulticastDomainList] = js.undefined
}
object DescribeTransitGatewayMulticastDomainsResult {
  
  inline def apply(): DescribeTransitGatewayMulticastDomainsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayMulticastDomainsResult]
  }
  
  extension [Self <: DescribeTransitGatewayMulticastDomainsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayMulticastDomains(value: TransitGatewayMulticastDomainList): Self = StObject.set(x, "TransitGatewayMulticastDomains", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayMulticastDomainsUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomains", js.undefined)
    
    inline def setTransitGatewayMulticastDomainsVarargs(value: TransitGatewayMulticastDomain*): Self = StObject.set(x, "TransitGatewayMulticastDomains", js.Array(value*))
  }
}
