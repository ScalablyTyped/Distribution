package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/mediapackage", "MediaPackage")
@js.native
object MediaPackageNs extends js.Object {
  trait Channel extends js.Object {
    /**
      * The Amazon Resource Name (ARN) assigned to the Channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A short text description of the Channel.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsIngest: js.UndefOr[HlsIngest] = js.undefined
    /**
      * The ID of the Channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CmafEncryption extends js.Object {
    /**
      * Time (in seconds) between each encryption key rotation.
      */
    var KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
    var SpekeKeyProvider: SpekeKeyProvider
  }
  
  trait CmafPackage extends js.Object {
    var Encryption: js.UndefOr[CmafEncryption] = js.undefined
    /**
      * A list of HLS manifest configurations
      */
    var HlsManifests: js.UndefOr[__listOfHlsManifest] = js.undefined
    /**
      * Duration (in seconds) of each segment. Actual segments will be
    rounded to the nearest multiple of the source segment duration.
      */
    var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
      */
    var SegmentPrefix: js.UndefOr[__string] = js.undefined
    var StreamSelection: js.UndefOr[StreamSelection] = js.undefined
  }
  
  trait CmafPackageCreateOrUpdateParameters extends js.Object {
    var Encryption: js.UndefOr[CmafEncryption] = js.undefined
    /**
      * A list of HLS manifest configurations
      */
    var HlsManifests: js.UndefOr[__listOfHlsManifestCreateOrUpdateParameters] = js.undefined
    /**
      * Duration (in seconds) of each segment. Actual segments will be
    rounded to the nearest multiple of the source segment duration.
      */
    var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
      */
    var SegmentPrefix: js.UndefOr[__string] = js.undefined
    var StreamSelection: js.UndefOr[StreamSelection] = js.undefined
  }
  
  trait CreateChannelRequest extends js.Object {
    /**
      * A short text description of the Channel.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the Channel. The ID must be unique within the region and it
    cannot be changed after a Channel is created.
      */
    var Id: __string
  }
  
  trait CreateChannelResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) assigned to the Channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A short text description of the Channel.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsIngest: js.UndefOr[HlsIngest] = js.undefined
    /**
      * The ID of the Channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateOriginEndpointRequest extends js.Object {
    /**
      * The ID of the Channel that the OriginEndpoint will be associated with.
    This cannot be changed after the OriginEndpoint is created.
      */
    var ChannelId: __string
    var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.undefined
    var DashPackage: js.UndefOr[DashPackage] = js.undefined
    /**
      * A short text description of the OriginEndpoint.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsPackage: js.UndefOr[HlsPackage] = js.undefined
    /**
      * The ID of the OriginEndpoint.  The ID must be unique within the region
    and it cannot be changed after the OriginEndpoint is created.
      */
    var Id: __string
    /**
      * A short string that will be used as the filename of the OriginEndpoint URL (defaults to "index").
      */
    var ManifestName: js.UndefOr[__string] = js.undefined
    var MssPackage: js.UndefOr[MssPackage] = js.undefined
    /**
      * Maximum duration (seconds) of content to retain for startover playback.
    If not specified, startover playback will be disabled for the OriginEndpoint.
      */
    var StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * Amount of delay (seconds) to enforce on the playback of live content.
    If not specified, there will be no time delay in effect for the OriginEndpoint.
      */
    var TimeDelaySeconds: js.UndefOr[__integer] = js.undefined
    /**
      * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
      */
    var Whitelist: js.UndefOr[__listOf__string] = js.undefined
  }
  
  trait CreateOriginEndpointResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the Channel the OriginEndpoint is associated with.
      */
    var ChannelId: js.UndefOr[__string] = js.undefined
    var CmafPackage: js.UndefOr[CmafPackage] = js.undefined
    var DashPackage: js.UndefOr[DashPackage] = js.undefined
    /**
      * A short text description of the OriginEndpoint.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsPackage: js.UndefOr[HlsPackage] = js.undefined
    /**
      * The ID of the OriginEndpoint.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * A short string appended to the end of the OriginEndpoint URL.
      */
    var ManifestName: js.UndefOr[__string] = js.undefined
    var MssPackage: js.UndefOr[MssPackage] = js.undefined
    /**
      * Maximum duration (seconds) of content to retain for startover playback.
    If not specified, startover playback will be disabled for the OriginEndpoint.
      */
    var StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * Amount of delay (seconds) to enforce on the playback of live content.
    If not specified, there will be no time delay in effect for the OriginEndpoint.
      */
    var TimeDelaySeconds: js.UndefOr[__integer] = js.undefined
    /**
      * The URL of the packaged OriginEndpoint for consumption.
      */
    var Url: js.UndefOr[__string] = js.undefined
    /**
      * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
      */
    var Whitelist: js.UndefOr[__listOf__string] = js.undefined
  }
  
  trait DashEncryption extends js.Object {
    /**
      * Time (in seconds) between each encryption key rotation.
      */
    var KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
    var SpekeKeyProvider: SpekeKeyProvider
  }
  
  trait DashPackage extends js.Object {
    var Encryption: js.UndefOr[DashEncryption] = js.undefined
    /**
      * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
      */
    var ManifestLayout: js.UndefOr[ManifestLayout] = js.undefined
    /**
      * Time window (in seconds) contained in each manifest.
      */
    var ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
      */
    var MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD).
      */
    var MinUpdatePeriodSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
    Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
    be partitioned into more than one period. If the list contains "ADS", new periods will be created where
    the Channel source contains SCTE-35 ad markers.
      */
    var PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement] = js.undefined
    /**
      * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
      */
    var Profile: js.UndefOr[Profile] = js.undefined
    /**
      * Duration (in seconds) of each segment. Actual segments will be
    rounded to the nearest multiple of the source segment duration.
      */
    var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * Determines the type of SegmentTimeline included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs.
      */
    var SegmentTemplateFormat: js.UndefOr[SegmentTemplateFormat] = js.undefined
    var StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    /**
      * Duration (in seconds) to delay live content before presentation.
      */
    var SuggestedPresentationDelaySeconds: js.UndefOr[__integer] = js.undefined
  }
  
  trait DeleteChannelRequest extends js.Object {
    /**
      * The ID of the Channel to delete.
      */
    var Id: __string
  }
  
  trait DeleteChannelResponse extends js.Object
  
  trait DeleteOriginEndpointRequest extends js.Object {
    /**
      * The ID of the OriginEndpoint to delete.
      */
    var Id: __string
  }
  
  trait DeleteOriginEndpointResponse extends js.Object
  
  trait DescribeChannelRequest extends js.Object {
    /**
      * The ID of a Channel.
      */
    var Id: __string
  }
  
  trait DescribeChannelResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) assigned to the Channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A short text description of the Channel.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsIngest: js.UndefOr[HlsIngest] = js.undefined
    /**
      * The ID of the Channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
  }
  
  trait DescribeOriginEndpointRequest extends js.Object {
    /**
      * The ID of the OriginEndpoint.
      */
    var Id: __string
  }
  
  trait DescribeOriginEndpointResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the Channel the OriginEndpoint is associated with.
      */
    var ChannelId: js.UndefOr[__string] = js.undefined
    var CmafPackage: js.UndefOr[CmafPackage] = js.undefined
    var DashPackage: js.UndefOr[DashPackage] = js.undefined
    /**
      * A short text description of the OriginEndpoint.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsPackage: js.UndefOr[HlsPackage] = js.undefined
    /**
      * The ID of the OriginEndpoint.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * A short string appended to the end of the OriginEndpoint URL.
      */
    var ManifestName: js.UndefOr[__string] = js.undefined
    var MssPackage: js.UndefOr[MssPackage] = js.undefined
    /**
      * Maximum duration (seconds) of content to retain for startover playback.
    If not specified, startover playback will be disabled for the OriginEndpoint.
      */
    var StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * Amount of delay (seconds) to enforce on the playback of live content.
    If not specified, there will be no time delay in effect for the OriginEndpoint.
      */
    var TimeDelaySeconds: js.UndefOr[__integer] = js.undefined
    /**
      * The URL of the packaged OriginEndpoint for consumption.
      */
    var Url: js.UndefOr[__string] = js.undefined
    /**
      * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
      */
    var Whitelist: js.UndefOr[__listOf__string] = js.undefined
  }
  
  trait HlsEncryption extends js.Object {
    /**
      * A constant initialization vector for encryption (optional).
    When not specified the initialization vector will be periodically rotated.
      */
    var ConstantInitializationVector: js.UndefOr[__string] = js.undefined
    /**
      * The encryption method to use.
      */
    var EncryptionMethod: js.UndefOr[EncryptionMethod] = js.undefined
    /**
      * Interval (in seconds) between each encryption key rotation.
      */
    var KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
      */
    var RepeatExtXKey: js.UndefOr[__boolean] = js.undefined
    var SpekeKeyProvider: SpekeKeyProvider
  }
  
  trait HlsIngest extends js.Object {
    /**
      * A list of endpoints to which the source stream should be sent.
      */
    var IngestEndpoints: js.UndefOr[__listOfIngestEndpoint] = js.undefined
  }
  
  trait HlsManifest extends js.Object {
    /**
      * This setting controls how ad markers are included in the packaged OriginEndpoint.
    "NONE" will omit all SCTE-35 ad markers from the output.
    "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
    markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest.
    "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35
    messages in the input source.
      */
    var AdMarkers: js.UndefOr[AdMarkers] = js.undefined
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
    /**
      * The URL of the packaged OriginEndpoint for consumption.
      */
    var Url: js.UndefOr[__string] = js.undefined
  }
  
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
  
  trait HlsPackage extends js.Object {
    /**
      * This setting controls how ad markers are included in the packaged OriginEndpoint.
    "NONE" will omit all SCTE-35 ad markers from the output.
    "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
    markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest.
    "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35
    messages in the input source.
      */
    var AdMarkers: js.UndefOr[AdMarkers] = js.undefined
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
    /**
      * Duration (in seconds) of each fragment. Actual fragments will be
    rounded to the nearest multiple of the source fragment duration.
      */
    var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
    var StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    /**
      * When enabled, audio streams will be placed in rendition groups in the output.
      */
    var UseAudioRenditionGroup: js.UndefOr[__boolean] = js.undefined
  }
  
  trait IngestEndpoint extends js.Object {
    /**
      * The system generated unique identifier for the IngestEndpoint
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The system generated password for ingest authentication.
      */
    var Password: js.UndefOr[__string] = js.undefined
    /**
      * The ingest URL to which the source stream should be sent.
      */
    var Url: js.UndefOr[__string] = js.undefined
    /**
      * The system generated username for ingest authentication.
      */
    var Username: js.UndefOr[__string] = js.undefined
  }
  
  trait ListChannelsRequest extends js.Object {
    /**
      * Upper bound on number of records to return.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token used to resume pagination from the end of a previous request.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListChannelsResponse extends js.Object {
    /**
      * A list of Channel records.
      */
    var Channels: js.UndefOr[__listOfChannel] = js.undefined
    /**
      * A token that can be used to resume pagination from the end of the collection.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListOriginEndpointsRequest extends js.Object {
    /**
      * When specified, the request will return only OriginEndpoints associated with the given Channel ID.
      */
    var ChannelId: js.UndefOr[__string] = js.undefined
    /**
      * The upper bound on the number of records to return.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token used to resume pagination from the end of a previous request.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListOriginEndpointsResponse extends js.Object {
    /**
      * A token that can be used to resume pagination from the end of the collection.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * A list of OriginEndpoint records.
      */
    var OriginEndpoints: js.UndefOr[__listOfOriginEndpoint] = js.undefined
  }
  
  trait MssEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
  }
  
  trait MssPackage extends js.Object {
    var Encryption: js.UndefOr[MssEncryption] = js.undefined
    /**
      * The time window (in seconds) contained in each manifest.
      */
    var ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * The duration (in seconds) of each segment.
      */
    var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
    var StreamSelection: js.UndefOr[StreamSelection] = js.undefined
  }
  
  trait OriginEndpoint extends js.Object {
    /**
      * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the Channel the OriginEndpoint is associated with.
      */
    var ChannelId: js.UndefOr[__string] = js.undefined
    var CmafPackage: js.UndefOr[CmafPackage] = js.undefined
    var DashPackage: js.UndefOr[DashPackage] = js.undefined
    /**
      * A short text description of the OriginEndpoint.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsPackage: js.UndefOr[HlsPackage] = js.undefined
    /**
      * The ID of the OriginEndpoint.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * A short string appended to the end of the OriginEndpoint URL.
      */
    var ManifestName: js.UndefOr[__string] = js.undefined
    var MssPackage: js.UndefOr[MssPackage] = js.undefined
    /**
      * Maximum duration (seconds) of content to retain for startover playback.
    If not specified, startover playback will be disabled for the OriginEndpoint.
      */
    var StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * Amount of delay (seconds) to enforce on the playback of live content.
    If not specified, there will be no time delay in effect for the OriginEndpoint.
      */
    var TimeDelaySeconds: js.UndefOr[__integer] = js.undefined
    /**
      * The URL of the packaged OriginEndpoint for consumption.
      */
    var Url: js.UndefOr[__string] = js.undefined
    /**
      * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
      */
    var Whitelist: js.UndefOr[__listOf__string] = js.undefined
  }
  
  trait RotateChannelCredentialsRequest extends js.Object {
    /**
      * The ID of the channel to update.
      */
    var Id: __string
  }
  
  trait RotateChannelCredentialsResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) assigned to the Channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A short text description of the Channel.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsIngest: js.UndefOr[HlsIngest] = js.undefined
    /**
      * The ID of the Channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
  }
  
  trait RotateIngestEndpointCredentialsRequest extends js.Object {
    /**
      * The ID of the channel the IngestEndpoint is on.
      */
    var Id: __string
    /**
      * The id of the IngestEndpoint whose credentials should be rotated
      */
    var IngestEndpointId: __string
  }
  
  trait RotateIngestEndpointCredentialsResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) assigned to the Channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A short text description of the Channel.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsIngest: js.UndefOr[HlsIngest] = js.undefined
    /**
      * The ID of the Channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
  }
  
  trait SpekeKeyProvider extends js.Object {
    /**
      * An Amazon Resource Name (ARN) of a Certificate Manager certificate
    that MediaPackage will use for enforcing secure end-to-end data
    transfer with the key provider service.
      */
    var CertificateArn: js.UndefOr[__string] = js.undefined
    /**
      * The resource ID to include in key requests.
      */
    var ResourceId: __string
    /**
      * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
    MediaPackage will assume when accessing the key provider service.
      */
    var RoleArn: __string
    /**
      * The system IDs to include in key requests.
      */
    var SystemIds: __listOf__string
    /**
      * The URL of the external key provider service.
      */
    var Url: __string
  }
  
  trait StreamSelection extends js.Object {
    /**
      * The maximum video bitrate (bps) to include in output.
      */
    var MaxVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined
    /**
      * The minimum video bitrate (bps) to include in output.
      */
    var MinVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined
    /**
      * A directive that determines the order of streams in the output.
      */
    var StreamOrder: js.UndefOr[StreamOrder] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a new Channel.
      */
    def createChannel(): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Channel.
      */
    def createChannel(params: CreateChannelRequest): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createChannel(
      params: CreateChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new OriginEndpoint record.
      */
    def createOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[CreateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createOriginEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateOriginEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new OriginEndpoint record.
      */
    def createOriginEndpoint(params: CreateOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[CreateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createOriginEndpoint(
      params: CreateOriginEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateOriginEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing Channel.
      */
    def deleteChannel(): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing Channel.
      */
    def deleteChannel(params: DeleteChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteChannel(
      params: DeleteChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing OriginEndpoint.
      */
    def deleteOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[DeleteOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteOriginEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteOriginEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing OriginEndpoint.
      */
    def deleteOriginEndpoint(params: DeleteOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[DeleteOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteOriginEndpoint(
      params: DeleteOriginEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteOriginEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details about a Channel.
      */
    def describeChannel(): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details about a Channel.
      */
    def describeChannel(params: DescribeChannelRequest): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeChannel(
      params: DescribeChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details about an existing OriginEndpoint.
      */
    def describeOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[DescribeOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOriginEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeOriginEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details about an existing OriginEndpoint.
      */
    def describeOriginEndpoint(params: DescribeOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[DescribeOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOriginEndpoint(
      params: DescribeOriginEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeOriginEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a collection of Channels.
      */
    def listChannels(): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listChannels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListChannelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a collection of Channels.
      */
    def listChannels(params: ListChannelsRequest): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listChannels(
      params: ListChannelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListChannelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a collection of OriginEndpoint records.
      */
    def listOriginEndpoints(): awsDashSdkLib.libRequestMod.Request[ListOriginEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOriginEndpoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOriginEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOriginEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a collection of OriginEndpoint records.
      */
    def listOriginEndpoints(params: ListOriginEndpointsRequest): awsDashSdkLib.libRequestMod.Request[ListOriginEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOriginEndpoints(
      params: ListOriginEndpointsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOriginEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOriginEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use RotateIngestEndpointCredentials instead
      */
    def rotateChannelCredentials(): awsDashSdkLib.libRequestMod.Request[RotateChannelCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rotateChannelCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RotateChannelCredentialsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RotateChannelCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use RotateIngestEndpointCredentials instead
      */
    def rotateChannelCredentials(params: RotateChannelCredentialsRequest): awsDashSdkLib.libRequestMod.Request[RotateChannelCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rotateChannelCredentials(
      params: RotateChannelCredentialsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RotateChannelCredentialsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RotateChannelCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
      */
    def rotateIngestEndpointCredentials(): awsDashSdkLib.libRequestMod.Request[RotateIngestEndpointCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rotateIngestEndpointCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RotateIngestEndpointCredentialsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RotateIngestEndpointCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
      */
    def rotateIngestEndpointCredentials(params: RotateIngestEndpointCredentialsRequest): awsDashSdkLib.libRequestMod.Request[RotateIngestEndpointCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rotateIngestEndpointCredentials(
      params: RotateIngestEndpointCredentialsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RotateIngestEndpointCredentialsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RotateIngestEndpointCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing Channel.
      */
    def updateChannel(): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing Channel.
      */
    def updateChannel(params: UpdateChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateChannel(
      params: UpdateChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing OriginEndpoint.
      */
    def updateOriginEndpoint(): awsDashSdkLib.libRequestMod.Request[UpdateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateOriginEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateOriginEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing OriginEndpoint.
      */
    def updateOriginEndpoint(params: UpdateOriginEndpointRequest): awsDashSdkLib.libRequestMod.Request[UpdateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateOriginEndpoint(
      params: UpdateOriginEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateOriginEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateOriginEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateChannelRequest extends js.Object {
    /**
      * A short text description of the Channel.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the Channel to update.
      */
    var Id: __string
  }
  
  trait UpdateChannelResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) assigned to the Channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A short text description of the Channel.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsIngest: js.UndefOr[HlsIngest] = js.undefined
    /**
      * The ID of the Channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateOriginEndpointRequest extends js.Object {
    var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.undefined
    var DashPackage: js.UndefOr[DashPackage] = js.undefined
    /**
      * A short text description of the OriginEndpoint.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsPackage: js.UndefOr[HlsPackage] = js.undefined
    /**
      * The ID of the OriginEndpoint to update.
      */
    var Id: __string
    /**
      * A short string that will be appended to the end of the Endpoint URL.
      */
    var ManifestName: js.UndefOr[__string] = js.undefined
    var MssPackage: js.UndefOr[MssPackage] = js.undefined
    /**
      * Maximum duration (in seconds) of content to retain for startover playback.
    If not specified, startover playback will be disabled for the OriginEndpoint.
      */
    var StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * Amount of delay (in seconds) to enforce on the playback of live content.
    If not specified, there will be no time delay in effect for the OriginEndpoint.
      */
    var TimeDelaySeconds: js.UndefOr[__integer] = js.undefined
    /**
      * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
      */
    var Whitelist: js.UndefOr[__listOf__string] = js.undefined
  }
  
  trait UpdateOriginEndpointResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the Channel the OriginEndpoint is associated with.
      */
    var ChannelId: js.UndefOr[__string] = js.undefined
    var CmafPackage: js.UndefOr[CmafPackage] = js.undefined
    var DashPackage: js.UndefOr[DashPackage] = js.undefined
    /**
      * A short text description of the OriginEndpoint.
      */
    var Description: js.UndefOr[__string] = js.undefined
    var HlsPackage: js.UndefOr[HlsPackage] = js.undefined
    /**
      * The ID of the OriginEndpoint.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * A short string appended to the end of the OriginEndpoint URL.
      */
    var ManifestName: js.UndefOr[__string] = js.undefined
    var MssPackage: js.UndefOr[MssPackage] = js.undefined
    /**
      * Maximum duration (seconds) of content to retain for startover playback.
    If not specified, startover playback will be disabled for the OriginEndpoint.
      */
    var StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined
    /**
      * Amount of delay (seconds) to enforce on the playback of live content.
    If not specified, there will be no time delay in effect for the OriginEndpoint.
      */
    var TimeDelaySeconds: js.UndefOr[__integer] = js.undefined
    /**
      * The URL of the packaged OriginEndpoint for consumption.
      */
    var Url: js.UndefOr[__string] = js.undefined
    /**
      * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
      */
    var Whitelist: js.UndefOr[__listOf__string] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AdMarkers = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.SCTE35_ENHANCED | awsDashSdkLib.awsDashSdkLibStrings.PASSTHROUGH | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EncryptionMethod = awsDashSdkLib.awsDashSdkLibStrings.AES_128 | awsDashSdkLib.awsDashSdkLibStrings.SAMPLE_AES | java.lang.String
  type ManifestLayout = awsDashSdkLib.awsDashSdkLibStrings.FULL | awsDashSdkLib.awsDashSdkLibStrings.COMPACT | java.lang.String
  type MaxResults = scala.Double
  type PlaylistType = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.EVENT | awsDashSdkLib.awsDashSdkLibStrings.VOD | java.lang.String
  type Profile = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.HBBTV_1_5 | java.lang.String
  type SegmentTemplateFormat = awsDashSdkLib.awsDashSdkLibStrings.NUMBER_WITH_TIMELINE | awsDashSdkLib.awsDashSdkLibStrings.TIME_WITH_TIMELINE | java.lang.String
  type StreamOrder = awsDashSdkLib.awsDashSdkLibStrings.ORIGINAL | awsDashSdkLib.awsDashSdkLibStrings.VIDEO_BITRATE_ASCENDING | awsDashSdkLib.awsDashSdkLibStrings.VIDEO_BITRATE_DESCENDING | java.lang.String
  type __PeriodTriggersElement = awsDashSdkLib.awsDashSdkLibStrings.ADS | java.lang.String
  type __boolean = scala.Boolean
  type __integer = scala.Double
  type __listOfChannel = js.Array[Channel]
  type __listOfHlsManifest = js.Array[HlsManifest]
  type __listOfHlsManifestCreateOrUpdateParameters = js.Array[HlsManifestCreateOrUpdateParameters]
  type __listOfIngestEndpoint = js.Array[IngestEndpoint]
  type __listOfOriginEndpoint = js.Array[OriginEndpoint]
  type __listOf__PeriodTriggersElement = js.Array[__PeriodTriggersElement]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-10-12` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

