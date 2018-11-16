package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccount Class */
@JSGlobal("FAXCOMEXLib.FaxAccount")
@js.native
class FaxAccount protected () extends js.Object {
  /** Name of the fax account */
  val AccountName: java.lang.String = js.native
  var `FAXCOMEXLib.FaxAccount_typekey`: FaxAccount = js.native
  /** Folders belonging to the account */
  val Folders: FaxAccountFolders = js.native
  /** Events the fax account is listening to */
  val RegisteredEvents: FAX_ACCOUNT_EVENTS_TYPE_ENUM = js.native
  /** Set bit-wise combination of events the fax account listens to */
  def ListenToAccountEvents(EventTypes: FAX_ACCOUNT_EVENTS_TYPE_ENUM): scala.Unit = js.native
}

