package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaxServer_OnDeviceStatusChange_Parameter extends js.Object {
  val bPoweredOff: scala.Boolean
  val bReceiving: scala.Boolean
  val bRinging: scala.Boolean
  val bSending: scala.Boolean
  val lDeviceId: scala.Double
  val pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
}

object FaxServer_OnDeviceStatusChange_Parameter {
  @scala.inline
  def apply(
    bPoweredOff: scala.Boolean,
    bReceiving: scala.Boolean,
    bRinging: scala.Boolean,
    bSending: scala.Boolean,
    lDeviceId: scala.Double,
    pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
  ): FaxServer_OnDeviceStatusChange_Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bPoweredOff")(bPoweredOff)
    __obj.updateDynamic("bReceiving")(bReceiving)
    __obj.updateDynamic("bRinging")(bRinging)
    __obj.updateDynamic("bSending")(bSending)
    __obj.updateDynamic("lDeviceId")(lDeviceId)
    __obj.updateDynamic("pFaxServer")(pFaxServer)
    __obj.asInstanceOf[FaxServer_OnDeviceStatusChange_Parameter]
  }
}

