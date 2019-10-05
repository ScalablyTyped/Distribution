package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingMessage Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingMessage")
@js.native
class FaxIncomingMessage protected () extends IFaxIncomingMessage {
  var `FAXCOMEXLib.FaxIncomingMessage_typekey`: FaxIncomingMessage = js.native
  /** Has Cover page */
  var HasCoverPage: Boolean = js.native
  /** Read flag on the message */
  var Read: Boolean = js.native
  /** Set of recipient names */
  var Recipients: String = js.native
  /** Sender's fax number */
  var SenderFaxNumber: String = js.native
  /** Sender's name */
  var SenderName: String = js.native
  /** Contents of cover page subject field */
  var Subject: String = js.native
  /** Is message reassigned? */
  val WasReAssigned: Boolean = js.native
  /** Reassigns the message */
  def ReAssign(): Unit = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

