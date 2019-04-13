package typings
package awsDashSdkLib.clientsMediaconvertMod

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
  var BaseUrl: js.UndefOr[__string] = js.undefined
  /**
    * Language to be used on Caption outputs
    */
  var CaptionLanguageMappings: js.UndefOr[__listOfHlsCaptionLanguageMapping] = js.undefined
  /**
    * Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
    */
  var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined
  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  var ClientCache: js.UndefOr[HlsClientCache] = js.undefined
  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  var CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[__stringPatternS3] = js.undefined
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined
  /**
    * Indicates whether segments should be placed in subdirectories.
    */
  var DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.undefined
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[HlsEncryptionSettings] = js.undefined
  /**
    * When set to GZIP, compresses HLS playlist.
    */
  var ManifestCompression: js.UndefOr[HlsManifestCompression] = js.undefined
  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.undefined
  /**
    * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back the end of your video asset. If you know that player devices are hanging on the final segment of your video because the length of your final segment is too short, use this setting to specify a minimum final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify a value for this setting, the encoder will combine any final segment that is shorter than the length that you specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final segment is 3.5 seconds.
    */
  var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined
  /**
    * When set, Minimum Segment Size is enforced by looking ahead and back within the specified range for a nearby avail and extending the segment size if needed.
    */
  var MinSegmentLength: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
    */
  var OutputSelection: js.UndefOr[HlsOutputSelection] = js.undefined
  /**
    * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
    */
  var ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.undefined
  /**
    * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
    */
  var ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600] = js.undefined
  /**
    * When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
    */
  var SegmentControl: js.UndefOr[HlsSegmentControl] = js.undefined
  /**
    * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer.
    */
  var SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be SINGLE_DIRECTORY for this setting to have an effect.
    */
  var SegmentsPerSubdirectory: js.UndefOr[__integerMin1Max2147483647] = js.undefined
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
  var TimedMetadataId3Period: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  /**
    * Provides an extra millisecond delta offset to fine tune the timestamps.
    */
  var TimestampDeltaMilliseconds: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
}

object HlsGroupSettings {
  @scala.inline
  def apply(
    AdMarkers: __listOfHlsAdMarkers = null,
    BaseUrl: __string = null,
    CaptionLanguageMappings: __listOfHlsCaptionLanguageMapping = null,
    CaptionLanguageSetting: HlsCaptionLanguageSetting = null,
    ClientCache: HlsClientCache = null,
    CodecSpecification: HlsCodecSpecification = null,
    Destination: __stringPatternS3 = null,
    DestinationSettings: DestinationSettings = null,
    DirectoryStructure: HlsDirectoryStructure = null,
    Encryption: HlsEncryptionSettings = null,
    ManifestCompression: HlsManifestCompression = null,
    ManifestDurationFormat: HlsManifestDurationFormat = null,
    MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
    MinSegmentLength: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    OutputSelection: HlsOutputSelection = null,
    ProgramDateTime: HlsProgramDateTime = null,
    ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600] = js.undefined,
    SegmentControl: HlsSegmentControl = null,
    SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    SegmentsPerSubdirectory: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    StreamInfResolution: HlsStreamInfResolution = null,
    TimedMetadataId3Frame: HlsTimedMetadataId3Frame = null,
    TimedMetadataId3Period: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
    TimestampDeltaMilliseconds: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  ): HlsGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (AdMarkers != null) __obj.updateDynamic("AdMarkers")(AdMarkers)
    if (BaseUrl != null) __obj.updateDynamic("BaseUrl")(BaseUrl)
    if (CaptionLanguageMappings != null) __obj.updateDynamic("CaptionLanguageMappings")(CaptionLanguageMappings)
    if (CaptionLanguageSetting != null) __obj.updateDynamic("CaptionLanguageSetting")(CaptionLanguageSetting.asInstanceOf[js.Any])
    if (ClientCache != null) __obj.updateDynamic("ClientCache")(ClientCache.asInstanceOf[js.Any])
    if (CodecSpecification != null) __obj.updateDynamic("CodecSpecification")(CodecSpecification.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination)
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings)
    if (DirectoryStructure != null) __obj.updateDynamic("DirectoryStructure")(DirectoryStructure.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (ManifestCompression != null) __obj.updateDynamic("ManifestCompression")(ManifestCompression.asInstanceOf[js.Any])
    if (ManifestDurationFormat != null) __obj.updateDynamic("ManifestDurationFormat")(ManifestDurationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(MinFinalSegmentLength)) __obj.updateDynamic("MinFinalSegmentLength")(MinFinalSegmentLength)
    if (!js.isUndefined(MinSegmentLength)) __obj.updateDynamic("MinSegmentLength")(MinSegmentLength)
    if (OutputSelection != null) __obj.updateDynamic("OutputSelection")(OutputSelection.asInstanceOf[js.Any])
    if (ProgramDateTime != null) __obj.updateDynamic("ProgramDateTime")(ProgramDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(ProgramDateTimePeriod)) __obj.updateDynamic("ProgramDateTimePeriod")(ProgramDateTimePeriod)
    if (SegmentControl != null) __obj.updateDynamic("SegmentControl")(SegmentControl.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentLength)) __obj.updateDynamic("SegmentLength")(SegmentLength)
    if (!js.isUndefined(SegmentsPerSubdirectory)) __obj.updateDynamic("SegmentsPerSubdirectory")(SegmentsPerSubdirectory)
    if (StreamInfResolution != null) __obj.updateDynamic("StreamInfResolution")(StreamInfResolution.asInstanceOf[js.Any])
    if (TimedMetadataId3Frame != null) __obj.updateDynamic("TimedMetadataId3Frame")(TimedMetadataId3Frame.asInstanceOf[js.Any])
    if (!js.isUndefined(TimedMetadataId3Period)) __obj.updateDynamic("TimedMetadataId3Period")(TimedMetadataId3Period)
    if (!js.isUndefined(TimestampDeltaMilliseconds)) __obj.updateDynamic("TimestampDeltaMilliseconds")(TimestampDeltaMilliseconds)
    __obj.asInstanceOf[HlsGroupSettings]
  }
}

