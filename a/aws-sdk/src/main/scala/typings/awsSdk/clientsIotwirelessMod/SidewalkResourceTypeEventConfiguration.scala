package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkResourceTypeEventConfiguration extends StObject {
  
  /**
    * Denotes whether the wireless device join event topic is enabled or disabled.
    */
  var WirelessDeviceEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
}
object SidewalkResourceTypeEventConfiguration {
  
  inline def apply(): SidewalkResourceTypeEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkResourceTypeEventConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidewalkResourceTypeEventConfiguration] (val x: Self) extends AnyVal {
    
    inline def setWirelessDeviceEventTopic(value: EventNotificationTopicStatus): Self = StObject.set(x, "WirelessDeviceEventTopic", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceEventTopicUndefined: Self = StObject.set(x, "WirelessDeviceEventTopic", js.undefined)
  }
}
