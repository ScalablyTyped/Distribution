package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGatewayGroupRequest extends StObject {
  
  /**
    *  A unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: typings.awsSdk.alexaforbusinessMod.ClientRequestToken
  
  /**
    * The description of the gateway group.
    */
  var Description: js.UndefOr[GatewayGroupDescription] = js.undefined
  
  /**
    * The name of the gateway group.
    */
  var Name: GatewayGroupName
}
object CreateGatewayGroupRequest {
  
  @scala.inline
  def apply(ClientRequestToken: ClientRequestToken, Name: GatewayGroupName): CreateGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayGroupRequest]
  }
  
  @scala.inline
  implicit class CreateGatewayGroupRequestMutableBuilder[Self <: CreateGatewayGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: GatewayGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: GatewayGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
