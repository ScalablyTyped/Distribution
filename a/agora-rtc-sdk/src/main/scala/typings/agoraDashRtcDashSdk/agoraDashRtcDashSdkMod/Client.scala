package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import typings.agoraDashRtcDashSdk.Anon_Attr
import typings.agoraDashRtcDashSdk.Anon_AudioVideo
import typings.agoraDashRtcDashSdk.Anon_Bitrate
import typings.agoraDashRtcDashSdk.Anon_Code
import typings.agoraDashRtcDashSdk.Anon_CurState
import typings.agoraDashRtcDashSdk.Anon_Forceturn
import typings.agoraDashRtcDashSdk.Anon_Reason
import typings.agoraDashRtcDashSdk.Anon_Role
import typings.agoraDashRtcDashSdk.Anon_Stream_1783294717
import typings.agoraDashRtcDashSdk.Anon_Uid
import typings.agoraDashRtcDashSdk.Anon_UidString
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkNumbers.`0`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkNumbers.`1`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkNumbers.`2`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`active-speaker`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`aes-128-ecb`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`aes-128-xts`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`aes-256-xts`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`camera-changed`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`client-banned`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`client-role-changed`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`connection-state-change`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`mute-audio`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`mute-video`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`network-quality`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`network-type-changed`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`peer-leave`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`peer-online`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`playout-device-changed`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`recording-device-changed`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`stream-added`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`stream-fallback`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`stream-published`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`stream-reconnect-end`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`stream-reconnect-start`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`stream-removed`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`stream-subscribed`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`stream-type-changed`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`stream-updated`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`unmute-audio`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`unmute-video`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.`volume-indicator`
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.audience
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.error
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.exception
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.host
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.liveStreamingFailed
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.liveStreamingStarted
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.liveStreamingStopped
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.liveTranscodingUpdated
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.onTokenPrivilegeDidExpire
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.onTokenPrivilegeWillExpire
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.streamInjectedStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Client object returned by the {@link createClient} method provides access to much of the core AgoraRTC functionality.
  */
@js.native
trait Client extends js.Object {
  /**
    * Injects an Online Media Stream to a Live Broadcast
    *
    * The `streamInjectedStatus` callback returns the inject status.If this method is called successfully, the server pulls the voice or video stream and injects it into a live channel.
    * This is applicable to scenarios where all of the audience members in the channel can watch a live show and interact with each other.
    * @param url URL address of the live streaming. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    * Valid protocols are RTMP, HLS, and FLV.
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
    * **Note:**
    *
    * Call {@link configPublisher} before {@link Client.join}.
    *
    * @example **Sample Code**
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
    * @example **Sample Code**
    * ``` javascript
    * client.disableDualStream(function() {
    *   console.log("Disable dual stream success!")
    * }, function(err) {
    *   console.log(err)
    * })
    * ```
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails.
    */
  def disableDualStream(): Unit = js.native
  def disableDualStream(onSuccess: js.Function0[Unit]): Unit = js.native
  def disableDualStream(onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  /**
    * Enables Volume Indicator
    *
    * This method enables the SDK to report the active remote users who are speaking and their volume regularly.
    *
    * If this method is enabled, the SDK will return the volumes every two seconds, regardless of whether there are active speakers.
    *
    * **Note:**
    *
    * - If you have multiple web pages running the Web SDK, this function might not work.
    * @example **Sample Code**
    * ``` javascript
    * client.enableAudioVolumeIndicator(); // Triggers the "volume-indicator" callback event every two seconds.
    * client.on("volume-indicator", function(evt){
    *     evt.attr.forEach(function(volume, index){
    *             console.log(#{index} UID ${volume.uid} Level ${volume.level});
    *     });
    * });
    * ```
    */
  def enableAudioVolumeIndicator(): Unit = js.native
  /**
    * Enables Dual Stream
    *
    * This method enables the dual-stream mode on the publisher side.
    *
    * Dual streams are a hybrid of a high-video stream and a low-video stream:
    *
    * - High-video stream: high bitrate, high resolution
    * - Low-video stream: low bitrate, low resolution
    *
    * @example **Sample Code**
    * ``` javascript
    * client.enableDualStream(function() {
    *   console.log("Enable dual stream success!")
    * }, function(err) {
    *   console,log(err)
    * })
    * ```
    *
    * **Note:**
    *
    * This method does not apply to the following scenarios:
    *
    * -   The stream is created by defining the [[audioSource]] and [[videoSource]] properties.
    * -   Audio-only mode (audio: true, video: false)
    * -   Safari browser on iOS
    * -   Screen-sharing scenario
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails.
    */
  def enableDualStream(): Unit = js.native
  def enableDualStream(onSuccess: js.Function0[Unit]): Unit = js.native
  def enableDualStream(onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  /**
    * Enumerates Video Input Devices
    *
    * This method enumerates the available video input devices, such as cameras.
    *
    * If this method succeeds, the SDK returns a list of video input devices in an array of [[MediaDeviceInfo]] objects.
    */
  def getCameras(callback: js.Function1[/* devices */ MediaDeviceInfo, Unit]): Unit = js.native
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
    * **Note:**
    *
    * - Some of the statistics are calculated after the `stream-published` event, which may take at most 3 seconds.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the local audio stream.
    *
    * @example **Sample Code**
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
    * **Note:**
    *
    * - Some of the statistics are calculated after the `stream-published` event, which may take at most 3 seconds.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the local video stream.
    *
    * @example **Sample Code**
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
    * **Note:**
    *
    * Chrome 61+ is required for this function, and the compatibility is not guaranteed.
    * See [Network Information API](https://developer.mozilla.org/en-US/docs/Web/API/Network_Information_API) for details.
    *
    * @param callback The callback contains the statistics of the system network.
    *
    * @example **Sample Code**
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
    */
  def getPlayoutDevices(callback: js.Function1[/* devices */ MediaDeviceInfo, Unit]): Unit = js.native
  /**
    * Enumerates Audio Input Devices
    *
    * This method enumerates the available audio input devices, such as microphones.
    *
    * If this method succeeds, the SDK returns a list of audio input devices in an array of [[MediaDeviceInfo]] objects.
    */
  def getRecordingDevices(callback: js.Function1[/* devices */ MediaDeviceInfo, Unit]): Unit = js.native
  /**
    * Retrieves the Audio Statistics of the Remote Stream
    *
    * This method retrieves the audio statistics of the remote stream, including audio codec type, packet loss rate, bitrate, and so on.
    *
    * **Note:**
    *
    * - The statistics are calculated after the `stream-subscribed` event, which may take at most 3 seconds.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the remote audio stream.
    *
    * @example **Sample Code**
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
    * **Note:**
    *
    * - The statistics are calculated after the `stream-subscribed` event, which may take at most 3 seconds.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the remote video stream.
    *
    * @example **Sample Code**
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
    * **Note:**
    *
    * - This method should be called after joining the channel, and it may take at most 3 seconds to retrieve the statistics.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the session connection.
    *
    * @example **Sample Code**
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
    * **Note:**
    *
    * This feature is experimental, see [Battery Status API](https://developer.mozilla.org/en-US/docs/Web/API/Battery_Status_API) for browser compatibility.
    *
    * @param callback The callback contains the statistics of the system.
    *
    * @example **Sample Code**
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
    * **Note:**
    *
    * - Calculation of the statistics may take at most 3 seconds.
    * - This method supports the Chrome browser only.
    *
    * @param callback The callback contains the statistics of the transmission quality.
    *
    * @example **Sample Code**
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
    * @example **Sample Code**
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
    * @param appId Pass in the App ID for your project. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * To get your App ID, see [Get an App ID](../../../web_prepare?platform=Web#create-an-agora-account-and-get-an-app-id).
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails.
    */
  def init(appId: String): Unit = js.native
  def init(appId: String, onSuccess: js.Function0[Unit]): Unit = js.native
  def init(appId: String, onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
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
    onFailure: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Joins an AgoraRTC Channel
    *
    * This method joins an AgoraRTC channel.
    * @example **Sample Code**
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
    * - High security requirements: Pass the string of the Token or Channel Key as the parameter value. See [Use Security Keys](../../../token) for details.
    * @param channel A string that provides a unique channel name for the Agora session. The length must be within 64 bytes. Supported character scopes:
    *
    *  - 26 lowercase English letters a-z
    *  - 26 uppercase English letters A-Z
    *  - 10 numbers 0-9
    *  - Space
    *  - "!", "#", "$", "%", "&", "(", ")", "+", "-", ":", ";", "<", "=", ".", ">", "?", "@", "[", "]", "^", "_", "{", "}", "|", "~", ","
    * @param uid The user ID, an integer or a string, ASCII characters only. Ensure this ID is unique.
    *            If you set the uid to `null`, the server assigns one and returns it in the `onSuccess` callback.
    *
    * **Note:**
    *
    * - All users in the same channel should have the same type (number or string) of `uid`.
    * - If you use a number as the user ID, it should be a 32-bit unsigned integer with a value ranging from 0 to (2<sup>32</sup>-1).
    * - If you use a string as the user ID, the maximum length is 255 characters.
    * @param onSuccess The callback when the method succeeds. The server returns the uid which represents the identity of the user.
    * @param onFailure The callback when the method fails.
    */
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
    onFailure: js.Function1[/* err */ js.Any, Unit]
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
    onFailure: js.Function1[/* err */ js.Any, Unit]
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
    onFailure: js.Function1[/* err */ js.Any, Unit]
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
    onFailure: js.Function1[/* err */ js.Any, Unit]
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
    onFailure: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Leaves an AgoraRTC Channel
    *
    * This method enables a user to leave a channel.
    * @example **Sample Code**
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
    * @param onFailure The callback when the method fails.
    */
  def leave(): Unit = js.native
  def leave(onSuccess: js.Function0[Unit]): Unit = js.native
  def leave(onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  /**
    * This callback notifies the application who is the active speaker in the channel.
    * @example **Sample Code**
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
    * @example **Sample Code**
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
    * This callback notifies the peer user that he/she is banned from the channel. Only the banned users receive this callback.
    * @example **Sample Code**
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
    * @example **Sample Code**
    *
    * ```javascript
    * client.on('client-role-changed', function(evt) {
    *   console.log('client-role-changed', evt.role);
    * });
    * ```
    */
  @JSName("on")
  def on_clientrolechanged(event: `client-role-changed`, callback: js.Function1[/* evt */ Anon_Role, Unit]): Unit = js.native
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
    * @example **Sample Code**
    *
    * ``` javascript
    * client.on("connection-state-change", function(evt) {
    *   console.log(evt.prevState, evt.curState);
    * })
    * ```
    */
  @JSName("on")
  def on_connectionstatechange(event: `connection-state-change`, callback: js.Function1[/* evt */ Anon_CurState, Unit]): Unit = js.native
  /**
    * Occurs when an error message is reported and requires error handling.
    * @example **Sample Code**
    * ``` javascript
    * client.on("error", function(err) {
    *     console.log("Got error msg:", err.reason);
    *   });
    *
    * ```
    *
    * For details, see [Error Codes and Warning Codes](../../../the_error_web).
    */
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
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
    * **Note:**
    *
    * This callback supports only the Chrome browser.
    * @example **Sample Code**
    * ``` javascript
    * client.on("exception", function(evt) {
    *   console.log(evt.code, evt.msg, evt.uid);
    * })
    * ```
    */
  @JSName("on")
  def on_exception(event: exception, callback: js.Function1[/* evt */ Anon_Code, Unit]): Unit = js.native
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
    */
  @JSName("on")
  def on_liveTranscodingUpdated(event: liveTranscodingUpdated, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the peer user mutes the audio.
    * @example **Sample Code**
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
    * @example **Sample Code**
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
    * **Note:**
    *
    * This is an experimental feature and the network quality rating is for reference only.
    *
    * @example **Sample Code**
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
    * @example **Sample Code**
    * ``` javascript
    * client.on("network-type-changed", function(evt) {
    *     console.log("Network Type Changed to", evt.networkType);
    *   });
    *
    * ```
    *
    * Note:
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
    * @example **Sample Code**
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
    * @example **Sample Code**
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
    * Occurs when the peer user leaves the channel; for example, the peer user calls {@link Client.leave}.
    * @example **Sample Code**
    * ``` javascript
    * client.on("peer-leave", function(evt) {
    *     var uid = evt.uid;
    *     console.log("remote user left ", uid);
    *     //……
    * });
    *
    * ```
    */
  @JSName("on")
  def on_peerleave(event: `peer-leave`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when a remote user or host joins the channel.
    *
    * - Communication channel (rtc mode): This callback notifies the app that another user joins the channel.
    *   If other users are already in the channel, the SDK also reports to the app on the existing users.
    * - Live-broadcast channel (live mode): This callback notifies the app that the host joins the channel.
    * If other hosts are already in the channel, the SDK also reports to the app on the existing hosts. Agora recommends limiting the number of hosts to 17.
    *
    * @example **Sample Code**
    *
    * ```javascript
    * client.on('peer-online', function(evt) {
    *   console.log('peer-online', evt.uid);
    * });
    * ```
    *
    */
  @JSName("on")
  def on_peeronline(event: `peer-online`, callback: js.Function1[/* evt */ Anon_UidString, Unit]): Unit = js.native
  /**
    * Occurs when an audio output device is added or removed.
    * @example **Sample Code**
    * ``` javascript
    * client.on("playout-device-changed", function(evt) {
    *     console.log("Playout Device Changed", evt.state, evt.device);
    *   });
    *
    * ```
    *
    * **Note:**
    *
    * Only supports Chrome 49+.
    */
  @JSName("on")
  def on_playoutdevicechanged(event: `playout-device-changed`, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when an audio input device is added or removed.
    * @example **Sample Code**
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
    * @example **Sample Code**
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
    * **Note:**
    *
    * Once the remote media stream is switched to the low stream due to unreliable network conditions,
    * you can monitor the stream switch between a high stream and low stream in the `stream-type-changed` callback.
    */
  @JSName("on")
  def on_streamfallback(event: `stream-fallback`, callback: js.Function1[/* evt */ Anon_Attr, Unit]): Unit = js.native
  /**
    * Occurs when the local stream is published.
    * @example **Sample Code**
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
    * @example **Sample Code**
    *
    * ``` javascript
    * client.on('stream-reconnect-end', function(evt) {
    *   console.log(evt.uid, evt.success, evt.reason);
    * })
    * ```
    */
  @JSName("on")
  def on_streamreconnectend(event: `stream-reconnect-end`, callback: js.Function1[/* evt */ Anon_Reason, Unit]): Unit = js.native
  /**
    * Occurs when the SDK starts republishing or re-subscribing to a stream.
    *
    * @example **Sample Code**
    *
    * ``` javascript
    * client.on("stream-reconnect-start", function(evt) {
    *   console.log(evt.uid);
    * })
    * ```
    */
  @JSName("on")
  def on_streamreconnectstart(event: `stream-reconnect-start`, callback: js.Function1[/* evt */ Anon_Uid, Unit]): Unit = js.native
  /**
    * Occurs when the remote stream is removed; for example, a peer user calls {@link Client.unpublish}.
    * @example **Sample Code**
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
    * @example **Sample Code**
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
    * It happens when a high-video stream changes to a low-video stream, or vice versa.
    *
    * The stream type (streamType):
    *
    * - 0: High-bitrate, high-resolution video stream.
    * - 1: Low-bitrate, low-resolution video stream.
    * @example **Sample Code**
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
    * Occurs when a remote stream adds or removes a track.
    *
    * When a remote stream calls the [[addTrack]] or [[removeTrack]] method, the SDK triggers this callback.
    */
  @JSName("on")
  def on_streamupdated(event: `stream-updated`, callback: js.Function1[/* evt */ Anon_Stream_1783294717, Unit]): Unit = js.native
  /**
    * Occurs when the peer user unmutes the audio.
    * @example **Sample Code**
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
    * @example **Sample Code**
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
    * @example **Sample Code**
    * ``` javascript
    * client.on("volume-indicator", function(evt){
    *     evt.attr.forEach(function(volume, index){
    *     console.log(`#{index} UID ${volume.uid} Level ${volume.level}`);
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
    * **Note:**
    *
    * In a live broadcast, whoever calls this API is the host.
    * @example **Sample Code**
    * ``` javascript
    * client.publish(stream, function(err) {
    *     console.log(err);
    *     //……
    * })
    * ```
    * @param stream Stream object, which represents the local stream.
    * @param onFailure The callback when the method fails.
    */
  def publish(stream: Stream): Unit = js.native
  def publish(stream: Stream, onFailure: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
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
    * @param onFailure The callback when the method fails.
    */
  def renewChannelKey(key: String): Unit = js.native
  def renewChannelKey(key: String, onSuccess: js.Function0[Unit]): Unit = js.native
  def renewChannelKey(key: String, onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
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
    * Sets the role of the user.
    *
    * This method is applicable only to the live mode.
    *
    * Sets the role of the user such as a host or an audience (default), before joining a channel.
    *
    * This method can be used to switch the user role after the user joins a channel.
    *
    * In live mode ([[mode]] is set as `live`):
    *
    * - Before joining the channel, you can call this method to set the role.
    *
    * - After joining the channel, you can call this method to switch the role:
    *
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
    * @example **Sample Code**
    *
    * ``` javascript
    * client.setClientRole('host', function() {
    *   console.log("setHost success");
    * }, function(e) {
    *   console.log("setHost failed", e);
    * })
    * ```
    *
    *
    */
  @JSName("setClientRole")
  def setClientRole_audience(role: audience): Unit = js.native
  @JSName("setClientRole")
  def setClientRole_audience(role: audience, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  @JSName("setClientRole")
  def setClientRole_host(role: host): Unit = js.native
  @JSName("setClientRole")
  def setClientRole_host(role: host, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  @JSName("setEncryptionMode")
  def setEncryptionMode_aes128ecb(encryptionMode: `aes-128-ecb`): Unit = js.native
  /**
    * Sets the Encryption Mode
    *
    * This method sets the encryption mode.
    *
    * **Note:**
    *
    * Ensure that you call this API before {@link Client.join}.
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
    * This method enables the built-in encryption.
    *
    * **Note:**
    *
    * Ensure that you call this API before {@link Client.join}.
    * @example `client.setEncryptionSecret(password)`
    * @param password The encryption password. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    */
  def setEncryptionSecret(password: String): Unit = js.native
  /**
    * Sets Live Transcoding
    *
    * This method sets the video layout and audio for CDN live.
    *
    * **Note:**
    *
    * Call {@link setLiveTranscoding} after {@link createStream}. For details, see [Push Streams to the CDN](../../../push_stream_web).
    * @param coding Transcoding settings, see {@link LiveTranscoding} for details.
    */
  def setLiveTranscoding(coding: LiveTranscoding): Unit = js.native
  /**
    * Sets the Low-video Stream Parameter
    *
    * If you enabled the dual-stream mode by calling {@link Client.enableDualStream}, use this method to set the low-video stream profile.
    *
    * If you do not set the low-video stream profile, the SDK will assign default values based on your stream video profile.
    *
    * **Note:**
    * - As different web browsers have different restrictions on the video profile, the parameters you set may fail to take effect.
    * The Firefox browser has a fixed frame rate of 30 fps, therefore the frame rate settings do not work on the Firefox browser.
    * - Due to limitations of some devices and browsers, the resolution you set may fail to take effect and get adjusted by the browser.
    * In this case, billings will be calculated based on the actual resolution.
    * - Call {@link Client.join} before using this method.
    * - Screen sharing supports the high-video stream only.
    * @param param Sets the video profile of the low-video stream.
    */
  def setLowStreamParameter(param: Anon_Bitrate): Unit = js.native
  def setProxyServer(): Unit = js.native
  /**
    * Deploys the Nginx Server
    *
    * Use this method to deploy the Nginx server.
    *
    * **Note:**
    *
    * - Ensure that you call this API before {@link Client.join}.
    * - Proxy services by different service providers may result in slow performance if you are using the Firefox browser.
    *   Therefore, Agora recommends using the same service provider for the proxy services. If you use different service providers, Agora recommends not using the Firefox browser.
    * @example `client.setProxyServer(proxyServer);`
    * @param proxyServer Your Nginx server domain name. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    */
  def setProxyServer(proxyServer: String): Unit = js.native
  /**
    * Sets the Remote Video-stream Type
    *
    * When a remote user sends dual streams, this method decides on which stream to receive on the subscriber side. If this method is not used, the subscriber receives the high-video stream.
    *
    * @example **Sample Code**
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
  def setRemoteVideoStreamType_0(stream: Stream, streamType: `0`): Unit = js.native
  @JSName("setRemoteVideoStreamType")
  def setRemoteVideoStreamType_1(stream: Stream, streamType: `1`): Unit = js.native
  /**
    * Sets Stream Fallback Option
    *
    * Use this method to set stream fallback option on the receiver.
    *
    * Under poor network conditions, the SDK can choose to subscribe to the low-video stream or only the audio stream.
    *
    * **Note:**
    *
    * This method can only be used when the publisher has enabled the dual-stream mode by {@link enableDualStream}.
    * @param stream The remote stream object.
    * @param fallbackType The fallback option:
    * - 0: Disable the fallback.
    * - 1: (Default) Automatically subscribe to the low-video stream under poor network.
    * - 2: Under poor network, the SDK may subscribe to the low-video stream (of lower resolution and lower bitrate) first,
    *      but if the network still does not allow displaying the video, the SDK will receive audio only.
    * @example **Sample Code**
    * ```javascript
    * // The sender side, after publishing the high stream
    * client.enableDualStream();
    *
    * // The receiver side, set the fallback option as 2
    * client.setStreamFallbackOption(remoteStream, 2);
    * ```
    */
  @JSName("setStreamFallbackOption")
  def setStreamFallbackOption_0(stream: Stream, fallbackType: `0`): Unit = js.native
  @JSName("setStreamFallbackOption")
  def setStreamFallbackOption_1(stream: Stream, fallbackType: `1`): Unit = js.native
  @JSName("setStreamFallbackOption")
  def setStreamFallbackOption_2(stream: Stream, fallbackType: `2`): Unit = js.native
  def setTurnServer(): Unit = js.native
  /**
    * Deploys the TURN Server
    *
    * Use this method to deploy the TURN server.
    *
    * **Note:**
    *
    * Ensure that you call this API before {@link Client.join}.
    * @example `client.setTurnServer(config);`
    * @param turnServer The TURN server settings.
    */
  def setTurnServer(turnServer: Anon_Forceturn): Unit = js.native
  /**
    * Starts a Live Stream
    *
    * This method starts a live stream.
    * @example **Sample Code**
    * ``` javascript
    * client.setLiveTranscoding(<coding>);
    * client.startLiveStreaming(<url>, true)
    * ```
    *
    * **Note:**
    *
    * Call {@link startLiveStreaming} after {@link createStream}. For details, see [Push Streams to the CDN](../../../push_stream_web).
    * @param url URL address for the live stream. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    * @param enableTranscoding Marks whether to enable live transcoding. If set as `true`, {@link setLiveTranscoding} must be called before this method.
    */
  def startLiveStreaming(url: String): Unit = js.native
  def startLiveStreaming(url: String, enableTranscoding: Boolean): Unit = js.native
  /**
    * Stops Live Streaming
    *
    * This method stops and deletes the live streaming.
    * @param url URL address of the live streaming. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    */
  def stopLiveStreaming(url: String): Unit = js.native
  /**
    * Subscribes to a Remote Stream
    *
    * This method enables a user to subscribe to a remote stream.
    *
    * @param stream Stream object, which represents the remote stream.
    * @param options Sets whether to receive the video or audio data independently by the `video` and `audio` parameters.
    *
    * **Note:**
    *
    * - `video` and `audio` cannot be set as `false` at the same time. If you need to stop subscribing to the stream, call [[Client.unsubscribe]] instead.
    * - Safari does not support independent subscription. Set `options` as `null` for Safari, otherwise the`SAFARI_NOT_SUPPORTED_FOR_TRACK_SUBSCRIPTION` error occurs.
    * @param onFailure The callback when the method fails.
    *
    * @example
    * **Sample Code**
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
    * **Sample Code**
    * ```javascript
    * // Initially, subscribe to the stream and receive only the video data
    * client.subscribe(stream, {video: true, audio: false});
    *
    * // After a while, switch to receiving only the audio data
    * client.subscribe(stream, {video: false, audio: true});
    * ```
    */
  def subscribe(stream: Stream): Unit = js.native
  def subscribe(stream: Stream, options: Anon_AudioVideo): Unit = js.native
  def subscribe(stream: Stream, options: Anon_AudioVideo, onFailure: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  /**
    * Unpublishes the Local Stream
    *
    * This method unpublishes the local stream.
    * @example
    * **Sample Code**
    * ``` javascript
    * client.unpublish(stream, function(err) {
    *     console.log(err);
    *     //……
    * })
    *
    * ```
    * @param stream Stream object, which represents the local stream.
    * @param onFailure The callback when the method fails.
    */
  def unpublish(stream: Stream): Unit = js.native
  def unpublish(stream: Stream, onFailure: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  /**
    * Unsubscribes from the Remote Stream
    *
    * This method enables the user to unsubscribe from the remote stream.
    * @example
    * **Sample Code**
    * ``` javascript
    * client.unsubscribe(stream, function(err) {
    *     console.log(err);
    *     //……
    * })
    *
    * ```
    * @param stream Stream object, which represents the remote stream.
    * @param onFailure The callback when the method fails.
    */
  def unsubscribe(stream: Stream): Unit = js.native
  def unsubscribe(stream: Stream, onFailure: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

