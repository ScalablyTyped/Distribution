package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceCommand object describes a CommandID that can be used when calling ExecuteCommand on a Device or Item object. */
@js.native
trait DeviceCommand extends js.Object {
  /** Returns the commandID for this Command */
  val CommandID: String = js.native
  /** Returns the command Description */
  val Description: String = js.native
  /** Returns the command Name */
  val Name: String = js.native
  @JSName("WIA.DeviceCommand_typekey")
  var WIADotDeviceCommand_typekey: DeviceCommand = js.native
}

object DeviceCommand {
  @scala.inline
  def apply(CommandID: String, Description: String, Name: String, WIADotDeviceCommand_typekey: DeviceCommand): DeviceCommand = {
    val __obj = js.Dynamic.literal(CommandID = CommandID.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.DeviceCommand_typekey")(WIADotDeviceCommand_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCommand]
  }
  @scala.inline
  implicit class DeviceCommandOps[Self <: DeviceCommand] (val x: Self) extends AnyVal {
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
    def setCommandID(value: String): Self = this.set("CommandID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWIADotDeviceCommand_typekey(value: DeviceCommand): Self = this.set("WIA.DeviceCommand_typekey", value.asInstanceOf[js.Any])
  }
  
}

