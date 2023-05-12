package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorCorrector extends StObject {
  
  /**
    * Brightness level.
    */
  var Brightness: js.UndefOr[integerMin1Max100] = js.undefined
  
  /**
    * Specify YUV limits and RGB tolerances when you set Sample range conversion to Limited range clip.
    */
  var ClipLimits: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ClipLimits] = js.undefined
  
  /**
    * Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, from SDR to HDR, and from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output. HDR to SDR conversion uses tone mapping to approximate the outcome of manually regrading from HDR to SDR. When you specify an output color space, MediaConvert uses the following color space metadata, which includes color primaries, transfer characteristics, and matrix coefficients:
    * HDR 10: BT.2020, PQ, BT.2020 non-constant
    * HLG 2020: BT.2020, HLG, BT.2020 non-constant
    * P3DCI (Theater): DCIP3, SMPTE 428M, BT.709
    * P3D65 (SDR): Display P3, sRGB, BT.709
    * P3D65 (HDR): Display P3, PQ, BT.709
    */
  var ColorSpaceConversion: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ColorSpaceConversion] = js.undefined
  
  /**
    * Contrast level.
    */
  var Contrast: js.UndefOr[integerMin1Max100] = js.undefined
  
  /**
    * Use these settings when you convert to the HDR 10 color space. Specify the SMPTE ST 2086 Mastering Display Color Volume static metadata that you want signaled in the output. These values don't affect the pixel values that are encoded in the video stream. They are intended to help the downstream video player display content in a way that reflects the intentions of the the content creator. When you set Color space conversion (ColorSpaceConversion) to HDR 10 (FORCE_HDR10), these settings are required. You must set values for Max frame average light level (maxFrameAverageLightLevel) and Max content light level (maxContentLightLevel); these settings don't have a default value. The default values for the other HDR 10 metadata settings are defined by the P3D65 color space. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
    */
  var Hdr10Metadata: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Hdr10Metadata] = js.undefined
  
  /**
    * Specify how MediaConvert maps brightness and colors from your HDR input to your SDR output. The mode that you select represents a creative choice, with different tradeoffs in the details and tones of your output. To maintain details in bright or saturated areas of your output: Choose Preserve details. For some sources, your SDR output may look less bright and less saturated when compared to your HDR source. MediaConvert automatically applies this mode for HLG sources, regardless of your choice. For a bright and saturated output: Choose Vibrant. We recommend that you choose this mode when any of your source content is HDR10, and for the best results when it is mastered for 1000 nits. You may notice loss of details in bright or saturated areas of your output. HDR to SDR tone mapping has no effect when your input is SDR.
    */
  var HdrToSdrToneMapper: js.UndefOr[HDRToSDRToneMapper] = js.undefined
  
  /**
    * Hue in degrees.
    */
  var Hue: js.UndefOr[integerMinNegative180Max180] = js.undefined
  
  /**
    * Specify how MediaConvert limits the color sample range for this output. To create a limited range output from a full range input: Choose Limited range squeeze. For full range inputs, MediaConvert performs a linear offset to color samples equally across all pixels and frames. Color samples in 10-bit outputs are limited to 64 through 940, and 8-bit outputs are limited to 16 through 235. Note: For limited range inputs, values for color samples are passed through to your output unchanged. MediaConvert does not limit the sample range. To correct pixels in your input that are out of range or out of gamut: Choose Limited range clip. Use for broadcast applications. MediaConvert conforms any pixels outside of the values that you specify under Minimum YUV and Maximum YUV to limited range bounds. MediaConvert also corrects any YUV values that, when converted to RGB, would be outside the bounds you specify under Minimum RGB tolerance and Maximum RGB tolerance. With either limited range conversion, MediaConvert writes the sample range metadata in the output.
    */
  var SampleRangeConversion: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.SampleRangeConversion] = js.undefined
  
  /**
    * Saturation level.
    */
  var Saturation: js.UndefOr[integerMin1Max100] = js.undefined
  
  /**
    * Specify the reference white level, in nits, for all of your SDR inputs. Use to correct brightness levels within HDR10 outputs. The following color metadata must be present in your SDR input: color primaries, transfer characteristics, and matrix coefficients. If your SDR input has missing color metadata, or if you want to correct input color metadata, manually specify a color space in the input video selector. For 1,000 nit peak brightness displays, we recommend that you set SDR reference white level to 203 (according to ITU-R BT.2408). Leave blank to use the default value of 100, or specify an integer from 100 to 1000.
    */
  var SdrReferenceWhiteLevel: js.UndefOr[integerMin100Max1000] = js.undefined
}
object ColorCorrector {
  
  inline def apply(): ColorCorrector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorCorrector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorCorrector] (val x: Self) extends AnyVal {
    
    inline def setBrightness(value: integerMin1Max100): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessUndefined: Self = StObject.set(x, "Brightness", js.undefined)
    
    inline def setClipLimits(value: ClipLimits): Self = StObject.set(x, "ClipLimits", value.asInstanceOf[js.Any])
    
    inline def setClipLimitsUndefined: Self = StObject.set(x, "ClipLimits", js.undefined)
    
    inline def setColorSpaceConversion(value: ColorSpaceConversion): Self = StObject.set(x, "ColorSpaceConversion", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceConversionUndefined: Self = StObject.set(x, "ColorSpaceConversion", js.undefined)
    
    inline def setContrast(value: integerMin1Max100): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastUndefined: Self = StObject.set(x, "Contrast", js.undefined)
    
    inline def setHdr10Metadata(value: Hdr10Metadata): Self = StObject.set(x, "Hdr10Metadata", value.asInstanceOf[js.Any])
    
    inline def setHdr10MetadataUndefined: Self = StObject.set(x, "Hdr10Metadata", js.undefined)
    
    inline def setHdrToSdrToneMapper(value: HDRToSDRToneMapper): Self = StObject.set(x, "HdrToSdrToneMapper", value.asInstanceOf[js.Any])
    
    inline def setHdrToSdrToneMapperUndefined: Self = StObject.set(x, "HdrToSdrToneMapper", js.undefined)
    
    inline def setHue(value: integerMinNegative180Max180): Self = StObject.set(x, "Hue", value.asInstanceOf[js.Any])
    
    inline def setHueUndefined: Self = StObject.set(x, "Hue", js.undefined)
    
    inline def setSampleRangeConversion(value: SampleRangeConversion): Self = StObject.set(x, "SampleRangeConversion", value.asInstanceOf[js.Any])
    
    inline def setSampleRangeConversionUndefined: Self = StObject.set(x, "SampleRangeConversion", js.undefined)
    
    inline def setSaturation(value: integerMin1Max100): Self = StObject.set(x, "Saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationUndefined: Self = StObject.set(x, "Saturation", js.undefined)
    
    inline def setSdrReferenceWhiteLevel(value: integerMin100Max1000): Self = StObject.set(x, "SdrReferenceWhiteLevel", value.asInstanceOf[js.Any])
    
    inline def setSdrReferenceWhiteLevelUndefined: Self = StObject.set(x, "SdrReferenceWhiteLevel", js.undefined)
  }
}
