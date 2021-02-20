package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGlobalSettingsInput extends StObject {
  
  /**
    * A list of resources along with the opt-in preferences for the account.
    */
  var GlobalSettings: js.UndefOr[typings.awsSdk.backupMod.GlobalSettings] = js.native
}
object UpdateGlobalSettingsInput {
  
  @scala.inline
  def apply(): UpdateGlobalSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalSettingsInput]
  }
  
  @scala.inline
  implicit class UpdateGlobalSettingsInputMutableBuilder[Self <: UpdateGlobalSettingsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalSettings(value: GlobalSettings): Self = StObject.set(x, "GlobalSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSettingsUndefined: Self = StObject.set(x, "GlobalSettings", js.undefined)
  }
}
