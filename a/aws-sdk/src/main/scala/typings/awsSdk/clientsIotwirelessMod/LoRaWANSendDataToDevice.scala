package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANSendDataToDevice extends StObject {
  
  var FPort: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FPort] = js.undefined
  
  /**
    * Choose the gateways that you want to use for the downlink data traffic when the wireless device is running in class B or class C mode.
    */
  var ParticipatingGateways: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ParticipatingGateways] = js.undefined
}
object LoRaWANSendDataToDevice {
  
  inline def apply(): LoRaWANSendDataToDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANSendDataToDevice]
  }
  
  extension [Self <: LoRaWANSendDataToDevice](x: Self) {
    
    inline def setFPort(value: FPort): Self = StObject.set(x, "FPort", value.asInstanceOf[js.Any])
    
    inline def setFPortUndefined: Self = StObject.set(x, "FPort", js.undefined)
    
    inline def setParticipatingGateways(value: ParticipatingGateways): Self = StObject.set(x, "ParticipatingGateways", value.asInstanceOf[js.Any])
    
    inline def setParticipatingGatewaysUndefined: Self = StObject.set(x, "ParticipatingGateways", js.undefined)
  }
}
