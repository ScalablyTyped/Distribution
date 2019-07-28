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

/** Statistics of the network connection. */
trait TransportStats extends js.Object {
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
    *
    * **Note:**
    *
    * Chrome 61+ is required for this function, and the compatibility is not guaranteed.
    * See [Network Information API](https://developer.mozilla.org/en-US/docs/Web/API/Network_Information_API) for details.
    */
  val NetworkType: js.UndefOr[
    bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED
  ] = js.undefined
  /** The estimated available bandwidth for sending the stream, in Kbps. */
  val OutgoingAvailableBandwidth: js.UndefOr[String] = js.undefined
  /** RTT (Round-Trip Time) between the SDK and the access node of the SD-RTN, in ms. */
  val RTT: js.UndefOr[String] = js.undefined
}

object TransportStats {
  @scala.inline
  def apply(
    NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED = null,
    OutgoingAvailableBandwidth: String = null,
    RTT: String = null
  ): TransportStats = {
    val __obj = js.Dynamic.literal()
    if (NetworkType != null) __obj.updateDynamic("NetworkType")(NetworkType.asInstanceOf[js.Any])
    if (OutgoingAvailableBandwidth != null) __obj.updateDynamic("OutgoingAvailableBandwidth")(OutgoingAvailableBandwidth)
    if (RTT != null) __obj.updateDynamic("RTT")(RTT)
    __obj.asInstanceOf[TransportStats]
  }
}

