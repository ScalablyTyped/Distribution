package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCode extends js.Object {
  var Cancel: Boolean = js.native
  val StatusCode: js.Any = js.native
  val TargetFrameName: String | Null = js.native
  val URL: String = js.native
  val pDisp: js.Any = js.native
}

object StatusCode {
  @scala.inline
  def apply(Cancel: Boolean, StatusCode: js.Any, URL: String, pDisp: js.Any): StatusCode = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCode]
  }
  @scala.inline
  implicit class StatusCodeOps[Self <: StatusCode] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: js.Any): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPDisp(value: js.Any): Self = this.set("pDisp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetFrameName(value: String): Self = this.set("TargetFrameName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetFrameNameNull: Self = this.set("TargetFrameName", null)
  }
  
}

