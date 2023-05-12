package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoPreprocessor extends StObject {
  
  /**
    * Use these settings to convert the color space or to modify properties such as hue and contrast for this output. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/converting-the-color-space.html.
    */
  var ColorCorrector: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ColorCorrector] = js.undefined
  
  /**
    * Use the deinterlacer to produce smoother motion and a clearer picture. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-scan-type.html.
    */
  var Deinterlacer: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Deinterlacer] = js.undefined
  
  /**
    * Enable Dolby Vision feature to produce Dolby Vision compatible video output.
    */
  var DolbyVision: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.DolbyVision] = js.undefined
  
  /**
    * Enable HDR10+ analyis and metadata injection. Compatible with HEVC only.
    */
  var Hdr10Plus: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Hdr10Plus] = js.undefined
  
  /**
    * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ImageInserter: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ImageInserter] = js.undefined
  
  /**
    * Enable the Noise reducer feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default. When you enable Noise reducer, you must also select a value for Noise reducer filter. For AVC outputs, when you include Noise reducer, you cannot include the Bandwidth reduction filter.
    */
  var NoiseReducer: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.NoiseReducer] = js.undefined
  
  /**
    * If you work with a third party video watermarking partner, use the group of settings that correspond with your watermarking partner to include watermarks in your output.
    */
  var PartnerWatermarking: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.PartnerWatermarking] = js.undefined
  
  /**
    * Settings for burning the output timecode and specified prefix into the output.
    */
  var TimecodeBurnin: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.TimecodeBurnin] = js.undefined
}
object VideoPreprocessor {
  
  inline def apply(): VideoPreprocessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPreprocessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoPreprocessor] (val x: Self) extends AnyVal {
    
    inline def setColorCorrector(value: ColorCorrector): Self = StObject.set(x, "ColorCorrector", value.asInstanceOf[js.Any])
    
    inline def setColorCorrectorUndefined: Self = StObject.set(x, "ColorCorrector", js.undefined)
    
    inline def setDeinterlacer(value: Deinterlacer): Self = StObject.set(x, "Deinterlacer", value.asInstanceOf[js.Any])
    
    inline def setDeinterlacerUndefined: Self = StObject.set(x, "Deinterlacer", js.undefined)
    
    inline def setDolbyVision(value: DolbyVision): Self = StObject.set(x, "DolbyVision", value.asInstanceOf[js.Any])
    
    inline def setDolbyVisionUndefined: Self = StObject.set(x, "DolbyVision", js.undefined)
    
    inline def setHdr10Plus(value: Hdr10Plus): Self = StObject.set(x, "Hdr10Plus", value.asInstanceOf[js.Any])
    
    inline def setHdr10PlusUndefined: Self = StObject.set(x, "Hdr10Plus", js.undefined)
    
    inline def setImageInserter(value: ImageInserter): Self = StObject.set(x, "ImageInserter", value.asInstanceOf[js.Any])
    
    inline def setImageInserterUndefined: Self = StObject.set(x, "ImageInserter", js.undefined)
    
    inline def setNoiseReducer(value: NoiseReducer): Self = StObject.set(x, "NoiseReducer", value.asInstanceOf[js.Any])
    
    inline def setNoiseReducerUndefined: Self = StObject.set(x, "NoiseReducer", js.undefined)
    
    inline def setPartnerWatermarking(value: PartnerWatermarking): Self = StObject.set(x, "PartnerWatermarking", value.asInstanceOf[js.Any])
    
    inline def setPartnerWatermarkingUndefined: Self = StObject.set(x, "PartnerWatermarking", js.undefined)
    
    inline def setTimecodeBurnin(value: TimecodeBurnin): Self = StObject.set(x, "TimecodeBurnin", value.asInstanceOf[js.Any])
    
    inline def setTimecodeBurninUndefined: Self = StObject.set(x, "TimecodeBurnin", js.undefined)
  }
}
