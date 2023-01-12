package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEvent extends StObject {
  
  /**
    * An object representing the device associated with the event.
    */
  var Device: js.UndefOr[typings.awsSdk.clientsIot1clickdevicesserviceMod.Device] = js.undefined
  
  /**
    * A serialized JSON object representing the device-type specific event.
    */
  var StdEvent: js.UndefOr[string] = js.undefined
}
object DeviceEvent {
  
  inline def apply(): DeviceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceEvent] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: Device): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
    
    inline def setStdEvent(value: string): Self = StObject.set(x, "StdEvent", value.asInstanceOf[js.Any])
    
    inline def setStdEventUndefined: Self = StObject.set(x, "StdEvent", js.undefined)
  }
}
