package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxOutgoingJob interface */
trait IFaxOutgoingJob extends js.Object {
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM
  /** Called Station ID */
  val CSID: String
  /** Page currently in transmision */
  val CurrentPage: Double
  /** Device ID that transmits the job */
  val DeviceId: Double
  /** Document's friendly name */
  val DocumentName: String
  /** Extended status description */
  val ExtendedStatus: String
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM
  @JSName("FAXCOMEXLib.IFaxOutgoingJob_typekey")
  var FAXCOMEXLibDotIFaxOutgoingJob_typekey: IFaxOutgoingJob
  /** Whether to group broadcast receipts */
  val GroupBroadcastReceipts: Boolean
  /** Unique job ID */
  val Id: String
  /** Time the job was originally scheduled to be transmitted */
  val OriginalScheduledTime: VarDate
  /** Total number of pages */
  val Pages: Double
  /** Priority of the fax */
  val Priority: FAX_PRIORITY_TYPE_ENUM
  /** Type of receipt */
  val ReceiptType: FAX_RECEIPT_TYPE_ENUM
  /** Recipient information object */
  val Recipient: FaxRecipient
  /** Number of failed transmission retries */
  val Retries: Double
  /** The time the fax job is scheduled to be transmitted */
  val ScheduledTime: VarDate
  /** Sender information object */
  val Sender: FaxSender
  /** Size in bytes of TIFF file */
  val Size: Double
  /** Current queue status of the job */
  val Status: FAX_JOB_STATUS_ENUM
  /** Cover page's subject field */
  val Subject: String
  /** Unique ID the submission process created for the Job */
  val SubmissionId: String
  /** Time the job was submitted */
  val SubmissionTime: VarDate
  /** Transmitting Station ID */
  val TSID: String
  /** The time the fax job finished its transmission */
  val TransmissionEnd: VarDate
  /** The time the fax job started its transmission */
  val TransmissionStart: VarDate
  /** Cancel the outbound job */
  def Cancel(): Unit
  /** Copy the job's TIFF image */
  def CopyTiff(bstrTiffPath: String): Unit
  /** Pause the outbound job */
  def Pause(): Unit
  /** Refresh the object */
  def Refresh(): Unit
  /** Restart the outbound job */
  def Restart(): Unit
  /** Resume the outbound job */
  def Resume(): Unit
}

object IFaxOutgoingJob {
  @scala.inline
  def apply(
    AvailableOperations: FAX_JOB_OPERATIONS_ENUM,
    CSID: String,
    Cancel: () => Unit,
    CopyTiff: String => Unit,
    CurrentPage: Double,
    DeviceId: Double,
    DocumentName: String,
    ExtendedStatus: String,
    ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM,
    FAXCOMEXLibDotIFaxOutgoingJob_typekey: IFaxOutgoingJob,
    GroupBroadcastReceipts: Boolean,
    Id: String,
    OriginalScheduledTime: VarDate,
    Pages: Double,
    Pause: () => Unit,
    Priority: FAX_PRIORITY_TYPE_ENUM,
    ReceiptType: FAX_RECEIPT_TYPE_ENUM,
    Recipient: FaxRecipient,
    Refresh: () => Unit,
    Restart: () => Unit,
    Resume: () => Unit,
    Retries: Double,
    ScheduledTime: VarDate,
    Sender: FaxSender,
    Size: Double,
    Status: FAX_JOB_STATUS_ENUM,
    Subject: String,
    SubmissionId: String,
    SubmissionTime: VarDate,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): IFaxOutgoingJob = {
    val __obj = js.Dynamic.literal(AvailableOperations = AvailableOperations.asInstanceOf[js.Any], CSID = CSID.asInstanceOf[js.Any], Cancel = js.Any.fromFunction0(Cancel), CopyTiff = js.Any.fromFunction1(CopyTiff), CurrentPage = CurrentPage.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], DocumentName = DocumentName.asInstanceOf[js.Any], ExtendedStatus = ExtendedStatus.asInstanceOf[js.Any], ExtendedStatusCode = ExtendedStatusCode.asInstanceOf[js.Any], GroupBroadcastReceipts = GroupBroadcastReceipts.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OriginalScheduledTime = OriginalScheduledTime.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Pause = js.Any.fromFunction0(Pause), Priority = Priority.asInstanceOf[js.Any], ReceiptType = ReceiptType.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Restart = js.Any.fromFunction0(Restart), Resume = js.Any.fromFunction0(Resume), Retries = Retries.asInstanceOf[js.Any], ScheduledTime = ScheduledTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SubmissionId = SubmissionId.asInstanceOf[js.Any], SubmissionTime = SubmissionTime.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.IFaxOutgoingJob_typekey")(FAXCOMEXLibDotIFaxOutgoingJob_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFaxOutgoingJob]
  }
}

