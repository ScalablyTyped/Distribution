package typings.activexFaxcomexlib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBstrMessageIdPFaxServer extends js.Object {
  val bstrMessageId: String
  val pFaxServer: FaxServer
}

object AnonBstrMessageIdPFaxServer {
  @scala.inline
  def apply(bstrMessageId: String, pFaxServer: FaxServer): AnonBstrMessageIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBstrMessageIdPFaxServer]
  }
}

