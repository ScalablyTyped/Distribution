package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioOnlyHlsSettings extends js.Object {
  /**
    * Specifies the group to which the audio Rendition belongs.
    */
  var AudioGroupId: js.UndefOr[__string] = js.native
  /**
    * Optional. Specifies the .jpg or .png image to use as the cover art for an audio-only output. We recommend a low bit-size file because the image increases the output audio bandwidth.
  The image is attached to the audio as an ID3 tag, frame type APIC, picture type 0x10, as per the "ID3 tag version 2.4.0 - Native Frames" standard.
    */
  var AudioOnlyImage: js.UndefOr[InputLocation] = js.native
  /**
    * Four types of audio-only tracks are supported:
  Audio-Only Variant Stream
  The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
  Alternate Audio, Auto Select, Default
  Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
  Alternate Audio, Auto Select, Not Default
  Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
  Alternate Audio, not Auto Select
  Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
    */
  var AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType] = js.native
  /**
    * Specifies the segment type.
    */
  var SegmentType: js.UndefOr[AudioOnlyHlsSegmentType] = js.native
}

object AudioOnlyHlsSettings {
  @scala.inline
  def apply(
    AudioGroupId: __string = null,
    AudioOnlyImage: InputLocation = null,
    AudioTrackType: AudioOnlyHlsTrackType = null,
    SegmentType: AudioOnlyHlsSegmentType = null
  ): AudioOnlyHlsSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioGroupId != null) __obj.updateDynamic("AudioGroupId")(AudioGroupId.asInstanceOf[js.Any])
    if (AudioOnlyImage != null) __obj.updateDynamic("AudioOnlyImage")(AudioOnlyImage.asInstanceOf[js.Any])
    if (AudioTrackType != null) __obj.updateDynamic("AudioTrackType")(AudioTrackType.asInstanceOf[js.Any])
    if (SegmentType != null) __obj.updateDynamic("SegmentType")(SegmentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioOnlyHlsSettings]
  }
}

