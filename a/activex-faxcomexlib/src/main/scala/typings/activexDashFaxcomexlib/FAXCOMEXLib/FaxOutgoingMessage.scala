package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingMessage Class */
@JSGlobal("FAXCOMEXLib.FaxOutgoingMessage")
@js.native
class FaxOutgoingMessage protected () extends IFaxOutgoingMessage {
  var `FAXCOMEXLib.FaxOutgoingMessage_typekey`: FaxOutgoingMessage = js.native
  /** Has Cover page */
  val HasCoverPage: Boolean = js.native
  /** Read flag on the message */
  var Read: Boolean = js.native
  /** Address of the receipt */
  val ReceiptAddress: String = js.native
  /** Type of the receipt */
  val ReceiptType: FAX_RECEIPT_TYPE_ENUM = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

