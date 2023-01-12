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
    * Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, from SDR to HDR, and from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output. HDR to SDR conversion uses Elemental tone mapping technology to approximate the outcome of manually regrading from HDR to SDR. Select Force P3D65 (SDR) to set the output color space metadata to the following: * Color primaries: Display P3 * Transfer characteristics: SMPTE 428M * Matrix coefficients: BT.709
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
    * Hue in degrees.
    */
  var Hue: js.UndefOr[integerMinNegative180Max180] = js.undefined
  
  /**
    * Specify the video color sample range for this output. To create a full range output, you must start with a full range YUV input and keep the default value, None (NONE). To create a limited range output from a full range input, choose Limited range (LIMITED_RANGE_SQUEEZE). With RGB inputs, your output is always limited range, regardless of your choice here. When you create a limited range output from a full range input, MediaConvert limits the active pixel values in a way that depends on the output's bit depth: 8-bit outputs contain only values from 16 through 235 and 10-bit outputs contain only values from 64 through 940. With this conversion, MediaConvert also changes the output metadata to note the limited range.
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
    
    inline def setColorSpaceConversion(value: ColorSpaceConversion): Self = StObject.set(x, "ColorSpaceConversion", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceConversionUndefined: Self = StObject.set(x, "ColorSpaceConversion", js.undefined)
    
    inline def setContrast(value: integerMin1Max100): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastUndefined: Self = StObject.set(x, "Contrast", js.undefined)
    
    inline def setHdr10Metadata(value: Hdr10Metadata): Self = StObject.set(x, "Hdr10Metadata", value.asInstanceOf[js.Any])
    
    inline def setHdr10MetadataUndefined: Self = StObject.set(x, "Hdr10Metadata", js.undefined)
    
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
