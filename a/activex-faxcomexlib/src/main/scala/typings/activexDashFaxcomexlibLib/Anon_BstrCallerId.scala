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
    val __obj = js.Dynamic.literal(bstrCallerId = bstrCallerId, lCallId = lCallId, lDeviceId = lDeviceId, pFaxServer = pFaxServer)
  
    __obj.asInstanceOf[Anon_BstrCallerId]
  }
}

