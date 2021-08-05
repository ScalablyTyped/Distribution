package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedBackupSetting extends StObject {
  
  /**
    * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs. Valid values:  Set to "WindowsVSS":"enabled" to enable the WindowsVSS backup option and create a VSS Windows backup.  Set to "WindowsVSS":"disabled" to create a regular backup. The WindowsVSS option is not enabled by default. If you specify an invalid option, you get an InvalidParameterValueException exception. For more information about Windows VSS backups, see Creating a VSS-Enabled Windows Backup.
    */
  var BackupOptions: js.UndefOr[typings.awsSdk.backupMod.BackupOptions] = js.undefined
  
  /**
    * The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon EC2. Valid values: EC2.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.undefined
}
object AdvancedBackupSetting {
  
  inline def apply(): AdvancedBackupSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedBackupSetting]
  }
  
  extension [Self <: AdvancedBackupSetting](x: Self) {
    
    inline def setBackupOptions(value: BackupOptions): Self = StObject.set(x, "BackupOptions", value.asInstanceOf[js.Any])
    
    inline def setBackupOptionsUndefined: Self = StObject.set(x, "BackupOptions", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
