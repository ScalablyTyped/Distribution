package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivityLogging Class */
@JSGlobal("FAXCOMEXLib.FaxActivityLogging")
@js.native
class FaxActivityLogging protected () extends js.Object {
  /** Activity log database files path */
  var DatabasePath: java.lang.String = js.native
  var `FAXCOMEXLib.FaxActivityLogging_typekey`: FaxActivityLogging = js.native
  /** Does the server log incoming fax activity */
  var LogIncoming: scala.Boolean = js.native
  /** Does the server log outgoing fax activity */
  var LogOutgoing: scala.Boolean = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

