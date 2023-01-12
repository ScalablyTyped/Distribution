package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFuotaTaskRequest extends StObject {
  
  var Description: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Description] = js.undefined
  
  var FirmwareUpdateImage: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FirmwareUpdateImage] = js.undefined
  
  var FirmwareUpdateRole: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FirmwareUpdateRole] = js.undefined
  
  var Id: FuotaTaskId
  
  var LoRaWAN: js.UndefOr[LoRaWANFuotaTask] = js.undefined
  
  var Name: js.UndefOr[FuotaTaskName] = js.undefined
}
object UpdateFuotaTaskRequest {
  
  inline def apply(Id: FuotaTaskId): UpdateFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFuotaTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFuotaTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFirmwareUpdateImage(value: FirmwareUpdateImage): Self = StObject.set(x, "FirmwareUpdateImage", value.asInstanceOf[js.Any])
    
    inline def setFirmwareUpdateImageUndefined: Self = StObject.set(x, "FirmwareUpdateImage", js.undefined)
    
    inline def setFirmwareUpdateRole(value: FirmwareUpdateRole): Self = StObject.set(x, "FirmwareUpdateRole", value.asInstanceOf[js.Any])
    
    inline def setFirmwareUpdateRoleUndefined: Self = StObject.set(x, "FirmwareUpdateRole", js.undefined)
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLoRaWAN(value: LoRaWANFuotaTask): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: FuotaTaskName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
