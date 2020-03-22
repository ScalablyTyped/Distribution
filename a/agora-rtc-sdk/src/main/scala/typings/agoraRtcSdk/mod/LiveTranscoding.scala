package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkNumbers.`100`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`1`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`2`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`32000`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`3`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`44100`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`48000`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`4`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`5`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`66`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`77`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for managing user-specific CDN live audio/video transcoding settings in {@link setLiveTranscoding}.
  *
  * @example **Sample code**
  * ``` javascript
  * var LiveTranscoding = {
  *   width: 640,
  *   height: 360,
  *   videoBitrate: 400,
  *   videoFramerate: 15,
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
  var audioBitrate: js.UndefOr[Double] = js.undefined
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
  var audioChannels: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.undefined
  /**
    * Audio sampling rate:
    *
    * - 32000: 32 kHz
    * - 44100: (Default) 44.1 kHz
    * - 48000: 48 kHz
    */
  var audioSampleRate: js.UndefOr[`32000` | `44100` | `48000`] = js.undefined
  /**
    * The background color in RGB hex value.
    *
    * Value only, do not include a #. The default value is 0x000000. The value range is [0x000000, 0xffffff].
    */
  var backgroundColor: js.UndefOr[Double] = js.undefined
  /**
    * Height of the video.
    *
    * Positive integer, the default value is 360. The value range is [64, 10000].
    *
    * - When pushing video streams to the CDN, set the value of width × height to at least 64 × 64, or the SDK adjusts it to 64 x 64.
    * - When pushing audio streams to the CDN, set the value of width × height to 0 × 0.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Adds a watermark image to the CDN live stream.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    *
    * See [[TranscodingWatermark]] for details.
    */
  var images: js.Array[TranscodingWatermark]
  /**
    * **DEPRECATED**
    *
    * Latency mode:
    * - true: Low latency with unassured quality.
    * - false: (Default）High latency with assured quality.
    */
  var lowLatency: js.UndefOr[Boolean] = js.undefined
  /**
    * Manages the user layout configuration in the CDN live streaming.
    *
    * Agora supports a maximum of 17 transcoding users in a CDN streaming channel. See [[TranscodingUser]] for details.
    */
  var transcodingUsers: js.Array[TranscodingUser]
  /** Number of users; default value is 0. The maximum is 17. */
  var userCount: js.UndefOr[Double] = js.undefined
  /**
    * Bitrate of the CDN live output video stream.
    *
    * Positive integer. The default value is 400 Kbps. The value range is [1,1000000].
    *
    * Set the bitrate according to the {@link AgoraRTC.VideoEncoderConfiguration.bitrate Video Profile Table}. If you set a bitrate beyond the proper range, the SDK automatically adapts it to a value within the range.
    */
  var videoBitrate: js.UndefOr[Double] = js.undefined
  /**
    * Video codec profile type.
    *
    * Set it as 66, 77, or 100 (default). If you set this parameter to other values, Agora adjusts it to the default value 100.
    *
    * - 66: Baseline video codec profile. Generally used in video calls on mobile phones.
    * - 77: Main video codec profile.Generally used in mainstream electronics, such as MP4 players, portable video players, PSP, and iPads.
    * - 100: (Default) High video codec profile.Generally used in high - resolution broadcasts or television.
    */
  var videoCodecProfile: js.UndefOr[`66` | `77` | `100`] = js.undefined
  /**
    * Frame rate of the output data stream set for CDN live.
    *
    * Positive integer. The default value is 15 fps. The value range is [1, 30]. Agora adjusts all values over 30 to 30.
    */
  var videoFramerate: js.UndefOr[Double] = js.undefined
  /** Video GOP in frames. The default value is 30 frames. The value range is [1,10000]. */
  var videoGop: js.UndefOr[Double] = js.undefined
  /**
    * Width of the video.
    *
    * Positive integer, the default value is 640. The value range is [64, 10000].
    *
    * - When pushing video streams to the CDN, set the value of width × height to at least 64 × 64, or the SDK adjusts it to 64 x 64.
    * - When pushing audio streams to the CDN, set the value of width × height to 0 × 0.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LiveTranscoding {
  @scala.inline
  def apply(
    images: js.Array[TranscodingWatermark],
    transcodingUsers: js.Array[TranscodingUser],
    audioBitrate: Int | Double = null,
    audioChannels: `1` | `2` | `3` | `4` | `5` = null,
    audioSampleRate: `32000` | `44100` | `48000` = null,
    backgroundColor: Int | Double = null,
    height: Int | Double = null,
    lowLatency: js.UndefOr[Boolean] = js.undefined,
    userCount: Int | Double = null,
    videoBitrate: Int | Double = null,
    videoCodecProfile: `66` | `77` | `100` = null,
    videoFramerate: Int | Double = null,
    videoGop: Int | Double = null,
    width: Int | Double = null
  ): LiveTranscoding = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], transcodingUsers = transcodingUsers.asInstanceOf[js.Any])
    if (audioBitrate != null) __obj.updateDynamic("audioBitrate")(audioBitrate.asInstanceOf[js.Any])
    if (audioChannels != null) __obj.updateDynamic("audioChannels")(audioChannels.asInstanceOf[js.Any])
    if (audioSampleRate != null) __obj.updateDynamic("audioSampleRate")(audioSampleRate.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(lowLatency)) __obj.updateDynamic("lowLatency")(lowLatency.asInstanceOf[js.Any])
    if (userCount != null) __obj.updateDynamic("userCount")(userCount.asInstanceOf[js.Any])
    if (videoBitrate != null) __obj.updateDynamic("videoBitrate")(videoBitrate.asInstanceOf[js.Any])
    if (videoCodecProfile != null) __obj.updateDynamic("videoCodecProfile")(videoCodecProfile.asInstanceOf[js.Any])
    if (videoFramerate != null) __obj.updateDynamic("videoFramerate")(videoFramerate.asInstanceOf[js.Any])
    if (videoGop != null) __obj.updateDynamic("videoGop")(videoGop.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveTranscoding]
  }
}

