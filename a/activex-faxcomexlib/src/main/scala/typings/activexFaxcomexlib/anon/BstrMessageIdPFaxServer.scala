package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BstrMessageIdPFaxServer extends js.Object {
  val bstrMessageId: String
  val pFaxServer: FaxServer
}

object BstrMessageIdPFaxServer {
  @scala.inline
  def apply(bstrMessageId: String, pFaxServer: FaxServer): BstrMessageIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrMessageIdPFaxServer]
  }
}

