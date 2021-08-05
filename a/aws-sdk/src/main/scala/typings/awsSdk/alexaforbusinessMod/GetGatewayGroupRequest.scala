package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGatewayGroupRequest extends StObject {
  
  /**
    * The ARN of the gateway group to get.
    */
  var GatewayGroupArn: Arn
}
object GetGatewayGroupRequest {
  
  inline def apply(GatewayGroupArn: Arn): GetGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayGroupRequest]
  }
  
  extension [Self <: GetGatewayGroupRequest](x: Self) {
    
    inline def setGatewayGroupArn(value: Arn): Self = StObject.set(x, "GatewayGroupArn", value.asInstanceOf[js.Any])
  }
}
