package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxDocument Class */
trait FaxDocument extends StObject {
  
  /** Whether to attach a fax to the receipt */
  var AttachFaxToReceipt: Boolean
  
  /** Full paths to the fax document body files */
  var Bodies: js.Any
  
  /** Full path to the fax document body file */
  var Body: String
  
  /** Call handle */
  var CallHandle: Double
  
  /** Submit the fax document on the already connected server */
  def ConnectedSubmit(pFaxServer: IFaxServer): SafeArray[String]
  
  /** Submit the fax document on the already connected server */
  def ConnectedSubmit2(pFaxServer: IFaxServer, pvFaxOutgoingJobIDs: SafeArray[String]): Double
  
  /** Cover page file path */
  var CoverPage: String
  
  /** Is server, local, or no cover page used */
  var CoverPageType: FAX_COVERPAGE_TYPE_ENUM
  
  /** The document name */
  var DocumentName: String
  
  /* private */ @JSName("FAXCOMEXLib.FaxDocument_typekey")
  var FAXCOMEXLibDotFaxDocument_typekey: FaxDocument
  
  /** Whether to group the broadcast receipts */
  var GroupBroadcastReceipts: Boolean
  
  /** Contents of cover page note field */
  var Note: String
  
  /** Priority of the fax */
  var Priority: FAX_PRIORITY_TYPE_ENUM
  
  /** Address of the receipt */
  var ReceiptAddress: String
  
  /** Type of the receipt */
  var ReceiptType: FAX_RECEIPT_TYPE_ENUM
  
  /** Collection of recipients */
  def Recipients(lIndex: Double): FaxRecipient
  /** Collection of recipients */
  @JSName("Recipients")
  val Recipients_Original: FaxRecipients
  
  /** Time to send the fax */
  var ScheduleTime: VarDate
  
  /** When to send the fax */
  var ScheduleType: FAX_SCHEDULE_TYPE_ENUM
  
  /** Sender information object */
  val Sender: FaxSender
  
  /** Contents of cover page subject field */
  var Subject: String
  
  /** Submission Id for the Fax document */
  val SubmissionId: String
  
  /** Connect to server, submit the fax document, disconnect */
  def Submit(bstrFaxServerName: String): SafeArray[Double]
  
  /** Connect to server, submit the fax document, disconnect */
  def Submit2(bstrFaxServerName: String, pvFaxOutgoingJobIDs: js.Any): Double
  
  /** Tapi connection */
  var TapiConnection: js.Any
}
object FaxDocument {
  
  inline def apply(
    AttachFaxToReceipt: Boolean,
    Bodies: js.Any,
    Body: String,
    CallHandle: Double,
    ConnectedSubmit: IFaxServer => SafeArray[String],
    ConnectedSubmit2: (IFaxServer, SafeArray[String]) => Double,
    CoverPage: String,
    CoverPageType: FAX_COVERPAGE_TYPE_ENUM,
    DocumentName: String,
    FAXCOMEXLibDotFaxDocument_typekey: FaxDocument,
    GroupBroadcastReceipts: Boolean,
    Note: String,
    Priority: FAX_PRIORITY_TYPE_ENUM,
    ReceiptAddress: String,
    ReceiptType: FAX_RECEIPT_TYPE_ENUM,
    Recipients: FaxRecipients,
    ScheduleTime: VarDate,
    ScheduleType: FAX_SCHEDULE_TYPE_ENUM,
    Sender: FaxSender,
    Subject: String,
    SubmissionId: String,
    Submit: String => SafeArray[Double],
    Submit2: (String, js.Any) => Double,
    TapiConnection: js.Any
  ): FaxDocument = {
    val __obj = js.Dynamic.literal(AttachFaxToReceipt = AttachFaxToReceipt.asInstanceOf[js.Any], Bodies = Bodies.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], CallHandle = CallHandle.asInstanceOf[js.Any], ConnectedSubmit = js.Any.fromFunction1(ConnectedSubmit), ConnectedSubmit2 = js.Any.fromFunction2(ConnectedSubmit2), CoverPage = CoverPage.asInstanceOf[js.Any], CoverPageType = CoverPageType.asInstanceOf[js.Any], DocumentName = DocumentName.asInstanceOf[js.Any], GroupBroadcastReceipts = GroupBroadcastReceipts.asInstanceOf[js.Any], Note = Note.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], ReceiptAddress = ReceiptAddress.asInstanceOf[js.Any], ReceiptType = ReceiptType.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], ScheduleTime = ScheduleTime.asInstanceOf[js.Any], ScheduleType = ScheduleType.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SubmissionId = SubmissionId.asInstanceOf[js.Any], Submit = js.Any.fromFunction1(Submit), Submit2 = js.Any.fromFunction2(Submit2), TapiConnection = TapiConnection.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxDocument_typekey")(FAXCOMEXLibDotFaxDocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxDocument]
  }
  
  extension [Self <: FaxDocument](x: Self) {
    
    inline def setAttachFaxToReceipt(value: Boolean): Self = StObject.set(x, "AttachFaxToReceipt", value.asInstanceOf[js.Any])
    
    inline def setBodies(value: js.Any): Self = StObject.set(x, "Bodies", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setCallHandle(value: Double): Self = StObject.set(x, "CallHandle", value.asInstanceOf[js.Any])
    
    inline def setConnectedSubmit(value: IFaxServer => SafeArray[String]): Self = StObject.set(x, "ConnectedSubmit", js.Any.fromFunction1(value))
    
    inline def setConnectedSubmit2(value: (IFaxServer, SafeArray[String]) => Double): Self = StObject.set(x, "ConnectedSubmit2", js.Any.fromFunction2(value))
    
    inline def setCoverPage(value: String): Self = StObject.set(x, "CoverPage", value.asInstanceOf[js.Any])
    
    inline def setCoverPageType(value: FAX_COVERPAGE_TYPE_ENUM): Self = StObject.set(x, "CoverPageType", value.asInstanceOf[js.Any])
    
    inline def setDocumentName(value: String): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxDocument_typekey(value: FaxDocument): Self = StObject.set(x, "FAXCOMEXLib.FaxDocument_typekey", value.asInstanceOf[js.Any])
    
    inline def setGroupBroadcastReceipts(value: Boolean): Self = StObject.set(x, "GroupBroadcastReceipts", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "Note", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: FAX_PRIORITY_TYPE_ENUM): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setReceiptAddress(value: String): Self = StObject.set(x, "ReceiptAddress", value.asInstanceOf[js.Any])
    
    inline def setReceiptType(value: FAX_RECEIPT_TYPE_ENUM): Self = StObject.set(x, "ReceiptType", value.asInstanceOf[js.Any])
    
    inline def setRecipients(value: FaxRecipients): Self = StObject.set(x, "Recipients", value.asInstanceOf[js.Any])
    
    inline def setScheduleTime(value: VarDate): Self = StObject.set(x, "ScheduleTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleType(value: FAX_SCHEDULE_TYPE_ENUM): Self = StObject.set(x, "ScheduleType", value.asInstanceOf[js.Any])
    
    inline def setSender(value: FaxSender): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubmissionId(value: String): Self = StObject.set(x, "SubmissionId", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: String => SafeArray[Double]): Self = StObject.set(x, "Submit", js.Any.fromFunction1(value))
    
    inline def setSubmit2(value: (String, js.Any) => Double): Self = StObject.set(x, "Submit2", js.Any.fromFunction2(value))
    
    inline def setTapiConnection(value: js.Any): Self = StObject.set(x, "TapiConnection", value.asInstanceOf[js.Any])
  }
}
