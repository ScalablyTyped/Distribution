package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioCodecSettings extends StObject {
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR".  In VBR mode, you control the audio quality with the setting VBR quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the rate control mode.
    */
  var AacSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.AacSettings] = js.undefined
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
    */
  var Ac3Settings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Ac3Settings] = js.undefined
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
    */
  var AiffSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.AiffSettings] = js.undefined
  
  /**
    * Choose the audio codec for this output. Note that the option Dolby Digital passthrough (PASSTHROUGH) applies only to Dolby Digital and Dolby Digital Plus audio inputs. Make sure that you choose a codec that's supported with your output container: https://docs.aws.amazon.com/mediaconvert/latest/ug/reference-codecs-containers.html#reference-codecs-containers-output-audio For audio-only outputs, make sure that both your input audio codec and your output audio codec are supported for audio-only workflows. For more information, see: https://docs.aws.amazon.com/mediaconvert/latest/ug/reference-codecs-containers-input.html#reference-codecs-containers-input-audio-only and https://docs.aws.amazon.com/mediaconvert/latest/ug/reference-codecs-containers.html#audio-only-output
    */
  var Codec: js.UndefOr[AudioCodec] = js.undefined
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
    */
  var Eac3AtmosSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Eac3AtmosSettings] = js.undefined
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3.
    */
  var Eac3Settings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Eac3Settings] = js.undefined
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.
    */
  var Mp2Settings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Mp2Settings] = js.undefined
  
  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value MP3.
    */
  var Mp3Settings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Mp3Settings] = js.undefined
  
  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value OPUS.
    */
  var OpusSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.OpusSettings] = js.undefined
  
  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value Vorbis.
    */
  var VorbisSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.VorbisSettings] = js.undefined
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.
    */
  var WavSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.WavSettings] = js.undefined
}
object AudioCodecSettings {
  
  inline def apply(): AudioCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioCodecSettings]
  }
  
  extension [Self <: AudioCodecSettings](x: Self) {
    
    inline def setAacSettings(value: AacSettings): Self = StObject.set(x, "AacSettings", value.asInstanceOf[js.Any])
    
    inline def setAacSettingsUndefined: Self = StObject.set(x, "AacSettings", js.undefined)
    
    inline def setAc3Settings(value: Ac3Settings): Self = StObject.set(x, "Ac3Settings", value.asInstanceOf[js.Any])
    
    inline def setAc3SettingsUndefined: Self = StObject.set(x, "Ac3Settings", js.undefined)
    
    inline def setAiffSettings(value: AiffSettings): Self = StObject.set(x, "AiffSettings", value.asInstanceOf[js.Any])
    
    inline def setAiffSettingsUndefined: Self = StObject.set(x, "AiffSettings", js.undefined)
    
    inline def setCodec(value: AudioCodec): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    inline def setEac3AtmosSettings(value: Eac3AtmosSettings): Self = StObject.set(x, "Eac3AtmosSettings", value.asInstanceOf[js.Any])
    
    inline def setEac3AtmosSettingsUndefined: Self = StObject.set(x, "Eac3AtmosSettings", js.undefined)
    
    inline def setEac3Settings(value: Eac3Settings): Self = StObject.set(x, "Eac3Settings", value.asInstanceOf[js.Any])
    
    inline def setEac3SettingsUndefined: Self = StObject.set(x, "Eac3Settings", js.undefined)
    
    inline def setMp2Settings(value: Mp2Settings): Self = StObject.set(x, "Mp2Settings", value.asInstanceOf[js.Any])
    
    inline def setMp2SettingsUndefined: Self = StObject.set(x, "Mp2Settings", js.undefined)
    
    inline def setMp3Settings(value: Mp3Settings): Self = StObject.set(x, "Mp3Settings", value.asInstanceOf[js.Any])
    
    inline def setMp3SettingsUndefined: Self = StObject.set(x, "Mp3Settings", js.undefined)
    
    inline def setOpusSettings(value: OpusSettings): Self = StObject.set(x, "OpusSettings", value.asInstanceOf[js.Any])
    
    inline def setOpusSettingsUndefined: Self = StObject.set(x, "OpusSettings", js.undefined)
    
    inline def setVorbisSettings(value: VorbisSettings): Self = StObject.set(x, "VorbisSettings", value.asInstanceOf[js.Any])
    
    inline def setVorbisSettingsUndefined: Self = StObject.set(x, "VorbisSettings", js.undefined)
    
    inline def setWavSettings(value: WavSettings): Self = StObject.set(x, "WavSettings", value.asInstanceOf[js.Any])
    
    inline def setWavSettingsUndefined: Self = StObject.set(x, "WavSettings", js.undefined)
  }
}
