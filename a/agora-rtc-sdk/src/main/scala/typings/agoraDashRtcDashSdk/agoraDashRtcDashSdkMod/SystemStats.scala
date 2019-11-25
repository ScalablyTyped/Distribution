package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** System statistics. */
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

