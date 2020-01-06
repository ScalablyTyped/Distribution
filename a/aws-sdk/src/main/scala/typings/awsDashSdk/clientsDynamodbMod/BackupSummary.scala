package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupSummary extends js.Object {
  /**
    * ARN associated with the backup.
    */
  var BackupArn: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.BackupArn] = js.native
  /**
    * Time at which the backup was created.
    */
  var BackupCreationDateTime: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.BackupCreationDateTime] = js.native
  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
    */
  var BackupExpiryDateTime: js.UndefOr[_Date] = js.native
  /**
    * Name of the specified backup.
    */
  var BackupName: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.BackupName] = js.native
  /**
    * Size of the backup in bytes.
    */
  var BackupSizeBytes: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.BackupSizeBytes] = js.native
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
    */
  var BackupStatus: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.BackupStatus] = js.native
  /**
    * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from AWS Backup service.  
    */
  var BackupType: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.BackupType] = js.native
  /**
    * ARN associated with the table.
    */
  var TableArn: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.TableArn] = js.native
  /**
    * Unique identifier for the table.
    */
  var TableId: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.TableId] = js.native
  /**
    * Name of the table.
    */
  var TableName: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.TableName] = js.native
}

object BackupSummary {
  @scala.inline
  def apply(
    BackupArn: BackupArn = null,
    BackupCreationDateTime: BackupCreationDateTime = null,
    BackupExpiryDateTime: _Date = null,
    BackupName: BackupName = null,
    BackupSizeBytes: Int | scala.Double = null,
    BackupStatus: BackupStatus = null,
    BackupType: BackupType = null,
    TableArn: TableArn = null,
    TableId: TableId = null,
    TableName: TableName = null
  ): BackupSummary = {
    val __obj = js.Dynamic.literal()
    if (BackupArn != null) __obj.updateDynamic("BackupArn")(BackupArn.asInstanceOf[js.Any])
    if (BackupCreationDateTime != null) __obj.updateDynamic("BackupCreationDateTime")(BackupCreationDateTime.asInstanceOf[js.Any])
    if (BackupExpiryDateTime != null) __obj.updateDynamic("BackupExpiryDateTime")(BackupExpiryDateTime.asInstanceOf[js.Any])
    if (BackupName != null) __obj.updateDynamic("BackupName")(BackupName.asInstanceOf[js.Any])
    if (BackupSizeBytes != null) __obj.updateDynamic("BackupSizeBytes")(BackupSizeBytes.asInstanceOf[js.Any])
    if (BackupStatus != null) __obj.updateDynamic("BackupStatus")(BackupStatus.asInstanceOf[js.Any])
    if (BackupType != null) __obj.updateDynamic("BackupType")(BackupType.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn.asInstanceOf[js.Any])
    if (TableId != null) __obj.updateDynamic("TableId")(TableId.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupSummary]
  }
}

