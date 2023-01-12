package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionStatusEventConfiguration extends StObject {
  
  /**
    * Connection status event configuration object for enabling or disabling LoRaWAN related event topics.
    */
  var LoRaWAN: js.UndefOr[LoRaWANConnectionStatusEventNotificationConfigurations] = js.undefined
  
  /**
    * Denotes whether the wireless gateway ID connection status event topic is enabled or disabled.
    */
  var WirelessGatewayIdEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
}
object ConnectionStatusEventConfiguration {
  
  inline def apply(): ConnectionStatusEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionStatusEventConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionStatusEventConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLoRaWAN(value: LoRaWANConnectionStatusEventNotificationConfigurations): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setWirelessGatewayIdEventTopic(value: EventNotificationTopicStatus): Self = StObject.set(x, "WirelessGatewayIdEventTopic", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewayIdEventTopicUndefined: Self = StObject.set(x, "WirelessGatewayIdEventTopic", js.undefined)
  }
}
