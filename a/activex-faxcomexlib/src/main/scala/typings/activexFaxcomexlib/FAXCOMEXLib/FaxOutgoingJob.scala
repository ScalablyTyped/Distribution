package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingJob Class */
trait FaxOutgoingJob extends StObject {
  
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM
  
  /** Called Station ID */
  val CSID: String
  
  /** Cancel the outbound job */
  def Cancel(): Unit
  
  /** Copy the job's TIFF image */
  def CopyTiff(bstrTiffPath: String): Unit
  
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
  
  /* private */ @JSName("FAXCOMEXLib.FaxOutgoingJob_typekey")
  var FAXCOMEXLibDotFaxOutgoingJob_typekey: FaxOutgoingJob
  
  /** Whether to group broadcast receipts */
  val GroupBroadcastReceipts: Boolean
  
  /** Has Cover page */
  val HasCoverPage: Boolean
  
  /** Unique job ID */
  val Id: String
  
  /** Time the job was originally scheduled to be transmitted */
  val OriginalScheduledTime: VarDate
  
  /** Total number of pages */
  val Pages: Double
  
  /** Pause the outbound job */
  def Pause(): Unit
  
  /** Priority of the fax */
  val Priority: FAX_PRIORITY_TYPE_ENUM
  
  /** Address of the receipt */
  val ReceiptAddress: String
  
  /** Type of receipt */
  val ReceiptType: FAX_RECEIPT_TYPE_ENUM
  
  /** Recipient information object */
  val Recipient: FaxRecipient
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Restart the outbound job */
  def Restart(): Unit
  
  /** Resume the outbound job */
  def Resume(): Unit
  
  /** Number of failed transmission retries */
  val Retries: Double
  
  /** When to send the fax */
  val ScheduleType: FAX_SCHEDULE_TYPE_ENUM
  
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
}
object FaxOutgoingJob {
  
  inline def apply(
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
  
  extension [Self <: FaxOutgoingJob](x: Self) {
    
    inline def setAvailableOperations(value: FAX_JOB_OPERATIONS_ENUM): Self = StObject.set(x, "AvailableOperations", value.asInstanceOf[js.Any])
    
    inline def setCSID(value: String): Self = StObject.set(x, "CSID", value.asInstanceOf[js.Any])
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "Cancel", js.Any.fromFunction0(value))
    
    inline def setCopyTiff(value: String => Unit): Self = StObject.set(x, "CopyTiff", js.Any.fromFunction1(value))
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "CurrentPage", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: Double): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDocumentName(value: String): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setExtendedStatus(value: String): Self = StObject.set(x, "ExtendedStatus", value.asInstanceOf[js.Any])
    
    inline def setExtendedStatusCode(value: FAX_JOB_EXTENDED_STATUS_ENUM): Self = StObject.set(x, "ExtendedStatusCode", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxOutgoingJob_typekey(value: FaxOutgoingJob): Self = StObject.set(x, "FAXCOMEXLib.FaxOutgoingJob_typekey", value.asInstanceOf[js.Any])
    
    inline def setGroupBroadcastReceipts(value: Boolean): Self = StObject.set(x, "GroupBroadcastReceipts", value.asInstanceOf[js.Any])
    
    inline def setHasCoverPage(value: Boolean): Self = StObject.set(x, "HasCoverPage", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setOriginalScheduledTime(value: VarDate): Self = StObject.set(x, "OriginalScheduledTime", value.asInstanceOf[js.Any])
    
    inline def setPages(value: Double): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "Pause", js.Any.fromFunction0(value))
    
    inline def setPriority(value: FAX_PRIORITY_TYPE_ENUM): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setReceiptAddress(value: String): Self = StObject.set(x, "ReceiptAddress", value.asInstanceOf[js.Any])
    
    inline def setReceiptType(value: FAX_RECEIPT_TYPE_ENUM): Self = StObject.set(x, "ReceiptType", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: FaxRecipient): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    inline def setRestart(value: () => Unit): Self = StObject.set(x, "Restart", js.Any.fromFunction0(value))
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "Resume", js.Any.fromFunction0(value))
    
    inline def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    inline def setScheduleType(value: FAX_SCHEDULE_TYPE_ENUM): Self = StObject.set(x, "ScheduleType", value.asInstanceOf[js.Any])
    
    inline def setScheduledTime(value: VarDate): Self = StObject.set(x, "ScheduledTime", value.asInstanceOf[js.Any])
    
    inline def setSender(value: FaxSender): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: FAX_JOB_STATUS_ENUM): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubmissionId(value: String): Self = StObject.set(x, "SubmissionId", value.asInstanceOf[js.Any])
    
    inline def setSubmissionTime(value: VarDate): Self = StObject.set(x, "SubmissionTime", value.asInstanceOf[js.Any])
    
    inline def setTSID(value: String): Self = StObject.set(x, "TSID", value.asInstanceOf[js.Any])
    
    inline def setTransmissionEnd(value: VarDate): Self = StObject.set(x, "TransmissionEnd", value.asInstanceOf[js.Any])
    
    inline def setTransmissionStart(value: VarDate): Self = StObject.set(x, "TransmissionStart", value.asInstanceOf[js.Any])
  }
}
