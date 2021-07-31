package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupJobsInput extends StObject {
  
  /**
    * The account ID to list the jobs from. Returns only backup jobs associated with the specified account ID.
    */
  var ByAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Returns only backup jobs that will be stored in the specified backup vault. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var ByBackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
  
  /**
    * Returns only backup jobs that were created after the specified date.
    */
  var ByCreatedAfter: js.UndefOr[timestamp] = js.undefined
  
  /**
    * Returns only backup jobs that were created before the specified date.
    */
  var ByCreatedBefore: js.UndefOr[timestamp] = js.undefined
  
  /**
    * Returns only backup jobs that match the specified resource Amazon Resource Name (ARN).
    */
  var ByResourceArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Returns only backup jobs for the specified resources:    DynamoDB for Amazon DynamoDB    EBS for Amazon Elastic Block Store    EC2 for Amazon Elastic Compute Cloud    EFS for Amazon Elastic File System    RDS for Amazon Relational Database Service    Storage Gateway for AWS Storage Gateway  
    */
  var ByResourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * Returns only backup jobs that are in the specified state.
    */
  var ByState: js.UndefOr[BackupJobState] = js.undefined
  
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.backupMod.MaxResults] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListBackupJobsInput {
  
  @scala.inline
  def apply(): ListBackupJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupJobsInput]
  }
  
  @scala.inline
  implicit class ListBackupJobsInputMutableBuilder[Self <: ListBackupJobsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByAccountId(value: AccountId): Self = StObject.set(x, "ByAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByAccountIdUndefined: Self = StObject.set(x, "ByAccountId", js.undefined)
    
    @scala.inline
    def setByBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "ByBackupVaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByBackupVaultNameUndefined: Self = StObject.set(x, "ByBackupVaultName", js.undefined)
    
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
    def setByState(value: BackupJobState): Self = StObject.set(x, "ByState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByStateUndefined: Self = StObject.set(x, "ByState", js.undefined)
    
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
