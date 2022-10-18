package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateWirelessDeviceFromMulticastGroupRequest extends StObject {
  
  var Id: MulticastGroupId
  
  var WirelessDeviceId: typings.awsSdk.clientsIotwirelessMod.WirelessDeviceId
}
object DisassociateWirelessDeviceFromMulticastGroupRequest {
  
  inline def apply(Id: MulticastGroupId, WirelessDeviceId: WirelessDeviceId): DisassociateWirelessDeviceFromMulticastGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], WirelessDeviceId = WirelessDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWirelessDeviceFromMulticastGroupRequest]
  }
  
  extension [Self <: DisassociateWirelessDeviceFromMulticastGroupRequest](x: Self) {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceId(value: WirelessDeviceId): Self = StObject.set(x, "WirelessDeviceId", value.asInstanceOf[js.Any])
  }
}
