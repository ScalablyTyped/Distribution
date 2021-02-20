package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGatewayGroupResponse extends StObject {
  
  /**
    * The ARN of the created gateway group.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.native
}
object CreateGatewayGroupResponse {
  
  @scala.inline
  def apply(): CreateGatewayGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGatewayGroupResponse]
  }
  
  @scala.inline
  implicit class CreateGatewayGroupResponseMutableBuilder[Self <: CreateGatewayGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayGroupArn(value: Arn): Self = StObject.set(x, "GatewayGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayGroupArnUndefined: Self = StObject.set(x, "GatewayGroupArn", js.undefined)
  }
}
