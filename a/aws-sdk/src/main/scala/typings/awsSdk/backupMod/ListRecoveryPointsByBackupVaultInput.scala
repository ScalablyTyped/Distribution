package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecoveryPointsByBackupVaultInput extends StObject {
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.backupMod.BackupVaultName
  
  /**
    * Returns only recovery points that match the specified backup plan ID.
    */
  var ByBackupPlanId: js.UndefOr[String] = js.undefined
  
  /**
    * Returns only recovery points that were created after the specified timestamp.
    */
  var ByCreatedAfter: js.UndefOr[timestamp] = js.undefined
  
  /**
    * Returns only recovery points that were created before the specified timestamp.
    */
  var ByCreatedBefore: js.UndefOr[timestamp] = js.undefined
  
  /**
    * Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
    */
  var ByResourceArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Returns only recovery points that match the specified resource type.
    */
  var ByResourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.backupMod.MaxResults] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListRecoveryPointsByBackupVaultInput {
  
  @scala.inline
  def apply(BackupVaultName: BackupVaultName): ListRecoveryPointsByBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecoveryPointsByBackupVaultInput]
  }
  
  @scala.inline
  implicit class ListRecoveryPointsByBackupVaultInputMutableBuilder[Self <: ListRecoveryPointsByBackupVaultInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByBackupPlanId(value: String): Self = StObject.set(x, "ByBackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByBackupPlanIdUndefined: Self = StObject.set(x, "ByBackupPlanId", js.undefined)
    
    @scala.inline
    def setByCreatedAfter(value: timestamp): Self = StObject.set(x, "ByCreatedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByCreatedAfterUndefined: Self = StObject.set(x, "ByCreatedAfter", js.undefined)
    
    @scala.inline
    def setByCreatedBefore(value: timestamp): Self = StObject.set(x, "ByCreatedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByCreatedBeforeUndefined: Self = StObject.set(x, "ByCreatedBefore", js.undefined)
    
    @scala.inline
    def setByResourceArn(value: ARN): Self = StObject.set(x, "ByResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByResourceArnUndefined: Self = StObject.set(x, "ByResourceArn", js.undefined)
    
    @scala.inline
    def setByResourceType(value: ResourceType): Self = StObject.set(x, "ByResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByResourceTypeUndefined: Self = StObject.set(x, "ByResourceType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
