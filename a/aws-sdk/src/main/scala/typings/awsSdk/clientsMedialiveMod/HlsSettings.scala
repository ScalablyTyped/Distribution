package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsSettings extends StObject {
  
  var AudioOnlyHlsSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AudioOnlyHlsSettings] = js.undefined
  
  var Fmp4HlsSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Fmp4HlsSettings] = js.undefined
  
  var FrameCaptureHlsSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.FrameCaptureHlsSettings] = js.undefined
  
  var StandardHlsSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.StandardHlsSettings] = js.undefined
}
object HlsSettings {
  
  inline def apply(): HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HlsSettings] (val x: Self) extends AnyVal {
    
    inline def setAudioOnlyHlsSettings(value: AudioOnlyHlsSettings): Self = StObject.set(x, "AudioOnlyHlsSettings", value.asInstanceOf[js.Any])
    
    inline def setAudioOnlyHlsSettingsUndefined: Self = StObject.set(x, "AudioOnlyHlsSettings", js.undefined)
    
    inline def setFmp4HlsSettings(value: Fmp4HlsSettings): Self = StObject.set(x, "Fmp4HlsSettings", value.asInstanceOf[js.Any])
    
    inline def setFmp4HlsSettingsUndefined: Self = StObject.set(x, "Fmp4HlsSettings", js.undefined)
    
    inline def setFrameCaptureHlsSettings(value: FrameCaptureHlsSettings): Self = StObject.set(x, "FrameCaptureHlsSettings", value.asInstanceOf[js.Any])
    
    inline def setFrameCaptureHlsSettingsUndefined: Self = StObject.set(x, "FrameCaptureHlsSettings", js.undefined)
    
    inline def setStandardHlsSettings(value: StandardHlsSettings): Self = StObject.set(x, "StandardHlsSettings", value.asInstanceOf[js.Any])
    
    inline def setStandardHlsSettingsUndefined: Self = StObject.set(x, "StandardHlsSettings", js.undefined)
  }
}
