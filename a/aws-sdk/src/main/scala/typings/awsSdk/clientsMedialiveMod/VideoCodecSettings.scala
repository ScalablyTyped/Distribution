package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoCodecSettings extends StObject {
  
  var FrameCaptureSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.FrameCaptureSettings] = js.undefined
  
  var H264Settings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.H264Settings] = js.undefined
  
  var H265Settings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.H265Settings] = js.undefined
  
  var Mpeg2Settings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Mpeg2Settings] = js.undefined
}
object VideoCodecSettings {
  
  inline def apply(): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoCodecSettings]
  }
  
  extension [Self <: VideoCodecSettings](x: Self) {
    
    inline def setFrameCaptureSettings(value: FrameCaptureSettings): Self = StObject.set(x, "FrameCaptureSettings", value.asInstanceOf[js.Any])
    
    inline def setFrameCaptureSettingsUndefined: Self = StObject.set(x, "FrameCaptureSettings", js.undefined)
    
    inline def setH264Settings(value: H264Settings): Self = StObject.set(x, "H264Settings", value.asInstanceOf[js.Any])
    
    inline def setH264SettingsUndefined: Self = StObject.set(x, "H264Settings", js.undefined)
    
    inline def setH265Settings(value: H265Settings): Self = StObject.set(x, "H265Settings", value.asInstanceOf[js.Any])
    
    inline def setH265SettingsUndefined: Self = StObject.set(x, "H265Settings", js.undefined)
    
    inline def setMpeg2Settings(value: Mpeg2Settings): Self = StObject.set(x, "Mpeg2Settings", value.asInstanceOf[js.Any])
    
    inline def setMpeg2SettingsUndefined: Self = StObject.set(x, "Mpeg2Settings", js.undefined)
  }
}
