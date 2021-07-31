package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegionSettingsInput extends StObject {
  
  /**
    * Updates the list of services along with the opt-in preferences for the Region.
    */
  var ResourceTypeOptInPreference: js.UndefOr[typings.awsSdk.backupMod.ResourceTypeOptInPreference] = js.undefined
}
object UpdateRegionSettingsInput {
  
  @scala.inline
  def apply(): UpdateRegionSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRegionSettingsInput]
  }
  
  @scala.inline
  implicit class UpdateRegionSettingsInputMutableBuilder[Self <: UpdateRegionSettingsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceTypeOptInPreference(value: ResourceTypeOptInPreference): Self = StObject.set(x, "ResourceTypeOptInPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeOptInPreferenceUndefined: Self = StObject.set(x, "ResourceTypeOptInPreference", js.undefined)
  }
}
