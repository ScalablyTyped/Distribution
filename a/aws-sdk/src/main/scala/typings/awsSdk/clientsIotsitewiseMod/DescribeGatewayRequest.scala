package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGatewayRequest extends StObject {
  
  /**
    * The ID of the gateway device.
    */
  var gatewayId: ID
}
object DescribeGatewayRequest {
  
  inline def apply(gatewayId: ID): DescribeGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGatewayRequest] (val x: Self) extends AnyVal {
    
    inline def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
  }
}
