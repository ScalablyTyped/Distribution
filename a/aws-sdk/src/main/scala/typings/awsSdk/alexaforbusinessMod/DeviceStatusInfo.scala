package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceStatusInfo extends StObject {
  
  /**
    * The latest available information about the connection status of a device. 
    */
  var ConnectionStatus: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ConnectionStatus] = js.native
  
  /**
    * The time (in epoch) when the device connection status changed.
    */
  var ConnectionStatusUpdatedTime: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ConnectionStatusUpdatedTime] = js.native
  
  /**
    * One or more device status detail descriptions.
    */
  var DeviceStatusDetails: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceStatusDetails] = js.native
}
object DeviceStatusInfo {
  
  @scala.inline
  def apply(): DeviceStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceStatusInfo]
  }
  
  @scala.inline
  implicit class DeviceStatusInfoMutableBuilder[Self <: DeviceStatusInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionStatus(value: ConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    @scala.inline
    def setConnectionStatusUpdatedTime(value: ConnectionStatusUpdatedTime): Self = StObject.set(x, "ConnectionStatusUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStatusUpdatedTimeUndefined: Self = StObject.set(x, "ConnectionStatusUpdatedTime", js.undefined)
    
    @scala.inline
    def setDeviceStatusDetails(value: DeviceStatusDetails): Self = StObject.set(x, "DeviceStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatusDetailsUndefined: Self = StObject.set(x, "DeviceStatusDetails", js.undefined)
    
    @scala.inline
    def setDeviceStatusDetailsVarargs(value: DeviceStatusDetail*): Self = StObject.set(x, "DeviceStatusDetails", js.Array(value :_*))
  }
}
