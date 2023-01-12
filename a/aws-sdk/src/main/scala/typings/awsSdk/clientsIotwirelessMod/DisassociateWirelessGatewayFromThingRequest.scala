package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateWirelessGatewayFromThingRequest extends StObject {
  
  /**
    * The ID of the resource to update.
    */
  var Id: WirelessGatewayId
}
object DisassociateWirelessGatewayFromThingRequest {
  
  inline def apply(Id: WirelessGatewayId): DisassociateWirelessGatewayFromThingRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWirelessGatewayFromThingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateWirelessGatewayFromThingRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
