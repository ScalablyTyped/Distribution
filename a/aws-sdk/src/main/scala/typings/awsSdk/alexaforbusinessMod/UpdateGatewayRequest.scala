package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewayRequest extends StObject {
  
  /**
    * The updated description of the gateway.
    */
  var Description: js.UndefOr[GatewayDescription] = js.undefined
  
  /**
    * The ARN of the gateway to update.
    */
  var GatewayArn: Arn
  
  /**
    * The updated name of the gateway.
    */
  var Name: js.UndefOr[GatewayName] = js.undefined
  
  /**
    * The updated software version of the gateway. The gateway automatically updates its software version during normal operation.
    */
  var SoftwareVersion: js.UndefOr[GatewayVersion] = js.undefined
}
object UpdateGatewayRequest {
  
  @scala.inline
  def apply(GatewayArn: Arn): UpdateGatewayRequest = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayRequest]
  }
  
  @scala.inline
  implicit class UpdateGatewayRequestMutableBuilder[Self <: UpdateGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: GatewayDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGatewayArn(value: Arn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: GatewayName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSoftwareVersion(value: GatewayVersion): Self = StObject.set(x, "SoftwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareVersionUndefined: Self = StObject.set(x, "SoftwareVersion", js.undefined)
  }
}
