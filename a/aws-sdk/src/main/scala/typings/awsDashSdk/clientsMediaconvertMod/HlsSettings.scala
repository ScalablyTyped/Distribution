package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsSettings extends js.Object {
  /**
    * Specifies the group to which the audio Rendition belongs.
    */
  var AudioGroupId: js.UndefOr[__string] = js.undefined
  /**
    * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw container. Regardless of the value that you specify here, if this output has video, the service will place the output into an MPEG2-TS container.
    */
  var AudioOnlyContainer: js.UndefOr[HlsAudioOnlyContainer] = js.undefined
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[__string] = js.undefined
  /**
    * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
    */
  var AudioTrackType: js.UndefOr[HlsAudioTrackType] = js.undefined
  /**
    * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
    */
  var IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest] = js.undefined
  /**
    * String concatenated to end of segment filenames. Accepts "Format Identifiers":#format_identifier_parameters.
    */
  var SegmentModifier: js.UndefOr[__string] = js.undefined
}

object HlsSettings {
  @scala.inline
  def apply(
    AudioGroupId: __string = null,
    AudioOnlyContainer: HlsAudioOnlyContainer = null,
    AudioRenditionSets: __string = null,
    AudioTrackType: HlsAudioTrackType = null,
    IFrameOnlyManifest: HlsIFrameOnlyManifest = null,
    SegmentModifier: __string = null
  ): HlsSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioGroupId != null) __obj.updateDynamic("AudioGroupId")(AudioGroupId)
    if (AudioOnlyContainer != null) __obj.updateDynamic("AudioOnlyContainer")(AudioOnlyContainer.asInstanceOf[js.Any])
    if (AudioRenditionSets != null) __obj.updateDynamic("AudioRenditionSets")(AudioRenditionSets)
    if (AudioTrackType != null) __obj.updateDynamic("AudioTrackType")(AudioTrackType.asInstanceOf[js.Any])
    if (IFrameOnlyManifest != null) __obj.updateDynamic("IFrameOnlyManifest")(IFrameOnlyManifest.asInstanceOf[js.Any])
    if (SegmentModifier != null) __obj.updateDynamic("SegmentModifier")(SegmentModifier)
    __obj.asInstanceOf[HlsSettings]
  }
}

