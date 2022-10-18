package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashIsoGroupSettings extends StObject {
  
  /**
    * By default, the service creates one .mpd DASH manifest for each DASH ISO output group in your job. This default manifest references every output in the output group. To create additional DASH manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfDashAdditionalManifest] = js.undefined
  
  /**
    * Use this setting only when your audio codec is a Dolby one (AC3, EAC3, or Atmos) and your downstream workflow requires that your DASH manifest use the Dolby channel configuration tag, rather than the MPEG one. For example, you might need to use this to make dynamic ad insertion work. Specify which audio channel configuration scheme ID URI MediaConvert writes in your DASH manifest. Keep the default value, MPEG channel configuration (MPEG_CHANNEL_CONFIGURATION), to have MediaConvert write this: urn:mpeg:mpegB:cicp:ChannelConfiguration. Choose Dolby channel configuration (DOLBY_CHANNEL_CONFIGURATION) to have MediaConvert write this instead: tag:dolby.com,2014:dash:audio_channel_configuration:2011.
    */
  var AudioChannelConfigSchemeIdUri: js.UndefOr[DashIsoGroupAudioChannelConfigSchemeIdUri] = js.undefined
  
  /**
    * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
    */
  var BaseUrl: js.UndefOr[string] = js.undefined
  
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
  var Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.undefined
  
  /**
    * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var FragmentLength: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Supports HbbTV specification as indicated
    */
  var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.undefined
  
  /**
    * Specify whether MediaConvert generates images for trick play. Keep the default value, None (NONE), to not generate any images. Choose Thumbnail (THUMBNAIL) to generate tiled thumbnails. Choose Thumbnail and full frame (THUMBNAIL_AND_FULLFRAME) to generate tiled thumbnails and full-resolution images of single frames. MediaConvert adds an entry in the .mpd manifest for each set of images that you generate. A common application for these images is Roku trick mode. The thumbnails and full-frame images that MediaConvert creates with this feature are compatible with this Roku specification: https://developer.roku.com/docs/developer-program/media-playback/trick-mode/hls-and-dash.md
    */
  var ImageBasedTrickPlay: js.UndefOr[DashIsoImageBasedTrickPlay] = js.undefined
  
  /**
    * Tile and thumbnail settings applicable when imageBasedTrickPlay is ADVANCED
    */
  var ImageBasedTrickPlaySettings: js.UndefOr[DashIsoImageBasedTrickPlaySettings] = js.undefined
  
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
  var MpdProfile: js.UndefOr[DashIsoMpdProfile] = js.undefined
  
  /**
    * Use this setting only when your output video stream has B-frames, which causes the initial presentation time stamp (PTS) to be offset from the initial decode time stamp (DTS). Specify how MediaConvert handles PTS when writing time stamps in output DASH manifests. Choose Match initial PTS (MATCH_INITIAL_PTS) when you want MediaConvert to use the initial PTS as the first time stamp in the manifest. Choose Zero-based (ZERO_BASED) to have MediaConvert ignore the initial PTS in the video stream and instead write the initial time stamp as zero in the manifest. For outputs that don't have B-frames, the time stamps in your DASH manifests start at zero regardless of your choice here.
    */
  var PtsOffsetHandlingForBFrames: js.UndefOr[DashIsoPtsOffsetHandlingForBFrames] = js.undefined
  
  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  var SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.undefined
  
  /**
    * Specify the length, in whole seconds, of each segment. When you don't specify a value, MediaConvert defaults to 30. Related settings: Use Segment length control (SegmentLengthControl) to specify whether the encoder enforces this value strictly. Use Segment control (DashIsoSegmentControl) to specify whether MediaConvert creates separate segment files or one content file that has metadata to mark the segment boundaries.
    */
  var SegmentLength: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Specify how you want MediaConvert to determine the segment length. Choose Exact (EXACT) to have the encoder use the exact length that you specify with the setting Segment length (SegmentLength). This might result in extra I-frames. Choose Multiple of GOP (GOP_MULTIPLE) to have the encoder round up the segment lengths to match the next GOP boundary.
    */
  var SegmentLengthControl: js.UndefOr[DashIsoSegmentLengthControl] = js.undefined
  
  /**
    * If you get an HTTP error in the 400 range when you play back your DASH output, enable this setting and run your transcoding job again. When you enable this setting, the service writes precise segment durations in the DASH manifest. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When you don't enable this setting, the service writes approximate segment durations in your DASH manifest.
    */
  var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.undefined
}
object DashIsoGroupSettings {
  
  inline def apply(): DashIsoGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashIsoGroupSettings]
  }
  
  extension [Self <: DashIsoGroupSettings](x: Self) {
    
    inline def setAdditionalManifests(value: listOfDashAdditionalManifest): Self = StObject.set(x, "AdditionalManifests", value.asInstanceOf[js.Any])
    
    inline def setAdditionalManifestsUndefined: Self = StObject.set(x, "AdditionalManifests", js.undefined)
    
    inline def setAdditionalManifestsVarargs(value: DashAdditionalManifest*): Self = StObject.set(x, "AdditionalManifests", js.Array(value*))
    
    inline def setAudioChannelConfigSchemeIdUri(value: DashIsoGroupAudioChannelConfigSchemeIdUri): Self = StObject.set(x, "AudioChannelConfigSchemeIdUri", value.asInstanceOf[js.Any])
    
    inline def setAudioChannelConfigSchemeIdUriUndefined: Self = StObject.set(x, "AudioChannelConfigSchemeIdUri", js.undefined)
    
    inline def setBaseUrl(value: string): Self = StObject.set(x, "BaseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "BaseUrl", js.undefined)
    
    inline def setDestination(value: stringPatternS3): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettings(value: DestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setEncryption(value: DashIsoEncryptionSettings): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setFragmentLength(value: integerMin1Max2147483647): Self = StObject.set(x, "FragmentLength", value.asInstanceOf[js.Any])
    
    inline def setFragmentLengthUndefined: Self = StObject.set(x, "FragmentLength", js.undefined)
    
    inline def setHbbtvCompliance(value: DashIsoHbbtvCompliance): Self = StObject.set(x, "HbbtvCompliance", value.asInstanceOf[js.Any])
    
    inline def setHbbtvComplianceUndefined: Self = StObject.set(x, "HbbtvCompliance", js.undefined)
    
    inline def setImageBasedTrickPlay(value: DashIsoImageBasedTrickPlay): Self = StObject.set(x, "ImageBasedTrickPlay", value.asInstanceOf[js.Any])
    
    inline def setImageBasedTrickPlaySettings(value: DashIsoImageBasedTrickPlaySettings): Self = StObject.set(x, "ImageBasedTrickPlaySettings", value.asInstanceOf[js.Any])
    
    inline def setImageBasedTrickPlaySettingsUndefined: Self = StObject.set(x, "ImageBasedTrickPlaySettings", js.undefined)
    
    inline def setImageBasedTrickPlayUndefined: Self = StObject.set(x, "ImageBasedTrickPlay", js.undefined)
    
    inline def setMinBufferTime(value: integerMin0Max2147483647): Self = StObject.set(x, "MinBufferTime", value.asInstanceOf[js.Any])
    
    inline def setMinBufferTimeUndefined: Self = StObject.set(x, "MinBufferTime", js.undefined)
    
    inline def setMinFinalSegmentLength(value: doubleMin0Max2147483647): Self = StObject.set(x, "MinFinalSegmentLength", value.asInstanceOf[js.Any])
    
    inline def setMinFinalSegmentLengthUndefined: Self = StObject.set(x, "MinFinalSegmentLength", js.undefined)
    
    inline def setMpdProfile(value: DashIsoMpdProfile): Self = StObject.set(x, "MpdProfile", value.asInstanceOf[js.Any])
    
    inline def setMpdProfileUndefined: Self = StObject.set(x, "MpdProfile", js.undefined)
    
    inline def setPtsOffsetHandlingForBFrames(value: DashIsoPtsOffsetHandlingForBFrames): Self = StObject.set(x, "PtsOffsetHandlingForBFrames", value.asInstanceOf[js.Any])
    
    inline def setPtsOffsetHandlingForBFramesUndefined: Self = StObject.set(x, "PtsOffsetHandlingForBFrames", js.undefined)
    
    inline def setSegmentControl(value: DashIsoSegmentControl): Self = StObject.set(x, "SegmentControl", value.asInstanceOf[js.Any])
    
    inline def setSegmentControlUndefined: Self = StObject.set(x, "SegmentControl", js.undefined)
    
    inline def setSegmentLength(value: integerMin1Max2147483647): Self = StObject.set(x, "SegmentLength", value.asInstanceOf[js.Any])
    
    inline def setSegmentLengthControl(value: DashIsoSegmentLengthControl): Self = StObject.set(x, "SegmentLengthControl", value.asInstanceOf[js.Any])
    
    inline def setSegmentLengthControlUndefined: Self = StObject.set(x, "SegmentLengthControl", js.undefined)
    
    inline def setSegmentLengthUndefined: Self = StObject.set(x, "SegmentLength", js.undefined)
    
    inline def setWriteSegmentTimelineInRepresentation(value: DashIsoWriteSegmentTimelineInRepresentation): Self = StObject.set(x, "WriteSegmentTimelineInRepresentation", value.asInstanceOf[js.Any])
    
    inline def setWriteSegmentTimelineInRepresentationUndefined: Self = StObject.set(x, "WriteSegmentTimelineInRepresentation", js.undefined)
  }
}
