package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceCommand object describes a CommandID that can be used when calling ExecuteCommand on a Device or Item object. */
@JSGlobal("WIA.DeviceCommand")
@js.native
class DeviceCommand protected () extends js.Object {
  /** Returns the commandID for this Command */
  val CommandID: java.lang.String = js.native
  /** Returns the command Description */
  val Description: java.lang.String = js.native
  /** Returns the command Name */
  val Name: java.lang.String = js.native
  var `WIA.DeviceCommand_typekey`: DeviceCommand = js.native
}

