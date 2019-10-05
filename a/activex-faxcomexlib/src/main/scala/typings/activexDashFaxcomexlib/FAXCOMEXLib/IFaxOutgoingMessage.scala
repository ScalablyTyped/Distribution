package typings.activexDashFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxOutgoingMessage interface */
@JSGlobal("FAXCOMEXLib.IFaxOutgoingMessage")
@js.native
class IFaxOutgoingMessage () extends js.Object {
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

