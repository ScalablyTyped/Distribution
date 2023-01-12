package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IFaxOutgoingMessage interface */
trait IFaxOutgoingMessage extends StObject {
  
  /** Called Station ID */
  val CSID: String
  
  /** Copy Tiff image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit
  
  /** Delete the message from the archive */
  def Delete(): Unit
  
  /** Name of the device transmitting the message */
  val DeviceName: String
  
  /** Document's friendly name */
  val DocumentName: String
  
  /** Unique message ID */
  val Id: String
  
  /** Time the job was originally scheduled to be transmitted */
  val OriginalScheduledTime: VarDate
  
  /** Total number of pages */
  val Pages: Double
  
  /** Priority of the fax */
  val Priority: FAX_PRIORITY_TYPE_ENUM
  
  /** Recipient information object */
  val Recipient: FaxRecipient
  
  /** Number of failed routing retries */
  val Retries: Double
  
  /** Sender information object */
  val Sender: FaxSender
  
  /** Size in bytes of TIFF file */
  val Size: Double
  
  /** Cover page's subject field */
  val Subject: String
  
  /** Unique ID the submission process created for the job */
  val SubmissionId: String
  
  /** Time the job was submitted */
  val SubmissionTime: VarDate
  
  /** Transmitting Station ID */
  val TSID: String
  
  /** Transmission end time */
  val TransmissionEnd: VarDate
  
  /** Transmission start time */
  val TransmissionStart: VarDate
}
object IFaxOutgoingMessage {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IFaxOutgoingMessage] (val x: Self) extends AnyVal {
    
    inline def setCSID(value: String): Self = StObject.set(x, "CSID", value.asInstanceOf[js.Any])
    
    inline def setCopyTiff(value: String => Unit): Self = StObject.set(x, "CopyTiff", js.Any.fromFunction1(value))
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDocumentName(value: String): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setOriginalScheduledTime(value: VarDate): Self = StObject.set(x, "OriginalScheduledTime", value.asInstanceOf[js.Any])
    
    inline def setPages(value: Double): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: FAX_PRIORITY_TYPE_ENUM): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: FaxRecipient): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
    
    inline def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    inline def setSender(value: FaxSender): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubmissionId(value: String): Self = StObject.set(x, "SubmissionId", value.asInstanceOf[js.Any])
    
    inline def setSubmissionTime(value: VarDate): Self = StObject.set(x, "SubmissionTime", value.asInstanceOf[js.Any])
    
    inline def setTSID(value: String): Self = StObject.set(x, "TSID", value.asInstanceOf[js.Any])
    
    inline def setTransmissionEnd(value: VarDate): Self = StObject.set(x, "TransmissionEnd", value.asInstanceOf[js.Any])
    
    inline def setTransmissionStart(value: VarDate): Self = StObject.set(x, "TransmissionStart", value.asInstanceOf[js.Any])
  }
}
