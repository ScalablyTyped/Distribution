package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkNumbers.`1`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`2`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`active-speaker`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`aes-128-ecb`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`aes-128-xts`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`aes-256-xts`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`camera-changed`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`channel-media-relay-event`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`channel-media-relay-state`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`client-banned`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`client-role-changed`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`connection-state-change`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`crypt-error`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`disable-local-video`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`enable-local-video`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`first-audio-frame-decode`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`first-video-frame-decode`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`mute-audio`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`mute-video`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`network-quality`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`network-type-changed`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`peer-leave`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`peer-online`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`playout-device-changed`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`receive-metadata`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`recording-device-changed`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`stream-added`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`stream-fallback`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`stream-published`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`stream-reconnect-end`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`stream-reconnect-start`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`stream-removed`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`stream-subscribed`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`stream-type-changed`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`stream-unpublished`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`stream-updated`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`unmute-audio`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`unmute-video`
import typings.agoraRtcSdk.agoraRtcSdkStrings.`volume-indicator`
import typings.agoraRtcSdk.agoraRtcSdkStrings.audience
import typings.agoraRtcSdk.agoraRtcSdkStrings.connected
import typings.agoraRtcSdk.agoraRtcSdkStrings.error
import typings.agoraRtcSdk.agoraRtcSdkStrings.exception
import typings.agoraRtcSdk.agoraRtcSdkStrings.host
import typings.agoraRtcSdk.agoraRtcSdkStrings.liveStreamingFailed
import typings.agoraRtcSdk.agoraRtcSdkStrings.liveStreamingStarted
import typings.agoraRtcSdk.agoraRtcSdkStrings.liveStreamingStopped
import typings.agoraRtcSdk.agoraRtcSdkStrings.liveTranscodingUpdated
import typings.agoraRtcSdk.agoraRtcSdkStrings.onTokenPrivilegeDidExpire
import typings.agoraRtcSdk.agoraRtcSdkStrings.onTokenPrivilegeWillExpire
import typings.agoraRtcSdk.agoraRtcSdkStrings.reconnect
import typings.agoraRtcSdk.agoraRtcSdkStrings.streamInjectedStatus
import typings.agoraRtcSdk.anon.Attr
import typings.agoraRtcSdk.anon.Bitrate
import typings.agoraRtcSdk.anon.Code
import typings.agoraRtcSdk.anon.CodeNumber
import typings.agoraRtcSdk.anon.CurState
import typings.agoraRtcSdk.anon.Forceturn
import typings.agoraRtcSdk.anon.Reason
import typings.agoraRtcSdk.anon.Role
import typings.agoraRtcSdk.anon.State
import typings.agoraRtcSdk.anon.StreamStream
import typings.agoraRtcSdk.anon.Success
import typings.agoraRtcSdk.anon.Type
import typings.agoraRtcSdk.anon.Uid
import typings.agoraRtcSdk.anon.Video
import typings.agoraRtcSdk.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Client interface provides major functions for a voice/video call, such as joining a channel and publishing a stream.
  *
  * The Client object is created by the {@link createClient} method and represents the local client.
  */
@js.native
trait Client extends StObject {
  
  /**
    * Injects an Online Media Stream to a Live Broadcast
    *
    * If this method is called successfully, the server pulls the voice or video stream and injects it into a live channel. This is applicable to scenarios where all of the audience members in the channel can watch a live show and interact with each other. See [Inject an Online Media Stream](https://docs.agora.io/en/Interactive%20Broadcast/inject_stream_web?platform=Web) for details.
    *
    * This method call triggers the following callbacks:
    * - On the local client:
    *   - `Client.on("streamInjectedStatus")`, with the state of injecting the online stream.
    *   - `Client.on("stream-added")` and `Client.on("peer-online")`(uid: 666), if the online media stream is injected into the channel.
    * - On the remote client:
    *   - `Client.on("stream-added")` and `Client.on("peer-online")`(uid: 666), if the online media stream is injected into the channel.
    *
    * **Note**
    * - You can only inject one online media stream into the same channel at the same time.
    * - Ensure that you [enable the RTMP Converter service](../../../cdn_streaming_web#prerequisites) before using this function.
    * @param url URL address of the live streaming. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    * Valid protocols are RTMP, HLS, and HTTP-FLV.
    * - Supported FLV audio codec type: AAC.
    * - Supported FLV video codec type: H.264 (AVC).
    * @param config Configuration of the inject stream, see {@link InjectStreamConfig} for details.
    */
  def addInjectStreamUrl(url: String, config: InjectStreamConfig): Unit = js.native
  
  /**
    * Configures the CDN Live Streaming
    *
    * **DEPRECATED**
    *
    * Agora recommends using the following methods instead:
    * - [[startLiveStreaming]]
    * - [[setLiveTranscoding]]
    * - [[stopLiveStreaming]]
    *
    * This method configures the CDN live streaming before joining a channel.
    *
    * **Note**
    *
    * Call {@link configPublisher} before {@link Client.join}.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.configPublisher({
    *   width: 360,
    *   height: 640,
    *   framerate: 30,
    *   bitrate: 500,
    *   publishUrl: "rtmp://xxx/xxx/"
    * });
    * ```
    * @param width Width of the output data stream set for CDN Live, 360 is the default value. A positive integer, and the value range is [1,10000].
    * @param height Height of the output data stream set for CDN Live, 640 is the default value. A positive integer, and the value range is [1,10000].
    * @param framerate Frame rate of the output data stream set for CDN Live, 15 fps is the default value. A positive integer, and the value range is [1,10000].
    * @param bitrate Bitrate of the output data stream set for CDN Live, 500 kbps is the default value. A positive integer, and the value range is [1,10000000].
    * @param publisherUrl The push-stream address for the picture-in-picture layouts, `null` is the default value.
    *                     ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    */
  def configPublisher(width: Double, height: Double, framerate: Double, bitrate: Double, publisherUrl: String): Unit = js.native
  
  /**
    * Disables Dual Streams
    *
    * This method disables dual streams.
    * @example **Sample code**
    * ``` javascript
    * client.disableDualStream(function() {
    *   console.log("Disable dual stream success!")
    * }, function(err) {
    *   console.log(err)
    * })
    * ```
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails. The following are common errors:
    * - "STILL_ON_PUBLISHING": Still publishing the stream. Disable dual streams later.
    * - "DISABLE_DUALSTREAM_FAILED": Fails to disable dual streams.
    */
  def disableDualStream(): Unit = js.native
  def disableDualStream(onSuccess: js.Function0[Unit]): Unit = js.native
  def disableDualStream(onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  def disableDualStream(onSuccess: Unit, onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  
  /**
    * Enables Volume Indicator
    *
    * This method enables the SDK to report the active remote users who are speaking and their volume regularly.
    *
    * If this method is enabled, the SDK triggers the `"volume-indicator"` callback to report the volumes every two seconds, regardless of whether there are active speakers.
    *
    * **Note**
    *
    * - If you have multiple web pages running the Web SDK, this function might not work.
    * @example **Sample code**
    * ``` javascript
    * client.enableAudioVolumeIndicator(); // Triggers the "volume-indicator" callback event every two seconds.
    * client.on("volume-indicator", function(evt){
    *     evt.attr.forEach(function(volume, index){
    *             console.log(`${index} UID ${volume.uid} Level ${volume.level}`);
    *     });
    * });
    * ```
    */
  def enableAudioVolumeIndicator(): Unit = js.native
  
  /**
    * Enables Dual Stream
    *
    * This method enables the dual-stream mode on the publisher side. We recommend calling this method after joining a channel({@link Client.join}).
    *
    * Dual streams are a hybrid of a high-quality video stream and a low-quality video stream:
    *
    * - High-quality video stream: High bitrate, high resolution.
    * - Low-quality video stream: Low bitrate, low resolution.
    *
    * We do not recommend using the track methods ([[addTrack]]/[[removeTrack]]/[[replaceTrack]]) on dual streams, which may cause different performance in the high-quality and low-quality video streams.
    *
    * **Note**
    *
    * This method does not apply to the following scenarios:
    *
    * -   The stream is created by defining the [[audioSource]] and [[videoSource]] properties.
    * -   Audio-only mode (audio: true, video: false)
    * -   Safari browser
    * -   Screen-sharing scenario
    * @example **Sample code**
    * ``` javascript
    * client.enableDualStream(function() {
    *   console.log("Enable dual stream success!")
    * }, function(err) {
    *   console.log(err)
    * })
    * ```
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails. The following are common errors:
    * - "IOS_NOT_SUPPORT": Does not support iOS.
    * - "WECHAT_NOT_SUPPORT": Does not support WeChat.
    * - "STILL_ON_PUBLISHING": Still publishing the stream. Enable dual streams later.
    * - "ENABLE_DUALSTREAM_FAILED": Fails to enable dual streams.
    */
  def enableDualStream(): Unit = js.native
  def enableDualStream(onSuccess: js.Function0[Unit]): Unit = js.native
  def enableDualStream(onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  def enableDualStream(onSuccess: Unit, onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  
  /**
    * Enumerates Video Input Devices
    *
    * This method enumerates the available video input devices, such as cameras.
    *
    * If this method succeeds, the SDK returns a list of video input devices in an array of [[MediaDeviceInfo]] objects.
    */
  def getCameras(callback: js.Function1[/* devices */ js.Array[MediaDeviceInfo], Unit]): Unit = js.native
  
  /**
    * Gets the Connection State
    *
    * This method returns the state of the connection between the SDK and Agora's edge server.
    *
    * @returns
    * The connection state:
    *
    * - `DISCONNECTED`: The SDK is disconnected from Agora's edge server.
    *  - This is the initial state before [[Client.join]].
    *  - The SDK also enters this state after the app calls [[Client.leave]].
    * - `CONNECTING`: The SDK is connecting to Agora's edge server.
    * The SDK enters this state when calling [[Client.join]] or reconnecting to Agora's edge server automatically after the connection is lost.
    * - `CONNECTED`: The SDK is connected to Agora's edge server and joins a channel. You can now publish or subscribe to a stream in the channel.
    * - `DISCONNECTING`: The SDK is disconnecting from Agora's edge server. The SDK enters this state when calling [[Client.leave]].
    */
  def getConnectionState(): String = js.native
  
  /**
    * Retrieves the Audio Statistics of the Local Stream
    *
    * This method retrieves the audio statistics of the published stream, including audio codec type, sampling rate, bitrate, and so on.
    *
    * **Note**
    *
    * - Some of the statistics are calculated after the `stream-published` event, which may take at most 3 seconds.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the local audio stream.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.getLocalAudioStats((localAudioStats) => {
    *     for(var uid in localAudioStats){
    *          console.log(`Audio CodecType from ${uid}: ${localAudioStats[uid].CodecType}`);
    *          console.log(`Audio MuteState from ${uid}: ${localAudioStats[uid].MuteState}`);
    *          console.log(`Audio RecordingLevel from ${uid}: ${localAudioStats[uid].RecordingLevel}`);
    *          console.log(`Audio SamplingRate from ${uid}: ${localAudioStats[uid].SamplingRate}`);
    *          console.log(`Audio SendBitrate from ${uid}: ${localAudioStats[uid].SendBitrate}`);
    *          console.log(`Audio SendLevel from ${uid}: ${localAudioStats[uid].SendLevel}`);
    *     }
    * });
    * ```
    */
  def getLocalAudioStats(callback: js.Function1[/* stats */ LocalAudioStatsMap, Unit]): Unit = js.native
  
  /**
    * Retrieves the Video Statistics of the Local Stream
    *
    * This method retrieves the video statistics of the published stream, including video resolution, bitrate, frame rate, and so on.
    *
    * **Note**
    *
    * - Some of the statistics are calculated after the `stream-published` event, which may take at most 3 seconds.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the local video stream.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.getLocalVideoStats((localVideoStats) => {
    *     for(var uid in localVideoStats){
    *          console.log(`Video CaptureFrameRate from ${uid}: ${localVideoStats[uid].CaptureFrameRate}`);
    *          console.log(`Video CaptureResolutionHeight from ${uid}: ${localVideoStats[uid].CaptureResolutionHeight}`);
    *          console.log(`Video CaptureResolutionWidth from ${uid}: ${localVideoStats[uid].CaptureResolutionWidth}`);
    *          console.log(`Video EncodeDelay from ${uid}: ${localVideoStats[uid].EncodeDelay}`);
    *          console.log(`Video MuteState from ${uid}: ${localVideoStats[uid].MuteState}`);
    *          console.log(`Video SendBitrate from ${uid}: ${localVideoStats[uid].SendBitrate}`);
    *          console.log(`Video SendFrameRate from ${uid}: ${localVideoStats[uid].SendFrameRate}`);
    *          console.log(`Video SendResolutionHeight from ${uid}: ${localVideoStats[uid].SendResolutionHeight}`);
    *          console.log(`Video SendResolutionWidth from ${uid}: ${localVideoStats[uid].SendResolutionWidth}`);
    *          console.log(`Video TargetSendBitrate from ${uid}: ${localVideoStats[uid].TargetSendBitrate}`);
    *          console.log(`Video TotalDuration from ${uid}: ${localVideoStats[uid].TotalDuration}`);
    *          console.log(`Video TotalFreezeTime from ${uid}: ${localVideoStats[uid].TotalFreezeTime}`);
    *     }
    * });
    * ```
    */
  def getLocalVideoStats(callback: js.Function1[/* stats */ LocalVideoStatsMap, Unit]): Unit = js.native
  
  /**
    * Gets the Statistics of the System Network
    *
    * **DEPRECATED** from v2.5.1, use [[getTransportStats]] instead.
    *
    * This method gets the statistics of the browser's local network.
    *
    * Currently only the network type information is provided, see [[NetworkType]].
    *
    * **Note**
    *
    * Chrome 61+ is required for this function, and the compatibility is not guaranteed.
    * See [Network Information API](https://developer.mozilla.org/en-US/docs/Web/API/Network_Information_API) for details.
    *
    * @param callback The callback contains the statistics of the system network.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.getNetworkStats((stats) => {
    *     console.log(`Current network type: ${stats.NetworkType}`);
    * });
    * ```
    */
  def getNetworkStats(callback: js.Function1[/* stats */ NetworkStats, Unit]): Unit = js.native
  
  /**
    * Enumerates Audio Output Devices
    *
    * This method enumerates the available audio output devices, such as speakers.
    *
    * If this method succeeds, the SDK returns a list of audio output devices in an array of [[MediaDeviceInfo]] objects.
    *
    * **Note**
    *
    * Only Chrome 49 or later supports this function.
    */
  def getPlayoutDevices(callback: js.Function1[/* devices */ js.Array[MediaDeviceInfo], Unit]): Unit = js.native
  
  /**
    * Enumerates Audio Input Devices
    *
    * This method enumerates the available audio input devices, such as microphones.
    *
    * If this method succeeds, the SDK returns a list of audio input devices in an array of [[MediaDeviceInfo]] objects.
    */
  def getRecordingDevices(callback: js.Function1[/* devices */ js.Array[MediaDeviceInfo], Unit]): Unit = js.native
  
  /**
    * Retrieves the Audio Statistics of the Remote Stream
    *
    * This method retrieves the audio statistics of the remote stream, including audio codec type, packet loss rate, bitrate, and so on.
    *
    * **Note**
    *
    * - The statistics are calculated after the `stream-subscribed` event, which may take at most 3 seconds.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the remote audio stream.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.getRemoteAudioStats((remoteAudioStatsMap) => {
    *     for(var uid in remoteAudioStatsMap){
    *          console.log(`Audio CodecType from ${uid}: ${remoteAudioStatsMap[uid].CodecType}`);
    *          console.log(`Audio End2EndDelay from ${uid}: ${remoteAudioStatsMap[uid].End2EndDelay}`);
    *          console.log(`Audio MuteState from ${uid}: ${remoteAudioStatsMap[uid].MuteState}`);
    *          console.log(`Audio PacketLossRate from ${uid}: ${remoteAudioStatsMap[uid].PacketLossRate}`);
    *          console.log(`Audio RecvBitrate from ${uid}: ${remoteAudioStatsMap[uid].RecvBitrate}`);
    *          console.log(`Audio RecvLevel from ${uid}: ${remoteAudioStatsMap[uid].RecvLevel}`);
    *          console.log(`Audio TotalFreezeTime from ${uid}: ${remoteAudioStatsMap[uid].TotalFreezeTime}`);
    *          console.log(`Audio TotalPlayDuration from ${uid}: ${remoteAudioStatsMap[uid].TotalPlayDuration}`);
    *          console.log(`Audio TransportDelay from ${uid}: ${remoteAudioStatsMap[uid].TransportDelay}`);
    *     }
    * });
    * ```
    */
  def getRemoteAudioStats(callback: js.Function1[/* stats */ RemoteAudioStatsMap, Unit]): Unit = js.native
  
  /**
    * Retrieves the Video Statistics of the Remote Stream
    *
    * This method retrieves the video statistics of the remote stream, including packet loss rate, video bitrate, frame rate, and so on.
    *
    * **Note**
    *
    * - The statistics are calculated after the `stream-subscribed` event, which may take at most 3 seconds.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the remote video stream.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.getRemoteVideoStats((remoteVideoStatsMap) => {
    *     for(var uid in remoteVideoStatsMap){
    *          console.log(`Video End2EndDelay from ${uid}: ${remoteVideoStatsMap[uid].End2EndDelay}`);
    *          console.log(`Video MuteState from ${uid}: ${remoteVideoStatsMap[uid].MuteState}`);
    *          console.log(`Video PacketLossRate from ${uid}: ${remoteVideoStatsMap[uid].PacketLossRate}`);
    *          console.log(`Video RecvBitrate from ${uid}: ${remoteVideoStatsMap[uid].RecvBitrate}`);
    *          console.log(`Video RecvResolutionHeight from ${uid}: ${remoteVideoStatsMap[uid].RecvResolutionHeight}`);
    *          console.log(`Video RecvResolutionWidth from ${uid}: ${remoteVideoStatsMap[uid].RecvResolutionWidth}`);
    *          console.log(`Video RenderFrameRate from ${uid}: ${remoteVideoStatsMap[uid].RenderFrameRate}`);
    *          console.log(`Video RenderResolutionHeight from ${uid}: ${remoteVideoStatsMap[uid].RenderResolutionHeight}`);
    *          console.log(`Video RenderResolutionWidth from ${uid}: ${remoteVideoStatsMap[uid].RenderResolutionWidth}`);
    *          console.log(`Video TotalFreezeTime from ${uid}: ${remoteVideoStatsMap[uid].TotalFreezeTime}`);
    *          console.log(`Video TotalPlayDuration from ${uid}: ${remoteVideoStatsMap[uid].TotalPlayDuration}`);
    *          console.log(`Video TransportDelay from ${uid}: ${remoteVideoStatsMap[uid].TransportDelay}`);
    *     }
    * });
    * ```
    *
    */
  def getRemoteVideoStats(callback: js.Function1[/* stats */ RemoteVideoStatsMap, Unit]): Unit = js.native
  
  /**
    * Gets the Statistics of the Session
    *
    * This method gets the statistics of the session connection.
    *
    * **Note**
    *
    * - This method should be called after joining the channel, and it may take at most 3 seconds to retrieve the statistics.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the session connection.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.getSessionStats((stats) => {
    *     console.log(`Current Session Duration: ${stats.Duration}`);
    *     console.log(`Current Session UserCount: ${stats.UserCount}`);
    *     console.log(`Current Session SendBytes: ${stats.SendBytes}`);
    *     console.log(`Current Session RecvBytes: ${stats.RecvBytes}`);
    *     console.log(`Current Session SendBitrate: ${stats.SendBitrate}`);
    *     console.log(`Current Session RecvBitrate: ${stats.RecvBitrate}`);
    * });
    * ```
    */
  def getSessionStats(callback: js.Function1[/* stats */ SessionStats, Unit]): Unit = js.native
  
  /**
    * Gets the Statistics of the System
    *
    * This method gets the statistics of the system.
    *
    * Currently only the battery level information is provided, see [[BatteryLevel]].
    *
    * **Note**
    *
    * This feature is experimental, see [Battery Status API](https://developer.mozilla.org/en-US/docs/Web/API/Battery_Status_API) for browser compatibility.
    *
    * @param callback The callback contains the statistics of the system.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.getSystemStats((stats) => {
    *     console.log(`Current battery level: ${stats.BatteryLevel}`);
    * });
    * ```
    */
  def getSystemStats(callback: js.Function1[/* stats */ SystemStats, Unit]): Unit = js.native
  
  /**
    * Gets the Statistics of the Transmission
    *
    * This method gets the statistics of the transmission quality to Agora service.
    *
    * **Note**
    *
    * - Calculation of the statistics may take at most 3 seconds.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the transmission quality.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.getTransportStats((stats) => {
    *     console.log(`Current Transport RTT: ${stats.RTT}`);
    *     console.log(`Current Network Type: ${stats.networkType}`);
    *     console.log(`Current Transport OutgoingAvailableBandwidth: ${stats.OutgoingAvailableBandwidth}`);
    * });
    * ```
    */
  def getTransportStats(callback: js.Function1[/* stats */ TransportStats, Unit]): Unit = js.native
  
  /**
    * Initializes a Client Object
    *
    * This method initializes the client object.
    * @example **Sample code**
    * ``` javascript
    * client.init(appId, function() {
    *     console.log("client initialized");
    *     // Join a channel
    *     //……
    * }, function(err) {
    *     console.log("client init failed ", err);
    *     // Error handling
    * });
    * ```
    * @param appId Pass in the [App ID](https://docs.agora.io/en/Agora%20Platform/terms?platform=All%20Platforms#a-name-appid-a-app-id) for your project. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails. The following are the common errors:
    * - `"BAD_ENVIRONMENT"`: Unsupported web browser.
    */
  def init(appId: String): Unit = js.native
  def init(appId: String, onSuccess: js.Function0[Unit]): Unit = js.native
  def init(appId: String, onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  def init(appId: String, onSuccess: Unit, onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  
  /**
    * Joins an AgoraRTC Channel
    *
    * This method joins an AgoraRTC channel.
    *
    * When joining the channel, the `Client.on("connected")` and `Client.on("connection-state-change")` callbacks are triggered on the local client.
    *
    * After joining the channel, if the user joining the channel is in the Communication profile, or is a host in the Live Broadcast profile, the `Client.on("peer-online")` callback is triggered on the remote client.
    *
    * @example **Sample code**
    * ``` javascript
    * client.join(<token>, "1024", null, function(uid) {
    *     console.log("client" + uid + "joined channel");
    *     // Create a local stream
    *     //……
    * }, function(err) {
    *     console.error("client join failed ", err);
    *     // Error handling
    * });
    * ```
    * @param tokenOrKey
    * - Low security requirements: Pass `null` as the parameter value.
    * - High security requirements: Pass the string of the Token or Channel Key as the parameter value. See [Use Security Keys](https://docs.agora.io/en/Agora%20Platform/token?platform=All%20Platforms#use-a-token-for-authentication) for details.
    * @param channel A string that provides a unique channel name for the Agora session. The length must be within 64 bytes. Supported character scopes:
    *
    * - All lowercase English letters: a to z.
    * - All uppercase English letters: A to Z.
    * - All numeric characters: 0 to 9.
    * - The space character.
    * - Punctuation characters and other symbols, including: "!", "#", "$", "%", "&", "(", ")", "+", "-", ":", ";", "<", "=", ".", ">", "?", "@", "[", "]", "^", "_", " {", "}", "|", "~", ",".
    * @param uid The user ID, an integer or a string, ASCII characters only. Ensure this ID is unique.
    *            If you set the uid to `null` or `0`, the server assigns one and returns it in the `onSuccess` callback.
    *
    * **Note**
    *
    * - All users in the same channel should have the same type (number or string) of `uid`.
    * - If you use a number as the user ID, it should be a 32-bit unsigned integer with a value ranging from 0 to (2<sup>32</sup>-1).
    * - If you use a string as the user ID, the maximum length is 255 characters.
    * - You can use string UIDs to interoperate with the Native SDK 2.8 or later. Ensure that the Native SDK uses the User Account to join the channel. See [Use String User Accounts](https://docs.agora.io/en/faq/string).
    * @param onSuccess The callback when the method succeeds. The server returns the uid which represents the identity of the user.
    * @param onFailure The callback when the method fails. The following are common errors:
    * - "INVALID_OPERATION": Unable to join the channel. Usually due to calling `Client.join` repeatedly.
    * - "UID_CONFLICT": The `uid` of the local client conflicts with other users in the channel.
    * - "ERR_REPEAT_JOIN": The local client has already joined the channel.
    * - "SOCKET_ERROR": The SDK disconnects with the Agora server when joining the channel.
    */
  def join(tokenOrKey: String, channel: String): Unit = js.native
  def join(tokenOrKey: String, channel: String, uid: String): Unit = js.native
  def join(
    tokenOrKey: String,
    channel: String,
    uid: String,
    onSuccess: js.Function1[/* uid */ Double | String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: String,
    channel: String,
    uid: String,
    onSuccess: js.Function1[/* uid */ Double | String, Unit],
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: String,
    channel: String,
    uid: String,
    onSuccess: Unit,
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(tokenOrKey: String, channel: String, uid: Double): Unit = js.native
  def join(
    tokenOrKey: String,
    channel: String,
    uid: Double,
    onSuccess: js.Function1[/* uid */ Double | String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: String,
    channel: String,
    uid: Double,
    onSuccess: js.Function1[/* uid */ Double | String, Unit],
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: String,
    channel: String,
    uid: Double,
    onSuccess: Unit,
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: String,
    channel: String,
    uid: Null,
    onSuccess: js.Function1[/* uid */ Double | String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: String,
    channel: String,
    uid: Null,
    onSuccess: js.Function1[/* uid */ Double | String, Unit],
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: String,
    channel: String,
    uid: Null,
    onSuccess: Unit,
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(tokenOrKey: Null, channel: String): Unit = js.native
  def join(tokenOrKey: Null, channel: String, uid: String): Unit = js.native
  def join(
    tokenOrKey: Null,
    channel: String,
    uid: String,
    onSuccess: js.Function1[/* uid */ Double | String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: Null,
    channel: String,
    uid: String,
    onSuccess: js.Function1[/* uid */ Double | String, Unit],
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: Null,
    channel: String,
    uid: String,
    onSuccess: Unit,
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(tokenOrKey: Null, channel: String, uid: Double): Unit = js.native
  def join(
    tokenOrKey: Null,
    channel: String,
    uid: Double,
    onSuccess: js.Function1[/* uid */ Double | String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: Null,
    channel: String,
    uid: Double,
    onSuccess: js.Function1[/* uid */ Double | String, Unit],
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: Null,
    channel: String,
    uid: Double,
    onSuccess: Unit,
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: Null,
    channel: String,
    uid: Null,
    onSuccess: js.Function1[/* uid */ Double | String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: Null,
    channel: String,
    uid: Null,
    onSuccess: js.Function1[/* uid */ Double | String, Unit],
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  def join(
    tokenOrKey: Null,
    channel: String,
    uid: Null,
    onSuccess: Unit,
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  
  /**
    * Leaves an AgoraRTC Channel
    *
    * This method enables a user to leave a channel.
    *
    * When leaving the channel, the `Client.on("connection-state-change")` callback is triggered on the local client.
    *
    * After leaving the channel, if the user joining the channel is in the Communication profile, or is a host in the Live Broadcast profile, the `Client.on("peer-leave") callback` is triggered on the remote client.
    *
    * @example **Sample code**
    * ``` javascript
    * client.leave(function() {
    *     console.log("client leaves channel");
    *     //……
    * }, function(err) {
    *     console.log("client leave failed ", err);
    *     //error handling
    * });
    * ```
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails. The following are common errors:
    * - "INVALID_OPERATION": Invalid operation. Possible reasons are that this method is already called or the user is not in the channel.
    * - "SOCKET_ERROR": The SDK disconnects with the Agora server when leaving the channel.
    * - "LEAVE_MSG_TIMEOUT": The request to leave the channel times out. In this case, the SDK automatically disconnects and leaves the channel.
    */
  def leave(): Unit = js.native
  def leave(onSuccess: js.Function0[Unit]): Unit = js.native
  def leave(onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  def leave(onSuccess: Unit, onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  
  /**
    * Unbinds Events
    *
    * This method removes the events attached by the `Client.on()` method.
    *
    * @param eventType The event to be removed.
    * @param callback The function to be removed.
    *
    * @example **Sample code**
    * ``` javascript
    * client.on("stream-published", function processStreamPublished(evt) {
    *   console.log("Stream Published");
    *   evt.stream.play("divId");
    *   client.off("stream-published", processStreamPublished);
    * })
    * ```
    */
  def off(eventType: String, callback: js.Any): Unit = js.native
  
  /**
    * **DEPRECATED** from 3.0.2. Use `Client.on("volume-indicator")` instead.
    *
    * This callback notifies the application who is the active speaker in the channel.
    * @example **Sample code**
    * ``` javascript
    * client.on("active-speaker", function(evt) {
    *      var uid = evt.uid;
    *      console.log("update active speaker: client " + uid);
    *   });
    *
    * ```
    */
  @JSName("on")
  def on_activespeaker(event: `active-speaker`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when a camera is added or removed.
    * @example **Sample code**
    * ``` javascript
    * client.on("camera-changed", function(evt) {
    *     console.log("Camera Changed", evt.state, evt.device);
    *   });
    *
    * ```
    *
    */
  @JSName("on")
  def on_camerachanged(event: `camera-changed`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Reports events during the media stream relay.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    */
  @JSName("on")
  def on_channelmediarelayevent(event: `channel-media-relay-event`, callback: js.Function1[/* evt */ CodeNumber, Unit]): Unit = js.native
  /**
    * Occurs when the state of the media stream relay changes.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    *
    * The SDK reports the state and error code of the current media relay in this callback.
    */
  @JSName("on")
  def on_channelmediarelaystate(event: `channel-media-relay-state`, callback: js.Function1[/* evt */ State, Unit]): Unit = js.native
  /**
    * This callback notifies the peer user that he/she is banned from the channel. Only the banned users receive this callback.
    *
    * Usually the reason is that the UID is banned (`K_UID_BANNED`(14)).
    *
    * @example **Sample code**
    * ``` javascript
    * client.on("client-banned", function (evt) {
    *    var uid = evt.uid;
    *    var attr = evt.attr;
    *    console.log(" user banned:" + uid + ", bantype:" + attr);
    *    alert(" user banned:" + uid + ", bantype:" + attr);
    * });
    *
    * ```
    */
  @JSName("on")
  def on_clientbanned(event: `client-banned`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the user role switches in a live broadcast. For example, from a host to an audience or vice versa.
    *
    * @example **Sample code**
    *
    * ```javascript
    * client.on('client-role-changed', function(evt) {
    *   console.log('client-role-changed', evt.role);
    * });
    * ```
    */
  @JSName("on")
  def on_clientrolechanged(event: `client-role-changed`, callback: js.Function1[/* evt */ Role, Unit]): Unit = js.native
  /**
    * Occurs when the SDK is connected to the server.
    *
    * @example **Sample code**
    * ``` javascript
    * client.on("connected", function() {
    *   console.log("connected");
    * })
    * ```
    *
    */
  @JSName("on")
  def on_connected(event: connected, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Occurs when the network connection state changes.
    *
    * The connection between the SDK and Agora's edge server has the following states:
    *
    * - `DISCONNECTED`: The SDK is disconnected from Agora's edge server.
    *  - This is the initial state before [[Client.join]].
    *  - The SDK also enters this state after the app calls [[Client.leave]].
    * - `CONNECTING`: The SDK is connecting to Agora's edge server.
    * The SDK enters this state when calling [[Client.join]] or reconnecting to Agora's edge server automatically after the connection is lost.
    * - `CONNECTED`: The SDK is connected to Agora's edge server and joins a channel. You can now publish or subscribe to a stream in the channel.
    * If the connection is lost because, for example, the network is down or switched, the SDK triggers this callback and notifies the app that the state changes from `CONNECTED` to `CONNECTING`.
    * - `DISCONNECTING`: The SDK is disconnecting from Agora's edge server. The SDK enters this state when calling [[Client.leave]].
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.on("connection-state-change", function(evt) {
    *   console.log(evt.prevState, evt.curState);
    * })
    * ```
    */
  @JSName("on")
  def on_connectionstatechange(event: `connection-state-change`, callback: js.Function1[/* evt */ CurState, Unit]): Unit = js.native
  /**
    * Occurs when encryption or decryption fails during publishing or subscribing to a stream.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    *
    * The failure is usually due to a wrong encryption password ({@link setEncryptionSecret}) or an incorrect encryption mode ({@link setEncryptionMode}).
    *
    * @example **Sample code**
    * ```javascript
    * client.on("crypt-error", function (evt) {
    *   console.log(evt.cryptType + "error!");
    * });
    * ```
    */
  @JSName("on")
  def on_crypterror(event: `crypt-error`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when a remote user of the Native SDK calls `enableLocalVideo(false)` to disable video capture.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    */
  @JSName("on")
  def on_disablelocalvideo(event: `disable-local-video`, callback: js.Function1[/* evt */ Uid, Unit]): Unit = js.native
  /**
    * Occurs when a remote user of the Native SDK calls `enableLocalVideo(true)` to enable video capture.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    */
  @JSName("on")
  def on_enablelocalvideo(event: `enable-local-video`, callback: js.Function1[/* evt */ Uid, Unit]): Unit = js.native
  /**
    * Occurs when an error message is reported and requires error handling.
    *
    * Possible errors:
    * - When `reason` is `"SOCKET_DISCONNECTED"`, the SDK disconnects from the Agora server due to network conditions and will automatically try reconnecting.
    * - If this callback reports other reasons, it means that the error occurs during the reconnecting phase.
    * @example **Sample code**
    * ``` javascript
    * client.on("error", function(err) {
    *     console.log("Got error msg:", err.reason);
    *   });
    *
    * ```
    */
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* evt */ Type, Unit]): Unit = js.native
  /**
    * Reports exception events in the channel.
    *
    * Exceptions are not errors, but usually mean quality issues.
    *
    * This callback also reports recovery from an exception.
    *
    * Each exception event has a corresponding recovery event, see the table below for details:
    *
    * ![](https://web-cdn.agora.io/docs-files/1547180053430)
    *
    * **Note**
    *
    * This callback supports only the Chrome browser.
    * @example **Sample code**
    * ``` javascript
    * client.on("exception", function(evt) {
    *   console.log(evt.code, evt.msg, evt.uid);
    * })
    * ```
    */
  @JSName("on")
  def on_exception(event: exception, callback: js.Function1[/* evt */ Code, Unit]): Unit = js.native
  /**
    * Occurs when the first remote audio frame is decoded.
    *
    * The SDK triggers this callback when the local client successfully subscribes to a remote stream and decodes the first audio frame.
    *
    * **Note** This callback supports only the Google Chrome browser.
    * @example **Sample code**
    * ``` javascript
    * client.on('first-audio-frame-decode', function (evt) {
    *   console.log('first-audio-frame-decode');
    *   console.log(evt.stream);
    * })
    *
    * ```
    */
  @JSName("on")
  def on_firstaudioframedecode(event: `first-audio-frame-decode`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the first remote video frame is decoded.
    *
    * The SDK triggers this callback when the local client successfully subscribes to a remote stream and decodes the first video frame.
    *
    * @example **Sample code**
    * ``` javascript
    * client.on('first-video-frame-decode', function (evt) {
    *   console.log('first-video-frame-decode');
    *   console.log(evt.stream);
    * })
    *
    * ```
    */
  @JSName("on")
  def on_firstvideoframedecode(event: `first-video-frame-decode`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the live streaming fails.
    */
  @JSName("on")
  def on_liveStreamingFailed(event: liveStreamingFailed, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the live streaming starts.
    */
  @JSName("on")
  def on_liveStreamingStarted(event: liveStreamingStarted, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the live streaming stops.
    */
  @JSName("on")
  def on_liveStreamingStopped(event: liveStreamingStopped, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the live transcoding setting is updated.
    *
    * The SDK triggers this callback when the live transcoding setting is updated by calling the {@link setLiveTranscoding} method.
    *
    * **Note**
    *
    * The first call of the {@link setLiveTranscoding} method does not trigger this callback.
    */
  @JSName("on")
  def on_liveTranscodingUpdated(event: liveTranscodingUpdated, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the peer user mutes the audio.
    * @example **Sample code**
    * ``` javascript
    * client.on("mute-audio", function(evt) {
    *   var uid = evt.uid;
    *   console.log("mute audio:" + uid);
    *   //alert("mute audio:" + uid);
    * });
    *
    * ```
    */
  @JSName("on")
  def on_muteaudio(event: `mute-audio`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the peer user turns off the video.
    * @example **Sample code**
    * ``` javascript
    * client.on("mute-video", function (evt) {
    *   var uid = evt.uid;
    *   console.log("mute video" + uid);
    *   //alert("mute video:" + uid);
    * })
    *
    * ```
    */
  @JSName("on")
  def on_mutevideo(event: `mute-video`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Reports the network quality of the local user once every two seconds.
    *
    * This callback reports on the uplink and downlink network conditions of the local user.
    *
    * **Note**
    *
    * This is an experimental feature and the network quality rating is for reference only.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.on('network-quality', function(stats) {
    *     console.log('downlinkNetworkQuality', stats.downlinkNetworkQuality);
    *     console.log('uplinkNetworkQuality', stats.uplinkNetworkQuality);
    * });
    * ```
    */
  @JSName("on")
  def on_networkquality(
    event: `network-quality`,
    callback: /** @param stats The local user's network quality, including the uplink and downlink quality, see [[NetworkQualityStats]] for details. */
  js.Function1[/* stats */ NetworkQualityStats, Unit]
  ): Unit = js.native
  /**
    * Occurs when the network type changes.
    * @example **Sample code**
    * ``` javascript
    * client.on("network-type-changed", function(evt) {
    *     console.log("Network Type Changed to", evt.networkType);
    *   });
    *
    * ```
    *
    * Note
    *
    * Chrome 61+ is required for this function, and the compatibility is not guaranteed.
    * See [Network Information API](https://developer.mozilla.org/en-US/docs/Web/API/Network_Information_API) for details.
    */
  @JSName("on")
  def on_networktypechanged(event: `network-type-changed`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the Token expires.
    *
    * You should request a new Token from your server and call {@link Client.renewToken}.
    * @example **Sample code**
    * ``` javascript
    * client.on("onTokenPrivilegeDidExpire", function(){
    *   //After requesting a new token
    *   client.renewToken(token);
    * });
    *
    * ```
    */
  @JSName("on")
  def on_onTokenPrivilegeDidExpire(event: onTokenPrivilegeDidExpire, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the Token expires in 30 seconds.
    *
    * You should request a new Token from your server and call {@link Client.renewToken}.
    * @example **Sample code**
    * ``` javascript
    * client.on("onTokenPrivilegeWillExpire", function(){
    *   //After requesting a new token
    *   client.renewToken(token);
    * });
    *
    * ```
    */
  @JSName("on")
  def on_onTokenPrivilegeWillExpire(event: onTokenPrivilegeWillExpire, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when a remote user becomes offline.
    *
    * The SDK triggers this callback in the following situations:
    * - A remote user calls {@link Client.leave} and leaves the channel.
    * - A remote user drops offline. When no data packet of the user or host is received for 20 seconds, the SDK assumes that the user drops offline.
    * A poor network connection may lead to false detections, so we recommend using the signaling system for reliable offline detection.
    * - A remote user switches the client role from host to audience.
    *
    * **Note**
    * In live-broadcast channels, the SDK triggers this callback only when a host goes offline.
    *
    * @example **Sample code**
    * ``` javascript
    * client.on("peer-leave", function(evt) {
    *     var uid = evt.uid;
    *     var reason = evt.reason;
    *     console.log("remote user left ", uid, "reason: ", reason);
    *     //……
    * });
    *
    * ```
    */
  @JSName("on")
  def on_peerleave(event: `peer-leave`, callback: js.Function1[/* evt */ Reason, Unit]): Unit = js.native
  /**
    * Occurs when a remote user or host joins the channel.
    *
    * - Communication channel (rtc mode): This callback notifies the app that another user joins the channel.
    *   If other users are already in the channel, the SDK also reports to the app on the existing users.
    * - Live-broadcast channel (live mode): This callback notifies the app that the host joins the channel.
    * If other hosts are already in the channel, the SDK also reports to the app on the existing hosts. Agora recommends limiting the number of hosts to 17.
    *
    * The SDK triggers this callback under one of the following circumstances:
    * - A remote user/host joins the channel by calling the [[Client.join]] method.
    * - A remote user switches the user role to the host by calling the [[Client.setClientRole]] method after joining the channel.
    * - A remote user/host rejoins the channel after a network interruption.
    * - The host injects an online media stream into the channel by calling the [[Client.addInjectStreamUrl]] method.
    * @example **Sample code**
    *
    * ```javascript
    * client.on('peer-online', function(evt) {
    *   console.log('peer-online', evt.uid);
    * });
    * ```
    *
    */
  @JSName("on")
  def on_peeronline(event: `peer-online`, callback: js.Function1[/* evt */ Uid, Unit]): Unit = js.native
  /**
    * Occurs when an audio output device is added or removed.
    * @example **Sample code**
    * ``` javascript
    * client.on("playout-device-changed", function(evt) {
    *     console.log("Playout Device Changed", evt.state, evt.device);
    *   });
    *
    * ```
    *
    * **Note**
    *
    * Only supports Chrome 49+.
    */
  @JSName("on")
  def on_playoutdevicechanged(event: `playout-device-changed`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    *  Occurs when the local user receives metadata.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.1.0*
    *
    * This callback reports the received metadata and the ID of the user who sends it.
    * @example **Sample code**
    * ``` javascript
    * client.on("receive-metadata", function (evt) {
    *   console.log("receive metadata from: ", evt.uid);
    *   console.log("receive metadata: ", evt.metadata);
    * })
    * ```
    */
  @JSName("on")
  def on_receivemetadata(event: `receive-metadata`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the SDK starts reconnecting to the server automatically after the connection is lost.
    *
    * @example **Sample code**
    * ``` javascript
    * client.on("reconnect", function() {
    *   console.log("reconnect");
    * })
    * ```
    *
    */
  @JSName("on")
  def on_reconnect(event: reconnect, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Occurs when an audio input device is added or removed.
    * @example **Sample code**
    * ``` javascript
    * client.on("recording-device-changed", function(evt) {
    *     console.log("Recording Device Changed", evt.state, evt.device);
    *   });
    *
    * ```
    *
    */
  @JSName("on")
  def on_recordingdevicechanged(event: `recording-device-changed`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the injected online media stream's status is updated.
    */
  @JSName("on")
  def on_streamInjectedStatus(event: streamInjectedStatus, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the remote stream is added.
    *
    * **Note**
    *
    * When the local user joins the channel, if other users are already in the channel, the SDK also reports to the app on the existing remote streams.
    * @example **Sample code**
    * ``` javascript
    * client.on("stream-added", function(evt) {
    *     var stream = evt.stream;
    *     console.log("new stream added ", stream.getId());
    *     // Subscribe the stream.
    *     //……
    * })
    *
    * ```
    *
    */
  @JSName("on")
  def on_streamadded(event: `stream-added`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the remote video stream falls back to an audio-only stream due to unreliable network conditions or switches back to the video after the network conditions improve.
    *
    * If you set `fallbackType` as 2 in [[setStreamFallbackOption]],
    * the SDK triggers this callback when the remote media stream falls back to audio only due to unreliable network conditions or switches back to the video after the network condition improves.
    *
    * **Note**
    *
    * Once the remote media stream is switched to the low stream due to unreliable network conditions,
    * you can monitor the stream switch between a high stream and low stream in the `stream-type-changed` callback.
    */
  @JSName("on")
  def on_streamfallback(event: `stream-fallback`, callback: js.Function1[/* evt */ Attr, Unit]): Unit = js.native
  /**
    * Occurs when the local stream is published.
    * @example **Sample code**
    * ``` javascript
    * client.on("stream-published", function(evt) {
    *     console.log("local stream published");
    *     //……
    * })
    *
    * ```
    */
  @JSName("on")
  def on_streampublished(event: `stream-published`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the SDK finishes republishing or re-subscribing to a stream.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.on('stream-reconnect-end', function(evt) {
    *   console.log(evt.uid, evt.success, evt.reason);
    * })
    * ```
    */
  @JSName("on")
  def on_streamreconnectend(event: `stream-reconnect-end`, callback: js.Function1[/* evt */ Success, Unit]): Unit = js.native
  /**
    * Occurs when the SDK starts republishing or re-subscribing to a stream.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.on("stream-reconnect-start", function(evt) {
    *   console.log(evt.uid);
    * })
    * ```
    */
  @JSName("on")
  def on_streamreconnectstart(event: `stream-reconnect-start`, callback: js.Function1[/* evt */ `0`, Unit]): Unit = js.native
  /**
    * Occurs when the remote stream is removed; for example, a peer user calls {@link Client.unpublish}.
    * @example **Sample code**
    * ``` javascript
    * client.on("stream-removed", function(evt) {
    *     var stream = evt.stream;
    *     console.log("remote stream was removed", stream.getId());
    *     //……
    * });
    *
    * ```
    */
  @JSName("on")
  def on_streamremoved(event: `stream-removed`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when a user subscribes to a remote stream.
    * @example **Sample code**
    * ``` javascript
    * client.on("stream-subscribed", function(evt) {
    *     var stream = evt.stream;
    *     console.log("new stream subscribed ", stream.getId());
    *     // Play the stream.
    *     //……
    * })
    *
    * ```
    */
  @JSName("on")
  def on_streamsubscribed(event: `stream-subscribed`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the type of a video stream changes.
    *
    * It happens when a high-quality video stream changes to a low-quality video stream, or vice versa.
    *
    * The stream type (streamType):
    *
    * - 0: High-bitrate, high-resolution video stream.
    * - 1: Low-bitrate, low-resolution video stream.
    * @example **Sample code**
    *
    * ``` javascript
    * client.on("stream-type-changed", function(evt) {
    *     console.log("Stream Type Change", evt.uid, evt.streamType);
    *   });
    *
    * ```
    *
    */
  @JSName("on")
  def on_streamtypechanged(event: `stream-type-changed`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the local stream is unpublished.
    * @example **Sample code**
    * ``` javascript
    * client.on("stream-unpublished", function(evt) {
    *     console.log("local stream unpublished");
    *     //……
    * })
    *
    * ```
    */
  @JSName("on")
  def on_streamunpublished(event: `stream-unpublished`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when a remote stream adds or removes a track.
    *
    * When a remote stream calls the [[addTrack]] or [[removeTrack]] method, the SDK triggers this callback.
    */
  @JSName("on")
  def on_streamupdated(event: `stream-updated`, callback: js.Function1[/* evt */ StreamStream, Unit]): Unit = js.native
  /**
    * Occurs when the peer user unmutes the audio.
    * @example **Sample code**
    * ``` javascript
    * client.on("unmute-audio", function (evt) {
    *   var uid = evt.uid;
    *   console.log("unmute audio:" + uid);
    * });
    *
    * ```
    */
  @JSName("on")
  def on_unmuteaudio(event: `unmute-audio`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the peer user turns on the video.
    * @example **Sample code**
    * ``` javascript
    * client.on("unmute-video", function (evt) {
    *   var uid = evt.uid;
    *   console.log("unmute video:" + uid);
    * })
    *
    * ```
    */
  @JSName("on")
  def on_unmutevideo(event: `unmute-video`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * This callback notifies the application of all the speaking remote users and their volumes.
    *
    * It is disabled by default. You can enable this event by calling {@link enableAudioVolumeIndicator}.
    * If enabled, it reports the volumes every two seconds regardless of whether there are users speaking.
    *
    * The volume is an integer ranging from 0 to 100. Usually a user with volume above five will be counted as a speaking user.
    * @example **Sample code**
    * ``` javascript
    * client.on("volume-indicator", function(evt){
    *     evt.attr.forEach(function(volume, index){
    *     console.log(`${index} UID ${volume.uid} Level ${volume.level}`);
    *   });
    * });
    * ```
    */
  @JSName("on")
  def on_volumeindicator(event: `volume-indicator`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  
  /**
    * Publishes a Local Stream
    *
    * This method publishes a local stream to the SD-RTN.
    *
    * When the stream is published, the following callbacks are triggered:
    * - On the local client: `Client.on("stream-published")`
    * - On the remote client: `Client.on("stream-added")`
    *
    * **Note**
    *
    * In a live broadcast, whoever calls this API is the host.
    * @example **Sample code**
    * ``` javascript
    * client.publish(stream, function(err) {
    *     console.log(err);
    *     //……
    * })
    * ```
    * @param stream Stream object, which represents the local stream.
    * @param onFailure The callback when the method fails. The following are common errors:
    * - "STREAM_ALREADY_PUBLISHED": This stream object is already published.
    * - "INVALID_LOCAL_STREAM": The stream object is invalid.
    * - "INVALID_OPERATION": The user is not in the channel, possibly because the user has not joined the channel or the connection is interrupted.
    * - "PUBLISH_STREAM_FAILED": Fails to publish the stream, usually because the connection is lost during publishing.
    * - "PEERCONNECTION_FAILED": Fails to establish the media transport channel.
    */
  def publish(stream: Stream): Unit = js.native
  def publish(stream: Stream, onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  
  /**
    * Removes the Injected Stream
    *
    * This method removes the HTTP/HTTPS URL address (added by [[addInjectStreamUrl]]) from the live broadcast.
    * @param url URL address of the live streaming. ASCII characters only, and the string length must be greater that 0 and less than 256 bytes.
    */
  def removeInjectStreamUrl(url: String): Unit = js.native
  
  /**
    * Renews the Channel Key
    *
    * This method renews your channel key.
    *
    * Once the Channel Key schema is enabled, the key expires after a certain period of time.
    * When the onFailure callback reports the error `DYNAMIC_KEY_TIMEOUT`, the application should renew the Channel Key by calling this method.
    * Not doing so will result in SDK disconnecting with the server.
    * @param key Specifies the renewed Channel Key.
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails. The following are common errors:
    * - "INVALID_OPERATION": The user is not in the channel. Call this method after the user joins a channel.
    */
  def renewChannelKey(key: String): Unit = js.native
  def renewChannelKey(key: String, onSuccess: js.Function0[Unit]): Unit = js.native
  def renewChannelKey(key: String, onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  def renewChannelKey(key: String, onSuccess: Unit, onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  
  /**
    * Renews the Token
    *
    * This method renews your token.
    *
    * Once the Token schema is enabled, the token expires after a certain period of time.
    * In case of the `onTokenPrivilegeWillExpire` or `onTokenPrivilegeDidExpire` callback events, the application should renew the Token by calling this method.
    * Not doing so will result in SDK disconnecting with the server.
    * @param token Specifies the renewed Token.
    */
  def renewToken(token: String): Unit = js.native
  
  /**
    * Sends metadata.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.1.0*
    *
    * This method adds metadata in a media stream, which allows you to diversify interactions in live broadcasts.
    * Example metadata includes shopping links, digital coupons, and online quizzes.
    *
    * **Note**
    * - This function supports the H.264 codec only. Ensure that you set `codec` as `"h264"` in `createClient`。
    * - Ensure that you call this method after successfully publishing a stream.
    * @param data String, the metadata to send. The maximum size is 1024 bytes.
    * @param callback The result of sending metadata.
    */
  def sendMetadata(data: String, callback: js.Function1[/* err */ Null | String, Unit]): Unit = js.native
  
  /**
    * Sets the role of the user.
    *
    * This method is applicable only to the live mode.
    *
    * Sets the role of the user such as a host or an audience (default), before joining a channel.
    *
    * This method can be used to switch the user role after the user joins a channel. When a user switches the user role after joining a channel, the following callbacks are triggered:
    * - On the local client: `Client.on("client-role-changed")`.
    * - On the remote client: `Client.on("peer-online")` or `Client.on("peer-leave")`.
    *
    * In live mode ([[mode]] is set as `live`):
    *
    * - Before joining the channel, you can call this method to set the role.
    * - After joining the channel, you can call this method to switch the role:
    *  - When you call [[publish]], the user role switches to `host`; when you call [[unpublish]], the user role switches to `audience`.
    *  - After calling [[publish]], if you call this method and set the user role as `audience`, [[unpublish]] is called automatically.
    *
    * **Note**
    *
    * In communication mode ([[mode]] set as `rtc`), this method does not take effect. All users are `host` by default.
    *
    * @param role User role in a live broadcast:
    *
    * - `"audience"`: Audience, the default role. An audience can only receive streams.
    * - `"host"`: Host. A host can both send and receive streams.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * client.setClientRole("host", function(e) {
    *   if (!e) {
    *     console.log("setHost success");
    *   } else {
    *     console.log("setHost error", e);
    *   }
    * });
    * ```
    *
    */
  @JSName("setClientRole")
  def setClientRole_audience(role: audience): Unit = js.native
  @JSName("setClientRole")
  def setClientRole_audience(role: audience, callback: js.Function1[/* err */ js.UndefOr[String | Null], Unit]): Unit = js.native
  @JSName("setClientRole")
  def setClientRole_host(role: host): Unit = js.native
  @JSName("setClientRole")
  def setClientRole_host(role: host, callback: js.Function1[/* err */ js.UndefOr[String | Null], Unit]): Unit = js.native
  
  @JSName("setEncryptionMode")
  def setEncryptionMode_aes128ecb(encryptionMode: `aes-128-ecb`): Unit = js.native
  /**
    * Sets the Encryption Mode
    *
    * Use this method with [[setEncryptionSecret]] method to enable the built-in encryption before joining a channel.
    *
    * All users in a channel must set the same encryption mode.
    *
    * **Note**
    *
    * - Ensure you call [[setEncryptionSecret]] and [[setEncryptionMode]] before joining the channel, otherwise the encryption is disabled.
    * - Do not use this method for CDN live streaming.
    * - If the encryption mode is incorrect, the SDK triggers the `Client.on("crypt-error")` callback when publishing or subscribing to a stream.
    * @example `client.setEncryptionMode(encryptionMode);`
    * @param encryptionMode The encryption mode:
    *
    * - aes-128-xts: Sets the encryption mode as AES128XTS.
    * - aes-256-xts: Sets the encryption mode as AES256XTS.
    * - aes-128-ecb: Sets the encryption mode as AES128ECB.
    */
  @JSName("setEncryptionMode")
  def setEncryptionMode_aes128xts(encryptionMode: `aes-128-xts`): Unit = js.native
  @JSName("setEncryptionMode")
  def setEncryptionMode_aes256xts(encryptionMode: `aes-256-xts`): Unit = js.native
  
  /**
    * Enables Built-in Encryption
    *
    * Use this method with [[setEncryptionMode]] method to enable the built-in encryption before joining a channel.
    *
    * All users in a channel must set the same encryption password.
    *
    * **Note**
    *
    * - Ensure you call [[setEncryptionSecret]] and [[setEncryptionMode]] before joining the channel, otherwise the encryption is disabled.
    * - Do not use this method for CDN live streaming.
    * - If the encryption password is incorrect, the SDK triggers the `Client.on("crypt-error")` callback when publishing or subscribing to a stream.
    * @example `client.setEncryptionSecret(password)`
    * @param password The encryption password. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    */
  def setEncryptionSecret(password: String): Unit = js.native
  
  /**
    * Sets Live Transcoding
    *
    * This method sets the video layout and audio for CDN live.
    * A successful call of this method to update the transcoding settings triggers the `Client.on("liveTranscodingUpdated")` callback.
    *
    * **Note**
    *
    * - Ensure that you [enable the RTMP Converter service](../../../cdn_streaming_web#prerequisites) before using this function.
    * - The first call of this method does not trigger the `Client.on("liveTranscodingUpdated")` callback.
    * - Call {@link setLiveTranscoding} after {@link createStream}. For details, see [Push Streams to CDN](../../../cdn_streaming_web).
    * @param coding Transcoding settings, see {@link LiveTranscoding} for details.
    */
  def setLiveTranscoding(coding: LiveTranscoding): Unit = js.native
  
  /**
    * Sets the video profile of the low-quality video stream
    *
    * If you have enabled the dual-stream mode by calling {@link Client.enableDualStream}, use this method to set the video profile of the low-quality stream.
    *
    * The default video profile of the low-quality video stream:
    * - Resolution (width × height): 160 × 120
    * - Bitrate: 50 Kbps
    * - Frame rate: 15 fps
    *
    * **Note**
    *
    * - The low-quality video stream keeps the aspect ratio of the high-quality video stream. If the resolution of the low-quality stream has a different aspect ratio, the SDK automatically adjusts the height of the low-quality stream.
    * - As different web browsers have different restrictions on the video profile, your settings may not take effect.
    *   - The Firefox browser has a fixed frame rate of 30 fps, therefore the frame rate setting does not work on the Firefox browser.
    *   - The resolution you set may not take effect.
    * - Billings are calculated based on the actual resolution.
    * - Call this method after calling {@link Client.join} and before calling {@link Client.publish}.
    * @param param The video profile of the low-quality video stream.
    */
  def setLowStreamParameter(param: Bitrate): Unit = js.native
  
  /**
    * Deploys a Proxy Server
    *
    * Use this method to deploy an HTTP proxy server.
    *
    * You can also use cloud proxy by {@link startProxyServer}. See [Use Cloud Proxy](https://docs.agora.io/en/Agora%20Platform/cloud_proxy_web?platform=Web) for details.
    *
    * **Note**
    *
    * - Ensure that you call this API before {@link Client.join}.
    * - Proxy services by different service providers may result in slow performance if you are using the Firefox browser.
    *   Therefore, Agora recommends using the same service provider for the proxy services. If you use different service providers, Agora recommends not using the Firefox browser.
    * @example `client.setProxyServer(proxyServer);`
    * @param proxyServer Your proxy server domain name. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. See {@link ClientConfig.proxyServer} for details.
    */
  def setProxyServer(): Unit = js.native
  def setProxyServer(proxyServer: String): Unit = js.native
  
  /**
    * Sets the stream type of a remote stream
    *
    * When a remote user sends dual streams, this method decides on which stream to receive on the subscriber side. If this method is not used, the subscriber receives the high-quality video stream.
    *
    * @example **Sample code**
    * ``` javascript
    * switchStream = function (){
    *   if (highOrLow === 0) {
    *     highOrLow = 1
    *     console.log("Set to low");
    *   }
    *   else {
    *     highOrLow = 0
    *     console.log("Set to high");
    *   }
    *
    *   client.setRemoteVideoStreamType(stream, highOrLow);
    * }
    * ```
    *
    * [[include:setRemoteStreamType-note.md]]
    * @param stream The remote video stream object.
    * @param streamType Sets the remote video stream type. The following lists the video-stream types:
    * - 0: High-bitrate, high-resolution video stream.
    * - 1: Low-bitrate, low-resolution video stream.
    */
  @JSName("setRemoteVideoStreamType")
  def setRemoteVideoStreamType_0(stream: Stream, streamType: typings.agoraRtcSdk.agoraRtcSdkNumbers.`0`): Unit = js.native
  @JSName("setRemoteVideoStreamType")
  def setRemoteVideoStreamType_1(stream: Stream, streamType: `1`): Unit = js.native
  
  /**
    * Sets Stream Fallback Option
    *
    * Use this method to set stream fallback option on the receiver.
    *
    * Under poor network conditions, the SDK can choose to subscribe to the low-quality video stream or only the audio stream.
    *
    * If the auto-fallback option is enabled, the SDK triggers the `Client.on("stream-type-changed")` callback when the remote stream changes from a high-quality video stream to a low-quality video stream or vice versa, and triggers the `Client.on("stream-fallback")` callback when the remote stream changes from a video stream to an audio-only stream or vice versa.
    *
    * **Note**
    *
    * This method can only be used when the publisher has enabled the dual-stream mode by {@link enableDualStream}.
    * @param stream The remote stream object.
    * @param fallbackType The fallback option:
    * - 0: Disable the fallback.
    * - 1: (Default) Automatically subscribe to the low-quality video stream under poor network.
    * - 2: Under poor network, the SDK may subscribe to the low-quality video stream (of lower resolution and lower bitrate) first,
    *      but if the network still does not allow displaying the video, the SDK will receive audio only.
    * @example **Sample code**
    * ```javascript
    * // The sender side, after publishing the high stream
    * client.enableDualStream();
    *
    * // The receiver side, set the fallback option as 2
    * client.setStreamFallbackOption(remoteStream, 2);
    * ```
    */
  @JSName("setStreamFallbackOption")
  def setStreamFallbackOption_0(stream: Stream, fallbackType: typings.agoraRtcSdk.agoraRtcSdkNumbers.`0`): Unit = js.native
  @JSName("setStreamFallbackOption")
  def setStreamFallbackOption_1(stream: Stream, fallbackType: `1`): Unit = js.native
  @JSName("setStreamFallbackOption")
  def setStreamFallbackOption_2(stream: Stream, fallbackType: `2`): Unit = js.native
  
  /**
    * Deploys the TURN Server
    *
    * Use this method to deploy the TURN server.
    *
    * You can also use cloud proxy by {@link startProxyServer}. See [Use Cloud Proxy](https://docs.agora.io/en/Agora%20Platform/cloud_proxy_web?platform=Web) for details.
    *
    * **Note**
    *
    * Ensure that you call this API before {@link Client.join}.
    * @example `client.setTurnServer(config);`
    * @param turnServer The TURN server settings. See {@link ClientConfig.turnServer} for details.
    */
  def setTurnServer(): Unit = js.native
  def setTurnServer(turnServer: js.Array[Forceturn]): Unit = js.native
  
  /**
    * Starts relaying media streams across channels.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    *
    * After this method call, the SDK triggers the following callbacks:
    *
    * - `Client.on("channel-media-relay-state")`, which reports the state and error code of the media stream relay.
    *   - If the media stream relay starts successfully, this callback returns `state` 2 and `code` 0.
    *   - If the media stream relay fails, this callback returns `state` 3. Refer to `code` for the error code and call this method again.
    * - `Client.on("channel-media-relay-event")`, which reports the events of the media stream relay.
    *   - If the media stream relay starts successfully, this callback returns `code` 4, reporting that the SDK starts relaying the media stream to the destination channel.
    *
    * **Note**
    *
    * - Contact sales-us@agora.io to enable this function.
    * - We do not support string user IDs in this API.
    * - Call this method only after joining a channel.
    * - In a live-broadcast channel, only a host can call this method.
    * - To call this method again after it succeeds, you must call {@link stopChannelMediaRelay} to quit the current relay.
    * @param config Configurations of the media stream relay: {@link ChannelMediaRelayConfiguration}.
    * @param callback The result of starting the media stream relay.
    *
    * - null: Success.
    * - {@link ChannelMediaError}: Failure. This class provides the error details.
    *
    * @example **Sample code**
    * ```javascript
    * client.startChannelMediaRelay(channelMediaConfig, function(e) {
    *   if(e) {
    *     utils.notification(`startChannelMediaRelay failed: ${JSON.stringify(e)}`);
    *   } else {
    *     utils.notification(`startChannelMediaRelay success`);
    *   }
    * });
    * ```
    */
  def startChannelMediaRelay(
    config: ChannelMediaRelayConfiguration,
    callback: js.Function1[/* err */ Null | ChannelMediaError, Unit]
  ): Unit = js.native
  
  /**
    * Starts a Live Stream
    *
    * This method starts a live stream. For details, see [Push Streams to the CDN](../../../cdn_streaming_web).
    *
    * When the live stream starts, the SDK triggers the `Client.on("liveStreamingStarted")` callback.
    * If this method call fails, the SDK triggers the `Client.on("liveStreamingFailed")` callback.
    *
    * **Note**
    *
    * - Only hosts in live-broadcast channels can call this method. Ensure that you set the user role as `"host"` in {@link setClientRole}.
    * - Call this method after the {@link publish} method call succeeds.
    * - Push one live stream at a time. If you need to push several streams, ensure that the current stream starts successfully before pushing the next one.
    * @example **Sample code**
    * ``` javascript
    * client.setLiveTranscoding(<coding>);
    * client.startLiveStreaming(<url>, true)
    * ```
    * @param url URL address for the live stream. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    * @param enableTranscoding Marks whether to enable live transcoding. If set as `true`, {@link setLiveTranscoding} must be called before this method.
    */
  def startLiveStreaming(url: String): Unit = js.native
  def startLiveStreaming(url: String, enableTranscoding: Boolean): Unit = js.native
  
  /**
    * Enables Cloud Proxy
    *
    * This method must be called before joining the channel or after leaving the channel.
    *
    * To use the cloud proxy service, some extra settings are needed, see [Use Cloud Proxy](https://docs.agora.io/en/Interactive%20Broadcast/cloud_proxy_web?platform=Web) for details.
    */
  def startProxyServer(): Unit = js.native
  
  /**
    * Stops the media stream relay.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    *
    * Once the relay stops, the user leaves all the destination channels.
    *
    * After this method call, the SDK triggers the `Client.on("channel-media-relay-state")` callback.
    *
    * - If the relay stops, the callback returns `state` 0.
    * - If the relay fails to stop, the callback returns `state` 3 and `code` 2 or 8. The failure is usually due to poor network conditions. You can call {@link Client.leave} to leave the channel and stop the relay.
    *
    * @param callback The result of stopping the media stream relay.
    *
    * - `null`: Success.
    * - {@link ChannelMediaError}: Failure. This class provides the error details.
    *
    * @example **Sample code**
    *
    * ```javascript
    * stopChannelMediaRelay: function() {
    *   client.stopChannelMediaRelay(function(e) {
    *     if(e) {
    *       utils.notification(`stopChannelMediaRelay failed: ${JSON.stringify(e)}`);
    *     } else {
    *       utils.notification(`stopChannelMediaRelay success`);
    *     }
    *   });
    * }
    * ```
    */
  def stopChannelMediaRelay(callback: js.Function1[/* err */ Null | ChannelMediaError, Unit]): Unit = js.native
  
  /**
    * Stops Live Streaming
    *
    * This method stops and deletes the live streaming.
    * When the live stream stops, the SDK triggers the `Client.on("liveStreamingStopped")` callback.
    * @param url URL address of the live streaming. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    */
  def stopLiveStreaming(url: String): Unit = js.native
  
  /**
    * Disables Cloud Proxy
    *
    * This method must be called before joining the channel or after leaving the channel.
    *
    * This method disables all proxy settings, including those set by [[setProxyServer]] and [[setTurnServer]].
    */
  def stopProxyServer(): Unit = js.native
  
  /**
    * Subscribes to a Remote Stream
    *
    * This method enables a user to subscribe to a remote stream.
    *
    * After the user subscribes to a remote stream, the SDK triggers the `Client.on("stream-subscribed")` callback.
    * If the remote stream contains an audio track, the SDK also triggers the `Client.on("first-audio-frame-decode")` callback;
    * if the remote stream contains a video track, the SDK also triggers the `Client.on("first-video-frame-decode")` callback.
    *
    * @param stream Stream object, which represents the remote stream.
    * @param options Sets whether to receive the video or audio data independently by the `video` and `audio` parameters.
    *
    * **Note**
    *
    * - `video` and `audio` cannot be set as `false` at the same time. If you need to stop subscribing to the stream, call [[Client.unsubscribe]] instead.
    * - Safari does not support independent subscription. Set `options` as `null` for Safari, otherwise the`SAFARI_NOT_SUPPORTED_FOR_TRACK_SUBSCRIPTION` error occurs.
    * @param onFailure The callback when the method fails. The following are common errors:
    * - "SAFARI_NOT_SUPPORTED_FOR_TRACK_SUBSCRIPTION": Safari does not support independent subscription.
    * - "INVALID_OPERATION": The user is not in the channel, possibly because the user has not joined the channel or the connection is interrupted.
    * - "SUBSCRIBE_STREAM_FAILED": The subscription fails, usually because the SDK has disconnected from the Agora server when subscribing to the stream.
    * - "PEERCONNECTION_FAILED": Fails to establish the media transport channel.
    * @example
    * **Sample code**
    * ```javascript
    * client.subscribe(stream, function(err) {
    *     console.error("stream subscribe failed", err);
    *     //……
    * });
    * ```
    * ### Advanced
    *
    * This method can be called multiple times for a single remote stream, and enables you to switch between receiving/not receiving the video or audio data flexibly.
    *
    * @example
    * **Sample code**
    * ```javascript
    * // Initially, subscribe to the stream and receive only the video data
    * client.subscribe(stream, {video: true, audio: false});
    *
    * // After a while, switch to receiving only the audio data
    * client.subscribe(stream, {video: false, audio: true});
    * ```
    */
  def subscribe(stream: Stream): Unit = js.native
  def subscribe(stream: Stream, options: Unit, onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  def subscribe(stream: Stream, options: Video): Unit = js.native
  def subscribe(stream: Stream, options: Video, onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  
  /**
    * Unpublishes the Local Stream
    *
    * This method unpublishes the local stream.
    *
    * When the stream is unpublished, the `Client.on("stream-removed")` callback is triggered on the remote client.
    *
    * **Note**
    *
    * In a live broadcast, the user role of a host switches to audience after unpublishing, and the `Client.on("peer-leave")` callback is triggered on the remote client.
    * @example
    * **Sample code**
    * ``` javascript
    * client.unpublish(stream, function(err) {
    *     console.log(err);
    *     //……
    * })
    *
    * ```
    * @param stream Stream object, which represents the local stream.
    * @param onFailure The callback when the method fails. The following are common errors:
    * - "STREAM_NOT_YET_PUBLISHED": The specified stream object is not published.
    * - "INVALID_LOCAL_STREAM": The specified stream object is invalid.
    * - "INVALID_OPERATION": The user is not in the channel, possibly because the user has not joined the channel or the connection is interrupted.
    */
  def unpublish(stream: Stream): Unit = js.native
  def unpublish(stream: Stream, onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  
  /**
    * Unsubscribes from the Remote Stream
    *
    * This method enables the user to unsubscribe from the remote stream.
    * @example
    * **Sample code**
    * ``` javascript
    * client.unsubscribe(stream, function(err) {
    *     console.log(err);
    *     //……
    * })
    *
    * ```
    * @param stream Stream object, which represents the remote stream.
    * @param onFailure The callback when the method fails. The following are common errors:
    * - "INVALID_REMOTE_STREAM": The specified stream object is invalid.
    * - "INVALID_OPERATION": The user is not in the channel, possibly because the user has not joined the channel or the connection is interrupted.
    * - "NO_SUCH_REMOTE_STREAM": The specified stream object is not found.
    * - "UNSUBSCRIBE_STREAM_FAILED": Fails to unsubscribe from the stream, usually because the SDK has disconnected from the Agora server when unsubscribing from the stream.
    */
  def unsubscribe(stream: Stream): Unit = js.native
  def unsubscribe(stream: Stream, onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  
  /**
    * Updates the channels for media stream relay.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    *
    * After the channel media relay starts, if you want to relay the media stream to more channels, or leave the current relay channel, you can call this method.
    *
    * After this method call, the SDK triggers the `Client.on("channel-media-relay-event")` callback.
    *
    * - If the update succeeds, the callback returns `code` 7.
    * - If the update fails, the callback returns `code` 8, and the SDK also triggers the `Client.on("channel-media-relay-state")` callback with `state` 3. In this case, the media relay state is reset, and you need to call {@link startChannelMediaRelay} again to restart the relay.
    *
    * **Note**
    *
    * - Call this method after {@link startChannelMediaRelay}.
    * - You can add a maximum of four destination channels to a relay.
    *
    * @param config Configurations of the media stream relay: {@link ChannelMediaRelayConfiguration}.
    * @param callback The result of updating the destination channels.
    *
    * - `null`: Success.
    * - {@link ChannelMediaError}: Failure. This class provides the error details.
    *
    * @example **Sample code**
    * ```javascript
    * client.updateChannelMediaRelay(channelMediaConfig, function(e) {
    *   if(e) {
    *     utils.notification(`updateChannelMediaRelay failed: ${JSON.stringify(e)}`);
    *   } else {
    *     utils.notification(`updateChannelMediaRelay success`);
    *   }
    * });
    * ```
    */
  def updateChannelMediaRelay(
    config: ChannelMediaRelayConfiguration,
    callback: js.Function1[/* err */ Null | ChannelMediaError, Unit]
  ): Unit = js.native
}
