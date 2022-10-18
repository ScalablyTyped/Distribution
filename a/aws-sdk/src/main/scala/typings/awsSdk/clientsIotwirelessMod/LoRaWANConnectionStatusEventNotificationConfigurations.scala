package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANConnectionStatusEventNotificationConfigurations extends StObject {
  
  /**
    * Denotes whether the gateway EUI connection status event topic is enabled or disabled.
    */
  var GatewayEuiEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
}
object LoRaWANConnectionStatusEventNotificationConfigurations {
  
  inline def apply(): LoRaWANConnectionStatusEventNotificationConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANConnectionStatusEventNotificationConfigurations]
  }
  
  extension [Self <: LoRaWANConnectionStatusEventNotificationConfigurations](x: Self) {
    
    inline def setGatewayEuiEventTopic(value: EventNotificationTopicStatus): Self = StObject.set(x, "GatewayEuiEventTopic", value.asInstanceOf[js.Any])
    
    inline def setGatewayEuiEventTopicUndefined: Self = StObject.set(x, "GatewayEuiEventTopic", js.undefined)
  }
}
