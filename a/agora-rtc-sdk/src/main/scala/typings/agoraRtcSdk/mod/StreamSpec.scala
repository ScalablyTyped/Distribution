package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkStrings.application
import typings.agoraRtcSdk.agoraRtcSdkStrings.screen
import typings.agoraRtcSdk.agoraRtcSdkStrings.window
import typings.agoraRtcSdk.anon.AEC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class defining the `spec` paramter in the {@link createStream} method.
  * [[include:StreamSpec-example.md]]
  */
@js.native
trait StreamSpec extends js.Object {
  /**
    * Marks whether this stream contains an audio track.
    */
  var audio: Boolean = js.native
  /** Marks whether to enable audio processing. */
  var audioProcessing: js.UndefOr[AEC] = js.native
  /**
    * Specifies the audio source of the stream.
    */
  var audioSource: js.UndefOr[MediaStreamTrack] = js.native
  /**
    * The camera device ID retrieved from the {@link getDevices} method.
    *
    * The retrieved ID is ASCII characters, and the string length is greater than or equals to 0 and less than 256 bytes.
    *
    * When the string length is 0, this property is ignored.
    */
  var cameraId: js.UndefOr[String] = js.native
  /**
    * The extension ID of the Chrome screen-sharing extension.
    *
    * ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Set this property if you use the Chrome screen-sharing extension. See [Chrome Extension for Screen Sharing](../../../chrome_screensharing_plugin?platform=Web) for details.
    *
    * **Note**
    *
    * Chrome 72 and later versions support screen sharing without the extension. You can leave `extensionId` as empty.
    *
    * If you set the `extensionId`, then you need to use the screen-sharing extension.
    */
  var extensionId: js.UndefOr[String] = js.native
  /**
    * Sets using the front or rear camera
    *
    * You can set this parameter to use the front or rear camera on mobile devices:
    * - `"user"`: The front camera.
    * - `"environment"`: The rear camera.
    */
  var facingMode: js.UndefOr[String] = js.native
  /**
    * The screen-sharing mode on the Firefox browser.
    *
    * If you are using the Firefox browser, setting this property specifies the screen-sharing mode:
    * - `"screen"`: (default) share the current screen
    * - `"application"`: share all windows of an App
    * - `"window"`: share a specified window of an App
    *
    * **Note**
    *
    * Firefox on Windows does not support the application mode.
    *
    * See [Screen Sharing on Firefox](../../../screensharing_web?platform=Web#a-name-ff-a-screen-sharing-on-firefox) for details.
    */
  var mediaSource: js.UndefOr[screen | application | window] = js.native
  /**
    * The microphone device ID retrieved from the {@link getDevices} method.
    *
    * The retrieved ID is ASCII characters, and the string length is greater than or equals to 0 and less than 256 bytes.
    *
    * When the string length is 0, this property is ignored.
    */
  var microphoneId: js.UndefOr[String] = js.native
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
  var mirror: js.UndefOr[Boolean] = js.native
  /**
    * Marks whether this stream contains a screen-sharing track. See [Share the Screen](../../../screensharing_web?platform=Web) for details.
    */
  var screen: js.UndefOr[Boolean] = js.native
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
    * **Note**
    *
    * - This function supports only Chrome 73 or later on Windows.
    * - For the audio sharing to take effect, the user must check **Share audio** in the pop-up window when sharing the screen.
    */
  var screenAudio: js.UndefOr[Boolean] = js.native
  /**
    * The stream ID.
    *
    * Please set the stream ID as the user ID, which can be retrieved from the callback of {@link Client.join}.
    */
  var streamID: js.UndefOr[Double | String] = js.native
  /**
    * Marks whether this stream contains a video track.
    */
  var video: Boolean = js.native
  /**
    * Specifies the video source of the stream.
    *
    * **Note**
    *
    * If you use a video source created by the Canvas API, re-draw on the canvas every one second when the drawing is still to keep the video publishing.
    */
  var videoSource: js.UndefOr[MediaStreamTrack] = js.native
}

object StreamSpec {
  @scala.inline
  def apply(audio: Boolean, video: Boolean): StreamSpec = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSpec]
  }
  @scala.inline
  implicit class StreamSpecOps[Self <: StreamSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudio(value: Boolean): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideo(value: Boolean): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioProcessing(value: AEC): Self = this.set("audioProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioProcessing: Self = this.set("audioProcessing", js.undefined)
    @scala.inline
    def setAudioSource(value: MediaStreamTrack): Self = this.set("audioSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioSource: Self = this.set("audioSource", js.undefined)
    @scala.inline
    def setCameraId(value: String): Self = this.set("cameraId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraId: Self = this.set("cameraId", js.undefined)
    @scala.inline
    def setExtensionId(value: String): Self = this.set("extensionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionId: Self = this.set("extensionId", js.undefined)
    @scala.inline
    def setFacingMode(value: String): Self = this.set("facingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacingMode: Self = this.set("facingMode", js.undefined)
    @scala.inline
    def setMediaSource(value: screen | application | window): Self = this.set("mediaSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaSource: Self = this.set("mediaSource", js.undefined)
    @scala.inline
    def setMicrophoneId(value: String): Self = this.set("microphoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrophoneId: Self = this.set("microphoneId", js.undefined)
    @scala.inline
    def setMirror(value: Boolean): Self = this.set("mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    @scala.inline
    def setScreen(value: Boolean): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreen: Self = this.set("screen", js.undefined)
    @scala.inline
    def setScreenAudio(value: Boolean): Self = this.set("screenAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenAudio: Self = this.set("screenAudio", js.undefined)
    @scala.inline
    def setStreamID(value: Double | String): Self = this.set("streamID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamID: Self = this.set("streamID", js.undefined)
    @scala.inline
    def setVideoSource(value: MediaStreamTrack): Self = this.set("videoSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoSource: Self = this.set("videoSource", js.undefined)
  }
  
}

