package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxJobStatus
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PJobStatus extends js.Object {
  val bstrJobId: String
  val pFaxServer: FaxServer
  val pJobStatus: FaxJobStatus
}

object PJobStatus {
  @scala.inline
  def apply(bstrJobId: String, pFaxServer: FaxServer, pJobStatus: FaxJobStatus): PJobStatus = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any], pJobStatus = pJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PJobStatus]
  }
}

