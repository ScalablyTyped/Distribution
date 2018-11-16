package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingMessage Class */
@JSGlobal("FAXCOMEXLib.FaxOutgoingMessage")
@js.native
class FaxOutgoingMessage protected () extends IFaxOutgoingMessage {
  var `FAXCOMEXLib.FaxOutgoingMessage_typekey`: FaxOutgoingMessage = js.native
  /** Has Cover page */
  val HasCoverPage: scala.Boolean = js.native
  /** Read flag on the message */
  var Read: scala.Boolean = js.native
  /** Address of the receipt */
  val ReceiptAddress: java.lang.String = js.native
  /** Type of the receipt */
  val ReceiptType: FAX_RECEIPT_TYPE_ENUM = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

