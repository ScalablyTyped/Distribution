package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFuotaTaskResponse extends StObject {
  
  var Arn: js.UndefOr[FuotaTaskArn] = js.undefined
  
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  var Description: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Description] = js.undefined
  
  var FirmwareUpdateImage: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FirmwareUpdateImage] = js.undefined
  
  var FirmwareUpdateRole: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FirmwareUpdateRole] = js.undefined
  
  var Id: js.UndefOr[FuotaTaskId] = js.undefined
  
  var LoRaWAN: js.UndefOr[LoRaWANFuotaTaskGetInfo] = js.undefined
  
  var Name: js.UndefOr[FuotaTaskName] = js.undefined
  
  var Status: js.UndefOr[FuotaTaskStatus] = js.undefined
}
object GetFuotaTaskResponse {
  
  inline def apply(): GetFuotaTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFuotaTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFuotaTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: FuotaTaskArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFirmwareUpdateImage(value: FirmwareUpdateImage): Self = StObject.set(x, "FirmwareUpdateImage", value.asInstanceOf[js.Any])
    
    inline def setFirmwareUpdateImageUndefined: Self = StObject.set(x, "FirmwareUpdateImage", js.undefined)
    
    inline def setFirmwareUpdateRole(value: FirmwareUpdateRole): Self = StObject.set(x, "FirmwareUpdateRole", value.asInstanceOf[js.Any])
    
    inline def setFirmwareUpdateRoleUndefined: Self = StObject.set(x, "FirmwareUpdateRole", js.undefined)
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANFuotaTaskGetInfo): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: FuotaTaskName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FuotaTaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
