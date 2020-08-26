package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxJobStatus
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PJobStatus extends js.Object {
  val bstrJobId: String = js.native
  val pFaxServer: FaxServer = js.native
  val pJobStatus: FaxJobStatus = js.native
}

object PJobStatus {
  @scala.inline
  def apply(bstrJobId: String, pFaxServer: FaxServer, pJobStatus: FaxJobStatus): PJobStatus = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any], pJobStatus = pJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PJobStatus]
  }
  @scala.inline
  implicit class PJobStatusOps[Self <: PJobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBstrJobId(value: String): Self = this.set("bstrJobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = this.set("pFaxServer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPJobStatus(value: FaxJobStatus): Self = this.set("pJobStatus", value.asInstanceOf[js.Any])
  }
  
}

