package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayFirmwareInformationRequest extends StObject {
  
  /**
    * The ID of the resource to get.
    */
  var Id: WirelessGatewayId
}
object GetWirelessGatewayFirmwareInformationRequest {
  
  inline def apply(Id: WirelessGatewayId): GetWirelessGatewayFirmwareInformationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWirelessGatewayFirmwareInformationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessGatewayFirmwareInformationRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
