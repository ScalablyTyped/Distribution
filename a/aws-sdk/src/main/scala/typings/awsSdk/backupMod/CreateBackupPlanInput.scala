package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupPlanInput extends StObject {
  
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: BackupPlanInput
  
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair. The specified tags are assigned to all backups created with this plan.
    */
  var BackupPlanTags: js.UndefOr[Tags] = js.undefined
  
  /**
    * Identifies the request and allows failed requests to be retried without the risk of running the operation twice. If the request includes a CreatorRequestId that matches an existing backup plan, that plan is returned. This parameter is optional.
    */
  var CreatorRequestId: js.UndefOr[String] = js.undefined
}
object CreateBackupPlanInput {
  
  @scala.inline
  def apply(BackupPlan: BackupPlanInput): CreateBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlan = BackupPlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupPlanInput]
  }
  
  @scala.inline
  implicit class CreateBackupPlanInputMutableBuilder[Self <: CreateBackupPlanInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlan(value: BackupPlanInput): Self = StObject.set(x, "BackupPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanTags(value: Tags): Self = StObject.set(x, "BackupPlanTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanTagsUndefined: Self = StObject.set(x, "BackupPlanTags", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: String): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
  }
}
