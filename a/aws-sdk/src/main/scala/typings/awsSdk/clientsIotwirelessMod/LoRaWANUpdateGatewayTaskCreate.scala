package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANUpdateGatewayTaskCreate extends StObject {
  
  /**
    * The version of the gateways that should receive the update.
    */
  var CurrentVersion: js.UndefOr[LoRaWANGatewayVersion] = js.undefined
  
  /**
    * The CRC of the signature private key to check.
    */
  var SigKeyCrc: js.UndefOr[Crc] = js.undefined
  
  /**
    * The signature used to verify the update firmware.
    */
  var UpdateSignature: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.UpdateSignature] = js.undefined
  
  /**
    * The firmware version to update the gateway to.
    */
  var UpdateVersion: js.UndefOr[LoRaWANGatewayVersion] = js.undefined
}
object LoRaWANUpdateGatewayTaskCreate {
  
  inline def apply(): LoRaWANUpdateGatewayTaskCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANUpdateGatewayTaskCreate]
  }
  
  extension [Self <: LoRaWANUpdateGatewayTaskCreate](x: Self) {
    
    inline def setCurrentVersion(value: LoRaWANGatewayVersion): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    inline def setSigKeyCrc(value: Crc): Self = StObject.set(x, "SigKeyCrc", value.asInstanceOf[js.Any])
    
    inline def setSigKeyCrcUndefined: Self = StObject.set(x, "SigKeyCrc", js.undefined)
    
    inline def setUpdateSignature(value: UpdateSignature): Self = StObject.set(x, "UpdateSignature", value.asInstanceOf[js.Any])
    
    inline def setUpdateSignatureUndefined: Self = StObject.set(x, "UpdateSignature", js.undefined)
    
    inline def setUpdateVersion(value: LoRaWANGatewayVersion): Self = StObject.set(x, "UpdateVersion", value.asInstanceOf[js.Any])
    
    inline def setUpdateVersionUndefined: Self = StObject.set(x, "UpdateVersion", js.undefined)
  }
}
