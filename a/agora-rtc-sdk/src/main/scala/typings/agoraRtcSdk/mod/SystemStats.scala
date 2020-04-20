package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System statistics.
  *
  * If {@link getSystemStats} is called successfully, this interface provides the system statistics.
  */
trait SystemStats extends js.Object {
  /** Battery level of the system (%). */
  var BatteryLevel: string
}

object SystemStats {
  @scala.inline
  def apply(BatteryLevel: string): SystemStats = {
    val __obj = js.Dynamic.literal(BatteryLevel = BatteryLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemStats]
  }
}

