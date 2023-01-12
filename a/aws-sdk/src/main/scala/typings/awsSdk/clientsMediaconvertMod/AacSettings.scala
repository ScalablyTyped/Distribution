package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AacSettings extends StObject {
  
  /**
    * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in AudioType and  FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you provide for AudioType and FollowInputAudioType.
    */
  var AudioDescriptionBroadcasterMix: js.UndefOr[AacAudioDescriptionBroadcasterMix] = js.undefined
  
  /**
    * Specify the average bitrate in bits per second. The set of valid values for this setting is: 6000, 8000, 10000, 12000, 14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000. The value you set is also constrained by the values that you choose for Profile (codecProfile), Bitrate control mode (codingMode), and Sample rate (sampleRate). Default values depend on Bitrate control mode and Profile.
    */
  var Bitrate: js.UndefOr[integerMin6000Max1024000] = js.undefined
  
  /**
    * AAC Profile.
    */
  var CodecProfile: js.UndefOr[AacCodecProfile] = js.undefined
  
  /**
    * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
    */
  var CodingMode: js.UndefOr[AacCodingMode] = js.undefined
  
  /**
    * Rate Control Mode.
    */
  var RateControlMode: js.UndefOr[AacRateControlMode] = js.undefined
  
  /**
    * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for the output container.
    */
  var RawFormat: js.UndefOr[AacRawFormat] = js.undefined
  
  /**
    * Sample rate in Hz. Valid values depend on rate control mode and profile.
    */
  var SampleRate: js.UndefOr[integerMin8000Max96000] = js.undefined
  
  /**
    * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    */
  var Specification: js.UndefOr[AacSpecification] = js.undefined
  
  /**
    * VBR Quality Level - Only used if rate_control_mode is VBR.
    */
  var VbrQuality: js.UndefOr[AacVbrQuality] = js.undefined
}
object AacSettings {
  
  inline def apply(): AacSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AacSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AacSettings] (val x: Self) extends AnyVal {
    
    inline def setAudioDescriptionBroadcasterMix(value: AacAudioDescriptionBroadcasterMix): Self = StObject.set(x, "AudioDescriptionBroadcasterMix", value.asInstanceOf[js.Any])
    
    inline def setAudioDescriptionBroadcasterMixUndefined: Self = StObject.set(x, "AudioDescriptionBroadcasterMix", js.undefined)
    
    inline def setBitrate(value: integerMin6000Max1024000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setCodecProfile(value: AacCodecProfile): Self = StObject.set(x, "CodecProfile", value.asInstanceOf[js.Any])
    
    inline def setCodecProfileUndefined: Self = StObject.set(x, "CodecProfile", js.undefined)
    
    inline def setCodingMode(value: AacCodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    inline def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    inline def setRateControlMode(value: AacRateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    inline def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    inline def setRawFormat(value: AacRawFormat): Self = StObject.set(x, "RawFormat", value.asInstanceOf[js.Any])
    
    inline def setRawFormatUndefined: Self = StObject.set(x, "RawFormat", js.undefined)
    
    inline def setSampleRate(value: integerMin8000Max96000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    
    inline def setSpecification(value: AacSpecification): Self = StObject.set(x, "Specification", value.asInstanceOf[js.Any])
    
    inline def setSpecificationUndefined: Self = StObject.set(x, "Specification", js.undefined)
    
    inline def setVbrQuality(value: AacVbrQuality): Self = StObject.set(x, "VbrQuality", value.asInstanceOf[js.Any])
    
    inline def setVbrQualityUndefined: Self = StObject.set(x, "VbrQuality", js.undefined)
  }
}
