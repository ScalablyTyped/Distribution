package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkStrings.h264_
import typings.agoraRtcSdk.agoraRtcSdkStrings.live
import typings.agoraRtcSdk.agoraRtcSdkStrings.rtc
import typings.agoraRtcSdk.agoraRtcSdkStrings.vp8_
import typings.agoraRtcSdk.anon.Forceturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class defining the properties of the `config` parameter in the {@link createClient} method.
  *
  * **Note**
  *
  * Ensure that you set {@link mode} and {@link codec}.
  * @example
  * **Sample code**
  * ``` javascript
  * var config = {
  *      mode: "live",
  *      codec: "vp8",
  *      proxyServer: "YOUR HTTP PROXY SERVER IP",
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
@js.native
trait ClientConfig extends StObject {
  
  /**
    * The codec the Web browser uses for encoding.
    * - `"vp8"`: Sets the browser to use VP8 for encoding.
    * - `"h264"`: Sets the browser to use H.264 for encoding.
    *
    * **Note**
    *
    * - Safari 12.1 or earlier does not support the VP8 codec.
    * - Codec support on mobile devices is a bit complex, see [Use Agora Web SDK on Mobile Devices](https://docs.agora.io/en/faq/web_on_mobile) for details.
    */
  var codec: vp8_ | h264_ = js.native
  
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
    * **Note**
    *
    * If you need to communicate with Agora Native SDK, Agora recommends the following settings:
    * - For Native SDK v2.3.2 and later:
    *  * Set {@link mode} as `"rtc"` or `"live"` if the Native SDK uses the communication channel profile.
    *  * Set {@link mode} as `"live"` if the Native SDK uses the live broadcast channel profile.
    * - For Native SDK before v2.3.2, set mode as "live" regardless of which channel profile the Native SDK uses.
    *
    * **Note**
    *
    * The `"rtc"` mode supports the Agora Recording SDK 2.3.3 or later.
    */
  var mode: live | rtc = js.native
  
  /**
    * Your HTTP proxy server domain name.
    *
    * You can also use cloud proxy by {@link startProxyServer}. See [Use Cloud Proxy](https://docs.agora.io/en/Agora%20Platform/cloud_proxy_web?platform=Web) for details.
    *
    * ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * **Note**
    * - We support https/SSL proxy server via port 443.
    * - Ensure that the proxy server supports wss (WebSocket Secure).
    * - For the required firewall ports, see [Firewall Requirements](https://docs.agora.io/en/Agora%20Platform/firewall?platform=All%20Platforms#web-sdk-1).
    */
  var proxyServer: js.UndefOr[String] = js.native
  
  /**
    * TURN server configurations.
    *
    * An array of the `turnServer` objects. You can pass configurations of multiple TURN servers to this property.
    *
    * You can also use cloud proxy by {@link startProxyServer}. See [Use Cloud Proxy](https://docs.agora.io/en/Agora%20Platform/cloud_proxy_web?platform=Web) for details.
    */
  var turnServer: js.UndefOr[js.Array[Forceturn]] = js.native
}
object ClientConfig {
  
  @scala.inline
  def apply(codec: vp8_ | h264_, mode: live | rtc): ClientConfig = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
  
  @scala.inline
  implicit class ClientConfigMutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodec(value: vp8_ | h264_): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: live | rtc): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyServer(value: String): Self = StObject.set(x, "proxyServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyServerUndefined: Self = StObject.set(x, "proxyServer", js.undefined)
    
    @scala.inline
    def setTurnServer(value: js.Array[Forceturn]): Self = StObject.set(x, "turnServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTurnServerUndefined: Self = StObject.set(x, "turnServer", js.undefined)
    
    @scala.inline
    def setTurnServerVarargs(value: Forceturn*): Self = StObject.set(x, "turnServer", js.Array(value :_*))
  }
}
