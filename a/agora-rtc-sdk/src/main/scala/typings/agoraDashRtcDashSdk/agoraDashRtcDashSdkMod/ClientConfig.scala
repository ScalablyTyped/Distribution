package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import typings.agoraDashRtcDashSdk.Anon_Forceturn
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.h264_
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.live
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.rtc
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.vp8_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class defining the properties of the `config` parameter in the {@link createClient} method.
  *
  * **Note:**
  *
  * - Ensure that you do not leave {@link mode} and {@link codec} as empty.
  * - Ensure that you set these properties before calling {@link Client.join}.
  *
  * [[include:ClientConfig-example.md]]
  * @example
  * **Sample Code**
  * ``` javascript
  * var config = {
  *      mode: "live",
  *      codec: "vp8",
  *      proxyServer: "YOUR NGINX PROXY SERVER IP",
  *      turnServer: {
  *          turnServerURL: "YOUR TURNSERVER URL",
  *          username: "YOUR USERNAME",
  *          password: "YOUR PASSWORD",
  *          udpport: "THE UDP PORT YOU WANT TO ADD",
  *          tcpport: "THE TCP PORT YOU WANT TO ADD",
  *          forceturn: false
  *      }
  * }
  * var client = AgoraRTC.createClient(config);```
  */
trait ClientConfig extends js.Object {
  /**
    * The codec the Web browser uses for encoding and decoding.
    * - `"vp8"`: Sets the browser to use VP8 for encoding and decoding.
    * - `"h264"`: Sets the browser to use H264 for encoding and decoding.
    *
    * **Note:**
    *
    * Set {@link codec} as `"h264"` as long as Safari is involved in the session.
    */
  var codec: vp8_ | h264_
  /**
    * The channel profile.
    *
    * Agora Web SDK needs to know the application scenario to apply different optimization methods.
    *
    * Currently Agora Web SDK supports the following channel profiles:
    * - `"live"`: Sets the channel profile as live broadcast. Host and audience roles that can be set by calling the [[Client.setClientRole]] method.
    * The host sends and receives voice/video, while the audience can only receive voice/video.
    * - `"rtc"`: Sets the channel profile as communication. This is used in one-on-one calls or group calls, where all users in the channel can talk freely.
    *
    * **Note:**
    *
    * If you need to communicate with Agora Native SDK, Agora recommends the following settings:
    * - For Native SDK v2.3.2 and later:
    *  * Set {@link mode} as `"rtc"` or `"live"` if the Native SDK uses the communication channel profile.
    *  * Set {@link mode} as `"live"` if the Native SDK uses the live broadcast channel profile.
    * - For Native SDK before v2.3.2, set  mode as "live" regardless of which channel profile the Native SDK uses.
    *
    * **Note:**
    *
    * If you set {@link mode} as `"rtc"`, the Agora Recording SDK is not supported.
    */
  var mode: live | rtc
  /**
    * Your Nginx server domain name.
    *
    * ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Enterprise users with a company firewall can use this property to pass signaling messages to the Agora SD-RTN through the Nginx Server.
    */
  var proxyServer: js.UndefOr[String] = js.undefined
  /**
    * TURN server settings.
    *
    * Enterprise users with a company firewall can use this property to pass audio and video data to the Agora SD-RTN through the TURN Server.
    */
  var turnServer: js.UndefOr[Anon_Forceturn] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    codec: vp8_ | h264_,
    mode: live | rtc,
    proxyServer: String = null,
    turnServer: Anon_Forceturn = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    if (proxyServer != null) __obj.updateDynamic("proxyServer")(proxyServer.asInstanceOf[js.Any])
    if (turnServer != null) __obj.updateDynamic("turnServer")(turnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}

