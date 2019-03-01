package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrCallerId extends js.Object {
  val bstrCallerId: java.lang.String
  val lCallId: scala.Double
  val lDeviceId: scala.Double
  val pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
}

object Anon_BstrCallerId {
  @scala.inline
  def apply(
    bstrCallerId: java.lang.String,
    lCallId: scala.Double,
    lDeviceId: scala.Double,
    pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
  ): Anon_BstrCallerId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bstrCallerId")(bstrCallerId)
    __obj.updateDynamic("lCallId")(lCallId)
    __obj.updateDynamic("lDeviceId")(lDeviceId)
    __obj.updateDynamic("pFaxServer")(pFaxServer)
    __obj.asInstanceOf[Anon_BstrCallerId]
  }
}

