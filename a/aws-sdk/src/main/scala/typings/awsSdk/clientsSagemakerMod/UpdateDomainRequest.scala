package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainRequest extends StObject {
  
  /**
    * A collection of settings.
    */
  var DefaultUserSettings: js.UndefOr[UserSettings] = js.undefined
  
  /**
    * The ID of the domain to be updated.
    */
  var DomainId: typings.awsSdk.clientsSagemakerMod.DomainId
  
  /**
    * A collection of DomainSettings configuration values to update.
    */
  var DomainSettingsForUpdate: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DomainSettingsForUpdate] = js.undefined
}
object UpdateDomainRequest {
  
  inline def apply(DomainId: DomainId): UpdateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainRequest]
  }
  
  extension [Self <: UpdateDomainRequest](x: Self) {
    
    inline def setDefaultUserSettings(value: UserSettings): Self = StObject.set(x, "DefaultUserSettings", value.asInstanceOf[js.Any])
    
    inline def setDefaultUserSettingsUndefined: Self = StObject.set(x, "DefaultUserSettings", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainSettingsForUpdate(value: DomainSettingsForUpdate): Self = StObject.set(x, "DomainSettingsForUpdate", value.asInstanceOf[js.Any])
    
    inline def setDomainSettingsForUpdateUndefined: Self = StObject.set(x, "DomainSettingsForUpdate", js.undefined)
  }
}
