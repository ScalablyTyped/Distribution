package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCopyJobsInput extends js.Object {
  
  /**
    * The account ID to list the jobs from. Returns only copy jobs associated with the specified account ID.
    */
  var ByAccountId: js.UndefOr[AccountId] = js.native
  
  /**
    * Returns only copy jobs that were created after the specified date.
    */
  var ByCreatedAfter: js.UndefOr[timestamp] = js.native
  
  /**
    * Returns only copy jobs that were created before the specified date.
    */
  var ByCreatedBefore: js.UndefOr[timestamp] = js.native
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a source backup vault to copy from; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault. 
    */
  var ByDestinationVaultArn: js.UndefOr[String] = js.native
  
  /**
    * Returns only copy jobs that match the specified resource Amazon Resource Name (ARN). 
    */
  var ByResourceArn: js.UndefOr[ARN] = js.native
  
  /**
    * Returns only backup jobs for the specified resources:    DynamoDB for Amazon DynamoDB    EBS for Amazon Elastic Block Store    EC2 for Amazon Elastic Compute Cloud    EFS for Amazon Elastic File System    RDS for Amazon Relational Database Service    Storage Gateway for AWS Storage Gateway  
    */
  var ByResourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * Returns only copy jobs that are in the specified state.
    */
  var ByState: js.UndefOr[CopyJobState] = js.native
  
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.backupMod.MaxResults] = js.native
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token. 
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListCopyJobsInput {
  
  @scala.inline
  def apply(): ListCopyJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCopyJobsInput]
  }
  
  @scala.inline
  implicit class ListCopyJobsInputOps[Self <: ListCopyJobsInput] (val x: Self) extends AnyVal {
    
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
    def setByAccountId(value: AccountId): Self = this.set("ByAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByAccountId: Self = this.set("ByAccountId", js.undefined)
    
    @scala.inline
    def setByCreatedAfter(value: timestamp): Self = this.set("ByCreatedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByCreatedAfter: Self = this.set("ByCreatedAfter", js.undefined)
    
    @scala.inline
    def setByCreatedBefore(value: timestamp): Self = this.set("ByCreatedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByCreatedBefore: Self = this.set("ByCreatedBefore", js.undefined)
    
    @scala.inline
    def setByDestinationVaultArn(value: String): Self = this.set("ByDestinationVaultArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByDestinationVaultArn: Self = this.set("ByDestinationVaultArn", js.undefined)
    
    @scala.inline
    def setByResourceArn(value: ARN): Self = this.set("ByResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByResourceArn: Self = this.set("ByResourceArn", js.undefined)
    
    @scala.inline
    def setByResourceType(value: ResourceType): Self = this.set("ByResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByResourceType: Self = this.set("ByResourceType", js.undefined)
    
    @scala.inline
    def setByState(value: CopyJobState): Self = this.set("ByState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByState: Self = this.set("ByState", js.undefined)
    
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
