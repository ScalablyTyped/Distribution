package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackupPlanOutput extends js.Object {
  
  /**
    * Contains a list of BackupOptions for each resource type. The list is populated only if the advanced option is set for the backup plan.
    */
  var AdvancedBackupSettings: js.UndefOr[typings.awsSdk.backupMod.AdvancedBackupSettings] = js.native
  
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: js.UndefOr[typings.awsSdk.backupMod.BackupPlan] = js.native
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.native
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  
  /**
    * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
  
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of running the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
  
  /**
    * The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value of DeletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var DeletionDate: js.UndefOr[timestamp] = js.native
  
  /**
    * The last time a job to back up resources was run with this backup plan. A date and time, in Unix format and Coordinated Universal Time (UTC). The value of LastExecutionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastExecutionDate: js.UndefOr[timestamp] = js.native
  
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot be edited.
    */
  var VersionId: js.UndefOr[String] = js.native
}
object GetBackupPlanOutput {
  
  @scala.inline
  def apply(): GetBackupPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupPlanOutput]
  }
  
  @scala.inline
  implicit class GetBackupPlanOutputOps[Self <: GetBackupPlanOutput] (val x: Self) extends AnyVal {
    
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
    def setAdvancedBackupSettingsVarargs(value: AdvancedBackupSetting*): Self = this.set("AdvancedBackupSettings", js.Array(value :_*))
    
    @scala.inline
    def setAdvancedBackupSettings(value: AdvancedBackupSettings): Self = this.set("AdvancedBackupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedBackupSettings: Self = this.set("AdvancedBackupSettings", js.undefined)
    
    @scala.inline
    def setBackupPlan(value: BackupPlan): Self = this.set("BackupPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupPlan: Self = this.set("BackupPlan", js.undefined)
    
    @scala.inline
    def setBackupPlanArn(value: ARN): Self = this.set("BackupPlanArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupPlanArn: Self = this.set("BackupPlanArn", js.undefined)
    
    @scala.inline
    def setBackupPlanId(value: String): Self = this.set("BackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupPlanId: Self = this.set("BackupPlanId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: String): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
    
    @scala.inline
    def setDeletionDate(value: timestamp): Self = this.set("DeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionDate: Self = this.set("DeletionDate", js.undefined)
    
    @scala.inline
    def setLastExecutionDate(value: timestamp): Self = this.set("LastExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastExecutionDate: Self = this.set("LastExecutionDate", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
}
