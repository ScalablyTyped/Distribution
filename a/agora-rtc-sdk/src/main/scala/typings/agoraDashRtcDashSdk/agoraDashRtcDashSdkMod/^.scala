package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import typings.agoraDashRtcDashSdk.Anon_Audio
import typings.agoraDashRtcDashSdk.Anon_Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agora-rtc-sdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * The version of the Agora Web SDK.
    *
    * @example `AgoraRTC.VERSION`
    */
  val VERSION: String = js.native
  /**
    * Checks the Web Browser Compatibility
    *
    * This method checks the compatibility between the Web SDK and the current web browser.
    *
    * Use this method before calling {@link createClient} to check the compatibility between the system and the web browser.
    *
    * **Note:**
    *
    * Agora has yet to conduct comprehensive tests on Chromium kernel browsers, such as QQ and 360.
    * Agora will gradually achieve compatibility on most mainstream browsers in subsequent versions of the Web SDK.
    * @returns - true: The Web SDK is compatible with the current web browser.
    * - false: The Web SDK is not compatible with the current web browser.
    */
  def checkSystemRequirements(): Boolean = js.native
  /**
    * Creates a Client Object
    *
    * This method creates and returns a client object. You can only call this method once each call session.
    * @example `AgoraRTC.createClient(config)`
    * @param config Defines the property of the client, see {@link ClientConfig} for details.
    */
  def createClient(config: ClientConfig): Client = js.native
  /**
    * Creates a Stream Object
    *
    * This method creates and returns a stream object.
    * @example `AgoraRTC.createStream(spec)`
    * @param spec Defines the properties of the stream, see {@link StreamSpec} for details.
    */
  def createStream(spec: StreamSpec): Stream = js.native
  /**
    * Enumerates the Media Devices
    *
    * This method enumerates the available media input and output devices, such as microphones, cameras, headsets, and so on.
    *
    * If this method succeeds, the SDK returns a list of media devices in an array of {@link MediaDeviceInfo} objects.
    * @example
    * **Sample Code**
    *
    * ``` javascript
    * AgoraRTC.getDevices (function(devices) {
    * var devCount = devices.length;
    *
    * var id = devices[0].deviceId;
    * });
    * ```
    */
  def getDevices(callback: js.Function1[/* devices */ js.Array[MediaDeviceInfo], Unit]): Unit = js.native
  /**
    * Gets the Sources for Screen-sharing
    *
    * To share the screen on Electron, call this method to get the screen sources. See [Share the Screen](../../screensharing_web?platform=Web#electron) for details.
    *
    * If this method succeeds, the SDK returns a list of screen sources in an array of {@link DesktopCapturerSource} objects.
    * @example **Sample Code**
    * ```javascript
    * AgoraRTC.getScreenSources(function(err, sources) {
    *   console.log(sources)
    * }
    * ```
    */
  def getScreenSources(callback: js.Function1[/* sources */ js.Array[DesktopCapturerSource], Unit]): Unit = js.native
  /**
    * Gets the supported codec of the web browser
    *
    * This method returns the codecs supported by both the Agora Web SDK and the web browser. The Agora Web SDK supports VP8 and H.264 for video, and OPUS for audio.
    *
    * This method supports all web browsers. For web browsers that do not support WebRTC or are not recognized, the returned codec list is empty.
    *
    * @returns  Returns a `Promise` object. In the `.then(function(result){})` callback, `result` has the following properties:
    * - `video`: array, the supported video codecs. The array might include `"H264"` and `"VP8"`, or be empty.
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
  def getSupportedCodec(): js.Promise[Anon_Audio] = js.native
  def getSupportedCodec(supportedCodecOptions: Anon_Stream): js.Promise[Anon_Audio] = js.native
}

