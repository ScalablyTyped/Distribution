package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoiseReducerTemporalFilterSettings extends StObject {
  
  /**
    * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
    */
  var AggressiveMode: js.UndefOr[integerMin0Max4] = js.undefined
  
  /**
    * When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the bandwidth and sharpness of your output is reduced. You can optionally use Post temporal sharpening (postTemporalSharpening) to apply sharpening to the edges of your output. Note that Post temporal sharpening will also make the bandwidth reduction from the Noise reducer smaller. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply sharpening, depending on your input type and quality. When you set Post temporal sharpening to Enabled (ENABLED), specify how much sharpening is applied using Post temporal sharpening strength (postTemporalSharpeningStrength). Set Post temporal sharpening to Disabled (DISABLED) to not apply sharpening.
    */
  var PostTemporalSharpening: js.UndefOr[NoiseFilterPostTemporalSharpening] = js.undefined
  
  /**
    * Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening the transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium (MEDIUM), or High (HIGH) to indicate the amount of sharpening.
    */
  var PostTemporalSharpeningStrength: js.UndefOr[NoiseFilterPostTemporalSharpeningStrength] = js.undefined
  
  /**
    * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time, high setting improves transcode time at the cost of bit rate.
    */
  var Speed: js.UndefOr[integerMinNegative1Max3] = js.undefined
  
  /**
    * Specify the strength of the noise reducing filter on this output. Higher values produce stronger filtering. We recommend the following value ranges, depending on the result that you want: * 0-2 for complexity reduction with minimal sharpness loss * 2-8 for complexity reduction with image preservation * 8-16 for a high level of complexity reduction
    */
  var Strength: js.UndefOr[integerMin0Max16] = js.undefined
}
object NoiseReducerTemporalFilterSettings {
  
  inline def apply(): NoiseReducerTemporalFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducerTemporalFilterSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoiseReducerTemporalFilterSettings] (val x: Self) extends AnyVal {
    
    inline def setAggressiveMode(value: integerMin0Max4): Self = StObject.set(x, "AggressiveMode", value.asInstanceOf[js.Any])
    
    inline def setAggressiveModeUndefined: Self = StObject.set(x, "AggressiveMode", js.undefined)
    
    inline def setPostTemporalSharpening(value: NoiseFilterPostTemporalSharpening): Self = StObject.set(x, "PostTemporalSharpening", value.asInstanceOf[js.Any])
    
    inline def setPostTemporalSharpeningStrength(value: NoiseFilterPostTemporalSharpeningStrength): Self = StObject.set(x, "PostTemporalSharpeningStrength", value.asInstanceOf[js.Any])
    
    inline def setPostTemporalSharpeningStrengthUndefined: Self = StObject.set(x, "PostTemporalSharpeningStrength", js.undefined)
    
    inline def setPostTemporalSharpeningUndefined: Self = StObject.set(x, "PostTemporalSharpening", js.undefined)
    
    inline def setSpeed(value: integerMinNegative1Max3): Self = StObject.set(x, "Speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "Speed", js.undefined)
    
    inline def setStrength(value: integerMin0Max16): Self = StObject.set(x, "Strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "Strength", js.undefined)
  }
}
