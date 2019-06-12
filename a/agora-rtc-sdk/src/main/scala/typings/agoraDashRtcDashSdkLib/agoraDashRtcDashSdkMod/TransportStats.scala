package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

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
    agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.bluetooth | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.cellular | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.ethernet | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.none | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.wifi | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.wimax | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.other | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.unknown | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.UNSUPPORTED
  ] = js.undefined
  /** The estimated available bandwidth for sending the stream, in Kbps. */
  val OutgoingAvailableBandwidth: js.UndefOr[java.lang.String] = js.undefined
  /** RTT (Round-Trip Time) between the SDK and the access node of the SD-RTN, in ms. */
  val RTT: js.UndefOr[java.lang.String] = js.undefined
}

object TransportStats {
  @scala.inline
  def apply(
    NetworkType: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.bluetooth | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.cellular | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.ethernet | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.none | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.wifi | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.wimax | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.other | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.unknown | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.UNSUPPORTED = null,
    OutgoingAvailableBandwidth: java.lang.String = null,
    RTT: java.lang.String = null
  ): TransportStats = {
    val __obj = js.Dynamic.literal()
    if (NetworkType != null) __obj.updateDynamic("NetworkType")(NetworkType.asInstanceOf[js.Any])
    if (OutgoingAvailableBandwidth != null) __obj.updateDynamic("OutgoingAvailableBandwidth")(OutgoingAvailableBandwidth)
    if (RTT != null) __obj.updateDynamic("RTT")(RTT)
    __obj.asInstanceOf[TransportStats]
  }
}

