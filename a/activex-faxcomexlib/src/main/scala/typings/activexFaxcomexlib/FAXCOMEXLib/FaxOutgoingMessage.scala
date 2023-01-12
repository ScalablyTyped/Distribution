package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingMessage Class */
trait FaxOutgoingMessage
  extends StObject
     with IFaxOutgoingMessage {
  
  /* private */ @JSName("FAXCOMEXLib.FaxOutgoingMessage_typekey")
  var FAXCOMEXLibDotFaxOutgoingMessage_typekey: FaxOutgoingMessage
  
  /** Has Cover page */
  val HasCoverPage: Boolean
  
  /** Read flag on the message */
  var Read: Boolean
  
  /** Address of the receipt */
  val ReceiptAddress: String
  
  /** Type of the receipt */
  val ReceiptType: FAX_RECEIPT_TYPE_ENUM
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Save the object */
  def Save(): Unit
}
object FaxOutgoingMessage {
  
  inline def apply(
    CSID: String,
    CopyTiff: String => Unit,
    Delete: () => Unit,
    DeviceName: String,
    DocumentName: String,
    FAXCOMEXLibDotFaxOutgoingMessage_typekey: FaxOutgoingMessage,
    HasCoverPage: Boolean,
    Id: String,
    OriginalScheduledTime: VarDate,
    Pages: Double,
    Priority: FAX_PRIORITY_TYPE_ENUM,
    Read: Boolean,
    ReceiptAddress: String,
    ReceiptType: FAX_RECEIPT_TYPE_ENUM,
    Recipient: FaxRecipient,
    Refresh: () => Unit,
    Retries: Double,
    Save: () => Unit,
    Sender: FaxSender,
    Size: Double,
    Subject: String,
    SubmissionId: String,
    SubmissionTime: VarDate,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): FaxOutgoingMessage = {
    val __obj = js.Dynamic.literal(CSID = CSID.asInstanceOf[js.Any], CopyTiff = js.Any.fromFunction1(CopyTiff), Delete = js.Any.fromFunction0(Delete), DeviceName = DeviceName.asInstanceOf[js.Any], DocumentName = DocumentName.asInstanceOf[js.Any], HasCoverPage = HasCoverPage.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OriginalScheduledTime = OriginalScheduledTime.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Read = Read.asInstanceOf[js.Any], ReceiptAddress = ReceiptAddress.asInstanceOf[js.Any], ReceiptType = ReceiptType.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Retries = Retries.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), Sender = Sender.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SubmissionId = SubmissionId.asInstanceOf[js.Any], SubmissionTime = SubmissionTime.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutgoingMessage_typekey")(FAXCOMEXLibDotFaxOutgoingMessage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutgoingMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaxOutgoingMessage] (val x: Self) extends AnyVal {
    
    inline def setFAXCOMEXLibDotFaxOutgoingMessage_typekey(value: FaxOutgoingMessage): Self = StObject.set(x, "FAXCOMEXLib.FaxOutgoingMessage_typekey", value.asInstanceOf[js.Any])
    
    inline def setHasCoverPage(value: Boolean): Self = StObject.set(x, "HasCoverPage", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "Read", value.asInstanceOf[js.Any])
    
    inline def setReceiptAddress(value: String): Self = StObject.set(x, "ReceiptAddress", value.asInstanceOf[js.Any])
    
    inline def setReceiptType(value: FAX_RECEIPT_TYPE_ENUM): Self = StObject.set(x, "ReceiptType", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
  }
}
