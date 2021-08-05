package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The DeviceEvent object describes an EventID that can be used when calling RegisterEvent or RegisterPersistentEvent on a DeviceManager object. */
trait DeviceEvent extends StObject {
  
  /** Returns the event Description */
  val Description: String
  
  /** Returns the EventID for this Event */
  val EventID: String
  
  /** Returns the event Name */
  val Name: String
  
  /** Returns the Type of this Event */
  val Type: WiaEventFlag
  
  /* private */ @JSName("WIA.DeviceEvent_typekey")
  var WIADotDeviceEvent_typekey: DeviceEvent
}
object DeviceEvent {
  
  inline def apply(
    Description: String,
    EventID: String,
    Name: String,
    Type: WiaEventFlag,
    WIADotDeviceEvent_typekey: DeviceEvent
  ): DeviceEvent = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], EventID = EventID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.DeviceEvent_typekey")(WIADotDeviceEvent_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEvent]
  }
  
  extension [Self <: DeviceEvent](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setEventID(value: String): Self = StObject.set(x, "EventID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: WiaEventFlag): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWIADotDeviceEvent_typekey(value: DeviceEvent): Self = StObject.set(x, "WIA.DeviceEvent_typekey", value.asInstanceOf[js.Any])
  }
}
