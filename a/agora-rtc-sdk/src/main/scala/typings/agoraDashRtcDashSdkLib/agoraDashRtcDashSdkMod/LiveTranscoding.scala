package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for managing user-specific CDN live audio/video transcoding settings.
  *
  * @example **Sample Code**
  * ``` javascript
  * var LiveTranscoding = {
  *   width: 640,
  *   height: 360,
  *   videoBitrate: 400,
  *   videoFramerate: 15,
  *   lowLatency: false,
  *   audioSampleRate: AgoraRTC.AUDIO_SAMPLE_RATE_48000,
  *   audioBitrate: 48,
  *   audioChannels: 1,
  *   videoGop: 30,
  *   videoCodecProfile: AgoraRTC.VIDEO_CODEC_PROFILE_HIGH,
  *   userCount: 0,
  *   backgroundColor: 0x000000,
  *   transcodingUsers: [],
  * };
  * ```
  */
trait LiveTranscoding extends js.Object {
  /**
    * Bitrate of the CDN live audio output stream in Kbps.
    *
    * Positive integer. The default value is 48, and the highest value is 128.
    */
  var audioBitrate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Agora’s self-defined audio channel type.
    *
    * Agora recommends choosing 1 or 2. Special players are required if you choose 3, 4 or 5:
    *
    * - 1: (Default) Mono
    * - 2: Dual sound channels
    * - 3: Three sound channels
    * - 4: Four sound channels
    * - 5: Five sound channels
    */
  var audioChannels: js.UndefOr[
    agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`1` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`2` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`3` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`4` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`5`
  ] = js.undefined
  /**
    * Audio sampling rate:
    *
    * - 32000: 32 kHz
    * - 44100: (Default) 44.1 kHz
    * - 48000: 48 kHz
    */
  var audioSampleRate: js.UndefOr[
    agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`32000` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`44100` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`48000`
  ] = js.undefined
  /**
    * The background color in RGB hex value.
    *
    * Value only, do not include a #. The default value is 0x000000. The value range is [0x000000, 0xffffff].
    */
  var backgroundColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Height of the video.
    *
    * Positive integer, the default value is 360. The value range is [1, 10000].
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Latency mode:
    * - true: Low latency with unassured quality.
    * - false: (Default）High latency with assured quality.
    */
  var lowLatency: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Manages the user layout configuration in the CDN live streaming.
    *
    * Agora supports a maximum of 17 transcoding users in a CDN streaming channel. See [[TranscodingUser]] for details.
    */
  var transcodingUsers: js.UndefOr[js.Array[TranscodingUser]] = js.undefined
  /** Number of users; default value is 0. The maximum is 17. */
  var userCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Bitrate of the CDN live output video stream.
    *
    * Positive integer. The default value is 400 Kbps. The value range is [1,1000000].
    */
  var videoBitrate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Video codec profile type:
    *
    * - 66: Baseline video codec profile. Generally used in video calls on mobile phones.
    * - 77: Main video codec profile.Generally used in mainstream electronics, such as MP4 players, portable video players, PSP, and iPads.
    * - 100: (Default) High video codec profile.Generally used in high - resolution broadcasts or television.
    */
  var videoCodecProfile: js.UndefOr[
    agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`66` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`77` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`100`
  ] = js.undefined
  /**
    * Frame rate of the output data stream set for CDN live.
    *
    * Positive integer. The default value is 15 fps. The value range is [1, 10000].
    */
  var videoFramerate: js.UndefOr[scala.Double] = js.undefined
  /** Video GOP in frames. The default value is 30 frames. The value range is [1,10000]. */
  var videoGop: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width of the video.
    *
    * Positive integer, the default value is 640. The value range is [1, 10000].
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object LiveTranscoding {
  @scala.inline
  def apply(
    audioBitrate: scala.Int | scala.Double = null,
    audioChannels: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`1` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`2` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`3` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`4` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`5` = null,
    audioSampleRate: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`32000` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`44100` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`48000` = null,
    backgroundColor: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    lowLatency: js.UndefOr[scala.Boolean] = js.undefined,
    transcodingUsers: js.Array[TranscodingUser] = null,
    userCount: scala.Int | scala.Double = null,
    videoBitrate: scala.Int | scala.Double = null,
    videoCodecProfile: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`66` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`77` | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`100` = null,
    videoFramerate: scala.Int | scala.Double = null,
    videoGop: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): LiveTranscoding = {
    val __obj = js.Dynamic.literal()
    if (audioBitrate != null) __obj.updateDynamic("audioBitrate")(audioBitrate.asInstanceOf[js.Any])
    if (audioChannels != null) __obj.updateDynamic("audioChannels")(audioChannels.asInstanceOf[js.Any])
    if (audioSampleRate != null) __obj.updateDynamic("audioSampleRate")(audioSampleRate.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(lowLatency)) __obj.updateDynamic("lowLatency")(lowLatency)
    if (transcodingUsers != null) __obj.updateDynamic("transcodingUsers")(transcodingUsers)
    if (userCount != null) __obj.updateDynamic("userCount")(userCount.asInstanceOf[js.Any])
    if (videoBitrate != null) __obj.updateDynamic("videoBitrate")(videoBitrate.asInstanceOf[js.Any])
    if (videoCodecProfile != null) __obj.updateDynamic("videoCodecProfile")(videoCodecProfile.asInstanceOf[js.Any])
    if (videoFramerate != null) __obj.updateDynamic("videoFramerate")(videoFramerate.asInstanceOf[js.Any])
    if (videoGop != null) __obj.updateDynamic("videoGop")(videoGop.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveTranscoding]
  }
}

