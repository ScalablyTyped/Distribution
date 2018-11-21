package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDocument Class */
@JSGlobal("FAXCOMEXLib.FaxDocument")
@js.native
class FaxDocument protected () extends js.Object {
  /** Whether to attach a fax to the receipt */
  var AttachFaxToReceipt: scala.Boolean = js.native
  /** Full paths to the fax document body files */
  var Bodies: js.Any = js.native
  /** Full path to the fax document body file */
  var Body: java.lang.String = js.native
  /** Call handle */
  var CallHandle: scala.Double = js.native
  /** Cover page file path */
  var CoverPage: java.lang.String = js.native
  /** Is server, local, or no cover page used */
  var CoverPageType: FAX_COVERPAGE_TYPE_ENUM = js.native
  /** The document name */
  var DocumentName: java.lang.String = js.native
  var `FAXCOMEXLib.FaxDocument_typekey`: FaxDocument = js.native
  /** Whether to group the broadcast receipts */
  var GroupBroadcastReceipts: scala.Boolean = js.native
  /** Contents of cover page note field */
  var Note: java.lang.String = js.native
  /** Priority of the fax */
  var Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  /** Address of the receipt */
  var ReceiptAddress: java.lang.String = js.native
  /** Type of the receipt */
  var ReceiptType: FAX_RECEIPT_TYPE_ENUM = js.native
  /** Collection of recipients */
  @JSName("Recipients")
  val Recipients_Original: FaxRecipients = js.native
  /** Time to send the fax */
  var ScheduleTime: activexDashInteropLib.VarDate = js.native
  /** When to send the fax */
  var ScheduleType: FAX_SCHEDULE_TYPE_ENUM = js.native
  /** Sender information object */
  val Sender: FaxSender = js.native
  /** Contents of cover page subject field */
  var Subject: java.lang.String = js.native
  /** Submission Id for the Fax document */
  val SubmissionId: java.lang.String = js.native
  /** Tapi connection */
  var TapiConnection: js.Any = js.native
  /** Submit the fax document on the already connected server */
  def ConnectedSubmit(pFaxServer: IFaxServer): activexDashInteropLib.SafeArray[java.lang.String] = js.native
  /** Submit the fax document on the already connected server */
  def ConnectedSubmit2(pFaxServer: IFaxServer, pvFaxOutgoingJobIDs: activexDashInteropLib.SafeArray[java.lang.String]): scala.Double = js.native
  /** Collection of recipients */
  def Recipients(lIndex: scala.Double): FaxRecipient = js.native
  /** Connect to server, submit the fax document, disconnect */
  def Submit(bstrFaxServerName: java.lang.String): activexDashInteropLib.SafeArray[scala.Double] = js.native
  /** Connect to server, submit the fax document, disconnect */
  def Submit2(bstrFaxServerName: java.lang.String, pvFaxOutgoingJobIDs: js.Any): scala.Double = js.native
}

