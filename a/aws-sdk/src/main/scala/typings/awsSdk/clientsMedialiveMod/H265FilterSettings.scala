package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H265FilterSettings extends StObject {
  
  var TemporalFilterSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.TemporalFilterSettings] = js.undefined
}
object H265FilterSettings {
  
  inline def apply(): H265FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H265FilterSettings]
  }
  
  extension [Self <: H265FilterSettings](x: Self) {
    
    inline def setTemporalFilterSettings(value: TemporalFilterSettings): Self = StObject.set(x, "TemporalFilterSettings", value.asInstanceOf[js.Any])
    
    inline def setTemporalFilterSettingsUndefined: Self = StObject.set(x, "TemporalFilterSettings", js.undefined)
  }
}
