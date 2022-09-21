package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configurations of the media stream relay.
  *
  * **Since**
  * <br>&emsp;&emsp;&emsp;*3.0.0*
  *
  * Use this interface to set the media stream relay when calling {@link startChannelMediaRelay} or {@link updateChannelMediaRelay}.
  */
trait ChannelMediaRelayConfiguration extends StObject {
  
  /**
    * Removes the destination channel.
    *
    * @param channelName The name of the destination channel.
    * @example **Sample code**
    * ``` javascript
    * configuration.removeDestChannelInfo("cname")
    * ```
    */
  def removeDestChannelInfo(channelName: String): Unit
  
  /**
    * Sets the information of the destination channel.
    *
    * To relay a media stream across multiple channels, call this method as many times (to a maximum of four).
    *
    * @param channelName The name of the destination channel. Ensure that the value of this parameter is the same as the value of `channelName` in `destInfo`.
    * @param destInfo The information of the destination channel:
    *
    * - `channelName`: String, the channel name.
    * - `uid`: Number, the unique ID to identify the relay stream in the destination channel. A 32-bit unsigned integer with a value ranging from 0 to (2<sup>32</sup>-1). If you set it as `0`, the server assigns a random one. To avoid UID conflicts, this uid must be different from any other UIDs in the destination channel.
    * - `token`: String, the token generated with the above `channelName` and `uid`. Do not set this parameter if you have not enabled token.
    *
    * @example **Sample code**
    * ``` javascript
    * var configuration = new AgoraRTC.ChannelMediaRelayConfiguration();
    * configuration.setDestChannelInfo("cname", {
    *  channelName: "destChannel",
    *  uid: 123,
    *  token: "yourDestToken",
    * });
    * ```
    */
  def setDestChannelInfo(channelName: String, destInfo: Any): Unit
  
  /**
    * Sets the information of the source channel.
    *
    * @param srcInfo The information of the source channel:
    *
    * - `channelName`: String, the channel name.
    * - `uid`: Number, the unique ID to identify the relay stream in the source channel. A 32-bit unsigned integer with a value ranging from 0 to (2<sup>32</sup>-1). If you set it as `0`, the server assigns a random one. To avoid UID conflicts, this value must be different from the UID of the current host.
    * - `token`: String, the token generated with the above `channelName` and `uid`. Do not set this parameter if you have not enabled token.
    *
    * @example **Sample code**
    * ``` javascript
    * var configuration = new AgoraRTC.ChannelMediaRelayConfiguration();
    * configuration.setSrcChannelInfo({
    *  channelName: "srcChannel",
    *  uid: 123,
    *  token: "yourSrcToken",
    * });
    * ```
    */
  def setSrcChannelInfo(srcInfo: Any): Unit
}
object ChannelMediaRelayConfiguration {
  
  inline def apply(
    removeDestChannelInfo: String => Unit,
    setDestChannelInfo: (String, Any) => Unit,
    setSrcChannelInfo: Any => Unit
  ): ChannelMediaRelayConfiguration = {
    val __obj = js.Dynamic.literal(removeDestChannelInfo = js.Any.fromFunction1(removeDestChannelInfo), setDestChannelInfo = js.Any.fromFunction2(setDestChannelInfo), setSrcChannelInfo = js.Any.fromFunction1(setSrcChannelInfo))
    __obj.asInstanceOf[ChannelMediaRelayConfiguration]
  }
  
  extension [Self <: ChannelMediaRelayConfiguration](x: Self) {
    
    inline def setRemoveDestChannelInfo(value: String => Unit): Self = StObject.set(x, "removeDestChannelInfo", js.Any.fromFunction1(value))
    
    inline def setSetDestChannelInfo(value: (String, Any) => Unit): Self = StObject.set(x, "setDestChannelInfo", js.Any.fromFunction2(value))
    
    inline def setSetSrcChannelInfo(value: Any => Unit): Self = StObject.set(x, "setSrcChannelInfo", js.Any.fromFunction1(value))
  }
}
