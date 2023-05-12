package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNatGatewaysResult extends StObject {
  
  /**
    * Information about the NAT gateways.
    */
  var NatGateways: js.UndefOr[NatGatewayList] = js.undefined
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNatGatewaysResult {
  
  inline def apply(): DescribeNatGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNatGatewaysResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNatGatewaysResult] (val x: Self) extends AnyVal {
    
    inline def setNatGateways(value: NatGatewayList): Self = StObject.set(x, "NatGateways", value.asInstanceOf[js.Any])
    
    inline def setNatGatewaysUndefined: Self = StObject.set(x, "NatGateways", js.undefined)
    
    inline def setNatGatewaysVarargs(value: NatGateway*): Self = StObject.set(x, "NatGateways", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
