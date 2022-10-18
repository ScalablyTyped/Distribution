package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionSelectorSettings extends StObject {
  
  var AncillarySourceSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AncillarySourceSettings] = js.undefined
  
  var AribSourceSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AribSourceSettings] = js.undefined
  
  var DvbSubSourceSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.DvbSubSourceSettings] = js.undefined
  
  var EmbeddedSourceSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.EmbeddedSourceSettings] = js.undefined
  
  var Scte20SourceSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Scte20SourceSettings] = js.undefined
  
  var Scte27SourceSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Scte27SourceSettings] = js.undefined
  
  var TeletextSourceSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.TeletextSourceSettings] = js.undefined
}
object CaptionSelectorSettings {
  
  inline def apply(): CaptionSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSelectorSettings]
  }
  
  extension [Self <: CaptionSelectorSettings](x: Self) {
    
    inline def setAncillarySourceSettings(value: AncillarySourceSettings): Self = StObject.set(x, "AncillarySourceSettings", value.asInstanceOf[js.Any])
    
    inline def setAncillarySourceSettingsUndefined: Self = StObject.set(x, "AncillarySourceSettings", js.undefined)
    
    inline def setAribSourceSettings(value: AribSourceSettings): Self = StObject.set(x, "AribSourceSettings", value.asInstanceOf[js.Any])
    
    inline def setAribSourceSettingsUndefined: Self = StObject.set(x, "AribSourceSettings", js.undefined)
    
    inline def setDvbSubSourceSettings(value: DvbSubSourceSettings): Self = StObject.set(x, "DvbSubSourceSettings", value.asInstanceOf[js.Any])
    
    inline def setDvbSubSourceSettingsUndefined: Self = StObject.set(x, "DvbSubSourceSettings", js.undefined)
    
    inline def setEmbeddedSourceSettings(value: EmbeddedSourceSettings): Self = StObject.set(x, "EmbeddedSourceSettings", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedSourceSettingsUndefined: Self = StObject.set(x, "EmbeddedSourceSettings", js.undefined)
    
    inline def setScte20SourceSettings(value: Scte20SourceSettings): Self = StObject.set(x, "Scte20SourceSettings", value.asInstanceOf[js.Any])
    
    inline def setScte20SourceSettingsUndefined: Self = StObject.set(x, "Scte20SourceSettings", js.undefined)
    
    inline def setScte27SourceSettings(value: Scte27SourceSettings): Self = StObject.set(x, "Scte27SourceSettings", value.asInstanceOf[js.Any])
    
    inline def setScte27SourceSettingsUndefined: Self = StObject.set(x, "Scte27SourceSettings", js.undefined)
    
    inline def setTeletextSourceSettings(value: TeletextSourceSettings): Self = StObject.set(x, "TeletextSourceSettings", value.asInstanceOf[js.Any])
    
    inline def setTeletextSourceSettingsUndefined: Self = StObject.set(x, "TeletextSourceSettings", js.undefined)
  }
}
