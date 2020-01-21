package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCopyJobsInput extends js.Object {
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
    * Returns only backup jobs for the specified resources:    DynamoDB for Amazon DynamoDB    EBS for Amazon Elastic Block Store    EFS for Amazon Elastic File System    RDS for Amazon Relational Database Service    Storage Gateway for AWS Storage Gateway  
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
  def apply(
    ByCreatedAfter: timestamp = null,
    ByCreatedBefore: timestamp = null,
    ByDestinationVaultArn: String = null,
    ByResourceArn: ARN = null,
    ByResourceType: ResourceType = null,
    ByState: CopyJobState = null,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): ListCopyJobsInput = {
    val __obj = js.Dynamic.literal()
    if (ByCreatedAfter != null) __obj.updateDynamic("ByCreatedAfter")(ByCreatedAfter.asInstanceOf[js.Any])
    if (ByCreatedBefore != null) __obj.updateDynamic("ByCreatedBefore")(ByCreatedBefore.asInstanceOf[js.Any])
    if (ByDestinationVaultArn != null) __obj.updateDynamic("ByDestinationVaultArn")(ByDestinationVaultArn.asInstanceOf[js.Any])
    if (ByResourceArn != null) __obj.updateDynamic("ByResourceArn")(ByResourceArn.asInstanceOf[js.Any])
    if (ByResourceType != null) __obj.updateDynamic("ByResourceType")(ByResourceType.asInstanceOf[js.Any])
    if (ByState != null) __obj.updateDynamic("ByState")(ByState.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCopyJobsInput]
  }
}

