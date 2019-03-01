package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends js.Object {
  var codec: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.vp8 | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.h264
  var mode: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.live | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.rtc
  var proxyServer: js.UndefOr[java.lang.String] = js.undefined
  var turnServer: js.UndefOr[agoraDashRtcDashSdkLib.Anon_Forceturn] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    codec: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.vp8 | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.h264,
    mode: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.live | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.rtc,
    proxyServer: java.lang.String = null,
    turnServer: agoraDashRtcDashSdkLib.Anon_Forceturn = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (proxyServer != null) __obj.updateDynamic("proxyServer")(proxyServer)
    if (turnServer != null) __obj.updateDynamic("turnServer")(turnServer)
    __obj.asInstanceOf[ClientConfig]
  }
}

