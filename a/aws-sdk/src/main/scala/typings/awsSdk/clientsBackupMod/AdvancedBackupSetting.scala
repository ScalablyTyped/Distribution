package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedBackupSetting extends StObject {
  
  /**
    * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs. Valid values:  Set to "WindowsVSS":"enabled" to enable the WindowsVSS backup option and create a Windows VSS backup.  Set to "WindowsVSS":"disabled" to create a regular backup. The WindowsVSS option is not enabled by default. If you specify an invalid option, you get an InvalidParameterValueException exception. For more information about Windows VSS backups, see Creating a VSS-Enabled Windows Backup.
    */
  var BackupOptions: js.UndefOr[typings.awsSdk.clientsBackupMod.BackupOptions] = js.undefined
  
  /**
    * Specifies an object containing resource type and backup options. The only supported resource type is Amazon EC2 instances with Windows Volume Shadow Copy Service (VSS). For a CloudFormation example, see the sample CloudFormation template to enable Windows VSS in the Backup User Guide. Valid values: EC2.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsBackupMod.ResourceType] = js.undefined
}
object AdvancedBackupSetting {
  
  inline def apply(): AdvancedBackupSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedBackupSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedBackupSetting] (val x: Self) extends AnyVal {
    
    inline def setBackupOptions(value: BackupOptions): Self = StObject.set(x, "BackupOptions", value.asInstanceOf[js.Any])
    
    inline def setBackupOptionsUndefined: Self = StObject.set(x, "BackupOptions", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
