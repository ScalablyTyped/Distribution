package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BstrCallerId extends js.Object {
  val bstrCallerId: String = js.native
  val lCallId: Double = js.native
  val lDeviceId: Double = js.native
  val pFaxServer: FaxServer = js.native
}

object BstrCallerId {
  @scala.inline
  def apply(bstrCallerId: String, lCallId: Double, lDeviceId: Double, pFaxServer: FaxServer): BstrCallerId = {
    val __obj = js.Dynamic.literal(bstrCallerId = bstrCallerId.asInstanceOf[js.Any], lCallId = lCallId.asInstanceOf[js.Any], lDeviceId = lDeviceId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrCallerId]
  }
  @scala.inline
  implicit class BstrCallerIdOps[Self <: BstrCallerId] (val x: Self) extends AnyVal {
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
    def setBstrCallerId(value: String): Self = this.set("bstrCallerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLCallId(value: Double): Self = this.set("lCallId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLDeviceId(value: Double): Self = this.set("lDeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = this.set("pFaxServer", value.asInstanceOf[js.Any])
  }
  
}

