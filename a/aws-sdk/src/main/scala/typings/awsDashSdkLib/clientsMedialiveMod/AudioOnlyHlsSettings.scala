package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioOnlyHlsSettings extends js.Object {
  /**
    * Specifies the group to which the audio Rendition belongs.
    */
  var AudioGroupId: js.UndefOr[__string] = js.undefined
  /**
    * For use with an audio only Stream. Must be a .jpg or .png file. If given, this image will be used as the cover-art for the audio only output. Ideally, it should be formatted for an iPhone screen for two reasons. The iPhone does not resize the image, it crops a centered image on the top/bottom and left/right. Additionally, this image file gets saved bit-for-bit into every 10-second segment file, so will increase bandwidth by {image file size} * {segment count} * {user count.}.
    */
  var AudioOnlyImage: js.UndefOr[InputLocation] = js.undefined
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
  var AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType] = js.undefined
}

object AudioOnlyHlsSettings {
  @scala.inline
  def apply(
    AudioGroupId: __string = null,
    AudioOnlyImage: InputLocation = null,
    AudioTrackType: AudioOnlyHlsTrackType = null
  ): AudioOnlyHlsSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioGroupId != null) __obj.updateDynamic("AudioGroupId")(AudioGroupId)
    if (AudioOnlyImage != null) __obj.updateDynamic("AudioOnlyImage")(AudioOnlyImage)
    if (AudioTrackType != null) __obj.updateDynamic("AudioTrackType")(AudioTrackType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioOnlyHlsSettings]
  }
}

