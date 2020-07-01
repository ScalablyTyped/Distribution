package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceMediaInfo extends js.Object {
  val autoAccept: Boolean
  val callConfigJson: String
  val callContextToken: String
  val callType: SoftphoneCallType
  val mediaLegContextToken: String
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
}

