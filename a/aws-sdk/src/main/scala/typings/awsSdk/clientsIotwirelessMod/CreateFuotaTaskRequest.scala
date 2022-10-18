package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFuotaTaskRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ClientRequestToken] = js.undefined
  
  var Description: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Description] = js.undefined
  
  var FirmwareUpdateImage: typings.awsSdk.clientsIotwirelessMod.FirmwareUpdateImage
  
  var FirmwareUpdateRole: typings.awsSdk.clientsIotwirelessMod.FirmwareUpdateRole
  
  var LoRaWAN: js.UndefOr[LoRaWANFuotaTask] = js.undefined
  
  var Name: js.UndefOr[FuotaTaskName] = js.undefined
  
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateFuotaTaskRequest {
  
  inline def apply(FirmwareUpdateImage: FirmwareUpdateImage, FirmwareUpdateRole: FirmwareUpdateRole): CreateFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(FirmwareUpdateImage = FirmwareUpdateImage.asInstanceOf[js.Any], FirmwareUpdateRole = FirmwareUpdateRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFuotaTaskRequest]
  }
  
  extension [Self <: CreateFuotaTaskRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFirmwareUpdateImage(value: FirmwareUpdateImage): Self = StObject.set(x, "FirmwareUpdateImage", value.asInstanceOf[js.Any])
    
    inline def setFirmwareUpdateRole(value: FirmwareUpdateRole): Self = StObject.set(x, "FirmwareUpdateRole", value.asInstanceOf[js.Any])
    
    inline def setLoRaWAN(value: LoRaWANFuotaTask): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: FuotaTaskName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
