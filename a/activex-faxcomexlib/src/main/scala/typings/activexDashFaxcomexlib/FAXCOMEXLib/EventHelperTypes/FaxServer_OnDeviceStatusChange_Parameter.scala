package typings.activexDashFaxcomexlib.FAXCOMEXLib.EventHelperTypes

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaxServer_OnDeviceStatusChange_Parameter extends js.Object {
  val bPoweredOff: Boolean
  val bReceiving: Boolean
  val bRinging: Boolean
  val bSending: Boolean
  val lDeviceId: Double
  val pFaxServer: FaxServer
}

object FaxServer_OnDeviceStatusChange_Parameter {
  @scala.inline
  def apply(
    bPoweredOff: Boolean,
    bReceiving: Boolean,
    bRinging: Boolean,
    bSending: Boolean,
    lDeviceId: Double,
    pFaxServer: FaxServer
  ): FaxServer_OnDeviceStatusChange_Parameter = {
    val __obj = js.Dynamic.literal(bPoweredOff = bPoweredOff.asInstanceOf[js.Any], bReceiving = bReceiving.asInstanceOf[js.Any], bRinging = bRinging.asInstanceOf[js.Any], bSending = bSending.asInstanceOf[js.Any], lDeviceId = lDeviceId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FaxServer_OnDeviceStatusChange_Parameter]
  }
}

