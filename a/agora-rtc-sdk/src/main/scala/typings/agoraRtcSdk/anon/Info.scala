package typings.agoraRtcSdk.anon

import typings.agoraRtcSdk.agoraRtcSdkStrings.error
import typings.agoraRtcSdk.agoraRtcSdkStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Info extends js.Object {
  var info: js.UndefOr[String] = js.native
  var msg: String = js.native
  var `type`: warning | error = js.native
}

object Info {
  @scala.inline
  def apply(msg: String, `type`: warning | error): Info = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
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
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: warning | error): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
  }
  
}

