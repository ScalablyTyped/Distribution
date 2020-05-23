package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxIncomingMessage interface */
trait IFaxIncomingMessage extends js.Object {
  /** Called Station ID */
  val CSID: String
  /** Caller ID */
  val CallerId: String
  /** Name of the device that received the message */
  val DeviceName: String
  /** Unique message ID */
  val Id: String
  /** Total number of pages */
  val Pages: Double
  /** Number of failed routing retries */
  val Retries: Double
  /** Routing information */
  val RoutingInformation: String
  /** Size in bytes of the message's TIFF file */
  val Size: Double
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

object IFaxIncomingMessage {
  @scala.inline
  def apply(
    CSID: String,
    CallerId: String,
    CopyTiff: String => Unit,
    Delete: () => Unit,
    DeviceName: String,
    Id: String,
    Pages: Double,
    Retries: Double,
    RoutingInformation: String,
    Size: Double,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): IFaxIncomingMessage = {
    val __obj = js.Dynamic.literal(CSID = CSID.asInstanceOf[js.Any], CallerId = CallerId.asInstanceOf[js.Any], CopyTiff = js.Any.fromFunction1(CopyTiff), Delete = js.Any.fromFunction0(Delete), DeviceName = DeviceName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Retries = Retries.asInstanceOf[js.Any], RoutingInformation = RoutingInformation.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFaxIncomingMessage]
  }
}

