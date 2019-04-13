package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRecoveryPointsByBackupVaultInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: awsDashSdkLib.clientsBackupMod.BackupVaultName
  /**
    * Returns only recovery points that match the specified backup plan ID.
    */
  var ByBackupPlanId: js.UndefOr[java.lang.String] = js.undefined
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
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListRecoveryPointsByBackupVaultInput {
  @scala.inline
  def apply(
    BackupVaultName: BackupVaultName,
    ByBackupPlanId: java.lang.String = null,
    ByCreatedAfter: timestamp = null,
    ByCreatedBefore: timestamp = null,
    ByResourceArn: ARN = null,
    ByResourceType: ResourceType = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: java.lang.String = null
  ): ListRecoveryPointsByBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName)
    if (ByBackupPlanId != null) __obj.updateDynamic("ByBackupPlanId")(ByBackupPlanId)
    if (ByCreatedAfter != null) __obj.updateDynamic("ByCreatedAfter")(ByCreatedAfter)
    if (ByCreatedBefore != null) __obj.updateDynamic("ByCreatedBefore")(ByCreatedBefore)
    if (ByResourceArn != null) __obj.updateDynamic("ByResourceArn")(ByResourceArn)
    if (ByResourceType != null) __obj.updateDynamic("ByResourceType")(ByResourceType)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListRecoveryPointsByBackupVaultInput]
  }
}

