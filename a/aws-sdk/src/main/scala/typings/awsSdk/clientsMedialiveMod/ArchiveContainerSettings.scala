package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveContainerSettings extends StObject {
  
  var M2tsSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.M2tsSettings] = js.undefined
  
  var RawSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.RawSettings] = js.undefined
}
object ArchiveContainerSettings {
  
  inline def apply(): ArchiveContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveContainerSettings]
  }
  
  extension [Self <: ArchiveContainerSettings](x: Self) {
    
    inline def setM2tsSettings(value: M2tsSettings): Self = StObject.set(x, "M2tsSettings", value.asInstanceOf[js.Any])
    
    inline def setM2tsSettingsUndefined: Self = StObject.set(x, "M2tsSettings", js.undefined)
    
    inline def setRawSettings(value: RawSettings): Self = StObject.set(x, "RawSettings", value.asInstanceOf[js.Any])
    
    inline def setRawSettingsUndefined: Self = StObject.set(x, "RawSettings", js.undefined)
  }
}
