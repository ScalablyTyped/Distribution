package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for configuring the imported live broadcast voice or video stream.
  *
  * @example **Sample Code**
  * ```javascript
  * var InjectStreamConfig = {
  *   width: 0,
  *   height: 0,
  *   videoGop: 30,
  *   videoFramerate: 15,
  *   videoBitrate: 400,
  *   audioSampleRate: 44100,
  *   audioChannels: 1,
  * };
  * ```
  */
trait InjectStreamConfig extends js.Object {
  /**
    * Audio bitrate of the added stream to the broadcast.
    *
    * Positive integer. The default value is 48. The value range is [1, 10000].
    *
    * **Note:**
    *
    * Agora recommends that you stay with the default value and not reset it at this point of time.
    */
  var audioBitrate: js.UndefOr[Double] = js.undefined
  /**
    * Audio channels to add into the broadcast.
    *
    * Positive integer. The default value is 1. The value range is [1, 2].
    *
    * **Note:**
    *
    * Agora recommends that you stay with the default value and not reset it at this point of time.
    */
  var audioChannels: js.UndefOr[Double] = js.undefined
  /**
    * Audio sampling rate of the added stream to the broadcast.
    *
    * - 32000: 32 kHz
    * - 44100: (Default) 44.1 kHz
    * - 48000: 48 kHz
    *
    * **Note:**
    *
    * Agora recommends that you stay with the default value and not reset it at this point of time.
    */
  var audioSampleRate: js.UndefOr[Double] = js.undefined
  /**
    * Height of the added stream to the broadcast.
    *
    * Integer, the default value is 0, which is the same height as the original stream. The value range is [0, 10000].
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Video bitrate of the added stream to the broadcast.
    *
    * Positive integer. The default value is 400 Kbps. The value range is [1, 10000].
    *
    * **Note:**
    *
    * The setting of the video bitrate is closely linked to the resolution. If the video bitrate you set is beyond the reasonable range, the SDK will set it within the reasonable range instead.
    */
  var videoBitrate: js.UndefOr[Double] = js.undefined
  /**
    * Video frame rate of the added stream to the broadcast.
    *
    * Positive integer. The default value is 15 fps. The value range is [1, 10000].
    */
  var videoFramerate: js.UndefOr[Double] = js.undefined
  /**
    * Video GOP of the added stream to the broadcast.
    *
    * Positive integer. The default value is 30 frames. The value range is [1, 10000].
    */
  var videoGop: js.UndefOr[Double] = js.undefined
  /**
    * Width of the added stream to the broadcast.
    *
    * Integer, the default value is 0, which is the same width as the original stream. The value range is [0, 10000].
    */
  var width: js.UndefOr[Double] = js.undefined
}

object InjectStreamConfig {
  @scala.inline
  def apply(
    audioBitrate: Int | Double = null,
    audioChannels: Int | Double = null,
    audioSampleRate: Int | Double = null,
    height: Int | Double = null,
    videoBitrate: Int | Double = null,
    videoFramerate: Int | Double = null,
    videoGop: Int | Double = null,
    width: Int | Double = null
  ): InjectStreamConfig = {
    val __obj = js.Dynamic.literal()
    if (audioBitrate != null) __obj.updateDynamic("audioBitrate")(audioBitrate.asInstanceOf[js.Any])
    if (audioChannels != null) __obj.updateDynamic("audioChannels")(audioChannels.asInstanceOf[js.Any])
    if (audioSampleRate != null) __obj.updateDynamic("audioSampleRate")(audioSampleRate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (videoBitrate != null) __obj.updateDynamic("videoBitrate")(videoBitrate.asInstanceOf[js.Any])
    if (videoFramerate != null) __obj.updateDynamic("videoFramerate")(videoFramerate.asInstanceOf[js.Any])
    if (videoGop != null) __obj.updateDynamic("videoGop")(videoGop.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectStreamConfig]
  }
}

