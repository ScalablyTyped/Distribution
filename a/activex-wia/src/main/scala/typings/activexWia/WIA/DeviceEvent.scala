package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The DeviceEvent object describes an EventID that can be used when calling RegisterEvent or RegisterPersistentEvent on a DeviceManager object. */
@js.native
trait DeviceEvent extends js.Object {
  
  /** Returns the event Description */
  val Description: String = js.native
  
  /** Returns the EventID for this Event */
  val EventID: String = js.native
  
  /** Returns the event Name */
  val Name: String = js.native
  
  /** Returns the Type of this Event */
  val Type: WiaEventFlag = js.native
  
  @JSName("WIA.DeviceEvent_typekey")
  var WIADotDeviceEvent_typekey: DeviceEvent = js.native
}
object DeviceEvent {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DeviceEventOps[Self <: DeviceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventID(value: String): Self = this.set("EventID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WiaEventFlag): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIADotDeviceEvent_typekey(value: DeviceEvent): Self = this.set("WIA.DeviceEvent_typekey", value.asInstanceOf[js.Any])
  }
}
