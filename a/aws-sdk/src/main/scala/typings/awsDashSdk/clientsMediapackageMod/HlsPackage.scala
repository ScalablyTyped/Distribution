package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsPackage extends js.Object {
  /**
    * This setting controls how ad markers are included in the packaged OriginEndpoint.
  "NONE" will omit all SCTE-35 ad markers from the output.
  "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
  markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest.
  "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35
  messages in the input source.
    */
  var AdMarkers: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.AdMarkers] = js.undefined
  var AdTriggers: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.AdTriggers] = js.undefined
  var AdsOnDeliveryRestrictions: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.AdsOnDeliveryRestrictions] = js.undefined
  var Encryption: js.UndefOr[HlsEncryption] = js.undefined
  /**
    * When enabled, an I-Frame only stream will be included in the output.
    */
  var IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined
  /**
    * The HTTP Live Streaming (HLS) playlist type.
  When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE
  entry will be included in the media playlist.
    */
  var PlaylistType: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.PlaylistType] = js.undefined
  /**
    * Time window (in seconds) contained in each parent manifest.
    */
  var PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag
  inserted into manifests. Additionally, when an interval is specified
  ID3Timed Metadata messages will be generated every 5 seconds using the
  ingest time of the content.
  If the interval is not specified, or set to 0, then
  no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no
  ID3Timed Metadata messages will be generated. Note that irrespective
  of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input,
  it will be passed through to HLS output.
    */
  var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
  var StreamSelection: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.StreamSelection] = js.undefined
  /**
    * When enabled, audio streams will be placed in rendition groups in the output.
    */
  var UseAudioRenditionGroup: js.UndefOr[__boolean] = js.undefined
}

object HlsPackage {
  @scala.inline
  def apply(
    AdMarkers: AdMarkers = null,
    AdTriggers: AdTriggers = null,
    AdsOnDeliveryRestrictions: AdsOnDeliveryRestrictions = null,
    Encryption: HlsEncryption = null,
    IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
    PlaylistType: PlaylistType = null,
    PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
    ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
    SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
    StreamSelection: StreamSelection = null,
    UseAudioRenditionGroup: js.UndefOr[__boolean] = js.undefined
  ): HlsPackage = {
    val __obj = js.Dynamic.literal()
    if (AdMarkers != null) __obj.updateDynamic("AdMarkers")(AdMarkers.asInstanceOf[js.Any])
    if (AdTriggers != null) __obj.updateDynamic("AdTriggers")(AdTriggers)
    if (AdsOnDeliveryRestrictions != null) __obj.updateDynamic("AdsOnDeliveryRestrictions")(AdsOnDeliveryRestrictions.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (!js.isUndefined(IncludeIframeOnlyStream)) __obj.updateDynamic("IncludeIframeOnlyStream")(IncludeIframeOnlyStream)
    if (PlaylistType != null) __obj.updateDynamic("PlaylistType")(PlaylistType.asInstanceOf[js.Any])
    if (!js.isUndefined(PlaylistWindowSeconds)) __obj.updateDynamic("PlaylistWindowSeconds")(PlaylistWindowSeconds)
    if (!js.isUndefined(ProgramDateTimeIntervalSeconds)) __obj.updateDynamic("ProgramDateTimeIntervalSeconds")(ProgramDateTimeIntervalSeconds)
    if (!js.isUndefined(SegmentDurationSeconds)) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds)
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection)
    if (!js.isUndefined(UseAudioRenditionGroup)) __obj.updateDynamic("UseAudioRenditionGroup")(UseAudioRenditionGroup)
    __obj.asInstanceOf[HlsPackage]
  }
}

