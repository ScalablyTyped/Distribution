package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedBackupSetting extends js.Object {
  
  /**
    * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs. Valid values:  Set to "WindowsVSS":"enabled" to enable the WindowsVSS backup option and create a VSS Windows backup.  Set to "WindowsVSS":"disabled" to create a regular backup. The WindowsVSS option is not enabled by default. If you specify an invalid option, you get an InvalidParameterValueException exception. For more information about Windows VSS backups, see Creating a VSS-Enabled Windows Backup.
    */
  var BackupOptions: js.UndefOr[typings.awsSdk.backupMod.BackupOptions] = js.native
  
  /**
    * The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon EC2. Valid values: EC2.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.native
}
object AdvancedBackupSetting {
  
  @scala.inline
  def apply(): AdvancedBackupSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedBackupSetting]
  }
  
  @scala.inline
  implicit class AdvancedBackupSettingOps[Self <: AdvancedBackupSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackupOptions(value: BackupOptions): Self = this.set("BackupOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupOptions: Self = this.set("BackupOptions", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
}
