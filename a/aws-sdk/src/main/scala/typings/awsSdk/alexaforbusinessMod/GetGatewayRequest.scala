package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGatewayRequest extends StObject {
  
  /**
    * The ARN of the gateway to get.
    */
  var GatewayArn: Arn = js.native
}
object GetGatewayRequest {
  
  @scala.inline
  def apply(GatewayArn: Arn): GetGatewayRequest = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayRequest]
  }
  
  @scala.inline
  implicit class GetGatewayRequestMutableBuilder[Self <: GetGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayArn(value: Arn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
