package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceEventConfigurationRequest extends StObject {
  
  /**
    * Event configuration for the connection status event.
    */
  var ConnectionStatus: js.UndefOr[ConnectionStatusEventConfiguration] = js.undefined
  
  /**
    * Event configuration for the device registration state event.
    */
  var DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateEventConfiguration] = js.undefined
  
  /**
    * Resource identifier to opt in for event messaging.
    */
  var Identifier: typings.awsSdk.clientsIotwirelessMod.Identifier
  
  /**
    * Identifier type of the particular resource identifier for event configuration.
    */
  var IdentifierType: typings.awsSdk.clientsIotwirelessMod.IdentifierType
  
  /**
    * Event configuration for the join event.
    */
  var Join: js.UndefOr[JoinEventConfiguration] = js.undefined
  
  /**
    * Event configuration for the message delivery status event.
    */
  var MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusEventConfiguration] = js.undefined
  
  /**
    * Partner type of the resource if the identifier type is PartnerAccountId 
    */
  var PartnerType: js.UndefOr[EventNotificationPartnerType] = js.undefined
  
  /**
    * Event configuration for the proximity event.
    */
  var Proximity: js.UndefOr[ProximityEventConfiguration] = js.undefined
}
object UpdateResourceEventConfigurationRequest {
  
  inline def apply(Identifier: Identifier, IdentifierType: IdentifierType): UpdateResourceEventConfigurationRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], IdentifierType = IdentifierType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceEventConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResourceEventConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionStatus(value: ConnectionStatusEventConfiguration): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setDeviceRegistrationState(value: DeviceRegistrationStateEventConfiguration): Self = StObject.set(x, "DeviceRegistrationState", value.asInstanceOf[js.Any])
    
    inline def setDeviceRegistrationStateUndefined: Self = StObject.set(x, "DeviceRegistrationState", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierType(value: IdentifierType): Self = StObject.set(x, "IdentifierType", value.asInstanceOf[js.Any])
    
    inline def setJoin(value: JoinEventConfiguration): Self = StObject.set(x, "Join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "Join", js.undefined)
    
    inline def setMessageDeliveryStatus(value: MessageDeliveryStatusEventConfiguration): Self = StObject.set(x, "MessageDeliveryStatus", value.asInstanceOf[js.Any])
    
    inline def setMessageDeliveryStatusUndefined: Self = StObject.set(x, "MessageDeliveryStatus", js.undefined)
    
    inline def setPartnerType(value: EventNotificationPartnerType): Self = StObject.set(x, "PartnerType", value.asInstanceOf[js.Any])
    
    inline def setPartnerTypeUndefined: Self = StObject.set(x, "PartnerType", js.undefined)
    
    inline def setProximity(value: ProximityEventConfiguration): Self = StObject.set(x, "Proximity", value.asInstanceOf[js.Any])
    
    inline def setProximityUndefined: Self = StObject.set(x, "Proximity", js.undefined)
  }
}
