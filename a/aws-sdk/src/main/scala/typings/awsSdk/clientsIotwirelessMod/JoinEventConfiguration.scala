package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinEventConfiguration extends StObject {
  
  /**
    * Join event configuration object for enabling or disabling LoRaWAN related event topics.
    */
  var LoRaWAN: js.UndefOr[LoRaWANJoinEventNotificationConfigurations] = js.undefined
  
  /**
    * Denotes whether the wireless device ID join event topic is enabled or disabled.
    */
  var WirelessDeviceIdEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
}
object JoinEventConfiguration {
  
  inline def apply(): JoinEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoinEventConfiguration]
  }
  
  extension [Self <: JoinEventConfiguration](x: Self) {
    
    inline def setLoRaWAN(value: LoRaWANJoinEventNotificationConfigurations): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setWirelessDeviceIdEventTopic(value: EventNotificationTopicStatus): Self = StObject.set(x, "WirelessDeviceIdEventTopic", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceIdEventTopicUndefined: Self = StObject.set(x, "WirelessDeviceIdEventTopic", js.undefined)
  }
}
