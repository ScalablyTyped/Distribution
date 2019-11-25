package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrMessageIdPFaxServer extends js.Object {
  val bstrMessageId: String
  val pFaxServer: FaxServer
}

object Anon_BstrMessageIdPFaxServer {
  @scala.inline
  def apply(bstrMessageId: String, pFaxServer: FaxServer): Anon_BstrMessageIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BstrMessageIdPFaxServer]
  }
}

