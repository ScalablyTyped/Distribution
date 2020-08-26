package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkStrings.UNSUPPORTED
import typings.agoraRtcSdk.agoraRtcSdkStrings.bluetooth
import typings.agoraRtcSdk.agoraRtcSdkStrings.cellular
import typings.agoraRtcSdk.agoraRtcSdkStrings.ethernet
import typings.agoraRtcSdk.agoraRtcSdkStrings.none
import typings.agoraRtcSdk.agoraRtcSdkStrings.other
import typings.agoraRtcSdk.agoraRtcSdkStrings.unknown
import typings.agoraRtcSdk.agoraRtcSdkStrings.wifi
import typings.agoraRtcSdk.agoraRtcSdkStrings.wimax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**  Statistics of the system network. */
@js.native
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
  var NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED = js.native
}

object NetworkStats {
  @scala.inline
  def apply(NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): NetworkStats = {
    val __obj = js.Dynamic.literal(NetworkType = NetworkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkStats]
  }
  @scala.inline
  implicit class NetworkStatsOps[Self <: NetworkStats] (val x: Self) extends AnyVal {
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
    def setNetworkType(value: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): Self = this.set("NetworkType", value.asInstanceOf[js.Any])
  }
  
}

