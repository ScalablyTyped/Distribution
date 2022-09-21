package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalSettingsInput extends StObject {
  
  /**
    * A value for isCrossAccountBackupEnabled and a Region. Example: update-global-settings --global-settings isCrossAccountBackupEnabled=false --region us-west-2.
    */
  var GlobalSettings: js.UndefOr[typings.awsSdk.backupMod.GlobalSettings] = js.undefined
}
object UpdateGlobalSettingsInput {
  
  inline def apply(): UpdateGlobalSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalSettingsInput]
  }
  
  extension [Self <: UpdateGlobalSettingsInput](x: Self) {
    
    inline def setGlobalSettings(value: GlobalSettings): Self = StObject.set(x, "GlobalSettings", value.asInstanceOf[js.Any])
    
    inline def setGlobalSettingsUndefined: Self = StObject.set(x, "GlobalSettings", js.undefined)
  }
}
