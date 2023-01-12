package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mpeg2FilterSettings extends StObject {
  
  var TemporalFilterSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.TemporalFilterSettings] = js.undefined
}
object Mpeg2FilterSettings {
  
  inline def apply(): Mpeg2FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mpeg2FilterSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mpeg2FilterSettings] (val x: Self) extends AnyVal {
    
    inline def setTemporalFilterSettings(value: TemporalFilterSettings): Self = StObject.set(x, "TemporalFilterSettings", value.asInstanceOf[js.Any])
    
    inline def setTemporalFilterSettingsUndefined: Self = StObject.set(x, "TemporalFilterSettings", js.undefined)
  }
}
