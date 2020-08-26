package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxOutgoingMessage interface */
@js.native
trait IFaxOutgoingMessage extends js.Object {
  /** Called Station ID */
  val CSID: String = js.native
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
  /** Copy Tiff image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit = js.native
  /** Delete the message from the archive */
  def Delete(): Unit = js.native
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
  implicit class IFaxOutgoingMessageOps[Self <: IFaxOutgoingMessage] (val x: Self) extends AnyVal {
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
    def setCSID(value: String): Self = this.set("CSID", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyTiff(value: String => Unit): Self = this.set("CopyTiff", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDeviceName(value: String): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentName(value: String): Self = this.set("DocumentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalScheduledTime(value: VarDate): Self = this.set("OriginalScheduledTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPages(value: Double): Self = this.set("Pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: FAX_PRIORITY_TYPE_ENUM): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: FaxRecipient): Self = this.set("Recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetries(value: Double): Self = this.set("Retries", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: FaxSender): Self = this.set("Sender", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
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

