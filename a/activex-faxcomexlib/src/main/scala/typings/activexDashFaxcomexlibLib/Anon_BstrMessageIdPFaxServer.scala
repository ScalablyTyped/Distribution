package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrMessageIdPFaxServer extends js.Object {
  val bstrMessageId: java.lang.String
  val pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
}

object Anon_BstrMessageIdPFaxServer {
  @scala.inline
  def apply(bstrMessageId: java.lang.String, pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer): Anon_BstrMessageIdPFaxServer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bstrMessageId")(bstrMessageId)
    __obj.updateDynamic("pFaxServer")(pFaxServer)
    __obj.asInstanceOf[Anon_BstrMessageIdPFaxServer]
  }
}

