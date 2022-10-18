package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEgressOnlyInternetGatewaysResult extends StObject {
  
  /**
    * Information about the egress-only internet gateways.
    */
  var EgressOnlyInternetGateways: js.UndefOr[EgressOnlyInternetGatewayList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeEgressOnlyInternetGatewaysResult {
  
  inline def apply(): DescribeEgressOnlyInternetGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEgressOnlyInternetGatewaysResult]
  }
  
  extension [Self <: DescribeEgressOnlyInternetGatewaysResult](x: Self) {
    
    inline def setEgressOnlyInternetGateways(value: EgressOnlyInternetGatewayList): Self = StObject.set(x, "EgressOnlyInternetGateways", value.asInstanceOf[js.Any])
    
    inline def setEgressOnlyInternetGatewaysUndefined: Self = StObject.set(x, "EgressOnlyInternetGateways", js.undefined)
    
    inline def setEgressOnlyInternetGatewaysVarargs(value: EgressOnlyInternetGateway*): Self = StObject.set(x, "EgressOnlyInternetGateways", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
