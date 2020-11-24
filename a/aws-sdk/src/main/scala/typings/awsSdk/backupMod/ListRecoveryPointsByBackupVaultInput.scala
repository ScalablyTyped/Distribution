package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRecoveryPointsByBackupVaultInput extends js.Object {
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.backupMod.BackupVaultName = js.native
  
  /**
    * Returns only recovery points that match the specified backup plan ID.
    */
  var ByBackupPlanId: js.UndefOr[String] = js.native
  
  /**
    * Returns only recovery points that were created after the specified timestamp.
    */
  var ByCreatedAfter: js.UndefOr[timestamp] = js.native
  
  /**
    * Returns only recovery points that were created before the specified timestamp.
    */
  var ByCreatedBefore: js.UndefOr[timestamp] = js.native
  
  /**
    * Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
    */
  var ByResourceArn: js.UndefOr[ARN] = js.native
  
  /**
    * Returns only recovery points that match the specified resource type.
    */
  var ByResourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.backupMod.MaxResults] = js.native
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListRecoveryPointsByBackupVaultInput {
  
  @scala.inline
  def apply(BackupVaultName: BackupVaultName): ListRecoveryPointsByBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecoveryPointsByBackupVaultInput]
  }
  
  @scala.inline
  implicit class ListRecoveryPointsByBackupVaultInputOps[Self <: ListRecoveryPointsByBackupVaultInput] (val x: Self) extends AnyVal {
    
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
    def setBackupVaultName(value: BackupVaultName): Self = this.set("BackupVaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByBackupPlanId(value: String): Self = this.set("ByBackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByBackupPlanId: Self = this.set("ByBackupPlanId", js.undefined)
    
    @scala.inline
    def setByCreatedAfter(value: timestamp): Self = this.set("ByCreatedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByCreatedAfter: Self = this.set("ByCreatedAfter", js.undefined)
    
    @scala.inline
    def setByCreatedBefore(value: timestamp): Self = this.set("ByCreatedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByCreatedBefore: Self = this.set("ByCreatedBefore", js.undefined)
    
    @scala.inline
    def setByResourceArn(value: ARN): Self = this.set("ByResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByResourceArn: Self = this.set("ByResourceArn", js.undefined)
    
    @scala.inline
    def setByResourceType(value: ResourceType): Self = this.set("ByResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByResourceType: Self = this.set("ByResourceType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
