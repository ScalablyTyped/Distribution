package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupPlanOutput extends StObject {
  
  /**
    * A list of BackupOptions settings for a resource type. This option is only available for Windows VSS backup jobs.
    */
  var AdvancedBackupSettings: js.UndefOr[typings.awsSdk.backupMod.AdvancedBackupSettings] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be edited.
    */
  var VersionId: js.UndefOr[String] = js.undefined
}
object CreateBackupPlanOutput {
  
  @scala.inline
  def apply(): CreateBackupPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupPlanOutput]
  }
  
  @scala.inline
  implicit class CreateBackupPlanOutputMutableBuilder[Self <: CreateBackupPlanOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvancedBackupSettings(value: AdvancedBackupSettings): Self = StObject.set(x, "AdvancedBackupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedBackupSettingsUndefined: Self = StObject.set(x, "AdvancedBackupSettings", js.undefined)
    
    @scala.inline
    def setAdvancedBackupSettingsVarargs(value: AdvancedBackupSetting*): Self = StObject.set(x, "AdvancedBackupSettings", js.Array(value :_*))
    
    @scala.inline
    def setBackupPlanArn(value: ARN): Self = StObject.set(x, "BackupPlanArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanArnUndefined: Self = StObject.set(x, "BackupPlanArn", js.undefined)
    
    @scala.inline
    def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanIdUndefined: Self = StObject.set(x, "BackupPlanId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
