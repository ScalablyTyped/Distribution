package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDirectConnectGatewaysResult extends StObject {
  
  /**
    * The Direct Connect gateways.
    */
  var directConnectGateways: js.UndefOr[DirectConnectGatewayList] = js.undefined
  
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeDirectConnectGatewaysResult {
  
  inline def apply(): DescribeDirectConnectGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewaysResult]
  }
  
  extension [Self <: DescribeDirectConnectGatewaysResult](x: Self) {
    
    inline def setDirectConnectGateways(value: DirectConnectGatewayList): Self = StObject.set(x, "directConnectGateways", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewaysUndefined: Self = StObject.set(x, "directConnectGateways", js.undefined)
    
    inline def setDirectConnectGatewaysVarargs(value: DirectConnectGateway*): Self = StObject.set(x, "directConnectGateways", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
