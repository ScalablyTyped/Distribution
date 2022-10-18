package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eac3AtmosSettings extends StObject {
  
  /**
    * Specify the average bitrate for this output in bits per second. Valid values: 384k, 448k, 576k, 640k, 768k, 1024k Default value: 448k Note that MediaConvert supports 384k only with channel-based immersive (CBI) 7.1.4 and 5.1.4 inputs. For CBI 9.1.6 and other input types, MediaConvert automatically increases your output bitrate to 448k.
    */
  var Bitrate: js.UndefOr[integerMin384000Max1024000] = js.undefined
  
  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  var BitstreamMode: js.UndefOr[Eac3AtmosBitstreamMode] = js.undefined
  
  /**
    * The coding mode for Dolby Digital Plus JOC (Atmos).
    */
  var CodingMode: js.UndefOr[Eac3AtmosCodingMode] = js.undefined
  
  /**
    * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
    */
  var DialogueIntelligence: js.UndefOr[Eac3AtmosDialogueIntelligence] = js.undefined
  
  /**
    * Specify whether MediaConvert should use any downmix metadata from your input file. Keep the default value, Custom (SPECIFIED) to provide downmix values in your job settings. Choose Follow source (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to specify your downmix values: Left only/Right only surround (LoRoSurroundMixLevel), Left total/Right total surround (LtRtSurroundMixLevel), Left total/Right total center (LtRtCenterMixLevel), Left only/Right only center (LoRoCenterMixLevel),  and Stereo downmix (StereoDownmix). When you keep Custom (SPECIFIED) for Downmix control (DownmixControl) and you don't specify values for the related settings, MediaConvert uses default values for those settings.
    */
  var DownmixControl: js.UndefOr[Eac3AtmosDownmixControl] = js.undefined
  
  /**
    * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby stream for the line operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression line (DynamicRangeCompressionLine). For information about the Dolby DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
    */
  var DynamicRangeCompressionLine: js.UndefOr[Eac3AtmosDynamicRangeCompressionLine] = js.undefined
  
  /**
    * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby stream for the RF operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression RF (DynamicRangeCompressionRf). For information about the Dolby DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
    */
  var DynamicRangeCompressionRf: js.UndefOr[Eac3AtmosDynamicRangeCompressionRf] = js.undefined
  
  /**
    * Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the default value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose Follow source (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to specify your dynamic range control values: Dynamic range compression line (DynamicRangeCompressionLine) and Dynamic range compression RF (DynamicRangeCompressionRf). When you keep the value Custom (SPECIFIED) for Dynamic range control (DynamicRangeControl) and you don't specify values for the related settings, MediaConvert uses default values for those settings.
    */
  var DynamicRangeControl: js.UndefOr[Eac3AtmosDynamicRangeControl] = js.undefined
  
  /**
    * Specify a value for the following Dolby Atmos setting: Left only/Right only center mix (Lo/Ro center). MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, MediaConvert ignores Left only/Right only center (LoRoCenterMixLevel).
    */
  var LoRoCenterMixLevel: js.UndefOr[doubleMinNegative6Max3] = js.undefined
  
  /**
    * Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround). MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, MediaConvert ignores Left only/Right only surround (LoRoSurroundMixLevel).
    */
  var LoRoSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.undefined
  
  /**
    * Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center). MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, MediaConvert ignores Left total/Right total center (LtRtCenterMixLevel).
    */
  var LtRtCenterMixLevel: js.UndefOr[doubleMinNegative6Max3] = js.undefined
  
  /**
    * Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt surround). MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, the service ignores Left total/Right total surround (LtRtSurroundMixLevel).
    */
  var LtRtSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.undefined
  
  /**
    * Choose how the service meters the loudness of your audio.
    */
  var MeteringMode: js.UndefOr[Eac3AtmosMeteringMode] = js.undefined
  
  /**
    * This value is always 48000. It represents the sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin48000Max48000] = js.undefined
  
  /**
    * Specify the percentage of audio content, from 0% to 100%, that must be speech in order for the encoder to use the measured speech loudness as the overall program loudness. Default value: 15%
    */
  var SpeechThreshold: js.UndefOr[integerMin0Max100] = js.undefined
  
  /**
    * Choose how the service does stereo downmixing. Default value: Not indicated (ATMOS_STORAGE_DDP_DMIXMOD_NOT_INDICATED) Related setting: To have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, MediaConvert ignores Stereo downmix (StereoDownmix).
    */
  var StereoDownmix: js.UndefOr[Eac3AtmosStereoDownmix] = js.undefined
  
  /**
    * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and right surround channels.
    */
  var SurroundExMode: js.UndefOr[Eac3AtmosSurroundExMode] = js.undefined
}
object Eac3AtmosSettings {
  
  inline def apply(): Eac3AtmosSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eac3AtmosSettings]
  }
  
  extension [Self <: Eac3AtmosSettings](x: Self) {
    
    inline def setBitrate(value: integerMin384000Max1024000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setBitstreamMode(value: Eac3AtmosBitstreamMode): Self = StObject.set(x, "BitstreamMode", value.asInstanceOf[js.Any])
    
    inline def setBitstreamModeUndefined: Self = StObject.set(x, "BitstreamMode", js.undefined)
    
    inline def setCodingMode(value: Eac3AtmosCodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    inline def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    inline def setDialogueIntelligence(value: Eac3AtmosDialogueIntelligence): Self = StObject.set(x, "DialogueIntelligence", value.asInstanceOf[js.Any])
    
    inline def setDialogueIntelligenceUndefined: Self = StObject.set(x, "DialogueIntelligence", js.undefined)
    
    inline def setDownmixControl(value: Eac3AtmosDownmixControl): Self = StObject.set(x, "DownmixControl", value.asInstanceOf[js.Any])
    
    inline def setDownmixControlUndefined: Self = StObject.set(x, "DownmixControl", js.undefined)
    
    inline def setDynamicRangeCompressionLine(value: Eac3AtmosDynamicRangeCompressionLine): Self = StObject.set(x, "DynamicRangeCompressionLine", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeCompressionLineUndefined: Self = StObject.set(x, "DynamicRangeCompressionLine", js.undefined)
    
    inline def setDynamicRangeCompressionRf(value: Eac3AtmosDynamicRangeCompressionRf): Self = StObject.set(x, "DynamicRangeCompressionRf", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeCompressionRfUndefined: Self = StObject.set(x, "DynamicRangeCompressionRf", js.undefined)
    
    inline def setDynamicRangeControl(value: Eac3AtmosDynamicRangeControl): Self = StObject.set(x, "DynamicRangeControl", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeControlUndefined: Self = StObject.set(x, "DynamicRangeControl", js.undefined)
    
    inline def setLoRoCenterMixLevel(value: doubleMinNegative6Max3): Self = StObject.set(x, "LoRoCenterMixLevel", value.asInstanceOf[js.Any])
    
    inline def setLoRoCenterMixLevelUndefined: Self = StObject.set(x, "LoRoCenterMixLevel", js.undefined)
    
    inline def setLoRoSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = StObject.set(x, "LoRoSurroundMixLevel", value.asInstanceOf[js.Any])
    
    inline def setLoRoSurroundMixLevelUndefined: Self = StObject.set(x, "LoRoSurroundMixLevel", js.undefined)
    
    inline def setLtRtCenterMixLevel(value: doubleMinNegative6Max3): Self = StObject.set(x, "LtRtCenterMixLevel", value.asInstanceOf[js.Any])
    
    inline def setLtRtCenterMixLevelUndefined: Self = StObject.set(x, "LtRtCenterMixLevel", js.undefined)
    
    inline def setLtRtSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = StObject.set(x, "LtRtSurroundMixLevel", value.asInstanceOf[js.Any])
    
    inline def setLtRtSurroundMixLevelUndefined: Self = StObject.set(x, "LtRtSurroundMixLevel", js.undefined)
    
    inline def setMeteringMode(value: Eac3AtmosMeteringMode): Self = StObject.set(x, "MeteringMode", value.asInstanceOf[js.Any])
    
    inline def setMeteringModeUndefined: Self = StObject.set(x, "MeteringMode", js.undefined)
    
    inline def setSampleRate(value: integerMin48000Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    
    inline def setSpeechThreshold(value: integerMin0Max100): Self = StObject.set(x, "SpeechThreshold", value.asInstanceOf[js.Any])
    
    inline def setSpeechThresholdUndefined: Self = StObject.set(x, "SpeechThreshold", js.undefined)
    
    inline def setStereoDownmix(value: Eac3AtmosStereoDownmix): Self = StObject.set(x, "StereoDownmix", value.asInstanceOf[js.Any])
    
    inline def setStereoDownmixUndefined: Self = StObject.set(x, "StereoDownmix", js.undefined)
    
    inline def setSurroundExMode(value: Eac3AtmosSurroundExMode): Self = StObject.set(x, "SurroundExMode", value.asInstanceOf[js.Any])
    
    inline def setSurroundExModeUndefined: Self = StObject.set(x, "SurroundExMode", js.undefined)
  }
}
