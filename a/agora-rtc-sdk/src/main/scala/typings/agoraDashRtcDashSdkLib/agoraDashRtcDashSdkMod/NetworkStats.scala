package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**  Statistics of the system network. */
trait NetworkStats extends js.Object {
  /**
    * Network type.
    *
    * - "bluetooth": Bluetooth network.
    * - "cellular": Cellular network.
    * - "ethernet": Ethernet.
    * - "none": No network.
    * - "wifi": Wi-Fi.
    * - "wimax": WiMax.
    * - "other": Other network type.
    * - "unknown": Unknown network type.
    * - "UNSUPPORTED": The browser does not support getting the network type.
    */
  var NetworkType: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.bluetooth | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.cellular | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.ethernet | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.none | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.wifi | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.wimax | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.other | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.unknown | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.UNSUPPORTED
}

object NetworkStats {
  @scala.inline
  def apply(
    NetworkType: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.bluetooth | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.cellular | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.ethernet | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.none | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.wifi | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.wimax | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.other | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.unknown | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.UNSUPPORTED
  ): NetworkStats = {
    val __obj = js.Dynamic.literal(NetworkType = NetworkType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkStats]
  }
}

