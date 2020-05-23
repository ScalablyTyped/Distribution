package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BstrJobIdPFaxServer extends js.Object {
  val bstrJobId: String
  val pFaxServer: FaxServer
}

object BstrJobIdPFaxServer {
  @scala.inline
  def apply(bstrJobId: String, pFaxServer: FaxServer): BstrJobIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrJobIdPFaxServer]
  }
}

