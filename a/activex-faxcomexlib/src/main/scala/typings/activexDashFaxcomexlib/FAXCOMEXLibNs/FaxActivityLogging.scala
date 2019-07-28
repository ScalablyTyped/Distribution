package typings.activexDashFaxcomexlib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivityLogging Class */
@JSGlobal("FAXCOMEXLib.FaxActivityLogging")
@js.native
class FaxActivityLogging protected () extends js.Object {
  /** Activity log database files path */
  var DatabasePath: String = js.native
  var `FAXCOMEXLib.FaxActivityLogging_typekey`: FaxActivityLogging = js.native
  /** Does the server log incoming fax activity */
  var LogIncoming: Boolean = js.native
  /** Does the server log outgoing fax activity */
  var LogOutgoing: Boolean = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

