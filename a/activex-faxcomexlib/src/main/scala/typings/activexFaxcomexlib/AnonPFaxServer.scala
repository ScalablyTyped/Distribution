package typings.activexFaxcomexlib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPFaxServer extends js.Object {
  val pFaxServer: FaxServer
}

object AnonPFaxServer {
  @scala.inline
  def apply(pFaxServer: FaxServer): AnonPFaxServer = {
    val __obj = js.Dynamic.literal(pFaxServer = pFaxServer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPFaxServer]
  }
}

