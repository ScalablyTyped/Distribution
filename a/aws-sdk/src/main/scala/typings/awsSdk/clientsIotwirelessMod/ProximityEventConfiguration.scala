package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProximityEventConfiguration extends StObject {
  
  /**
    * Proximity event configuration object for enabling or disabling Sidewalk related event topics.
    */
  var Sidewalk: js.UndefOr[SidewalkEventNotificationConfigurations] = js.undefined
  
  /**
    * Denotes whether the wireless device ID proximity event topic is enabled or disabled.
    */
  var WirelessDeviceIdEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
}
object ProximityEventConfiguration {
  
  inline def apply(): ProximityEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProximityEventConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProximityEventConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSidewalk(value: SidewalkEventNotificationConfigurations): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
    
    inline def setWirelessDeviceIdEventTopic(value: EventNotificationTopicStatus): Self = StObject.set(x, "WirelessDeviceIdEventTopic", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceIdEventTopicUndefined: Self = StObject.set(x, "WirelessDeviceIdEventTopic", js.undefined)
  }
}
