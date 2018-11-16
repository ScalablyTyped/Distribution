package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxOutgoingJob interface */
@JSGlobal("FAXCOMEXLib.IFaxOutgoingJob")
@js.native
class IFaxOutgoingJob protected () extends js.Object {
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  /** Called Station ID */
  val CSID: java.lang.String = js.native
  /** Page currently in transmision */
  val CurrentPage: scala.Double = js.native
  /** Device ID that transmits the job */
  val DeviceId: scala.Double = js.native
  /** Document's friendly name */
  val DocumentName: java.lang.String = js.native
  /** Extended status description */
  val ExtendedStatus: java.lang.String = js.native
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  var `FAXCOMEXLib.IFaxOutgoingJob_typekey`: IFaxOutgoingJob = js.native
  /** Whether to group broadcast receipts */
  val GroupBroadcastReceipts: scala.Boolean = js.native
  /** Unique job ID */
  val Id: java.lang.String = js.native
  /** Time the job was originally scheduled to be transmitted */
  val OriginalScheduledTime: stdLib.VarDate = js.native
  /** Total number of pages */
  val Pages: scala.Double = js.native
  /** Priority of the fax */
  val Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  /** Type of receipt */
  val ReceiptType: FAX_RECEIPT_TYPE_ENUM = js.native
  /** Recipient information object */
  val Recipient: FaxRecipient = js.native
  /** Number of failed transmission retries */
  val Retries: scala.Double = js.native
  /** The time the fax job is scheduled to be transmitted */
  val ScheduledTime: stdLib.VarDate = js.native
  /** Sender information object */
  val Sender: FaxSender = js.native
  /** Size in bytes of TIFF file */
  val Size: scala.Double = js.native
  /** Current queue status of the job */
  val Status: FAX_JOB_STATUS_ENUM = js.native
  /** Cover page's subject field */
  val Subject: java.lang.String = js.native
  /** Unique ID the submission process created for the Job */
  val SubmissionId: java.lang.String = js.native
  /** Time the job was submitted */
  val SubmissionTime: stdLib.VarDate = js.native
  /** Transmitting Station ID */
  val TSID: java.lang.String = js.native
  /** The time the fax job finished its transmission */
  val TransmissionEnd: stdLib.VarDate = js.native
  /** The time the fax job started its transmission */
  val TransmissionStart: stdLib.VarDate = js.native
  /** Cancel the outbound job */
  def Cancel(): scala.Unit = js.native
  /** Copy the job's TIFF image */
  def CopyTiff(bstrTiffPath: java.lang.String): scala.Unit = js.native
  /** Pause the outbound job */
  def Pause(): scala.Unit = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Restart the outbound job */
  def Restart(): scala.Unit = js.native
  /** Resume the outbound job */
  def Resume(): scala.Unit = js.native
}

