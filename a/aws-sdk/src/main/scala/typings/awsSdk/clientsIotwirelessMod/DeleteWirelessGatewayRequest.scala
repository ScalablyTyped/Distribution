package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWirelessGatewayRequest extends StObject {
  
  /**
    * The ID of the resource to delete.
    */
  var Id: WirelessGatewayId
}
object DeleteWirelessGatewayRequest {
  
  inline def apply(Id: WirelessGatewayId): DeleteWirelessGatewayRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWirelessGatewayRequest]
  }
  
  extension [Self <: DeleteWirelessGatewayRequest](x: Self) {
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
