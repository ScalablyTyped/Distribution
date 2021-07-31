package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGatewayGroupRequest extends StObject {
  
  /**
    * The ARN of the gateway group to delete.
    */
  var GatewayGroupArn: Arn
}
object DeleteGatewayGroupRequest {
  
  @scala.inline
  def apply(GatewayGroupArn: Arn): DeleteGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteGatewayGroupRequestMutableBuilder[Self <: DeleteGatewayGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayGroupArn(value: Arn): Self = StObject.set(x, "GatewayGroupArn", value.asInstanceOf[js.Any])
  }
}
