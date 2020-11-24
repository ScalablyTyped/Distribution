package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingJob Class */
@js.native
trait FaxOutgoingJob extends js.Object {
  
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  
  /** Called Station ID */
  val CSID: String = js.native
  
  /** Cancel the outbound job */
  def Cancel(): Unit = js.native
  
  /** Copy the job's TIFF image */
  def CopyTiff(bstrTiffPath: String): Unit = js.native
  
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
  
  @JSName("FAXCOMEXLib.FaxOutgoingJob_typekey")
  var FAXCOMEXLibDotFaxOutgoingJob_typekey: FaxOutgoingJob = js.native
  
  /** Whether to group broadcast receipts */
  val GroupBroadcastReceipts: Boolean = js.native
  
  /** Has Cover page */
  val HasCoverPage: Boolean = js.native
  
  /** Unique job ID */
  val Id: String = js.native
  
  /** Time the job was originally scheduled to be transmitted */
  val OriginalScheduledTime: VarDate = js.native
  
  /** Total number of pages */
  val Pages: Double = js.native
  
  /** Pause the outbound job */
  def Pause(): Unit = js.native
  
  /** Priority of the fax */
  val Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  
  /** Address of the receipt */
  val ReceiptAddress: String = js.native
  
  /** Type of receipt */
  val ReceiptType: FAX_RECEIPT_TYPE_ENUM = js.native
  
  /** Recipient information object */
  val Recipient: FaxRecipient = js.native
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** Restart the outbound job */
  def Restart(): Unit = js.native
  
  /** Resume the outbound job */
  def Resume(): Unit = js.native
  
  /** Number of failed transmission retries */
  val Retries: Double = js.native
  
  /** When to send the fax */
  val ScheduleType: FAX_SCHEDULE_TYPE_ENUM = js.native
  
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
}
object FaxOutgoingJob {
  
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
    FAXCOMEXLibDotFaxOutgoingJob_typekey: FaxOutgoingJob,
    GroupBroadcastReceipts: Boolean,
    HasCoverPage: Boolean,
    Id: String,
    OriginalScheduledTime: VarDate,
    Pages: Double,
    Pause: () => Unit,
    Priority: FAX_PRIORITY_TYPE_ENUM,
    ReceiptAddress: String,
    ReceiptType: FAX_RECEIPT_TYPE_ENUM,
    Recipient: FaxRecipient,
    Refresh: () => Unit,
    Restart: () => Unit,
    Resume: () => Unit,
    Retries: Double,
    ScheduleType: FAX_SCHEDULE_TYPE_ENUM,
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
  ): FaxOutgoingJob = {
    val __obj = js.Dynamic.literal(AvailableOperations = AvailableOperations.asInstanceOf[js.Any], CSID = CSID.asInstanceOf[js.Any], Cancel = js.Any.fromFunction0(Cancel), CopyTiff = js.Any.fromFunction1(CopyTiff), CurrentPage = CurrentPage.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], DocumentName = DocumentName.asInstanceOf[js.Any], ExtendedStatus = ExtendedStatus.asInstanceOf[js.Any], ExtendedStatusCode = ExtendedStatusCode.asInstanceOf[js.Any], GroupBroadcastReceipts = GroupBroadcastReceipts.asInstanceOf[js.Any], HasCoverPage = HasCoverPage.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OriginalScheduledTime = OriginalScheduledTime.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Pause = js.Any.fromFunction0(Pause), Priority = Priority.asInstanceOf[js.Any], ReceiptAddress = ReceiptAddress.asInstanceOf[js.Any], ReceiptType = ReceiptType.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Restart = js.Any.fromFunction0(Restart), Resume = js.Any.fromFunction0(Resume), Retries = Retries.asInstanceOf[js.Any], ScheduleType = ScheduleType.asInstanceOf[js.Any], ScheduledTime = ScheduledTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SubmissionId = SubmissionId.asInstanceOf[js.Any], SubmissionTime = SubmissionTime.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutgoingJob_typekey")(FAXCOMEXLibDotFaxOutgoingJob_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutgoingJob]
  }
  
  @scala.inline
  implicit class FaxOutgoingJobOps[Self <: FaxOutgoingJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailableOperations(value: FAX_JOB_OPERATIONS_ENUM): Self = this.set("AvailableOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSID(value: String): Self = this.set("CSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("Cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopyTiff(value: String => Unit): Self = this.set("CopyTiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("CurrentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: Double): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentName(value: String): Self = this.set("DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatus(value: String): Self = this.set("ExtendedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatusCode(value: FAX_JOB_EXTENDED_STATUS_ENUM): Self = this.set("ExtendedStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxOutgoingJob_typekey(value: FaxOutgoingJob): Self = this.set("FAXCOMEXLib.FaxOutgoingJob_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBroadcastReceipts(value: Boolean): Self = this.set("GroupBroadcastReceipts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCoverPage(value: Boolean): Self = this.set("HasCoverPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalScheduledTime(value: VarDate): Self = this.set("OriginalScheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Double): Self = this.set("Pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("Pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPriority(value: FAX_PRIORITY_TYPE_ENUM): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptAddress(value: String): Self = this.set("ReceiptAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptType(value: FAX_RECEIPT_TYPE_ENUM): Self = this.set("ReceiptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: FaxRecipient): Self = this.set("Recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestart(value: () => Unit): Self = this.set("Restart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("Resume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleType(value: FAX_SCHEDULE_TYPE_ENUM): Self = this.set("ScheduleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledTime(value: VarDate): Self = this.set("ScheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: FaxSender): Self = this.set("Sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: FAX_JOB_STATUS_ENUM): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmissionId(value: String): Self = this.set("SubmissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmissionTime(value: VarDate): Self = this.set("SubmissionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSID(value: String): Self = this.set("TSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmissionEnd(value: VarDate): Self = this.set("TransmissionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmissionStart(value: VarDate): Self = this.set("TransmissionStart", value.asInstanceOf[js.Any])
  }
}
