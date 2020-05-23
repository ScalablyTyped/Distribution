package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    BackupVaultName: BackupVaultName,
    ByBackupPlanId: String = null,
    ByCreatedAfter: timestamp = null,
    ByCreatedBefore: timestamp = null,
    ByResourceArn: ARN = null,
    ByResourceType: ResourceType = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null
  ): ListRecoveryPointsByBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    if (ByBackupPlanId != null) __obj.updateDynamic("ByBackupPlanId")(ByBackupPlanId.asInstanceOf[js.Any])
    if (ByCreatedAfter != null) __obj.updateDynamic("ByCreatedAfter")(ByCreatedAfter.asInstanceOf[js.Any])
    if (ByCreatedBefore != null) __obj.updateDynamic("ByCreatedBefore")(ByCreatedBefore.asInstanceOf[js.Any])
    if (ByResourceArn != null) __obj.updateDynamic("ByResourceArn")(ByResourceArn.asInstanceOf[js.Any])
    if (ByResourceType != null) __obj.updateDynamic("ByResourceType")(ByResourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecoveryPointsByBackupVaultInput]
  }
}

