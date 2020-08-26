package typings.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaxServerOnDeviceStatusChangeParameter extends js.Object {
  val bPoweredOff: Boolean = js.native
  val bReceiving: Boolean = js.native
  val bRinging: Boolean = js.native
  val bSending: Boolean = js.native
  val lDeviceId: Double = js.native
  val pFaxServer: FaxServer = js.native
}

object FaxServerOnDeviceStatusChangeParameter {
  @scala.inline
  def apply(
    bPoweredOff: Boolean,
    bReceiving: Boolean,
    bRinging: Boolean,
    bSending: Boolean,
    lDeviceId: Double,
    pFaxServer: FaxServer
  ): FaxServerOnDeviceStatusChangeParameter = {
    val __obj = js.Dynamic.literal(bPoweredOff = bPoweredOff.asInstanceOf[js.Any], bReceiving = bReceiving.asInstanceOf[js.Any], bRinging = bRinging.asInstanceOf[js.Any], bSending = bSending.asInstanceOf[js.Any], lDeviceId = lDeviceId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxServerOnDeviceStatusChangeParameter]
  }
  @scala.inline
  implicit class FaxServerOnDeviceStatusChangeParameterOps[Self <: FaxServerOnDeviceStatusChangeParameter] (val x: Self) extends AnyVal {
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
    def setBPoweredOff(value: Boolean): Self = this.set("bPoweredOff", value.asInstanceOf[js.Any])
    @scala.inline
    def setBReceiving(value: Boolean): Self = this.set("bReceiving", value.asInstanceOf[js.Any])
    @scala.inline
    def setBRinging(value: Boolean): Self = this.set("bRinging", value.asInstanceOf[js.Any])
    @scala.inline
    def setBSending(value: Boolean): Self = this.set("bSending", value.asInstanceOf[js.Any])
    @scala.inline
    def setLDeviceId(value: Double): Self = this.set("lDeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = this.set("pFaxServer", value.asInstanceOf[js.Any])
  }
  
}

