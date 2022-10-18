package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSelectorColorSpaceSettings extends StObject {
  
  var Hdr10Settings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Hdr10Settings] = js.undefined
}
object VideoSelectorColorSpaceSettings {
  
  inline def apply(): VideoSelectorColorSpaceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorColorSpaceSettings]
  }
  
  extension [Self <: VideoSelectorColorSpaceSettings](x: Self) {
    
    inline def setHdr10Settings(value: Hdr10Settings): Self = StObject.set(x, "Hdr10Settings", value.asInstanceOf[js.Any])
    
    inline def setHdr10SettingsUndefined: Self = StObject.set(x, "Hdr10Settings", js.undefined)
  }
}
