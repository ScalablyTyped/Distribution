package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceStatusInfo extends StObject {
  
  /**
    * The latest available information about the connection status of a device. 
    */
  var ConnectionStatus: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ConnectionStatus] = js.undefined
  
  /**
    * The time (in epoch) when the device connection status changed.
    */
  var ConnectionStatusUpdatedTime: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ConnectionStatusUpdatedTime] = js.undefined
  
  /**
    * One or more device status detail descriptions.
    */
  var DeviceStatusDetails: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceStatusDetails] = js.undefined
}
object DeviceStatusInfo {
  
  inline def apply(): DeviceStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceStatusInfo]
  }
  
  extension [Self <: DeviceStatusInfo](x: Self) {
    
    inline def setConnectionStatus(value: ConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setConnectionStatusUpdatedTime(value: ConnectionStatusUpdatedTime): Self = StObject.set(x, "ConnectionStatusUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUpdatedTimeUndefined: Self = StObject.set(x, "ConnectionStatusUpdatedTime", js.undefined)
    
    inline def setDeviceStatusDetails(value: DeviceStatusDetails): Self = StObject.set(x, "DeviceStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatusDetailsUndefined: Self = StObject.set(x, "DeviceStatusDetails", js.undefined)
    
    inline def setDeviceStatusDetailsVarargs(value: DeviceStatusDetail*): Self = StObject.set(x, "DeviceStatusDetails", js.Array(value :_*))
  }
}
