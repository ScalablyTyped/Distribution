package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewaysResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the transit gateways.
    */
  var TransitGateways: js.UndefOr[TransitGatewayList] = js.undefined
}
object DescribeTransitGatewaysResult {
  
  inline def apply(): DescribeTransitGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewaysResult]
  }
  
  extension [Self <: DescribeTransitGatewaysResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGateways(value: TransitGatewayList): Self = StObject.set(x, "TransitGateways", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewaysUndefined: Self = StObject.set(x, "TransitGateways", js.undefined)
    
    inline def setTransitGatewaysVarargs(value: TransitGateway*): Self = StObject.set(x, "TransitGateways", js.Array(value*))
  }
}
