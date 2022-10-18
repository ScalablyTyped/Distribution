package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegionSettingsInput extends StObject {
  
  /**
    * Enables or disables full Backup management of backups for a resource type. To enable full Backup management for DynamoDB along with  Backup's advanced DynamoDB backup features, follow the procedure to  enable advanced DynamoDB backup programmatically.
    */
  var ResourceTypeManagementPreference: js.UndefOr[typings.awsSdk.clientsBackupMod.ResourceTypeManagementPreference] = js.undefined
  
  /**
    * Updates the list of services along with the opt-in preferences for the Region.
    */
  var ResourceTypeOptInPreference: js.UndefOr[typings.awsSdk.clientsBackupMod.ResourceTypeOptInPreference] = js.undefined
}
object UpdateRegionSettingsInput {
  
  inline def apply(): UpdateRegionSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRegionSettingsInput]
  }
  
  extension [Self <: UpdateRegionSettingsInput](x: Self) {
    
    inline def setResourceTypeManagementPreference(value: ResourceTypeManagementPreference): Self = StObject.set(x, "ResourceTypeManagementPreference", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeManagementPreferenceUndefined: Self = StObject.set(x, "ResourceTypeManagementPreference", js.undefined)
    
    inline def setResourceTypeOptInPreference(value: ResourceTypeOptInPreference): Self = StObject.set(x, "ResourceTypeOptInPreference", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeOptInPreferenceUndefined: Self = StObject.set(x, "ResourceTypeOptInPreference", js.undefined)
  }
}
