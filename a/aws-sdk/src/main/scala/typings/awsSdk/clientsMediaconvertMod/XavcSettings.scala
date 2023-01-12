package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XavcSettings extends StObject {
  
  /**
    * Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of quantization for your video content. When you want to apply your quantization settings manually, you must set Adaptive quantization (adaptiveQuantization) to a value other than Auto (AUTO). Use this setting to specify the strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive quantization in this transcode, set Adaptive quantization to Off (OFF). Related settings: The value that you choose here applies to the following settings: Flicker adaptive quantization (flickerAdaptiveQuantization), Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization (temporalAdaptiveQuantization).
    */
  var AdaptiveQuantization: js.UndefOr[XavcAdaptiveQuantization] = js.undefined
  
  /**
    * Optional. Choose a specific entropy encoding mode only when you want to override XAVC recommendations. If you choose the value auto, MediaConvert uses the mode that the XAVC file format specifies given this output's operating point.
    */
  var EntropyEncoding: js.UndefOr[XavcEntropyEncoding] = js.undefined
  
  /**
    * If you are using the console, use the Frame rate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list. The framerates shown in the dropdown list are decimal approximations of fractions. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate that you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[XavcFramerateControl] = js.undefined
  
  /**
    * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
    */
  var FramerateConversionAlgorithm: js.UndefOr[XavcFramerateConversionAlgorithm] = js.undefined
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Frame rate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max1001] = js.undefined
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin24Max60000] = js.undefined
  
  /**
    * Specify the XAVC profile for this output. For more information, see the Sony documentation at https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating points for XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
    */
  var Profile: js.UndefOr[XavcProfile] = js.undefined
  
  /**
    * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting will slightly reduce the duration of your video. Related settings: You must also set Frame rate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
    */
  var SlowPal: js.UndefOr[XavcSlowPal] = js.undefined
  
  /**
    * Ignore this setting unless your downstream workflow requires that you specify it explicitly. Otherwise, we recommend that you adjust the softness of your output by using a lower value for the setting Sharpness (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting specifies the quantization matrices that the encoder uses. Keep the default value, 0, for flat quantization. Choose the value 1 or 16 to use the default JVT softening quantization matricies from the H.264 specification. Choose a value from 17 to 128 to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
    */
  var Softness: js.UndefOr[integerMin0Max128] = js.undefined
  
  /**
    * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of quantization for your video content. Include this setting in your JSON job specification only when you choose to change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[XavcSpatialAdaptiveQuantization] = js.undefined
  
  /**
    * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of quantization for your video content. Include this setting in your JSON job specification only when you choose to change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal adaptive quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
    */
  var TemporalAdaptiveQuantization: js.UndefOr[XavcTemporalAdaptiveQuantization] = js.undefined
  
  /**
    * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K_INTRA_CBG.
    */
  var Xavc4kIntraCbgProfileSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Xavc4kIntraCbgProfileSettings] = js.undefined
  
  /**
    * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K_INTRA_VBR.
    */
  var Xavc4kIntraVbrProfileSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Xavc4kIntraVbrProfileSettings] = js.undefined
  
  /**
    * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K.
    */
  var Xavc4kProfileSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Xavc4kProfileSettings] = js.undefined
  
  /**
    * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD_INTRA_CBG.
    */
  var XavcHdIntraCbgProfileSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.XavcHdIntraCbgProfileSettings] = js.undefined
  
  /**
    * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD.
    */
  var XavcHdProfileSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.XavcHdProfileSettings] = js.undefined
}
object XavcSettings {
  
  inline def apply(): XavcSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XavcSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XavcSettings] (val x: Self) extends AnyVal {
    
    inline def setAdaptiveQuantization(value: XavcAdaptiveQuantization): Self = StObject.set(x, "AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveQuantizationUndefined: Self = StObject.set(x, "AdaptiveQuantization", js.undefined)
    
    inline def setEntropyEncoding(value: XavcEntropyEncoding): Self = StObject.set(x, "EntropyEncoding", value.asInstanceOf[js.Any])
    
    inline def setEntropyEncodingUndefined: Self = StObject.set(x, "EntropyEncoding", js.undefined)
    
    inline def setFramerateControl(value: XavcFramerateControl): Self = StObject.set(x, "FramerateControl", value.asInstanceOf[js.Any])
    
    inline def setFramerateControlUndefined: Self = StObject.set(x, "FramerateControl", js.undefined)
    
    inline def setFramerateConversionAlgorithm(value: XavcFramerateConversionAlgorithm): Self = StObject.set(x, "FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setFramerateConversionAlgorithmUndefined: Self = StObject.set(x, "FramerateConversionAlgorithm", js.undefined)
    
    inline def setFramerateDenominator(value: integerMin1Max1001): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    inline def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    inline def setFramerateNumerator(value: integerMin24Max60000): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    inline def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
    
    inline def setProfile(value: XavcProfile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
    
    inline def setSlowPal(value: XavcSlowPal): Self = StObject.set(x, "SlowPal", value.asInstanceOf[js.Any])
    
    inline def setSlowPalUndefined: Self = StObject.set(x, "SlowPal", js.undefined)
    
    inline def setSoftness(value: integerMin0Max128): Self = StObject.set(x, "Softness", value.asInstanceOf[js.Any])
    
    inline def setSoftnessUndefined: Self = StObject.set(x, "Softness", js.undefined)
    
    inline def setSpatialAdaptiveQuantization(value: XavcSpatialAdaptiveQuantization): Self = StObject.set(x, "SpatialAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setSpatialAdaptiveQuantizationUndefined: Self = StObject.set(x, "SpatialAdaptiveQuantization", js.undefined)
    
    inline def setTemporalAdaptiveQuantization(value: XavcTemporalAdaptiveQuantization): Self = StObject.set(x, "TemporalAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setTemporalAdaptiveQuantizationUndefined: Self = StObject.set(x, "TemporalAdaptiveQuantization", js.undefined)
    
    inline def setXavc4kIntraCbgProfileSettings(value: Xavc4kIntraCbgProfileSettings): Self = StObject.set(x, "Xavc4kIntraCbgProfileSettings", value.asInstanceOf[js.Any])
    
    inline def setXavc4kIntraCbgProfileSettingsUndefined: Self = StObject.set(x, "Xavc4kIntraCbgProfileSettings", js.undefined)
    
    inline def setXavc4kIntraVbrProfileSettings(value: Xavc4kIntraVbrProfileSettings): Self = StObject.set(x, "Xavc4kIntraVbrProfileSettings", value.asInstanceOf[js.Any])
    
    inline def setXavc4kIntraVbrProfileSettingsUndefined: Self = StObject.set(x, "Xavc4kIntraVbrProfileSettings", js.undefined)
    
    inline def setXavc4kProfileSettings(value: Xavc4kProfileSettings): Self = StObject.set(x, "Xavc4kProfileSettings", value.asInstanceOf[js.Any])
    
    inline def setXavc4kProfileSettingsUndefined: Self = StObject.set(x, "Xavc4kProfileSettings", js.undefined)
    
    inline def setXavcHdIntraCbgProfileSettings(value: XavcHdIntraCbgProfileSettings): Self = StObject.set(x, "XavcHdIntraCbgProfileSettings", value.asInstanceOf[js.Any])
    
    inline def setXavcHdIntraCbgProfileSettingsUndefined: Self = StObject.set(x, "XavcHdIntraCbgProfileSettings", js.undefined)
    
    inline def setXavcHdProfileSettings(value: XavcHdProfileSettings): Self = StObject.set(x, "XavcHdProfileSettings", value.asInstanceOf[js.Any])
    
    inline def setXavcHdProfileSettingsUndefined: Self = StObject.set(x, "XavcHdProfileSettings", js.undefined)
  }
}
