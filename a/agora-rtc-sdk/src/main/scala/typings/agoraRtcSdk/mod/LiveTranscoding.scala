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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configurations for CDN live stream transcoding. To be used in {@link setLiveTranscoding}.
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
  *   images: [],
  * };
  * ```
  */
@js.native
trait LiveTranscoding extends js.Object {
  
  /**
    * The audio bitrate (Kbps) of the CDN live stream.
    *
    * A positive integer. The default value is 48, and the highest value is 128.
    */
  var audioBitrate: js.UndefOr[Double] = js.native
  
  /**
    * The number of audio channels for the CDN live stream.
    *
    * Agora recommends choosing 1 (mono), or 2 (stereo) audio channels. Special players are required if you choose 3, 4, or 5.
    *
    * - 1: (Default) Mono
    * - 2: Stereo
    * - 3: Three audio channels
    * - 4: Four audio channels
    * - 5: Five audio channels
    */
  var audioChannels: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.native
  
  /**
    * The audio sampling rate:
    *
    * - 32000: 32 kHz
    * - 44100: (Default) 44.1 kHz
    * - 48000: 48 kHz
    */
  var audioSampleRate: js.UndefOr[`32000` | `44100` | `48000`] = js.native
  
  /**
    * The background color in RGB hex.
    *
    * Value only. Do not include a preceding #. The default value is 0x000000. The value range is [0x000000, 0xffffff].
    */
  var backgroundColor: js.UndefOr[Double] = js.native
  
  /**
    * The height of the video in pixels.
    *
    * A positive integer. The default value is 360.
    *
    * - When pushing video streams to the CDN, ensure that `height` is at least 64; otherwise, the Agora server adjusts the value to 64.
    * - When pushing audio streams to the CDN, set `width` and `height` as 0.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Watermark images for the CDN live stream.
    *
    * **Since**
    * <br>&emsp;&emsp;&emsp;*3.0.0*
    *
    * See [[TranscodingWatermark]] for details.
    */
  var images: js.Array[TranscodingWatermark] = js.native
  
  /**
    * **DEPRECATED**
    *
    * Latency mode:
    * - true: Low latency with unassured quality.
    * - false: (Default）High latency with assured quality.
    */
  var lowLatency: js.UndefOr[Boolean] = js.native
  
  /**
    * Manages the user layout configuration in the CDN live streaming.
    *
    * Agora supports a maximum of 17 transcoding users in a CDN streaming channel. See [[TranscodingUser]] for details.
    */
  var transcodingUsers: js.Array[TranscodingUser] = js.native
  
  /** The number of users; default value is 0. The maximum is 17. */
  var userCount: js.UndefOr[Double] = js.native
  
  /**
    * The bitrate (Kbps) of the output video stream.
    *
    * A positive integer. The default value is 400 Kbps. The value range is [1,1000000].
    *
    * Set the bitrate according to the {@link AgoraRTC.VideoEncoderConfiguration.bitrate Video Profile Table}. If you set a bitrate beyond the proper range, the SDK automatically adapts it to a value within the range.
    */
  var videoBitrate: js.UndefOr[Double] = js.native
  
  /**
    * The video codec profile type.
    *
    * Set it as 66, 77, or 100 (default). If you set this parameter to any other value, Agora adjusts it to the default value 100.
    *
    * - 66: Baseline video codec profile. Generally used for video calls on mobile phones.
    * - 77: Main video codec profile. Generally used for mainstream electronics, such as MP4 players, portable video players, PSP, and iPads.
    * - 100: (Default) High video codec profile. Generally used for high-resolution broadcasts or television.
    */
  var videoCodecProfile: js.UndefOr[`66` | `77` | `100`] = js.native
  
  /**
    * The video frame rate (fps) of the CDN live stream.
    *
    * A positive integer. The default value is 15 fps. The value range is [1, 30]. The Agora server adjusts any value over 30 to 30.
    */
  var videoFramerate: js.UndefOr[Double] = js.native
  
  /** The video GOP in frames. The default value is 30 frames. The value range is [1,10000]. */
  var videoGop: js.UndefOr[Double] = js.native
  
  /**
    * The width of the video in pixels.
    *
    * A positive integer, the default value is 640.
    *
    * - When pushing video streams to the CDN, ensure that `width` is at least 64; otherwise, the Agora server adjusts the value to 64.
    * - When pushing audio streams to the CDN, set `width` and `height` as 0.
    */
  var width: js.UndefOr[Double] = js.native
}
object LiveTranscoding {
  
  @scala.inline
  def apply(images: js.Array[TranscodingWatermark], transcodingUsers: js.Array[TranscodingUser]): LiveTranscoding = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], transcodingUsers = transcodingUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveTranscoding]
  }
  
  @scala.inline
  implicit class LiveTranscodingOps[Self <: LiveTranscoding] (val x: Self) extends AnyVal {
    
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
    def setImagesVarargs(value: TranscodingWatermark*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[TranscodingWatermark]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscodingUsersVarargs(value: TranscodingUser*): Self = this.set("transcodingUsers", js.Array(value :_*))
    
    @scala.inline
    def setTranscodingUsers(value: js.Array[TranscodingUser]): Self = this.set("transcodingUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioBitrate(value: Double): Self = this.set("audioBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioBitrate: Self = this.set("audioBitrate", js.undefined)
    
    @scala.inline
    def setAudioChannels(value: `1` | `2` | `3` | `4` | `5`): Self = this.set("audioChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioChannels: Self = this.set("audioChannels", js.undefined)
    
    @scala.inline
    def setAudioSampleRate(value: `32000` | `44100` | `48000`): Self = this.set("audioSampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioSampleRate: Self = this.set("audioSampleRate", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Double): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLowLatency(value: Boolean): Self = this.set("lowLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowLatency: Self = this.set("lowLatency", js.undefined)
    
    @scala.inline
    def setUserCount(value: Double): Self = this.set("userCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserCount: Self = this.set("userCount", js.undefined)
    
    @scala.inline
    def setVideoBitrate(value: Double): Self = this.set("videoBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoBitrate: Self = this.set("videoBitrate", js.undefined)
    
    @scala.inline
    def setVideoCodecProfile(value: `66` | `77` | `100`): Self = this.set("videoCodecProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoCodecProfile: Self = this.set("videoCodecProfile", js.undefined)
    
    @scala.inline
    def setVideoFramerate(value: Double): Self = this.set("videoFramerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoFramerate: Self = this.set("videoFramerate", js.undefined)
    
    @scala.inline
    def setVideoGop(value: Double): Self = this.set("videoGop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoGop: Self = this.set("videoGop", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
