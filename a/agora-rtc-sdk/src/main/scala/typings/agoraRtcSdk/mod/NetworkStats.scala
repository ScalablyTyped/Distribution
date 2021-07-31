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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**  Statistics of the system network. */
trait NetworkStats extends StObject {
  
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
  
  @scala.inline
  implicit class NetworkStatsMutableBuilder[Self <: NetworkStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkType(value: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
  }
}
