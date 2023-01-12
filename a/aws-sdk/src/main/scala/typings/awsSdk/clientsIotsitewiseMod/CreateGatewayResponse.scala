package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGatewayResponse extends StObject {
  
  /**
    * The ARN of the gateway, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId} 
    */
  var gatewayArn: ARN
  
  /**
    * The ID of the gateway device. You can use this ID when you call other IoT SiteWise APIs.
    */
  var gatewayId: ID
}
object CreateGatewayResponse {
  
  inline def apply(gatewayArn: ARN, gatewayId: ID): CreateGatewayResponse = {
    val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGatewayResponse] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: ARN): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
  }
}
