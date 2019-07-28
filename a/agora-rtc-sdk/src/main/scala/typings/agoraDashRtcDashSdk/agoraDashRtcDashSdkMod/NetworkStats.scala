package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.UNSUPPORTED
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.bluetooth
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.cellular
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.ethernet
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.none
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.other
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.unknown
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.wifi
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.wimax
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
  var NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED
}

object NetworkStats {
  @scala.inline
  def apply(NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): NetworkStats = {
    val __obj = js.Dynamic.literal(NetworkType = NetworkType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkStats]
  }
}

