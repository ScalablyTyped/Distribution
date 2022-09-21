package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkStrings.h264_
import typings.agoraRtcSdk.agoraRtcSdkStrings.live
import typings.agoraRtcSdk.agoraRtcSdkStrings.rtc
import typings.agoraRtcSdk.agoraRtcSdkStrings.vp8_
import typings.agoraRtcSdk.agoraRtcSdkStrings.vp9_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait ClientConfig extends StObject {
  
  /**
    * The region for connection.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.1.2*
    *
    * This advanced feature applies to scenarios that have regional restrictions.
    *
    * By default, the SDK connects to nearby Agora servers. After specifying the region, the SDK connects to the Agora servers within that region. For details, see {@link AREAS}.
    *
    * **Note:**
    *
    * - The regional restriction is a global configuration and applies to the entire browser tab. If one Client specifies the connection region, all the other Clients created on the same tab follow the restriction.
    * - The SDK supports specifying only one region.
    *
    * **Sample code**
    * ```js
    * var config = {
    *     mode: "live",
    *     codec: "vp8",
    *     // Specify the region as North America.
    *     areaCode: [AgoraRTC.AREAS.NORTH_AMERICA]
    * };
    * var client = AgoraRTC.createClient(config);
    * ```
    */
  var areaCode: js.UndefOr[js.Array[AREAS]] = js.undefined
  
  /**
    * The codec the Web browser uses for encoding.
    * - `"vp8"`: Sets the browser to use VP8 for encoding.
    * - `"vp9"`: Sets the browser to use VP9 for encoding.
    * - `"h264"`: Sets the browser to use H.264 for encoding.
    *
    * **Note**
    *
    * - Safari 12.1 or earlier does not support the VP8 codec.
    * - Codec support on mobile devices is a bit complex, see [Use Agora Web SDK on Mobile Devices](https://docs.agora.io/en/faq/web_on_mobile) for details.
    */
  var codec: vp8_ | vp9_ | h264_
  
  var excludedArea: js.UndefOr[AREAS] = js.undefined
  
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
  var mode: live | rtc
  
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
  var proxyServer: js.UndefOr[String] = js.undefined
  
  /**
    * TURN server configurations.
    *
    * An array of the {@link TurnServer} objects. You can pass configurations of multiple TURN servers to this property.
    *
    * You can also use cloud proxy by {@link startProxyServer}. See [Use Cloud Proxy](https://docs.agora.io/en/Agora%20Platform/cloud_proxy_web?platform=Web) for details.
    */
  var turnServer: js.UndefOr[js.Array[TurnServer]] = js.undefined
}
object ClientConfig {
  
  inline def apply(codec: vp8_ | vp9_ | h264_, mode: live | rtc): ClientConfig = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
  
  extension [Self <: ClientConfig](x: Self) {
    
    inline def setAreaCode(value: js.Array[AREAS]): Self = StObject.set(x, "areaCode", value.asInstanceOf[js.Any])
    
    inline def setAreaCodeUndefined: Self = StObject.set(x, "areaCode", js.undefined)
    
    inline def setAreaCodeVarargs(value: AREAS*): Self = StObject.set(x, "areaCode", js.Array(value*))
    
    inline def setCodec(value: vp8_ | vp9_ | h264_): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setExcludedArea(value: AREAS): Self = StObject.set(x, "excludedArea", value.asInstanceOf[js.Any])
    
    inline def setExcludedAreaUndefined: Self = StObject.set(x, "excludedArea", js.undefined)
    
    inline def setMode(value: live | rtc): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setProxyServer(value: String): Self = StObject.set(x, "proxyServer", value.asInstanceOf[js.Any])
    
    inline def setProxyServerUndefined: Self = StObject.set(x, "proxyServer", js.undefined)
    
    inline def setTurnServer(value: js.Array[TurnServer]): Self = StObject.set(x, "turnServer", value.asInstanceOf[js.Any])
    
    inline def setTurnServerUndefined: Self = StObject.set(x, "turnServer", js.undefined)
    
    inline def setTurnServerVarargs(value: TurnServer*): Self = StObject.set(x, "turnServer", js.Array(value*))
  }
}
