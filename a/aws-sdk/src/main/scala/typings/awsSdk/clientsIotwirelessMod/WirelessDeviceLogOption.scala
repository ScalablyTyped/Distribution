package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessDeviceLogOption extends StObject {
  
  var Events: js.UndefOr[WirelessDeviceEventLogOptionList] = js.undefined
  
  var LogLevel: typings.awsSdk.clientsIotwirelessMod.LogLevel
  
  /**
    * The wireless device type.
    */
  var Type: WirelessDeviceType
}
object WirelessDeviceLogOption {
  
  inline def apply(LogLevel: LogLevel, Type: WirelessDeviceType): WirelessDeviceLogOption = {
    val __obj = js.Dynamic.literal(LogLevel = LogLevel.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[WirelessDeviceLogOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WirelessDeviceLogOption] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: WirelessDeviceEventLogOptionList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: WirelessDeviceEventLogOption*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setType(value: WirelessDeviceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
