package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.AnonAEC
import typings.agoraRtcSdk.agoraRtcSdkStrings.application
import typings.agoraRtcSdk.agoraRtcSdkStrings.screen
import typings.agoraRtcSdk.agoraRtcSdkStrings.window
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
  var audioProcessing: js.UndefOr[AnonAEC] = js.undefined
  /**
    * Specifies the audio source of the stream.
    */
  var audioSource: js.UndefOr[MediaStreamTrack] = js.undefined
  /**
    * The camera device ID retrieved from the {@link getDevices} method.
    *
    * The retrieved ID is ASCII characters, and the string length is greater than or equals to 0 and less than 256 bytes.
    *
    * When the string length is 0, this property is ignored.
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
    * Sets using the front or rear camera
    *
    * You can set this parameter to use the front or rear camera on mobile devices:
    * - `"user"`: The front camera.
    * - `"environment"`: The rear camera.
    */
  var facingMode: js.UndefOr[String] = js.undefined
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
    * The retrieved ID is ASCII characters, and the string length is greater than or equals to 0 and less than 256 bytes.
    *
    * When the string length is 0, this property is ignored.
    */
  var microphoneId: js.UndefOr[String] = js.undefined
  /**
    * Marks whether to mirror the local video image of the publisher in the local preview.
    *
    * This setting does not take effect in screen-sharing streams.
    *
    * - `true`: (Default) Mirror the local video.
    * - `false`: Do not mirror the local video.
    *
    *  Agora recommends enabling this function when using the front camera, and disabling it when using the rear camera.
    */
  var mirror: js.UndefOr[Boolean] = js.undefined
  /**
    * Marks whether this stream contains a screen-sharing track. See [Share the Screen](../../../screensharing_web?platform=Web) for details.
    */
  var screen: js.UndefOr[Boolean] = js.undefined
  /**
    * Marks whether to share the audio playback when sharing the screen.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    *
    * - `true`: Share the local audio playback when sharing the screen.
    * - `false`: (Default) Do not share the local audio playback when sharing the screen.
    *
    * To share the local audio playback when sharing the screen, ensure that you set {@link screen} as `true`. We recommend also setting {@link audio} as `false`. If both `screenAudio` and `audio` are set as `true`, the stream only contains the local audio playback.
    *
    * **Note:**
    *
    * - This function supports only Chrome 73 or later on Windows.
    * - For the audio sharing to take effect, the user must check **Share audio** in the pop-up window when sharing the screen.
    */
  var screenAudio: js.UndefOr[Boolean] = js.undefined
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
    audioProcessing: AnonAEC = null,
    audioSource: MediaStreamTrack = null,
    cameraId: String = null,
    extensionId: String = null,
    facingMode: String = null,
    mediaSource: screen | application | window = null,
    microphoneId: String = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    screen: js.UndefOr[Boolean] = js.undefined,
    screenAudio: js.UndefOr[Boolean] = js.undefined,
    streamID: Double | String = null,
    videoSource: MediaStreamTrack = null
  ): StreamSpec = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    if (audioProcessing != null) __obj.updateDynamic("audioProcessing")(audioProcessing.asInstanceOf[js.Any])
    if (audioSource != null) __obj.updateDynamic("audioSource")(audioSource.asInstanceOf[js.Any])
    if (cameraId != null) __obj.updateDynamic("cameraId")(cameraId.asInstanceOf[js.Any])
    if (extensionId != null) __obj.updateDynamic("extensionId")(extensionId.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (mediaSource != null) __obj.updateDynamic("mediaSource")(mediaSource.asInstanceOf[js.Any])
    if (microphoneId != null) __obj.updateDynamic("microphoneId")(microphoneId.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (!js.isUndefined(screen)) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (!js.isUndefined(screenAudio)) __obj.updateDynamic("screenAudio")(screenAudio.asInstanceOf[js.Any])
    if (streamID != null) __obj.updateDynamic("streamID")(streamID.asInstanceOf[js.Any])
    if (videoSource != null) __obj.updateDynamic("videoSource")(videoSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSpec]
  }
}

