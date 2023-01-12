package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCarrierGatewaysResult extends StObject {
  
  /**
    * Information about the carrier gateway.
    */
  var CarrierGateways: js.UndefOr[CarrierGatewaySet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeCarrierGatewaysResult {
  
  inline def apply(): DescribeCarrierGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCarrierGatewaysResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCarrierGatewaysResult] (val x: Self) extends AnyVal {
    
    inline def setCarrierGateways(value: CarrierGatewaySet): Self = StObject.set(x, "CarrierGateways", value.asInstanceOf[js.Any])
    
    inline def setCarrierGatewaysUndefined: Self = StObject.set(x, "CarrierGateways", js.undefined)
    
    inline def setCarrierGatewaysVarargs(value: CarrierGateway*): Self = StObject.set(x, "CarrierGateways", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
