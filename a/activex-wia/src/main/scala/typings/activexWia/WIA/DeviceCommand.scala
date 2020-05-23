package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceCommand object describes a CommandID that can be used when calling ExecuteCommand on a Device or Item object. */
trait DeviceCommand extends js.Object {
  /** Returns the commandID for this Command */
  val CommandID: String
  /** Returns the command Description */
  val Description: String
  /** Returns the command Name */
  val Name: String
  @JSName("WIA.DeviceCommand_typekey")
  var WIADotDeviceCommand_typekey: DeviceCommand
}

object DeviceCommand {
  @scala.inline
  def apply(CommandID: String, Description: String, Name: String, WIADotDeviceCommand_typekey: DeviceCommand): DeviceCommand = {
    val __obj = js.Dynamic.literal(CommandID = CommandID.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.DeviceCommand_typekey")(WIADotDeviceCommand_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCommand]
  }
}

