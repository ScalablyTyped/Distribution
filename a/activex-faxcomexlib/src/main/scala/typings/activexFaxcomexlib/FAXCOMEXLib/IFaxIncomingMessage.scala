package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxIncomingMessage interface */
@js.native
trait IFaxIncomingMessage extends js.Object {
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
  @scala.inline
  implicit class IFaxIncomingMessageOps[Self <: IFaxIncomingMessage] (val x: Self) extends AnyVal {
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
    def setCallerId(value: String): Self = this.set("CallerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyTiff(value: String => Unit): Self = this.set("CopyTiff", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDeviceName(value: String): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPages(value: Double): Self = this.set("Pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetries(value: Double): Self = this.set("Retries", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutingInformation(value: String): Self = this.set("RoutingInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTSID(value: String): Self = this.set("TSID", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransmissionEnd(value: VarDate): Self = this.set("TransmissionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransmissionStart(value: VarDate): Self = this.set("TransmissionStart", value.asInstanceOf[js.Any])
  }
  
}

