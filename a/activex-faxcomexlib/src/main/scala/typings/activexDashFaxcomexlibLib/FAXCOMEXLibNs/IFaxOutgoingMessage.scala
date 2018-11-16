package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxOutgoingMessage interface */
@JSGlobal("FAXCOMEXLib.IFaxOutgoingMessage")
@js.native
class IFaxOutgoingMessage () extends js.Object {
  /** Called Station ID */
  val CSID: java.lang.String = js.native
  /** Name of the device transmitting the message */
  val DeviceName: java.lang.String = js.native
  /** Document's friendly name */
  val DocumentName: java.lang.String = js.native
  /** Unique message ID */
  val Id: java.lang.String = js.native
  /** Time the job was originally scheduled to be transmitted */
  val OriginalScheduledTime: stdLib.VarDate = js.native
  /** Total number of pages */
  val Pages: scala.Double = js.native
  /** Priority of the fax */
  val Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  /** Recipient information object */
  val Recipient: FaxRecipient = js.native
  /** Number of failed routing retries */
  val Retries: scala.Double = js.native
  /** Sender information object */
  val Sender: FaxSender = js.native
  /** Size in bytes of TIFF file */
  val Size: scala.Double = js.native
  /** Cover page's subject field */
  val Subject: java.lang.String = js.native
  /** Unique ID the submission process created for the job */
  val SubmissionId: java.lang.String = js.native
  /** Time the job was submitted */
  val SubmissionTime: stdLib.VarDate = js.native
  /** Transmitting Station ID */
  val TSID: java.lang.String = js.native
  /** Transmission end time */
  val TransmissionEnd: stdLib.VarDate = js.native
  /** Transmission start time */
  val TransmissionStart: stdLib.VarDate = js.native
  /** Copy Tiff image to the local file */
  def CopyTiff(bstrTiffPath: java.lang.String): scala.Unit = js.native
  /** Delete the message from the archive */
  def Delete(): scala.Unit = js.native
}

