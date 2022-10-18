package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMulticastGroupResponse extends StObject {
  
  var Arn: js.UndefOr[MulticastGroupArn] = js.undefined
  
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  var Description: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Description] = js.undefined
  
  var Id: js.UndefOr[MulticastGroupId] = js.undefined
  
  var LoRaWAN: js.UndefOr[LoRaWANMulticastGet] = js.undefined
  
  var Name: js.UndefOr[MulticastGroupName] = js.undefined
  
  var Status: js.UndefOr[MulticastGroupStatus] = js.undefined
}
object GetMulticastGroupResponse {
  
  inline def apply(): GetMulticastGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMulticastGroupResponse]
  }
  
  extension [Self <: GetMulticastGroupResponse](x: Self) {
    
    inline def setArn(value: MulticastGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANMulticastGet): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: MulticastGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: MulticastGroupStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
