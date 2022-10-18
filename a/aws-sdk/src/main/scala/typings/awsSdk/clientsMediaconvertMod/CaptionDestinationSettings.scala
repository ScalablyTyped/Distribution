package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionDestinationSettings extends StObject {
  
  /**
    * Burn-in is a captions delivery method, rather than a captions format. Burn-in writes the captions directly on your video frames, replacing pixels of video content with the captions. Set up burn-in captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to BURN_IN.
    */
  var BurninDestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.BurninDestinationSettings] = js.undefined
  
  /**
    * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Note that your choice of video output container constrains your choice of output captions format. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html. If you are using SCTE-20 and you want to create an output that complies with the SCTE-43 spec, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
    */
  var DestinationType: js.UndefOr[CaptionDestinationType] = js.undefined
  
  /**
    * Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to DVB_SUB.
    */
  var DvbSubDestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.DvbSubDestinationSettings] = js.undefined
  
  /**
    * Settings related to CEA/EIA-608 and CEA/EIA-708 (also called embedded or ancillary) captions. Set up embedded captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/embedded-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to EMBEDDED, EMBEDDED_PLUS_SCTE20, or SCTE20_PLUS_EMBEDDED.
    */
  var EmbeddedDestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.EmbeddedDestinationSettings] = js.undefined
  
  /**
    * Settings related to IMSC captions. IMSC is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to IMSC.
    */
  var ImscDestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ImscDestinationSettings] = js.undefined
  
  /**
    * Settings related to SCC captions. SCC is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/scc-srt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to SCC.
    */
  var SccDestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.SccDestinationSettings] = js.undefined
  
  /**
    * Settings related to SRT captions. SRT is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to SRT.
    */
  var SrtDestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.SrtDestinationSettings] = js.undefined
  
  /**
    * Settings related to teletext captions. Set up teletext captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/teletext-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to TELETEXT.
    */
  var TeletextDestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.TeletextDestinationSettings] = js.undefined
  
  /**
    * Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to TTML.
    */
  var TtmlDestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.TtmlDestinationSettings] = js.undefined
  
  /**
    * Settings related to WebVTT captions. WebVTT is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to WebVTT.
    */
  var WebvttDestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.WebvttDestinationSettings] = js.undefined
}
object CaptionDestinationSettings {
  
  inline def apply(): CaptionDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionDestinationSettings]
  }
  
  extension [Self <: CaptionDestinationSettings](x: Self) {
    
    inline def setBurninDestinationSettings(value: BurninDestinationSettings): Self = StObject.set(x, "BurninDestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setBurninDestinationSettingsUndefined: Self = StObject.set(x, "BurninDestinationSettings", js.undefined)
    
    inline def setDestinationType(value: CaptionDestinationType): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "DestinationType", js.undefined)
    
    inline def setDvbSubDestinationSettings(value: DvbSubDestinationSettings): Self = StObject.set(x, "DvbSubDestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setDvbSubDestinationSettingsUndefined: Self = StObject.set(x, "DvbSubDestinationSettings", js.undefined)
    
    inline def setEmbeddedDestinationSettings(value: EmbeddedDestinationSettings): Self = StObject.set(x, "EmbeddedDestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedDestinationSettingsUndefined: Self = StObject.set(x, "EmbeddedDestinationSettings", js.undefined)
    
    inline def setImscDestinationSettings(value: ImscDestinationSettings): Self = StObject.set(x, "ImscDestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setImscDestinationSettingsUndefined: Self = StObject.set(x, "ImscDestinationSettings", js.undefined)
    
    inline def setSccDestinationSettings(value: SccDestinationSettings): Self = StObject.set(x, "SccDestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setSccDestinationSettingsUndefined: Self = StObject.set(x, "SccDestinationSettings", js.undefined)
    
    inline def setSrtDestinationSettings(value: SrtDestinationSettings): Self = StObject.set(x, "SrtDestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setSrtDestinationSettingsUndefined: Self = StObject.set(x, "SrtDestinationSettings", js.undefined)
    
    inline def setTeletextDestinationSettings(value: TeletextDestinationSettings): Self = StObject.set(x, "TeletextDestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setTeletextDestinationSettingsUndefined: Self = StObject.set(x, "TeletextDestinationSettings", js.undefined)
    
    inline def setTtmlDestinationSettings(value: TtmlDestinationSettings): Self = StObject.set(x, "TtmlDestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setTtmlDestinationSettingsUndefined: Self = StObject.set(x, "TtmlDestinationSettings", js.undefined)
    
    inline def setWebvttDestinationSettings(value: WebvttDestinationSettings): Self = StObject.set(x, "WebvttDestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setWebvttDestinationSettingsUndefined: Self = StObject.set(x, "WebvttDestinationSettings", js.undefined)
  }
}
