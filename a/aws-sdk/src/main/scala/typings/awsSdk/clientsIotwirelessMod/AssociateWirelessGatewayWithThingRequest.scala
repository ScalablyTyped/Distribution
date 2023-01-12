package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWirelessGatewayWithThingRequest extends StObject {
  
  /**
    * The ID of the resource to update.
    */
  var Id: WirelessGatewayId
  
  /**
    * The ARN of the thing to associate with the wireless gateway.
    */
  var ThingArn: typings.awsSdk.clientsIotwirelessMod.ThingArn
}
object AssociateWirelessGatewayWithThingRequest {
  
  inline def apply(Id: WirelessGatewayId, ThingArn: ThingArn): AssociateWirelessGatewayWithThingRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ThingArn = ThingArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWirelessGatewayWithThingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateWirelessGatewayWithThingRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "ThingArn", value.asInstanceOf[js.Any])
  }
}
