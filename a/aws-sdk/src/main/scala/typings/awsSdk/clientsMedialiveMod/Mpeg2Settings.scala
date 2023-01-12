package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mpeg2Settings extends StObject {
  
  /**
    * Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows intra-frame quantizers to vary, which might improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[Mpeg2AdaptiveQuantization] = js.undefined
  
  /**
    * Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD signaling is, or if your downstream system has not given you guidance, choose AUTO.
  AUTO: MediaLive will try to preserve the input AFD value (in cases where multiple AFD values are valid).
  FIXED: MediaLive will use the value you specify in fixedAFD.
    */
  var AfdSignaling: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AfdSignaling] = js.undefined
  
  /**
    * Specifies whether to include the color space metadata. The metadata describes the color space that applies to the video (the colorSpace field). We recommend that you insert the metadata.
    */
  var ColorMetadata: js.UndefOr[Mpeg2ColorMetadata] = js.undefined
  
  /**
    * Choose the type of color space conversion to apply to the output. For detailed information on setting up both the input and the output to obtain the desired color space in the output, see the section on \"MediaLive Features - Video - color space\" in the MediaLive User Guide.
  PASSTHROUGH: Keep the color space of the input content - do not convert it.
  AUTO:Convert all content that is SD to rec 601, and convert all content that is HD to rec 709.
    */
  var ColorSpace: js.UndefOr[Mpeg2ColorSpace] = js.undefined
  
  /**
    * Sets the pixel aspect ratio for the encode.
    */
  var DisplayAspectRatio: js.UndefOr[Mpeg2DisplayRatio] = js.undefined
  
  /**
    * Optionally specify a noise reduction filter, which can improve quality of compressed content. If you do not choose a filter, no filter will be applied.
  TEMPORAL: This filter is useful for both source content that is noisy (when it has excessive digital artifacts) and source content that is clean.
  When the content is noisy, the filter cleans up the source content before the encoding phase, with these two effects: First, it improves the output video quality because the content has been cleaned up. Secondly, it decreases the bandwidth because MediaLive does not waste bits on encoding noise.
  When the content is reasonably clean, the filter tends to decrease the bitrate.
    */
  var FilterSettings: js.UndefOr[Mpeg2FilterSettings] = js.undefined
  
  /**
    * Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all frames of the video encode.
    */
  var FixedAfd: js.UndefOr[typings.awsSdk.clientsMedialiveMod.FixedAfd] = js.undefined
  
  /**
    * description": "The framerate denominator. For example, 1001. The framerate is the numerator divided by the denominator. For example, 24000 / 1001 = 23.976 FPS.
    */
  var FramerateDenominator: integerMin1
  
  /**
    * The framerate numerator. For example, 24000. The framerate is the numerator divided by the denominator. For example, 24000 / 1001 = 23.976 FPS.
    */
  var FramerateNumerator: integerMin1
  
  /**
    * MPEG2: default is open GOP.
    */
  var GopClosedCadence: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Relates to the GOP structure. The number of B-frames between reference frames. If you do not know what a B-frame is, use the default.
    */
  var GopNumBFrames: js.UndefOr[integerMin0Max7] = js.undefined
  
  /**
    * Relates to the GOP structure. The GOP size (keyframe interval) in the units specified in gopSizeUnits. If you do not know what GOP is, use the default.
  If gopSizeUnits is frames, then the gopSize must be an integer and must be greater than or equal to 1.
  If gopSizeUnits is seconds, the gopSize must be greater than 0, but does not need to be an integer.
    */
  var GopSize: js.UndefOr[double] = js.undefined
  
  /**
    * Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do not plan to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will internally convert the gop size to a frame count.
    */
  var GopSizeUnits: js.UndefOr[Mpeg2GopSizeUnits] = js.undefined
  
  /**
    * Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
    */
  var ScanType: js.UndefOr[Mpeg2ScanType] = js.undefined
  
  /**
    * Relates to the GOP structure. If you do not know what GOP is, use the default.
  FIXED: Set the number of B-frames in each sub-GOP to the value in gopNumBFrames.
  DYNAMIC: Let MediaLive optimize the number of B-frames in each sub-GOP, to improve visual quality.
    */
  var SubgopLength: js.UndefOr[Mpeg2SubGopLength] = js.undefined
  
  /**
    * Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up the input and the output for a timecode, see the section on \"MediaLive Features - Timecode configuration\" in the MediaLive User Guide.
  DISABLED: do not include timecodes.
  GOP_TIMECODE: Include timecode metadata in the GOP header.
    */
  var TimecodeInsertion: js.UndefOr[Mpeg2TimecodeInsertionBehavior] = js.undefined
}
object Mpeg2Settings {
  
  inline def apply(FramerateDenominator: integerMin1, FramerateNumerator: integerMin1): Mpeg2Settings = {
    val __obj = js.Dynamic.literal(FramerateDenominator = FramerateDenominator.asInstanceOf[js.Any], FramerateNumerator = FramerateNumerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mpeg2Settings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mpeg2Settings] (val x: Self) extends AnyVal {
    
    inline def setAdaptiveQuantization(value: Mpeg2AdaptiveQuantization): Self = StObject.set(x, "AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveQuantizationUndefined: Self = StObject.set(x, "AdaptiveQuantization", js.undefined)
    
    inline def setAfdSignaling(value: AfdSignaling): Self = StObject.set(x, "AfdSignaling", value.asInstanceOf[js.Any])
    
    inline def setAfdSignalingUndefined: Self = StObject.set(x, "AfdSignaling", js.undefined)
    
    inline def setColorMetadata(value: Mpeg2ColorMetadata): Self = StObject.set(x, "ColorMetadata", value.asInstanceOf[js.Any])
    
    inline def setColorMetadataUndefined: Self = StObject.set(x, "ColorMetadata", js.undefined)
    
    inline def setColorSpace(value: Mpeg2ColorSpace): Self = StObject.set(x, "ColorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "ColorSpace", js.undefined)
    
    inline def setDisplayAspectRatio(value: Mpeg2DisplayRatio): Self = StObject.set(x, "DisplayAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setDisplayAspectRatioUndefined: Self = StObject.set(x, "DisplayAspectRatio", js.undefined)
    
    inline def setFilterSettings(value: Mpeg2FilterSettings): Self = StObject.set(x, "FilterSettings", value.asInstanceOf[js.Any])
    
    inline def setFilterSettingsUndefined: Self = StObject.set(x, "FilterSettings", js.undefined)
    
    inline def setFixedAfd(value: FixedAfd): Self = StObject.set(x, "FixedAfd", value.asInstanceOf[js.Any])
    
    inline def setFixedAfdUndefined: Self = StObject.set(x, "FixedAfd", js.undefined)
    
    inline def setFramerateDenominator(value: integerMin1): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    inline def setFramerateNumerator(value: integerMin1): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    inline def setGopClosedCadence(value: integerMin0): Self = StObject.set(x, "GopClosedCadence", value.asInstanceOf[js.Any])
    
    inline def setGopClosedCadenceUndefined: Self = StObject.set(x, "GopClosedCadence", js.undefined)
    
    inline def setGopNumBFrames(value: integerMin0Max7): Self = StObject.set(x, "GopNumBFrames", value.asInstanceOf[js.Any])
    
    inline def setGopNumBFramesUndefined: Self = StObject.set(x, "GopNumBFrames", js.undefined)
    
    inline def setGopSize(value: double): Self = StObject.set(x, "GopSize", value.asInstanceOf[js.Any])
    
    inline def setGopSizeUndefined: Self = StObject.set(x, "GopSize", js.undefined)
    
    inline def setGopSizeUnits(value: Mpeg2GopSizeUnits): Self = StObject.set(x, "GopSizeUnits", value.asInstanceOf[js.Any])
    
    inline def setGopSizeUnitsUndefined: Self = StObject.set(x, "GopSizeUnits", js.undefined)
    
    inline def setScanType(value: Mpeg2ScanType): Self = StObject.set(x, "ScanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "ScanType", js.undefined)
    
    inline def setSubgopLength(value: Mpeg2SubGopLength): Self = StObject.set(x, "SubgopLength", value.asInstanceOf[js.Any])
    
    inline def setSubgopLengthUndefined: Self = StObject.set(x, "SubgopLength", js.undefined)
    
    inline def setTimecodeInsertion(value: Mpeg2TimecodeInsertionBehavior): Self = StObject.set(x, "TimecodeInsertion", value.asInstanceOf[js.Any])
    
    inline def setTimecodeInsertionUndefined: Self = StObject.set(x, "TimecodeInsertion", js.undefined)
  }
}
