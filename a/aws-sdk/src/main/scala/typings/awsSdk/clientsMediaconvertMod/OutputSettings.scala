package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputSettings extends StObject {
  
  /**
    * Settings for HLS output groups
    */
  var HlsSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.HlsSettings] = js.undefined
}
object OutputSettings {
  
  inline def apply(): OutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputSettings] (val x: Self) extends AnyVal {
    
    inline def setHlsSettings(value: HlsSettings): Self = StObject.set(x, "HlsSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsSettingsUndefined: Self = StObject.set(x, "HlsSettings", js.undefined)
  }
}
