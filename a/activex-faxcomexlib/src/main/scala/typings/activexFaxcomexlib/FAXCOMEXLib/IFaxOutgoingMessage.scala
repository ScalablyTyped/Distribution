package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxOutgoingMessage interface */
trait IFaxOutgoingMessage extends js.Object {
  /** Called Station ID */
  val CSID: String
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
  /** Copy Tiff image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit
  /** Delete the message from the archive */
  def Delete(): Unit
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
}

