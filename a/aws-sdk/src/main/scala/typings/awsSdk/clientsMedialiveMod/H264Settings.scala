package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H264Settings extends StObject {
  
  /**
    * Enables or disables adaptive quantization, which is a technique MediaLive can apply to video on a frame-by-frame basis to produce more compression without losing quality. There are three types of adaptive quantization: flicker, spatial, and temporal. Set the field in one of these ways: Set to Auto. Recommended. For each type of AQ, MediaLive will determine if AQ is needed, and if so, the appropriate strength. Set a strength (a value other than Auto or Disable). This strength will apply to any of the AQ fields that you choose to enable. Set to Disabled to disable all types of adaptive quantization.
    */
  var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.undefined
  
  /**
    * Indicates that AFD values will be written into the output stream.  If afdSignaling is "auto", the system will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value will be the value configured in the fixedAfd parameter.
    */
  var AfdSignaling: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AfdSignaling] = js.undefined
  
  /**
    * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000] = js.undefined
  
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var BufFillPct: js.UndefOr[integerMin0Max100] = js.undefined
  
  /**
    * Size of buffer (HRD buffer model) in bits.
    */
  var BufSize: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Includes colorspace metadata in the output.
    */
  var ColorMetadata: js.UndefOr[H264ColorMetadata] = js.undefined
  
  /**
    * Color Space settings
    */
  var ColorSpaceSettings: js.UndefOr[H264ColorSpaceSettings] = js.undefined
  
  /**
    * Entropy encoding mode.  Use cabac (must be in Main or High profile) or cavlc.
    */
  var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.undefined
  
  /**
    * Optional filters that you can apply to an encode.
    */
  var FilterSettings: js.UndefOr[H264FilterSettings] = js.undefined
  
  /**
    * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to 'Fixed'.
    */
  var FixedAfd: js.UndefOr[typings.awsSdk.clientsMedialiveMod.FixedAfd] = js.undefined
  
  /**
    * Flicker AQ makes adjustments within each frame to reduce flicker or 'pop' on I-frames. The value to enter in this field depends on the value in the Adaptive quantization field: If you have set the Adaptive quantization field to Auto, MediaLive ignores any value in this field. MediaLive will determine if flicker AQ is appropriate and will apply the appropriate strength. If you have set the Adaptive quantization field to a strength, you can set this field to Enabled or Disabled. Enabled: MediaLive will apply flicker AQ using the specified strength. Disabled: MediaLive won't apply flicker AQ. If you have set the Adaptive quantization to Disabled, MediaLive ignores any value in this field and doesn't apply flicker AQ.
    */
  var FlickerAq: js.UndefOr[H264FlickerAq] = js.undefined
  
  /**
    * This setting applies only when scan type is "interlaced." It controls whether coding is performed on a field basis or on a frame basis. (When the video is progressive, the coding is always performed on a frame basis.)
  enabled: Force MediaLive to code on a field basis, so that odd and even sets of fields are coded separately.
  disabled: Code the two sets of fields separately (on a field basis) or together (on a frame basis using PAFF), depending on what is most appropriate for the content.
    */
  var ForceFieldPictures: js.UndefOr[H264ForceFieldPictures] = js.undefined
  
  /**
    * This field indicates how the output video frame rate is specified.  If "specified" is selected then the output video frame rate is determined by framerateNumerator and framerateDenominator, else if "initializeFromSource" is selected then the output video frame rate will be set equal to the input video frame rate of the first input.
    */
  var FramerateControl: js.UndefOr[H264FramerateControl] = js.undefined
  
  /**
    * Framerate denominator.
    */
  var FramerateDenominator: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * Documentation update needed
    */
  var GopBReference: js.UndefOr[H264GopBReference] = js.undefined
  
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Number of B-frames between reference frames.
    */
  var GopNumBFrames: js.UndefOr[integerMin0Max7] = js.undefined
  
  /**
    * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits.
  If gopSizeUnits is frames, gopSize must be an integer and must be greater than or equal to 1.
  If gopSizeUnits is seconds, gopSize must be greater than 0, but need not be an integer.
    */
  var GopSize: js.UndefOr[double] = js.undefined
  
  /**
    * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.undefined
  
  /**
    * H.264 Level.
    */
  var Level: js.UndefOr[H264Level] = js.undefined
  
  /**
    * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality for certain content.
    */
  var LookAheadRateControl: js.UndefOr[H264LookAheadRateControl] = js.undefined
  
  /**
    * For QVBR: See the tooltip for Quality level
  For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
    */
  var MaxBitrate: js.UndefOr[integerMin1000] = js.undefined
  
  /**
    * Only meaningful if sceneChangeDetect is set to enabled.  Defaults to 5 if multiplex rate control is used.  Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.undefined
  
  /**
    * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
    */
  var NumRefFrames: js.UndefOr[integerMin1Max6] = js.undefined
  
  /**
    * This field indicates how the output pixel aspect ratio is specified.  If "specified" is selected then the output video pixel aspect ratio is determined by parNumerator and parDenominator, else if "initializeFromSource" is selected then the output pixsel aspect ratio will be set equal to the input video pixel aspect ratio of the first input.
    */
  var ParControl: js.UndefOr[H264ParControl] = js.undefined
  
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * H.264 Profile.
    */
  var Profile: js.UndefOr[H264Profile] = js.undefined
  
  /**
    * Leave as STANDARD_QUALITY or choose a different value (which might result in additional costs to run the channel).
  - ENHANCED_QUALITY: Produces a slightly better video quality without an increase in the bitrate. Has an effect only when the Rate control mode is QVBR or CBR. If this channel is in a MediaLive multiplex, the value must be ENHANCED_QUALITY.
  - STANDARD_QUALITY: Valid for any Rate control mode.
    */
  var QualityLevel: js.UndefOr[H264QualityLevel] = js.undefined
  
  /**
    * Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. You can set a target quality or you can let MediaLive determine the best quality. To set a target quality, enter values in the QVBR quality level field and the Max bitrate field. Enter values that suit your most important viewing devices. Recommended values are:
  - Primary screen: Quality level: 8 to 10. Max bitrate: 4M
  - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M
  - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
  To let MediaLive decide, leave the QVBR quality level field empty, and in Max bitrate enter the maximum rate you want in the video. For more information, see the section called "Video - rate control mode" in the MediaLive user guide
    */
  var QvbrQualityLevel: js.UndefOr[integerMin1Max10] = js.undefined
  
  /**
    * Rate control mode.
  QVBR: Quality will match the specified quality level except when it is constrained by the
  maximum bitrate.  Recommended if you or your viewers pay for bandwidth.
  VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR
  if you want to maintain a specific average bitrate over the duration of the channel.
  CBR: Quality varies, depending on the video complexity. Recommended only if you distribute
  your assets to devices that cannot handle variable bitrates.
  Multiplex: This rate control mode is only supported (and is required) when the video is being
  delivered to a MediaLive Multiplex in which case the rate control configuration is controlled
  by the properties within the Multiplex Program.
    */
  var RateControlMode: js.UndefOr[H264RateControlMode] = js.undefined
  
  /**
    * Sets the scan type of the output to progressive or top-field-first interlaced.
    */
  var ScanType: js.UndefOr[H264ScanType] = js.undefined
  
  /**
    * Scene change detection.
  - On: inserts I-frames when scene change is detected.
  - Off: does not force an I-frame when scene change is detected.
    */
  var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.undefined
  
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
  This field is optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.undefined
  
  /**
    * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.  If not set to zero, must be greater than 15.
    */
  var Softness: js.UndefOr[integerMin0Max128] = js.undefined
  
  /**
    * Spatial AQ makes adjustments within each frame based on spatial variation of content complexity. The value to enter in this field depends on the value in the Adaptive quantization field: If you have set the Adaptive quantization field to Auto, MediaLive ignores any value in this field. MediaLive will determine if spatial AQ is appropriate and will apply the appropriate strength. If you have set the Adaptive quantization field to a strength, you can set this field to Enabled or Disabled. Enabled: MediaLive will apply spatial AQ using the specified strength. Disabled: MediaLive won't apply spatial AQ. If you have set the Adaptive quantization to Disabled, MediaLive ignores any value in this field and doesn't apply spatial AQ.
    */
  var SpatialAq: js.UndefOr[H264SpatialAq] = js.undefined
  
  /**
    * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of B-frames used for each sub-GOP to improve visual quality.
    */
  var SubgopLength: js.UndefOr[H264SubGopLength] = js.undefined
  
  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  var Syntax: js.UndefOr[H264Syntax] = js.undefined
  
  /**
    * Temporal makes adjustments within each frame based on temporal variation of content complexity. The value to enter in this field depends on the value in the Adaptive quantization field: If you have set the Adaptive quantization field to Auto, MediaLive ignores any value in this field. MediaLive will determine if temporal AQ is appropriate and will apply the appropriate strength. If you have set the Adaptive quantization field to a strength, you can set this field to Enabled or Disabled. Enabled: MediaLive will apply temporal AQ using the specified strength. Disabled: MediaLive won't apply temporal AQ. If you have set the Adaptive quantization to Disabled, MediaLive ignores any value in this field and doesn't apply temporal AQ.
    */
  var TemporalAq: js.UndefOr[H264TemporalAq] = js.undefined
  
  /**
    * Determines how timecodes should be inserted into the video elementary stream.
  - 'disabled': Do not include timecodes
  - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
    */
  var TimecodeInsertion: js.UndefOr[H264TimecodeInsertionBehavior] = js.undefined
}
object H264Settings {
  
  inline def apply(): H264Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H264Settings]
  }
  
  extension [Self <: H264Settings](x: Self) {
    
    inline def setAdaptiveQuantization(value: H264AdaptiveQuantization): Self = StObject.set(x, "AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveQuantizationUndefined: Self = StObject.set(x, "AdaptiveQuantization", js.undefined)
    
    inline def setAfdSignaling(value: AfdSignaling): Self = StObject.set(x, "AfdSignaling", value.asInstanceOf[js.Any])
    
    inline def setAfdSignalingUndefined: Self = StObject.set(x, "AfdSignaling", js.undefined)
    
    inline def setBitrate(value: integerMin1000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setBufFillPct(value: integerMin0Max100): Self = StObject.set(x, "BufFillPct", value.asInstanceOf[js.Any])
    
    inline def setBufFillPctUndefined: Self = StObject.set(x, "BufFillPct", js.undefined)
    
    inline def setBufSize(value: integerMin0): Self = StObject.set(x, "BufSize", value.asInstanceOf[js.Any])
    
    inline def setBufSizeUndefined: Self = StObject.set(x, "BufSize", js.undefined)
    
    inline def setColorMetadata(value: H264ColorMetadata): Self = StObject.set(x, "ColorMetadata", value.asInstanceOf[js.Any])
    
    inline def setColorMetadataUndefined: Self = StObject.set(x, "ColorMetadata", js.undefined)
    
    inline def setColorSpaceSettings(value: H264ColorSpaceSettings): Self = StObject.set(x, "ColorSpaceSettings", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceSettingsUndefined: Self = StObject.set(x, "ColorSpaceSettings", js.undefined)
    
    inline def setEntropyEncoding(value: H264EntropyEncoding): Self = StObject.set(x, "EntropyEncoding", value.asInstanceOf[js.Any])
    
    inline def setEntropyEncodingUndefined: Self = StObject.set(x, "EntropyEncoding", js.undefined)
    
    inline def setFilterSettings(value: H264FilterSettings): Self = StObject.set(x, "FilterSettings", value.asInstanceOf[js.Any])
    
    inline def setFilterSettingsUndefined: Self = StObject.set(x, "FilterSettings", js.undefined)
    
    inline def setFixedAfd(value: FixedAfd): Self = StObject.set(x, "FixedAfd", value.asInstanceOf[js.Any])
    
    inline def setFixedAfdUndefined: Self = StObject.set(x, "FixedAfd", js.undefined)
    
    inline def setFlickerAq(value: H264FlickerAq): Self = StObject.set(x, "FlickerAq", value.asInstanceOf[js.Any])
    
    inline def setFlickerAqUndefined: Self = StObject.set(x, "FlickerAq", js.undefined)
    
    inline def setForceFieldPictures(value: H264ForceFieldPictures): Self = StObject.set(x, "ForceFieldPictures", value.asInstanceOf[js.Any])
    
    inline def setForceFieldPicturesUndefined: Self = StObject.set(x, "ForceFieldPictures", js.undefined)
    
    inline def setFramerateControl(value: H264FramerateControl): Self = StObject.set(x, "FramerateControl", value.asInstanceOf[js.Any])
    
    inline def setFramerateControlUndefined: Self = StObject.set(x, "FramerateControl", js.undefined)
    
    inline def setFramerateDenominator(value: integerMin1): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    inline def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    inline def setFramerateNumerator(value: integerMin1): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    inline def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
    
    inline def setGopBReference(value: H264GopBReference): Self = StObject.set(x, "GopBReference", value.asInstanceOf[js.Any])
    
    inline def setGopBReferenceUndefined: Self = StObject.set(x, "GopBReference", js.undefined)
    
    inline def setGopClosedCadence(value: integerMin0): Self = StObject.set(x, "GopClosedCadence", value.asInstanceOf[js.Any])
    
    inline def setGopClosedCadenceUndefined: Self = StObject.set(x, "GopClosedCadence", js.undefined)
    
    inline def setGopNumBFrames(value: integerMin0Max7): Self = StObject.set(x, "GopNumBFrames", value.asInstanceOf[js.Any])
    
    inline def setGopNumBFramesUndefined: Self = StObject.set(x, "GopNumBFrames", js.undefined)
    
    inline def setGopSize(value: double): Self = StObject.set(x, "GopSize", value.asInstanceOf[js.Any])
    
    inline def setGopSizeUndefined: Self = StObject.set(x, "GopSize", js.undefined)
    
    inline def setGopSizeUnits(value: H264GopSizeUnits): Self = StObject.set(x, "GopSizeUnits", value.asInstanceOf[js.Any])
    
    inline def setGopSizeUnitsUndefined: Self = StObject.set(x, "GopSizeUnits", js.undefined)
    
    inline def setLevel(value: H264Level): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "Level", js.undefined)
    
    inline def setLookAheadRateControl(value: H264LookAheadRateControl): Self = StObject.set(x, "LookAheadRateControl", value.asInstanceOf[js.Any])
    
    inline def setLookAheadRateControlUndefined: Self = StObject.set(x, "LookAheadRateControl", js.undefined)
    
    inline def setMaxBitrate(value: integerMin1000): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setMinIInterval(value: integerMin0Max30): Self = StObject.set(x, "MinIInterval", value.asInstanceOf[js.Any])
    
    inline def setMinIIntervalUndefined: Self = StObject.set(x, "MinIInterval", js.undefined)
    
    inline def setNumRefFrames(value: integerMin1Max6): Self = StObject.set(x, "NumRefFrames", value.asInstanceOf[js.Any])
    
    inline def setNumRefFramesUndefined: Self = StObject.set(x, "NumRefFrames", js.undefined)
    
    inline def setParControl(value: H264ParControl): Self = StObject.set(x, "ParControl", value.asInstanceOf[js.Any])
    
    inline def setParControlUndefined: Self = StObject.set(x, "ParControl", js.undefined)
    
    inline def setParDenominator(value: integerMin1): Self = StObject.set(x, "ParDenominator", value.asInstanceOf[js.Any])
    
    inline def setParDenominatorUndefined: Self = StObject.set(x, "ParDenominator", js.undefined)
    
    inline def setParNumerator(value: integerMin1): Self = StObject.set(x, "ParNumerator", value.asInstanceOf[js.Any])
    
    inline def setParNumeratorUndefined: Self = StObject.set(x, "ParNumerator", js.undefined)
    
    inline def setProfile(value: H264Profile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
    
    inline def setQualityLevel(value: H264QualityLevel): Self = StObject.set(x, "QualityLevel", value.asInstanceOf[js.Any])
    
    inline def setQualityLevelUndefined: Self = StObject.set(x, "QualityLevel", js.undefined)
    
    inline def setQvbrQualityLevel(value: integerMin1Max10): Self = StObject.set(x, "QvbrQualityLevel", value.asInstanceOf[js.Any])
    
    inline def setQvbrQualityLevelUndefined: Self = StObject.set(x, "QvbrQualityLevel", js.undefined)
    
    inline def setRateControlMode(value: H264RateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    inline def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    inline def setScanType(value: H264ScanType): Self = StObject.set(x, "ScanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "ScanType", js.undefined)
    
    inline def setSceneChangeDetect(value: H264SceneChangeDetect): Self = StObject.set(x, "SceneChangeDetect", value.asInstanceOf[js.Any])
    
    inline def setSceneChangeDetectUndefined: Self = StObject.set(x, "SceneChangeDetect", js.undefined)
    
    inline def setSlices(value: integerMin1Max32): Self = StObject.set(x, "Slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "Slices", js.undefined)
    
    inline def setSoftness(value: integerMin0Max128): Self = StObject.set(x, "Softness", value.asInstanceOf[js.Any])
    
    inline def setSoftnessUndefined: Self = StObject.set(x, "Softness", js.undefined)
    
    inline def setSpatialAq(value: H264SpatialAq): Self = StObject.set(x, "SpatialAq", value.asInstanceOf[js.Any])
    
    inline def setSpatialAqUndefined: Self = StObject.set(x, "SpatialAq", js.undefined)
    
    inline def setSubgopLength(value: H264SubGopLength): Self = StObject.set(x, "SubgopLength", value.asInstanceOf[js.Any])
    
    inline def setSubgopLengthUndefined: Self = StObject.set(x, "SubgopLength", js.undefined)
    
    inline def setSyntax(value: H264Syntax): Self = StObject.set(x, "Syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "Syntax", js.undefined)
    
    inline def setTemporalAq(value: H264TemporalAq): Self = StObject.set(x, "TemporalAq", value.asInstanceOf[js.Any])
    
    inline def setTemporalAqUndefined: Self = StObject.set(x, "TemporalAq", js.undefined)
    
    inline def setTimecodeInsertion(value: H264TimecodeInsertionBehavior): Self = StObject.set(x, "TimecodeInsertion", value.asInstanceOf[js.Any])
    
    inline def setTimecodeInsertionUndefined: Self = StObject.set(x, "TimecodeInsertion", js.undefined)
  }
}
