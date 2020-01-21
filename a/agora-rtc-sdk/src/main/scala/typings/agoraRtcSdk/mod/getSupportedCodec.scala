package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.AnonAudio
import typings.agoraRtcSdk.AnonStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agora-rtc-sdk", "getSupportedCodec")
@js.native
object getSupportedCodec extends js.Object {
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
  def apply(): js.Promise[AnonAudio] = js.native
  def apply(supportedCodecOptions: AnonStream): js.Promise[AnonAudio] = js.native
}

