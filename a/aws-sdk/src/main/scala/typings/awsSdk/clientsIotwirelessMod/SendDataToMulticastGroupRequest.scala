package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDataToMulticastGroupRequest extends StObject {
  
  var Id: MulticastGroupId
  
  var PayloadData: typings.awsSdk.clientsIotwirelessMod.PayloadData
  
  var WirelessMetadata: MulticastWirelessMetadata
}
object SendDataToMulticastGroupRequest {
  
  inline def apply(Id: MulticastGroupId, PayloadData: PayloadData, WirelessMetadata: MulticastWirelessMetadata): SendDataToMulticastGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PayloadData = PayloadData.asInstanceOf[js.Any], WirelessMetadata = WirelessMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDataToMulticastGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendDataToMulticastGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setPayloadData(value: PayloadData): Self = StObject.set(x, "PayloadData", value.asInstanceOf[js.Any])
    
    inline def setWirelessMetadata(value: MulticastWirelessMetadata): Self = StObject.set(x, "WirelessMetadata", value.asInstanceOf[js.Any])
  }
}
