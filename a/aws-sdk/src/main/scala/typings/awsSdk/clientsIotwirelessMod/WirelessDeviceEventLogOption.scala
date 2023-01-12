package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessDeviceEventLogOption extends StObject {
  
  var Event: WirelessDeviceEvent
  
  var LogLevel: typings.awsSdk.clientsIotwirelessMod.LogLevel
}
object WirelessDeviceEventLogOption {
  
  inline def apply(Event: WirelessDeviceEvent, LogLevel: LogLevel): WirelessDeviceEventLogOption = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], LogLevel = LogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WirelessDeviceEventLogOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WirelessDeviceEventLogOption] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: WirelessDeviceEvent): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
  }
}
