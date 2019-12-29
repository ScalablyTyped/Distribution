package typings.activexDashFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
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
  val CSID: String = js.native
  /** Page currently in transmision */
  val CurrentPage: Double = js.native
  /** Device ID that transmits the job */
  val DeviceId: Double = js.native
  /** Document's friendly name */
  val DocumentName: String = js.native
  /** Extended status description */
  val ExtendedStatus: String = js.native
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  @JSName("FAXCOMEXLib.IFaxOutgoingJob_typekey")
  var FAXCOMEXLibDotIFaxOutgoingJob_typekey: IFaxOutgoingJob = js.native
  /** Whether to group broadcast receipts */
  val GroupBroadcastReceipts: Boolean = js.native
  /** Unique job ID */
  val Id: String = js.native
  /** Time the job was originally scheduled to be transmitted */
  val OriginalScheduledTime: VarDate = js.native
  /** Total number of pages */
  val Pages: Double = js.native
  /** Priority of the fax */
  val Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  /** Type of receipt */
  val ReceiptType: FAX_RECEIPT_TYPE_ENUM = js.native
  /** Recipient information object */
  val Recipient: FaxRecipient = js.native
  /** Number of failed transmission retries */
  val Retries: Double = js.native
  /** The time the fax job is scheduled to be transmitted */
  val ScheduledTime: VarDate = js.native
  /** Sender information object */
  val Sender: FaxSender = js.native
  /** Size in bytes of TIFF file */
  val Size: Double = js.native
  /** Current queue status of the job */
  val Status: FAX_JOB_STATUS_ENUM = js.native
  /** Cover page's subject field */
  val Subject: String = js.native
  /** Unique ID the submission process created for the Job */
  val SubmissionId: String = js.native
  /** Time the job was submitted */
  val SubmissionTime: VarDate = js.native
  /** Transmitting Station ID */
  val TSID: String = js.native
  /** The time the fax job finished its transmission */
  val TransmissionEnd: VarDate = js.native
  /** The time the fax job started its transmission */
  val TransmissionStart: VarDate = js.native
  /** Cancel the outbound job */
  def Cancel(): Unit = js.native
  /** Copy the job's TIFF image */
  def CopyTiff(bstrTiffPath: String): Unit = js.native
  /** Pause the outbound job */
  def Pause(): Unit = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Restart the outbound job */
  def Restart(): Unit = js.native
  /** Resume the outbound job */
  def Resume(): Unit = js.native
}

