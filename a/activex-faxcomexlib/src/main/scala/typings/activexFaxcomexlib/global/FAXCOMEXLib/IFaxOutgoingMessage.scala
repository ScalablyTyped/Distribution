package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_PRIORITY_TYPE_ENUM
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxOutgoingMessage interface */
@JSGlobal("FAXCOMEXLib.IFaxOutgoingMessage")
@js.native
class IFaxOutgoingMessage ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingMessage {
  /** Called Station ID */
  /* CompleteClass */
  override val CSID: String = js.native
  /** Name of the device transmitting the message */
  /* CompleteClass */
  override val DeviceName: String = js.native
  /** Document's friendly name */
  /* CompleteClass */
  override val DocumentName: String = js.native
  /** Unique message ID */
  /* CompleteClass */
  override val Id: String = js.native
  /** Time the job was originally scheduled to be transmitted */
  /* CompleteClass */
  override val OriginalScheduledTime: VarDate = js.native
  /** Total number of pages */
  /* CompleteClass */
  override val Pages: Double = js.native
  /** Priority of the fax */
  /* CompleteClass */
  override val Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  /** Recipient information object */
  /* CompleteClass */
  override val Recipient: typings.activexFaxcomexlib.FAXCOMEXLib.FaxRecipient = js.native
  /** Number of failed routing retries */
  /* CompleteClass */
  override val Retries: Double = js.native
  /** Sender information object */
  /* CompleteClass */
  override val Sender: typings.activexFaxcomexlib.FAXCOMEXLib.FaxSender = js.native
  /** Size in bytes of TIFF file */
  /* CompleteClass */
  override val Size: Double = js.native
  /** Cover page's subject field */
  /* CompleteClass */
  override val Subject: String = js.native
  /** Unique ID the submission process created for the job */
  /* CompleteClass */
  override val SubmissionId: String = js.native
  /** Time the job was submitted */
  /* CompleteClass */
  override val SubmissionTime: VarDate = js.native
  /** Transmitting Station ID */
  /* CompleteClass */
  override val TSID: String = js.native
  /** Transmission end time */
  /* CompleteClass */
  override val TransmissionEnd: VarDate = js.native
  /** Transmission start time */
  /* CompleteClass */
  override val TransmissionStart: VarDate = js.native
  /** Copy Tiff image to the local file */
  /* CompleteClass */
  override def CopyTiff(bstrTiffPath: String): Unit = js.native
  /** Delete the message from the archive */
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

