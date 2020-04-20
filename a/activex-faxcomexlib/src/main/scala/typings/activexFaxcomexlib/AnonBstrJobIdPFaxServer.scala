package typings.activexFaxcomexlib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBstrJobIdPFaxServer extends js.Object {
  val bstrJobId: String
  val pFaxServer: FaxServer
}

object AnonBstrJobIdPFaxServer {
  @scala.inline
  def apply(bstrJobId: String, pFaxServer: FaxServer): AnonBstrJobIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBstrJobIdPFaxServer]
  }
}

