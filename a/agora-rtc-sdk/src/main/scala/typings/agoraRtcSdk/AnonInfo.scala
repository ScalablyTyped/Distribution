package typings.agoraRtcSdk

import typings.agoraRtcSdk.agoraRtcSdkStrings.error
import typings.agoraRtcSdk.agoraRtcSdkStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfo extends js.Object {
  var info: js.UndefOr[String] = js.undefined
  var msg: String
  var `type`: warning | error
}

object AnonInfo {
  @scala.inline
  def apply(msg: String, `type`: warning | error, info: String = null): AnonInfo = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInfo]
  }
}

