package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IFaxOutgoingMessage interface */
@js.native
trait IFaxOutgoingMessage extends StObject {
  
  /** Called Station ID */
  val CSID: String = js.native
  
  /** Copy Tiff image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit = js.native
  
  /** Delete the message from the archive */
  def Delete(): Unit = js.native
  
  /** Name of the device transmitting the message */
  val DeviceName: String = js.native
  
  /** Document's friendly name */
  val DocumentName: String = js.native
  
  /** Unique message ID */
  val Id: String = js.native
  
  /** Time the job was originally scheduled to be transmitted */
  val OriginalScheduledTime: VarDate = js.native
  
  /** Total number of pages */
  val Pages: Double = js.native
  
  /** Priority of the fax */
  val Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  
  /** Recipient information object */
  val Recipient: FaxRecipient = js.native
  
  /** Number of failed routing retries */
  val Retries: Double = js.native
  
  /** Sender information object */
  val Sender: FaxSender = js.native
  
  /** Size in bytes of TIFF file */
  val Size: Double = js.native
  
  /** Cover page's subject field */
  val Subject: String = js.native
  
  /** Unique ID the submission process created for the job */
  val SubmissionId: String = js.native
  
  /** Time the job was submitted */
  val SubmissionTime: VarDate = js.native
  
  /** Transmitting Station ID */
  val TSID: String = js.native
  
  /** Transmission end time */
  val TransmissionEnd: VarDate = js.native
  
  /** Transmission start time */
  val TransmissionStart: VarDate = js.native
}
object IFaxOutgoingMessage {
  
  @scala.inline
  def apply(
    CSID: String,
    CopyTiff: String => Unit,
    Delete: () => Unit,
    DeviceName: String,
    DocumentName: String,
    Id: String,
    OriginalScheduledTime: VarDate,
    Pages: Double,
    Priority: FAX_PRIORITY_TYPE_ENUM,
    Recipient: FaxRecipient,
    Retries: Double,
    Sender: FaxSender,
    Size: Double,
    Subject: String,
    SubmissionId: String,
    SubmissionTime: VarDate,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): IFaxOutgoingMessage = {
    val __obj = js.Dynamic.literal(CSID = CSID.asInstanceOf[js.Any], CopyTiff = js.Any.fromFunction1(CopyTiff), Delete = js.Any.fromFunction0(Delete), DeviceName = DeviceName.asInstanceOf[js.Any], DocumentName = DocumentName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OriginalScheduledTime = OriginalScheduledTime.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Retries = Retries.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SubmissionId = SubmissionId.asInstanceOf[js.Any], SubmissionTime = SubmissionTime.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFaxOutgoingMessage]
  }
  
  @scala.inline
  implicit class IFaxOutgoingMessageMutableBuilder[Self <: IFaxOutgoingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCSID(value: String): Self = StObject.set(x, "CSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTiff(value: String => Unit): Self = StObject.set(x, "CopyTiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentName(value: String): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalScheduledTime(value: VarDate): Self = StObject.set(x, "OriginalScheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Double): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: FAX_PRIORITY_TYPE_ENUM): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: FaxRecipient): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: FaxSender): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmissionId(value: String): Self = StObject.set(x, "SubmissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmissionTime(value: VarDate): Self = StObject.set(x, "SubmissionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSID(value: String): Self = StObject.set(x, "TSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmissionEnd(value: VarDate): Self = StObject.set(x, "TransmissionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmissionStart(value: VarDate): Self = StObject.set(x, "TransmissionStart", value.asInstanceOf[js.Any])
  }
}
