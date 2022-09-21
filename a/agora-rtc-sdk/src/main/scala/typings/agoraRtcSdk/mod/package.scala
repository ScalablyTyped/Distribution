package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.agoraRtcSdk.anon.Audio
import typings.agoraRtcSdk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * The version of the Agora Web SDK.
  *
  * @example `AgoraRTC.VERSION`
  */
inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

/**
  * Checks the Web Browser Compatibility
  *
  * This method checks the compatibility between the Web SDK and the current web browser.
  *
  * Use this method before calling {@link createClient} to check the compatibility between the system and the web browser.
  *
  * **Note**
  *
  * - Both the type and version of the browser affect the return value.
  * - Agora has not conducted comprehensive tests on some Chromium kernel browsers, such as QQ and 360. You can call this method to check if the SDK supports the browser.
  * @returns - `true`: The Web SDK is compatible with the current web browser.
  * - `false`: The Web SDK is not compatible with the current web browser.
  */
inline def checkSystemRequirements(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSystemRequirements")().asInstanceOf[Boolean]

/**
  * Creates a Client Object
  *
  * This method creates and returns a client object. You can only call this method once each call session.
  * @example `AgoraRTC.createClient(config)`
  * @param config Defines the property of the client, see {@link ClientConfig} for details.
  */
inline def createClient(config: ClientConfig): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(config.asInstanceOf[js.Any]).asInstanceOf[Client]

/**
  * Creates a Stream Object
  *
  * This method creates and returns a stream object.
  * @example `AgoraRTC.createStream(spec)`
  * @param spec Defines the properties of the stream, see {@link StreamSpec} for details.
  */
inline def createStream(spec: StreamSpec): Stream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(spec.asInstanceOf[js.Any]).asInstanceOf[Stream]

/**
  * Enumerates the media devices
  *
  * This method enumerates the available media input and output devices, such as microphones, cameras, headsets, and so on.
  *
  * If this method succeeds, the SDK returns a list of media devices in an array of {@link MediaDeviceInfo} objects.
  *
  * **Note**
  *
  * - On Chrome 81 or later, Safari, and Firefox, device IDs are only available after the user has granted permissions to use the media device. See [Why can't I get device ID on Chrome 81?](https://docs.agora.io/en/faq/empty_deviceId)
  * - You cannot get the `"audioinput"` device on Firefox and Safari.
  *
  * @example
  * **Sample code**
  *
  * ``` javascript
  * AgoraRTC.getDevices (function(devices) {
  * var devCount = devices.length;
  *
  * var id = devices[0].deviceId;
  * }, function(errStr){
  *      console.error("Failed to getDevice", errStr);
  * });
  * ```
  *
  * @param callback The callback when the method succeeds. The SDK returns a list of media devices in an array of {@link MediaDeviceInfo} objects.
  * @param callback_Error The callback when the method fails. See the detailed error message in the `errStr` parameter.
  */
inline def getDevices(callback: js.Function1[/* devices */ js.Array[MediaDeviceInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def getDevices(
  callback: js.Function1[/* devices */ js.Array[MediaDeviceInfo], Unit],
  callback_Error: js.Function1[/* errStr */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(callback.asInstanceOf[js.Any], callback_Error.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Gets the Sources for Screen-sharing
  *
  * To share the screen in Electron, call this method to get the screen sources. See [Share the Screen](../../screensharing_web?platform=Web#electron) for details.
  *
  * If this method succeeds, the SDK returns a list of screen sources in an array of {@link DesktopCapturerSource} objects.
  * @example **Sample code**
  * ```javascript
  * AgoraRTC.getScreenSources(function(err, sources) {
  *   console.log(sources)
  * }
  * ```
  */
inline def getScreenSources(callback: js.Function1[/* sources */ js.Array[DesktopCapturerSource], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenSources")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Gets the supported codec of the web browser
  *
  * This method returns the codecs supported by both the Agora Web SDK and the web browser. The Agora Web SDK supports VP8, VP9 and H.264 for video, and OPUS for audio.
  *
  * **Note**
  *
  * - This method supports all web browsers. For web browsers that do not support WebRTC or are not recognized, the returned codec list is empty.
  * - The returned codec list is based on the [SDP](https://tools.ietf.org/html/rfc4566) used by the web browser and for reference only.
  * - Some Android phones might claim to support H.264 but have problems in communicating with other platforms using H.264. In this case, we recommend using the VP8 or VP9 codec.
  *
  * @returns  Returns a `Promise` object. In the `.then(function(result){})` callback, `result` has the following properties:
  * - `video`: array, the supported video codecs. The array might include `"H264"`, `"VP8"` and `"VP9"`, or be empty.
  * - `audio`: array, the supported audio codecs. The array might include `"OPUS"`, or be empty.
  *
  * @example
  * **Sample code**
  *
  * ``` javascript
  * // Gets the supported decoding formats as the receiver
  * AgoraRTC.getSupportedCodec()
  *   .then(function(result){
  *     console.log(`Supported video codec: ${result.video.join(",")}`);
  *     console.log(`Supported audio codec: ${result.audio.join(",")}`);
  *   });
  *
  * // Gets the supported encoding formats as the sender
  * navigator.mediaDevices.getUserMedia({video: true, audio: true})
  *  .then(function(mediaStream){
  *     return AgoraRTC.getSupportedCodec({stream: mediaStream});
  *  })
  *  .then(function(result){
  *     console.log(`Supported video codec: ${result.video.join(",")}`);
  *     console.log(`Supported audio codec: ${result.audio.join(",")}`);
  *  });
  * ```
  */
inline def getSupportedCodec(): js.Promise[Audio] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedCodec")().asInstanceOf[js.Promise[Audio]]
inline def getSupportedCodec(supportedCodecOptions: typings.agoraRtcSdk.anon.Stream): js.Promise[Audio] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedCodec")(supportedCodecOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Audio]]

/**
  * A list of `LocalAudioStats` objects, one per uid.
  *
  * If {@link getLocalAudioStats} is called successfully, this interface provides the UID and [[LocalAudioStats]] of the local user.
  */
type LocalAudioStatsMap = StringDictionary[LocalAudioStats]

/**
  * A list of `LocalVideoStats` objects, one per uid.
  *
  * If {@link getLocalVideoStats} is called successfully, this interface provides the UID and [[LocalVideoStats]] of each remote user.
  */
type LocalVideoStatsMap = StringDictionary[LocalVideoStats]

/**
  * A list of `RemoteAudioStats` objects, one per uid.
  *
  * If {@link getRemoteAudioStats} is called successfully, this interface provides the UID and [[RemoteAudioStats]] of each remote user.
  */
type RemoteAudioStatsMap = StringDictionary[RemoteAudioStats]

/**
  * A list of `RemoteVideoStats` objects, one per uid.
  *
  * If {@link getRemoteVideoStats} is called successfully, this interface provides the UID and [[RemoteVideoStats]] of each remote user.
  */
type RemoteVideoStatsMap = StringDictionary[RemoteVideoStats]
