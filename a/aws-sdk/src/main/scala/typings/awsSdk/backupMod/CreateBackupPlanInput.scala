package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBackupPlanInput extends js.Object {
  
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: BackupPlanInput = js.native
  
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair. The specified tags are assigned to all backups created with this plan.
    */
  var BackupPlanTags: js.UndefOr[Tags] = js.native
  
  /**
    * Identifies the request and allows failed requests to be retried without the risk of running the operation twice. If the request includes a CreatorRequestId that matches an existing backup plan, that plan is returned. This parameter is optional.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
}
object CreateBackupPlanInput {
  
  @scala.inline
  def apply(BackupPlan: BackupPlanInput): CreateBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlan = BackupPlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupPlanInput]
  }
  
  @scala.inline
  implicit class CreateBackupPlanInputOps[Self <: CreateBackupPlanInput] (val x: Self) extends AnyVal {
    
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
    def setBackupPlan(value: BackupPlanInput): Self = this.set("BackupPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanTags(value: Tags): Self = this.set("BackupPlanTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupPlanTags: Self = this.set("BackupPlanTags", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: String): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
  }
}
