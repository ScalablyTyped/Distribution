package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLibNs.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrJobIdPFaxServer extends js.Object {
  val bstrJobId: String
  val pFaxServer: FaxServer
}

object Anon_BstrJobIdPFaxServer {
  @scala.inline
  def apply(bstrJobId: String, pFaxServer: FaxServer): Anon_BstrJobIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId, pFaxServer = pFaxServer)
  
    __obj.asInstanceOf[Anon_BstrJobIdPFaxServer]
  }
}

