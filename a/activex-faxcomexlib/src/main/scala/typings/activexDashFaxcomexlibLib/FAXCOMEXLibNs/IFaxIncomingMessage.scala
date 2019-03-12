package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxIncomingMessage interface */
@JSGlobal("FAXCOMEXLib.IFaxIncomingMessage")
@js.native
class IFaxIncomingMessage () extends js.Object {
  /** Called Station ID */
  val CSID: java.lang.String = js.native
  /** Caller ID */
  val CallerId: java.lang.String = js.native
  /** Name of the device that received the message */
  val DeviceName: java.lang.String = js.native
  /** Unique message ID */
  val Id: java.lang.String = js.native
  /** Total number of pages */
  val Pages: scala.Double = js.native
  /** Number of failed routing retries */
  val Retries: scala.Double = js.native
  /** Routing information */
  val RoutingInformation: java.lang.String = js.native
  /** Size in bytes of the message's TIFF file */
  val Size: scala.Double = js.native
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

