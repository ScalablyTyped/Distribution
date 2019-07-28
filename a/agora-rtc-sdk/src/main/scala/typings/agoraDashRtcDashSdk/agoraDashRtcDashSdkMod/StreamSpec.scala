package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import typings.agoraDashRtcDashSdk.Anon_AEC
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.application
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.screen
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class defining the `spec` paramter in the {@link createStream} method.
  * [[include:StreamSpec-example.md]]
  */
trait StreamSpec extends js.Object {
  /**
    * Marks whether this stream contains an audio track.
    */
  var audio: Boolean
  /** Marks whether to enable audio processing. */
  var audioProcessing: js.UndefOr[Anon_AEC] = js.undefined
  /**
    * Specifies the audio source of the stream.
    */
  var audioSource: js.UndefOr[MediaStreamTrack] = js.undefined
  /**
    * The camera device ID retrieved from the {@link getDevices} method.
    *
    * The retrieved ID is ASCII characters, and the string length is greater than 0 and less than 256 bytes.
    */
  var cameraId: js.UndefOr[String] = js.undefined
  /**
    * The extension ID of the Chrome screen-sharing extension.
    *
    * ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Set this property if you use the Chrome screen-sharing extension. See [Chrome Extension for Screen Sharing](../../../chrome_screensharing_plugin?platform=Web) for details.
    *
    * **Note:**
    *
    * Chrome 72 and later versions support screen sharing without the extension. You can leave `extensionId` as empty.
    *
    * If you set the `extensionId`, then you need to use the screen-sharing extension.
    */
  var extensionId: js.UndefOr[String] = js.undefined
  /**
    * The screen-sharing mode on the Firefox browser.
    *
    * If you are using the Firefox browser, setting this property specifies the screen-sharing mode:
    * - `"screen"`: (default) share the current screen
    * - `"application"`: share all windows of an App
    * - `"window"`: share a specified window of an App
    *
    * **Note:**
    *
    * Firefox on Windows does not support the application mode.
    *
    * See [Screen Sharing on Firefox](../../../screensharing_web?platform=Web#a-name-ff-a-screen-sharing-on-firefox) for details.
    */
  var mediaSource: js.UndefOr[screen | application | window] = js.undefined
  /**
    * The microphone device ID retrieved from the {@link getDevices} method.
    *
    * The retrieved ID is ASCII characters, and the string length is greater than 0 and less than 256 bytes.
    */
  var microphoneId: js.UndefOr[String] = js.undefined
  /**
    * Marks whether the video image of the publisher is mirrored on the publisher’s webpage.
    *
    * The default value is `true` (except in the screen-share mode). Agora recommends enabling this function when using the front camera, and disabling it when using the rear camera.
    */
  var mirror: js.UndefOr[Boolean] = js.undefined
  /**
    * Marks whether this stream contains a screen-sharing track.
    */
  var screen: js.UndefOr[Boolean] = js.undefined
  /**
    * The stream ID.
    *
    * Please set the stream ID as the user ID, which can be retrieved from the callback of {@link Client.join}.
    */
  var streamID: js.UndefOr[Double | String] = js.undefined
  /**
    * Marks whether this stream contains a video track.
    */
  var video: Boolean
  /**
    * Specifies the video source of the stream.
    *
    * **Note:**
    *
    * If you use a video source created by the Canvas API, re-draw on the canvas every one second when the drawing is still to keep the video publishing.
    */
  var videoSource: js.UndefOr[MediaStreamTrack] = js.undefined
}

object StreamSpec {
  @scala.inline
  def apply(
    audio: Boolean,
    video: Boolean,
    audioProcessing: Anon_AEC = null,
    audioSource: MediaStreamTrack = null,
    cameraId: String = null,
    extensionId: String = null,
    mediaSource: screen | application | window = null,
    microphoneId: String = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    screen: js.UndefOr[Boolean] = js.undefined,
    streamID: Double | String = null,
    videoSource: MediaStreamTrack = null
  ): StreamSpec = {
    val __obj = js.Dynamic.literal(audio = audio, video = video)
    if (audioProcessing != null) __obj.updateDynamic("audioProcessing")(audioProcessing)
    if (audioSource != null) __obj.updateDynamic("audioSource")(audioSource)
    if (cameraId != null) __obj.updateDynamic("cameraId")(cameraId)
    if (extensionId != null) __obj.updateDynamic("extensionId")(extensionId)
    if (mediaSource != null) __obj.updateDynamic("mediaSource")(mediaSource.asInstanceOf[js.Any])
    if (microphoneId != null) __obj.updateDynamic("microphoneId")(microphoneId)
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror)
    if (!js.isUndefined(screen)) __obj.updateDynamic("screen")(screen)
    if (streamID != null) __obj.updateDynamic("streamID")(streamID.asInstanceOf[js.Any])
    if (videoSource != null) __obj.updateDynamic("videoSource")(videoSource)
    __obj.asInstanceOf[StreamSpec]
  }
}

