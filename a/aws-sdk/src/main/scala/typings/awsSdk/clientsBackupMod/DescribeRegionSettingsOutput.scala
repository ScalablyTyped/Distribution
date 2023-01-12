package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRegionSettingsOutput extends StObject {
  
  /**
    * Returns whether Backup fully manages the backups for a resource type. For the benefits of full Backup management, see  Full Backup management. For a list of resource types and whether each supports full Backup management, see the  Feature availability by resource table. If "DynamoDB":false, you can enable full Backup management for DynamoDB backup by enabling  Backup's advanced DynamoDB backup features.
    */
  var ResourceTypeManagementPreference: js.UndefOr[typings.awsSdk.clientsBackupMod.ResourceTypeManagementPreference] = js.undefined
  
  /**
    * Returns a list of all services along with the opt-in preferences in the Region.
    */
  var ResourceTypeOptInPreference: js.UndefOr[typings.awsSdk.clientsBackupMod.ResourceTypeOptInPreference] = js.undefined
}
object DescribeRegionSettingsOutput {
  
  inline def apply(): DescribeRegionSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegionSettingsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRegionSettingsOutput] (val x: Self) extends AnyVal {
    
    inline def setResourceTypeManagementPreference(value: ResourceTypeManagementPreference): Self = StObject.set(x, "ResourceTypeManagementPreference", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeManagementPreferenceUndefined: Self = StObject.set(x, "ResourceTypeManagementPreference", js.undefined)
    
    inline def setResourceTypeOptInPreference(value: ResourceTypeOptInPreference): Self = StObject.set(x, "ResourceTypeOptInPreference", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeOptInPreferenceUndefined: Self = StObject.set(x, "ResourceTypeOptInPreference", js.undefined)
  }
}
