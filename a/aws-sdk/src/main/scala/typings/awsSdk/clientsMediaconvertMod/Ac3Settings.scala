package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ac3Settings extends StObject {
  
  /**
    * Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[integerMin64000Max640000] = js.undefined
  
  /**
    * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  var BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.undefined
  
  /**
    * Dolby Digital coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Ac3CodingMode] = js.undefined
  
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.undefined
  
  /**
    * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
    */
  var DynamicRangeCompressionLine: js.UndefOr[Ac3DynamicRangeCompressionLine] = js.undefined
  
  /**
    * When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend that you use the mode-specific settings instead of Dynamic range compression profile (DynamicRangeCompressionProfile). The mode-specific settings are Dynamic range compression profile, line mode (dynamicRangeCompressionLine) and Dynamic range compression profile, RF mode (dynamicRangeCompressionRf). Note that when you specify values for all three settings, MediaConvert ignores the value of this setting in favor of the mode-specific settings. If you do use this setting instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the default Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
    */
  var DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile] = js.undefined
  
  /**
    * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
    */
  var DynamicRangeCompressionRf: js.UndefOr[Ac3DynamicRangeCompressionRf] = js.undefined
  
  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  var LfeFilter: js.UndefOr[Ac3LfeFilter] = js.undefined
  
  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Ac3MetadataControl] = js.undefined
  
  /**
    * This value is always 48000. It represents the sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin48000Max48000] = js.undefined
}
object Ac3Settings {
  
  inline def apply(): Ac3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ac3Settings]
  }
  
  extension [Self <: Ac3Settings](x: Self) {
    
    inline def setBitrate(value: integerMin64000Max640000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setBitstreamMode(value: Ac3BitstreamMode): Self = StObject.set(x, "BitstreamMode", value.asInstanceOf[js.Any])
    
    inline def setBitstreamModeUndefined: Self = StObject.set(x, "BitstreamMode", js.undefined)
    
    inline def setCodingMode(value: Ac3CodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    inline def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    inline def setDialnorm(value: integerMin1Max31): Self = StObject.set(x, "Dialnorm", value.asInstanceOf[js.Any])
    
    inline def setDialnormUndefined: Self = StObject.set(x, "Dialnorm", js.undefined)
    
    inline def setDynamicRangeCompressionLine(value: Ac3DynamicRangeCompressionLine): Self = StObject.set(x, "DynamicRangeCompressionLine", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeCompressionLineUndefined: Self = StObject.set(x, "DynamicRangeCompressionLine", js.undefined)
    
    inline def setDynamicRangeCompressionProfile(value: Ac3DynamicRangeCompressionProfile): Self = StObject.set(x, "DynamicRangeCompressionProfile", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeCompressionProfileUndefined: Self = StObject.set(x, "DynamicRangeCompressionProfile", js.undefined)
    
    inline def setDynamicRangeCompressionRf(value: Ac3DynamicRangeCompressionRf): Self = StObject.set(x, "DynamicRangeCompressionRf", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeCompressionRfUndefined: Self = StObject.set(x, "DynamicRangeCompressionRf", js.undefined)
    
    inline def setLfeFilter(value: Ac3LfeFilter): Self = StObject.set(x, "LfeFilter", value.asInstanceOf[js.Any])
    
    inline def setLfeFilterUndefined: Self = StObject.set(x, "LfeFilter", js.undefined)
    
    inline def setMetadataControl(value: Ac3MetadataControl): Self = StObject.set(x, "MetadataControl", value.asInstanceOf[js.Any])
    
    inline def setMetadataControlUndefined: Self = StObject.set(x, "MetadataControl", js.undefined)
    
    inline def setSampleRate(value: integerMin48000Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
