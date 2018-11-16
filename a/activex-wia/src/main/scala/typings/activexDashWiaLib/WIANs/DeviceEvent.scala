package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceEvent object describes an EventID that can be used when calling RegisterEvent or RegisterPersistentEvent on a DeviceManager object. */
@JSGlobal("WIA.DeviceEvent")
@js.native
class DeviceEvent protected () extends js.Object {
  /** Returns the event Description */
  val Description: java.lang.String = js.native
  /** Returns the EventID for this Event */
  val EventID: java.lang.String = js.native
  /** Returns the event Name */
  val Name: java.lang.String = js.native
  /** Returns the Type of this Event */
  val Type: WiaEventFlag = js.native
  var `WIA.DeviceEvent_typekey`: DeviceEvent = js.native
}

