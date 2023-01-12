package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayFirmwareInformationResponse extends StObject {
  
  /**
    * Information about the wireless gateway's firmware.
    */
  var LoRaWAN: js.UndefOr[LoRaWANGatewayCurrentVersion] = js.undefined
}
object GetWirelessGatewayFirmwareInformationResponse {
  
  inline def apply(): GetWirelessGatewayFirmwareInformationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWirelessGatewayFirmwareInformationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessGatewayFirmwareInformationResponse] (val x: Self) extends AnyVal {
    
    inline def setLoRaWAN(value: LoRaWANGatewayCurrentVersion): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
  }
}
