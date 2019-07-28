package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsGroupSettings extends js.Object {
  /**
    * Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
    */
  var AdMarkers: js.UndefOr[__listOfHlsAdMarkers] = js.undefined
  /**
    * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
    */
  var BaseUrlContent: js.UndefOr[__string] = js.undefined
  /**
    * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
    */
  var BaseUrlManifest: js.UndefOr[__string] = js.undefined
  /**
    * Mapping of up to 4 caption channels to caption languages.  Is only meaningful if captionLanguageSetting is set to "insert".
    */
  var CaptionLanguageMappings: js.UndefOr[__listOfCaptionLanguageMapping] = js.undefined
  /**
    * Applies only to 608 Embedded output captions.
  insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions.
  none: Include CLOSED-CAPTIONS=NONE line in the manifest.
  omit: Omit any CLOSED-CAPTIONS line from the manifest.
    */
  var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined
  /**
    * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from saving media segments for later replay.
    */
  var ClientCache: js.UndefOr[HlsClientCache] = js.undefined
  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  var CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined
  /**
    * For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text string. If ivSource is set to "explicit" then this parameter is required and is used as the IV for encryption.
    */
  var ConstantIv: js.UndefOr[__stringMin32Max32] = js.undefined
  /**
    * A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled).
    */
  var Destination: OutputLocationRef
  /**
    * Place segments in subdirectories.
    */
  var DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.undefined
  /**
    * Encrypts the segments with the given encryption scheme.  Exclude this parameter if no encryption is desired.
    */
  var EncryptionType: js.UndefOr[HlsEncryptionType] = js.undefined
  /**
    * Parameters that control interactions with the CDN.
    */
  var HlsCdnSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.HlsCdnSettings] = js.undefined
  /**
    * DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according to the Output Selection field).
  STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other manifests (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame position. For example, #EXT-X-BYTERANGE:160364@1461888"
    */
  var IFrameOnlyPlaylists: js.UndefOr[IFrameOnlyPlaylistType] = js.undefined
  /**
    * Applies only if Mode field is LIVE. Specifies the maximum number of segments in the media manifest file. After this maximum, older segments are removed from the media manifest. This number must be less than or equal to the Keep Segments field.
    */
  var IndexNSegments: js.UndefOr[__integerMin3] = js.undefined
  /**
    * Parameter that control output group behavior on input loss.
    */
  var InputLossAction: js.UndefOr[InputLossActionForHlsOut] = js.undefined
  /**
    * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not in the manifest.
    */
  var IvInManifest: js.UndefOr[HlsIvInManifest] = js.undefined
  /**
    * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change every segment (to match the segment number). If this is set to "explicit", you must enter a constantIv value.
    */
  var IvSource: js.UndefOr[HlsIvSource] = js.undefined
  /**
    * Applies only if Mode field is LIVE. Specifies the number of media segments (.ts files) to retain in the destination directory.
    */
  var KeepSegments: js.UndefOr[__integerMin1] = js.undefined
  /**
    * The value specifies how the key is represented in the resource identified by the URI.  If parameter is absent, an implicit value of "identity" is used.  A reverse DNS string can also be given.
    */
  var KeyFormat: js.UndefOr[__string] = js.undefined
  /**
    * Either a single positive integer version value or a slash delimited list of version values (1/2/3).
    */
  var KeyFormatVersions: js.UndefOr[__string] = js.undefined
  /**
    * The key provider settings.
    */
  var KeyProviderSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.KeyProviderSettings] = js.undefined
  /**
    * When set to gzip, compresses HLS playlist.
    */
  var ManifestCompression: js.UndefOr[HlsManifestCompression] = js.undefined
  /**
    * Indicates whether the output manifest should use floating point or integer values for segment duration.
    */
  var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.undefined
  /**
    * When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a nearby avail and extending the segment size if needed.
    */
  var MinSegmentLength: js.UndefOr[__integerMin0] = js.undefined
  /**
    * If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only the number segments specified in keepSegments and indexNSegments are kept; newer segments replace older segments, which may prevent players from rewinding all the way to the beginning of the event.
  VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type manifest on completion of the stream.
    */
  var Mode: js.UndefOr[HlsMode] = js.undefined
  /**
    * MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this output group.
  SEGMENTSONLY: Does not generate any manifests for this output group.
    */
  var OutputSelection: js.UndefOr[HlsOutputSelection] = js.undefined
  /**
    * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestampOffset.
    */
  var ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.undefined
  /**
    * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
    */
  var ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600] = js.undefined
  /**
    * ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines: first its own media files, then the media files of the other pipeline. This feature allows playout device that support stale manifest detection to switch from one manifest to the other, when the current manifest seems to be stale. There are still two destinations and two master manifests, but both master manifests reference the media files from both pipelines.
  DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline only.
  For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed. MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is irrelevant.
    */
  var RedundantManifest: js.UndefOr[HlsRedundantManifest] = js.undefined
  /**
    * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer.
    */
  var SegmentLength: js.UndefOr[__integerMin1] = js.undefined
  /**
    * useInputSegmentation has been deprecated. The configured segment size is always used.
    */
  var SegmentationMode: js.UndefOr[HlsSegmentationMode] = js.undefined
  /**
    * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be subdirectoryPerStream for this setting to have an effect.
    */
  var SegmentsPerSubdirectory: js.UndefOr[__integerMin1] = js.undefined
  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  var StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.undefined
  /**
    * Indicates ID3 frame that has the timecode.
    */
  var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.undefined
  /**
    * Timed Metadata interval in seconds.
    */
  var TimedMetadataId3Period: js.UndefOr[__integerMin0] = js.undefined
  /**
    * Provides an extra millisecond delta offset to fine tune the timestamps.
    */
  var TimestampDeltaMilliseconds: js.UndefOr[__integerMin0] = js.undefined
  /**
    * SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
  SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is when sending the output to AWS Elemental MediaConvert, which can accept only a single media file. Playback while the channel is running is not guaranteed due to HTTP server caching.
    */
  var TsFileMode: js.UndefOr[HlsTsFileMode] = js.undefined
}

object HlsGroupSettings {
  @scala.inline
  def apply(
    Destination: OutputLocationRef,
    AdMarkers: __listOfHlsAdMarkers = null,
    BaseUrlContent: __string = null,
    BaseUrlManifest: __string = null,
    CaptionLanguageMappings: __listOfCaptionLanguageMapping = null,
    CaptionLanguageSetting: HlsCaptionLanguageSetting = null,
    ClientCache: HlsClientCache = null,
    CodecSpecification: HlsCodecSpecification = null,
    ConstantIv: __stringMin32Max32 = null,
    DirectoryStructure: HlsDirectoryStructure = null,
    EncryptionType: HlsEncryptionType = null,
    HlsCdnSettings: HlsCdnSettings = null,
    IFrameOnlyPlaylists: IFrameOnlyPlaylistType = null,
    IndexNSegments: js.UndefOr[__integerMin3] = js.undefined,
    InputLossAction: InputLossActionForHlsOut = null,
    IvInManifest: HlsIvInManifest = null,
    IvSource: HlsIvSource = null,
    KeepSegments: js.UndefOr[__integerMin1] = js.undefined,
    KeyFormat: __string = null,
    KeyFormatVersions: __string = null,
    KeyProviderSettings: KeyProviderSettings = null,
    ManifestCompression: HlsManifestCompression = null,
    ManifestDurationFormat: HlsManifestDurationFormat = null,
    MinSegmentLength: js.UndefOr[__integerMin0] = js.undefined,
    Mode: HlsMode = null,
    OutputSelection: HlsOutputSelection = null,
    ProgramDateTime: HlsProgramDateTime = null,
    ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600] = js.undefined,
    RedundantManifest: HlsRedundantManifest = null,
    SegmentLength: js.UndefOr[__integerMin1] = js.undefined,
    SegmentationMode: HlsSegmentationMode = null,
    SegmentsPerSubdirectory: js.UndefOr[__integerMin1] = js.undefined,
    StreamInfResolution: HlsStreamInfResolution = null,
    TimedMetadataId3Frame: HlsTimedMetadataId3Frame = null,
    TimedMetadataId3Period: js.UndefOr[__integerMin0] = js.undefined,
    TimestampDeltaMilliseconds: js.UndefOr[__integerMin0] = js.undefined,
    TsFileMode: HlsTsFileMode = null
  ): HlsGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination)
    if (AdMarkers != null) __obj.updateDynamic("AdMarkers")(AdMarkers)
    if (BaseUrlContent != null) __obj.updateDynamic("BaseUrlContent")(BaseUrlContent)
    if (BaseUrlManifest != null) __obj.updateDynamic("BaseUrlManifest")(BaseUrlManifest)
    if (CaptionLanguageMappings != null) __obj.updateDynamic("CaptionLanguageMappings")(CaptionLanguageMappings)
    if (CaptionLanguageSetting != null) __obj.updateDynamic("CaptionLanguageSetting")(CaptionLanguageSetting.asInstanceOf[js.Any])
    if (ClientCache != null) __obj.updateDynamic("ClientCache")(ClientCache.asInstanceOf[js.Any])
    if (CodecSpecification != null) __obj.updateDynamic("CodecSpecification")(CodecSpecification.asInstanceOf[js.Any])
    if (ConstantIv != null) __obj.updateDynamic("ConstantIv")(ConstantIv)
    if (DirectoryStructure != null) __obj.updateDynamic("DirectoryStructure")(DirectoryStructure.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (HlsCdnSettings != null) __obj.updateDynamic("HlsCdnSettings")(HlsCdnSettings)
    if (IFrameOnlyPlaylists != null) __obj.updateDynamic("IFrameOnlyPlaylists")(IFrameOnlyPlaylists.asInstanceOf[js.Any])
    if (!js.isUndefined(IndexNSegments)) __obj.updateDynamic("IndexNSegments")(IndexNSegments)
    if (InputLossAction != null) __obj.updateDynamic("InputLossAction")(InputLossAction.asInstanceOf[js.Any])
    if (IvInManifest != null) __obj.updateDynamic("IvInManifest")(IvInManifest.asInstanceOf[js.Any])
    if (IvSource != null) __obj.updateDynamic("IvSource")(IvSource.asInstanceOf[js.Any])
    if (!js.isUndefined(KeepSegments)) __obj.updateDynamic("KeepSegments")(KeepSegments)
    if (KeyFormat != null) __obj.updateDynamic("KeyFormat")(KeyFormat)
    if (KeyFormatVersions != null) __obj.updateDynamic("KeyFormatVersions")(KeyFormatVersions)
    if (KeyProviderSettings != null) __obj.updateDynamic("KeyProviderSettings")(KeyProviderSettings)
    if (ManifestCompression != null) __obj.updateDynamic("ManifestCompression")(ManifestCompression.asInstanceOf[js.Any])
    if (ManifestDurationFormat != null) __obj.updateDynamic("ManifestDurationFormat")(ManifestDurationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(MinSegmentLength)) __obj.updateDynamic("MinSegmentLength")(MinSegmentLength)
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (OutputSelection != null) __obj.updateDynamic("OutputSelection")(OutputSelection.asInstanceOf[js.Any])
    if (ProgramDateTime != null) __obj.updateDynamic("ProgramDateTime")(ProgramDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(ProgramDateTimePeriod)) __obj.updateDynamic("ProgramDateTimePeriod")(ProgramDateTimePeriod)
    if (RedundantManifest != null) __obj.updateDynamic("RedundantManifest")(RedundantManifest.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentLength)) __obj.updateDynamic("SegmentLength")(SegmentLength)
    if (SegmentationMode != null) __obj.updateDynamic("SegmentationMode")(SegmentationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsPerSubdirectory)) __obj.updateDynamic("SegmentsPerSubdirectory")(SegmentsPerSubdirectory)
    if (StreamInfResolution != null) __obj.updateDynamic("StreamInfResolution")(StreamInfResolution.asInstanceOf[js.Any])
    if (TimedMetadataId3Frame != null) __obj.updateDynamic("TimedMetadataId3Frame")(TimedMetadataId3Frame.asInstanceOf[js.Any])
    if (!js.isUndefined(TimedMetadataId3Period)) __obj.updateDynamic("TimedMetadataId3Period")(TimedMetadataId3Period)
    if (!js.isUndefined(TimestampDeltaMilliseconds)) __obj.updateDynamic("TimestampDeltaMilliseconds")(TimestampDeltaMilliseconds)
    if (TsFileMode != null) __obj.updateDynamic("TsFileMode")(TsFileMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsGroupSettings]
  }
}

