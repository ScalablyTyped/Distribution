package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGatewayRequest extends StObject {
  
  /**
    * The ARN of the gateway to get.
    */
  var GatewayArn: Arn
}
object GetGatewayRequest {
  
  inline def apply(GatewayArn: Arn): GetGatewayRequest = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayRequest]
  }
  
  extension [Self <: GetGatewayRequest](x: Self) {
    
    inline def setGatewayArn(value: Arn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
