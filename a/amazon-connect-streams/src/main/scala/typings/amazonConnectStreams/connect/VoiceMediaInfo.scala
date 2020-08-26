package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceMediaInfo extends js.Object {
  val autoAccept: Boolean = js.native
  val callConfigJson: String = js.native
  val callContextToken: String = js.native
  val callType: SoftphoneCallType = js.native
  val mediaLegContextToken: String = js.native
}

object VoiceMediaInfo {
  @scala.inline
  def apply(
    autoAccept: Boolean,
    callConfigJson: String,
    callContextToken: String,
    callType: SoftphoneCallType,
    mediaLegContextToken: String
  ): VoiceMediaInfo = {
    val __obj = js.Dynamic.literal(autoAccept = autoAccept.asInstanceOf[js.Any], callConfigJson = callConfigJson.asInstanceOf[js.Any], callContextToken = callContextToken.asInstanceOf[js.Any], callType = callType.asInstanceOf[js.Any], mediaLegContextToken = mediaLegContextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceMediaInfo]
  }
  @scala.inline
  implicit class VoiceMediaInfoOps[Self <: VoiceMediaInfo] (val x: Self) extends AnyVal {
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
    def setAutoAccept(value: Boolean): Self = this.set("autoAccept", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallConfigJson(value: String): Self = this.set("callConfigJson", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallContextToken(value: String): Self = this.set("callContextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallType(value: SoftphoneCallType): Self = this.set("callType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaLegContextToken(value: String): Self = this.set("mediaLegContextToken", value.asInstanceOf[js.Any])
  }
  
}

