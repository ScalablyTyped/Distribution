package typings.activexDashFaxcomexlib.FAXCOMEXLibNs

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxIncomingMessage interface */
@JSGlobal("FAXCOMEXLib.IFaxIncomingMessage")
@js.native
class IFaxIncomingMessage () extends js.Object {
  /** Called Station ID */
  val CSID: String = js.native
  /** Caller ID */
  val CallerId: String = js.native
  /** Name of the device that received the message */
  val DeviceName: String = js.native
  /** Unique message ID */
  val Id: String = js.native
  /** Total number of pages */
  val Pages: Double = js.native
  /** Number of failed routing retries */
  val Retries: Double = js.native
  /** Routing information */
  val RoutingInformation: String = js.native
  /** Size in bytes of the message's TIFF file */
  val Size: Double = js.native
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

