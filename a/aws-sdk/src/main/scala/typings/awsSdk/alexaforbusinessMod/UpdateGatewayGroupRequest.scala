package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGatewayGroupRequest extends StObject {
  
  /**
    * The updated description of the gateway group.
    */
  var Description: js.UndefOr[GatewayGroupDescription] = js.native
  
  /**
    * The ARN of the gateway group to update.
    */
  var GatewayGroupArn: Arn = js.native
  
  /**
    * The updated name of the gateway group.
    */
  var Name: js.UndefOr[GatewayGroupName] = js.native
}
object UpdateGatewayGroupRequest {
  
  @scala.inline
  def apply(GatewayGroupArn: Arn): UpdateGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateGatewayGroupRequestMutableBuilder[Self <: UpdateGatewayGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: GatewayGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGatewayGroupArn(value: Arn): Self = StObject.set(x, "GatewayGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: GatewayGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
