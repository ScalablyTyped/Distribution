package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventNotificationItemConfigurations extends StObject {
  
  /**
    * Connection status event configuration for an event configuration item.
    */
  var ConnectionStatus: js.UndefOr[ConnectionStatusEventConfiguration] = js.undefined
  
  /**
    * Device registration state event configuration for an event configuration item.
    */
  var DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateEventConfiguration] = js.undefined
  
  /**
    * Join event configuration for an event configuration item.
    */
  var Join: js.UndefOr[JoinEventConfiguration] = js.undefined
  
  /**
    * Message delivery status event configuration for an event configuration item.
    */
  var MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusEventConfiguration] = js.undefined
  
  /**
    * Proximity event configuration for an event configuration item.
    */
  var Proximity: js.UndefOr[ProximityEventConfiguration] = js.undefined
}
object EventNotificationItemConfigurations {
  
  inline def apply(): EventNotificationItemConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventNotificationItemConfigurations]
  }
  
  extension [Self <: EventNotificationItemConfigurations](x: Self) {
    
    inline def setConnectionStatus(value: ConnectionStatusEventConfiguration): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setDeviceRegistrationState(value: DeviceRegistrationStateEventConfiguration): Self = StObject.set(x, "DeviceRegistrationState", value.asInstanceOf[js.Any])
    
    inline def setDeviceRegistrationStateUndefined: Self = StObject.set(x, "DeviceRegistrationState", js.undefined)
    
    inline def setJoin(value: JoinEventConfiguration): Self = StObject.set(x, "Join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "Join", js.undefined)
    
    inline def setMessageDeliveryStatus(value: MessageDeliveryStatusEventConfiguration): Self = StObject.set(x, "MessageDeliveryStatus", value.asInstanceOf[js.Any])
    
    inline def setMessageDeliveryStatusUndefined: Self = StObject.set(x, "MessageDeliveryStatus", js.undefined)
    
    inline def setProximity(value: ProximityEventConfiguration): Self = StObject.set(x, "Proximity", value.asInstanceOf[js.Any])
    
    inline def setProximityUndefined: Self = StObject.set(x, "Proximity", js.undefined)
  }
}
