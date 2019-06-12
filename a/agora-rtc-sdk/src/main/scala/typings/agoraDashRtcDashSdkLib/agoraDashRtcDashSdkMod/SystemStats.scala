package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** System statistics. */
trait SystemStats extends js.Object {
  /** Battery level of the system (%). */
  var BatteryLevel: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.string
}

object SystemStats {
  @scala.inline
  def apply(BatteryLevel: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.string): SystemStats = {
    val __obj = js.Dynamic.literal(BatteryLevel = BatteryLevel)
  
    __obj.asInstanceOf[SystemStats]
  }
}

