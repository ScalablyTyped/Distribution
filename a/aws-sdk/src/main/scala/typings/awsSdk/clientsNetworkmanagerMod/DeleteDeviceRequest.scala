package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeviceRequest extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: typings.awsSdk.clientsNetworkmanagerMod.DeviceId
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
}
object DeleteDeviceRequest {
  
  inline def apply(DeviceId: DeviceId, GlobalNetworkId: GlobalNetworkId): DeleteDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
  }
}
