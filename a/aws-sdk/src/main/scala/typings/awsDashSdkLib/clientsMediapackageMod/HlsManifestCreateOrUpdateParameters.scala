package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsManifestCreateOrUpdateParameters extends js.Object {
  /**
    * This setting controls how ad markers are included in the packaged OriginEndpoint.
  "NONE" will omit all SCTE-35 ad markers from the output.
  "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
  markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest.
  "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35
  messages in the input source.
    */
  var AdMarkers: js.UndefOr[AdMarkers] = js.undefined
  var AdTriggers: js.UndefOr[AdTriggers] = js.undefined
  var AdsOnDeliveryRestrictions: js.UndefOr[AdsOnDeliveryRestrictions] = js.undefined
  /**
    * The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
    */
  var Id: __string
  /**
    * When enabled, an I-Frame only stream will be included in the output.
    */
  var IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined
  /**
    * An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
    */
  var ManifestName: js.UndefOr[__string] = js.undefined
  /**
    * The HTTP Live Streaming (HLS) playlist type.
  When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE
  entry will be included in the media playlist.
    */
  var PlaylistType: js.UndefOr[PlaylistType] = js.undefined
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
}

object HlsManifestCreateOrUpdateParameters {
  @scala.inline
  def apply(
    Id: __string,
    AdMarkers: AdMarkers = null,
    AdTriggers: AdTriggers = null,
    AdsOnDeliveryRestrictions: AdsOnDeliveryRestrictions = null,
    IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
    ManifestName: __string = null,
    PlaylistType: PlaylistType = null,
    PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
    ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined
  ): HlsManifestCreateOrUpdateParameters = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (AdMarkers != null) __obj.updateDynamic("AdMarkers")(AdMarkers.asInstanceOf[js.Any])
    if (AdTriggers != null) __obj.updateDynamic("AdTriggers")(AdTriggers)
    if (AdsOnDeliveryRestrictions != null) __obj.updateDynamic("AdsOnDeliveryRestrictions")(AdsOnDeliveryRestrictions.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeIframeOnlyStream)) __obj.updateDynamic("IncludeIframeOnlyStream")(IncludeIframeOnlyStream)
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName)
    if (PlaylistType != null) __obj.updateDynamic("PlaylistType")(PlaylistType.asInstanceOf[js.Any])
    if (!js.isUndefined(PlaylistWindowSeconds)) __obj.updateDynamic("PlaylistWindowSeconds")(PlaylistWindowSeconds)
    if (!js.isUndefined(ProgramDateTimeIntervalSeconds)) __obj.updateDynamic("ProgramDateTimeIntervalSeconds")(ProgramDateTimeIntervalSeconds)
    __obj.asInstanceOf[HlsManifestCreateOrUpdateParameters]
  }
}

