package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingMessage Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingMessage")
@js.native
class FaxIncomingMessage protected () extends IFaxIncomingMessage {
  var `FAXCOMEXLib.FaxIncomingMessage_typekey`: FaxIncomingMessage = js.native
  /** Has Cover page */
  var HasCoverPage: scala.Boolean = js.native
  /** Read flag on the message */
  var Read: scala.Boolean = js.native
  /** Set of recipient names */
  var Recipients: java.lang.String = js.native
  /** Sender's fax number */
  var SenderFaxNumber: java.lang.String = js.native
  /** Sender's name */
  var SenderName: java.lang.String = js.native
  /** Contents of cover page subject field */
  var Subject: java.lang.String = js.native
  /** Is message reassigned? */
  val WasReAssigned: scala.Boolean = js.native
  /** Reassigns the message */
  def ReAssign(): scala.Unit = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

