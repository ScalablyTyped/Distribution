package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CmafGroupSettings extends StObject {
  
  /**
    * By default, the service creates one top-level .m3u8 HLS manifest and one top -level .mpd DASH manifest for each CMAF output group in your job. These default manifests reference every output in the output group. To create additional top-level manifests that reference a subset of the outputs in the output group, specify a list of them here. For each additional manifest that you specify, the service creates one HLS manifest and one DASH manifest.
    */
  var AdditionalManifests: js.UndefOr[listOfCmafAdditionalManifest] = js.undefined
  
  /**
    * A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
    */
  var BaseUrl: js.UndefOr[string] = js.undefined
  
  /**
    * Disable this setting only when your workflow requires the #EXT-X-ALLOW-CACHE:no tag. Otherwise, keep the default value Enabled (ENABLED) and control caching in your video distribution set up. For example, use the Cache-Control http header.
    */
  var ClientCache: js.UndefOr[CmafClientCache] = js.undefined
  
  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  var CodecSpecification: js.UndefOr[CmafCodecSpecification] = js.undefined
  
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.undefined
  
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.DestinationSettings] = js.undefined
  
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[CmafEncryptionSettings] = js.undefined
  
  /**
    * Specify the length, in whole seconds, of the mp4 fragments. When you don't specify a value, MediaConvert defaults to 2. Related setting: Use Fragment length control (FragmentLengthControl) to specify whether the encoder enforces this value strictly.
    */
  var FragmentLength: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Specify whether MediaConvert generates images for trick play. Keep the default value, None (NONE), to not generate any images. Choose Thumbnail (THUMBNAIL) to generate tiled thumbnails. Choose Thumbnail and full frame (THUMBNAIL_AND_FULLFRAME) to generate tiled thumbnails and full-resolution images of single frames. When you enable Write HLS manifest (WriteHlsManifest), MediaConvert creates a child manifest for each set of images that you generate and adds corresponding entries to the parent manifest. When you enable Write DASH manifest (WriteDashManifest), MediaConvert adds an entry in the .mpd manifest for each set of images that you generate. A common application for these images is Roku trick mode. The thumbnails and full-frame images that MediaConvert creates with this feature are compatible with this Roku specification: https://developer.roku.com/docs/developer-program/media-playback/trick-mode/hls-and-dash.md
    */
  var ImageBasedTrickPlay: js.UndefOr[CmafImageBasedTrickPlay] = js.undefined
  
  /**
    * Tile and thumbnail settings applicable when imageBasedTrickPlay is ADVANCED
    */
  var ImageBasedTrickPlaySettings: js.UndefOr[CmafImageBasedTrickPlaySettings] = js.undefined
  
  /**
    * When set to GZIP, compresses HLS playlist.
    */
  var ManifestCompression: js.UndefOr[CmafManifestCompression] = js.undefined
  
  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  var ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat] = js.undefined
  
  /**
    * Minimum time of initially buffered media that is needed to ensure smooth playout.
    */
  var MinBufferTime: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back the end of your video asset. If you know that player devices are hanging on the final segment of your video because the length of your final segment is too short, use this setting to specify a minimum final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify a value for this setting, the encoder will combine any final segment that is shorter than the length that you specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final segment is 3.5 seconds.
    */
  var MinFinalSegmentLength: js.UndefOr[doubleMin0Max2147483647] = js.undefined
  
  /**
    * Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals  urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
    */
  var MpdProfile: js.UndefOr[CmafMpdProfile] = js.undefined
  
  /**
    * Use this setting only when your output video stream has B-frames, which causes the initial presentation time stamp (PTS) to be offset from the initial decode time stamp (DTS). Specify how MediaConvert handles PTS when writing time stamps in output DASH manifests. Choose Match initial PTS (MATCH_INITIAL_PTS) when you want MediaConvert to use the initial PTS as the first time stamp in the manifest. Choose Zero-based (ZERO_BASED) to have MediaConvert ignore the initial PTS in the video stream and instead write the initial time stamp as zero in the manifest. For outputs that don't have B-frames, the time stamps in your DASH manifests start at zero regardless of your choice here.
    */
  var PtsOffsetHandlingForBFrames: js.UndefOr[CmafPtsOffsetHandlingForBFrames] = js.undefined
  
  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  var SegmentControl: js.UndefOr[CmafSegmentControl] = js.undefined
  
  /**
    * Specify the length, in whole seconds, of each segment. When you don't specify a value, MediaConvert defaults to 10. Related settings: Use Segment length control (SegmentLengthControl) to specify whether the encoder enforces this value strictly. Use Segment control (CmafSegmentControl) to specify whether MediaConvert creates separate segment files or one content file that has metadata to mark the segment boundaries.
    */
  var SegmentLength: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Specify how you want MediaConvert to determine the segment length. Choose Exact (EXACT) to have the encoder use the exact length that you specify with the setting Segment length (SegmentLength). This might result in extra I-frames. Choose Multiple of GOP (GOP_MULTIPLE) to have the encoder round up the segment lengths to match the next GOP boundary.
    */
  var SegmentLengthControl: js.UndefOr[CmafSegmentLengthControl] = js.undefined
  
  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  var StreamInfResolution: js.UndefOr[CmafStreamInfResolution] = js.undefined
  
  /**
    * When set to LEGACY, the segment target duration is always rounded up to the nearest integer value above its current value in seconds. When set to SPEC\\_COMPLIANT, the segment target duration is rounded up to the nearest integer value if fraction seconds are greater than or equal to 0.5 (>= 0.5) and rounded down if less than 0.5 (< 0.5). You may need to use LEGACY if your client needs to ensure that the target duration is always longer than the actual duration of the segment. Some older players may experience interrupted playback when the actual duration of a track in a segment is longer than the target duration.
    */
  var TargetDurationCompatibilityMode: js.UndefOr[CmafTargetDurationCompatibilityMode] = js.undefined
  
  /**
    * When set to ENABLED, a DASH MPD manifest will be generated for this output.
    */
  var WriteDashManifest: js.UndefOr[CmafWriteDASHManifest] = js.undefined
  
  /**
    * When set to ENABLED, an Apple HLS manifest will be generated for this output.
    */
  var WriteHlsManifest: js.UndefOr[CmafWriteHLSManifest] = js.undefined
  
  /**
    * When you enable Precise segment duration in DASH manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
    */
  var WriteSegmentTimelineInRepresentation: js.UndefOr[CmafWriteSegmentTimelineInRepresentation] = js.undefined
}
object CmafGroupSettings {
  
  inline def apply(): CmafGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmafGroupSettings]
  }
  
  extension [Self <: CmafGroupSettings](x: Self) {
    
    inline def setAdditionalManifests(value: listOfCmafAdditionalManifest): Self = StObject.set(x, "AdditionalManifests", value.asInstanceOf[js.Any])
    
    inline def setAdditionalManifestsUndefined: Self = StObject.set(x, "AdditionalManifests", js.undefined)
    
    inline def setAdditionalManifestsVarargs(value: CmafAdditionalManifest*): Self = StObject.set(x, "AdditionalManifests", js.Array(value*))
    
    inline def setBaseUrl(value: string): Self = StObject.set(x, "BaseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "BaseUrl", js.undefined)
    
    inline def setClientCache(value: CmafClientCache): Self = StObject.set(x, "ClientCache", value.asInstanceOf[js.Any])
    
    inline def setClientCacheUndefined: Self = StObject.set(x, "ClientCache", js.undefined)
    
    inline def setCodecSpecification(value: CmafCodecSpecification): Self = StObject.set(x, "CodecSpecification", value.asInstanceOf[js.Any])
    
    inline def setCodecSpecificationUndefined: Self = StObject.set(x, "CodecSpecification", js.undefined)
    
    inline def setDestination(value: stringPatternS3): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettings(value: DestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setEncryption(value: CmafEncryptionSettings): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setFragmentLength(value: integerMin1Max2147483647): Self = StObject.set(x, "FragmentLength", value.asInstanceOf[js.Any])
    
    inline def setFragmentLengthUndefined: Self = StObject.set(x, "FragmentLength", js.undefined)
    
    inline def setImageBasedTrickPlay(value: CmafImageBasedTrickPlay): Self = StObject.set(x, "ImageBasedTrickPlay", value.asInstanceOf[js.Any])
    
    inline def setImageBasedTrickPlaySettings(value: CmafImageBasedTrickPlaySettings): Self = StObject.set(x, "ImageBasedTrickPlaySettings", value.asInstanceOf[js.Any])
    
    inline def setImageBasedTrickPlaySettingsUndefined: Self = StObject.set(x, "ImageBasedTrickPlaySettings", js.undefined)
    
    inline def setImageBasedTrickPlayUndefined: Self = StObject.set(x, "ImageBasedTrickPlay", js.undefined)
    
    inline def setManifestCompression(value: CmafManifestCompression): Self = StObject.set(x, "ManifestCompression", value.asInstanceOf[js.Any])
    
    inline def setManifestCompressionUndefined: Self = StObject.set(x, "ManifestCompression", js.undefined)
    
    inline def setManifestDurationFormat(value: CmafManifestDurationFormat): Self = StObject.set(x, "ManifestDurationFormat", value.asInstanceOf[js.Any])
    
    inline def setManifestDurationFormatUndefined: Self = StObject.set(x, "ManifestDurationFormat", js.undefined)
    
    inline def setMinBufferTime(value: integerMin0Max2147483647): Self = StObject.set(x, "MinBufferTime", value.asInstanceOf[js.Any])
    
    inline def setMinBufferTimeUndefined: Self = StObject.set(x, "MinBufferTime", js.undefined)
    
    inline def setMinFinalSegmentLength(value: doubleMin0Max2147483647): Self = StObject.set(x, "MinFinalSegmentLength", value.asInstanceOf[js.Any])
    
    inline def setMinFinalSegmentLengthUndefined: Self = StObject.set(x, "MinFinalSegmentLength", js.undefined)
    
    inline def setMpdProfile(value: CmafMpdProfile): Self = StObject.set(x, "MpdProfile", value.asInstanceOf[js.Any])
    
    inline def setMpdProfileUndefined: Self = StObject.set(x, "MpdProfile", js.undefined)
    
    inline def setPtsOffsetHandlingForBFrames(value: CmafPtsOffsetHandlingForBFrames): Self = StObject.set(x, "PtsOffsetHandlingForBFrames", value.asInstanceOf[js.Any])
    
    inline def setPtsOffsetHandlingForBFramesUndefined: Self = StObject.set(x, "PtsOffsetHandlingForBFrames", js.undefined)
    
    inline def setSegmentControl(value: CmafSegmentControl): Self = StObject.set(x, "SegmentControl", value.asInstanceOf[js.Any])
    
    inline def setSegmentControlUndefined: Self = StObject.set(x, "SegmentControl", js.undefined)
    
    inline def setSegmentLength(value: integerMin1Max2147483647): Self = StObject.set(x, "SegmentLength", value.asInstanceOf[js.Any])
    
    inline def setSegmentLengthControl(value: CmafSegmentLengthControl): Self = StObject.set(x, "SegmentLengthControl", value.asInstanceOf[js.Any])
    
    inline def setSegmentLengthControlUndefined: Self = StObject.set(x, "SegmentLengthControl", js.undefined)
    
    inline def setSegmentLengthUndefined: Self = StObject.set(x, "SegmentLength", js.undefined)
    
    inline def setStreamInfResolution(value: CmafStreamInfResolution): Self = StObject.set(x, "StreamInfResolution", value.asInstanceOf[js.Any])
    
    inline def setStreamInfResolutionUndefined: Self = StObject.set(x, "StreamInfResolution", js.undefined)
    
    inline def setTargetDurationCompatibilityMode(value: CmafTargetDurationCompatibilityMode): Self = StObject.set(x, "TargetDurationCompatibilityMode", value.asInstanceOf[js.Any])
    
    inline def setTargetDurationCompatibilityModeUndefined: Self = StObject.set(x, "TargetDurationCompatibilityMode", js.undefined)
    
    inline def setWriteDashManifest(value: CmafWriteDASHManifest): Self = StObject.set(x, "WriteDashManifest", value.asInstanceOf[js.Any])
    
    inline def setWriteDashManifestUndefined: Self = StObject.set(x, "WriteDashManifest", js.undefined)
    
    inline def setWriteHlsManifest(value: CmafWriteHLSManifest): Self = StObject.set(x, "WriteHlsManifest", value.asInstanceOf[js.Any])
    
    inline def setWriteHlsManifestUndefined: Self = StObject.set(x, "WriteHlsManifest", js.undefined)
    
    inline def setWriteSegmentTimelineInRepresentation(value: CmafWriteSegmentTimelineInRepresentation): Self = StObject.set(x, "WriteSegmentTimelineInRepresentation", value.asInstanceOf[js.Any])
    
    inline def setWriteSegmentTimelineInRepresentationUndefined: Self = StObject.set(x, "WriteSegmentTimelineInRepresentation", js.undefined)
  }
}
