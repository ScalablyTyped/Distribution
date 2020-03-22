package typings.agoraRtcSdk

import typings.agoraRtcSdk.agoraRtcSdkStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var reason: js.Any
  var `type`: error
}

object AnonType {
  @scala.inline
  def apply(reason: js.Any, `type`: error): AnonType = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

