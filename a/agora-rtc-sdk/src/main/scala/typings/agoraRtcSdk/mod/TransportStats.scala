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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics of the network connection.
  *
  * If {@link getTransportStats} is called successfully, this interface provides the statistics.
  */
@js.native
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
    * **Note**
    *
    * Chrome 61 or later is required for this function, and the compatibility is not guaranteed.
    * See [Network Information API](https://developer.mozilla.org/en-US/docs/Web/API/Network_Information_API) for details.
    */
  val NetworkType: js.UndefOr[
    bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED
  ] = js.native
  
  /** The estimated available bandwidth for sending the stream, in Kbps. */
  val OutgoingAvailableBandwidth: js.UndefOr[String] = js.native
  
  /** RTT (Round-Trip Time) between the SDK and the access node of the SD-RTN, in ms. */
  val RTT: js.UndefOr[String] = js.native
}
object TransportStats {
  
  @scala.inline
  def apply(): TransportStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportStats]
  }
  
  @scala.inline
  implicit class TransportStatsOps[Self <: TransportStats] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteNetworkType: Self = this.set("NetworkType", js.undefined)
    
    @scala.inline
    def setOutgoingAvailableBandwidth(value: String): Self = this.set("OutgoingAvailableBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingAvailableBandwidth: Self = this.set("OutgoingAvailableBandwidth", js.undefined)
    
    @scala.inline
    def setRTT(value: String): Self = this.set("RTT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRTT: Self = this.set("RTT", js.undefined)
  }
}
