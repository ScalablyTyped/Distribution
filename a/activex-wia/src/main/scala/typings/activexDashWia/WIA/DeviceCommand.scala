package typings.activexDashWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceCommand object describes a CommandID that can be used when calling ExecuteCommand on a Device or Item object. */
@JSGlobal("WIA.DeviceCommand")
@js.native
class DeviceCommand protected () extends js.Object {
  /** Returns the commandID for this Command */
  val CommandID: String = js.native
  /** Returns the command Description */
  val Description: String = js.native
  /** Returns the command Name */
  val Name: String = js.native
  var `WIA.DeviceCommand_typekey`: DeviceCommand = js.native
}

